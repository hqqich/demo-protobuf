package main

import (
	"bufio"
	"fmt"
	"google.golang.org/protobuf/proto"
	stProto "gosrc/protos"
	"net"
	"os"
	"time"
	//protobuf编解码库,下面两个库是相互兼容的，可以使用其中任意一个
	//"github.com/golang/protobuf/proto"
	//"github.com/gogo/protobuf/proto"
)

func main() {
	strIP := "127.0.0.1:7788"
	var conn net.Conn
	var err error

	//连接服务器
	for conn, err = net.Dial("tcp", strIP); err != nil; conn, err = net.Dial("tcp", strIP) {
		fmt.Println("connect", strIP, "fail")
		time.Sleep(time.Second)
		fmt.Println("reconnect...")
	}
	fmt.Println("connect", strIP, "success")
	defer conn.Close()

	name := "hqq"
	id := int32(26)
	email := "hqq"

	number := "19812199"
	var a stProto.Person_PhoneType = stProto.Person_MOBILE

	phoneNumberSlice := make([]*stProto.Person_PhoneNumber, 0)
	phoneNumberSlice = append(phoneNumberSlice, &stProto.Person_PhoneNumber{
		Number: &number,
		Type:   &a,
	})

	//var hens [1]*stProto.Person_PhoneNumber
	//
	//
	//hens[0] = &stProto.Person_PhoneNumber{
	//	Number: &number,
	//	Type:   &a,
	//}

	//发送消息
	cnt := int32(0)
	sender := bufio.NewScanner(os.Stdin)

	for sender.Scan() {
		println(sender)
		cnt++
		stSend := &stProto.Person{
			Name:   &name,
			Id:     &id,
			Email:  &email,
			Phones: phoneNumberSlice,
		}

		//protobuf编码
		pData, err := proto.Marshal(stSend)
		if err != nil {
			panic(err)
		}

		//发送
		conn.Write(pData)
		if sender.Text() == "stop" {
			return
		}
	}
}
