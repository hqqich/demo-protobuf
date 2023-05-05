package main

import (
	"bufio"
	"fmt"
	"google.golang.org/protobuf/proto"
	stProto "gosrc/protos"
	"io"
	"net"
	"os"
	"strconv"
	"time"
	//protobuf编解码库,下面两个库是相互兼容的，可以使用其中任意一个
	//"github.com/golang/protobuf/proto"
	//"github.com/gogo/protobuf/proto"
)

func main() {

	two()

}

func two() {
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
	defer func(conn net.Conn) {
		err := conn.Close()
		if err != nil {

		}
	}(conn)

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

	//发送消息
	var sender *bufio.Scanner = bufio.NewScanner(os.Stdin)
	var scan bool = sender.Scan()
	if scan {
		text := sender.Text()
		atoi, _ := strconv.Atoi(text)

		for i := 0; i < atoi; i++ {

			stSend := &stProto.Person{
				Name:   &name,
				Id:     &id,
				Email:  &email,
				Phones: phoneNumberSlice,
			}

			//protobuf编码，编完的是一个 []byte 类型
			var pData, err = proto.Marshal(stSend)
			if err != nil {
				panic(err)
			}

			//发送
			_, _ = conn.Write(pData)
		}
	}

	var (
		all, _ = io.ReadAll(conn)
	)
	fmt.Println(all)
	fmt.Println(string(all))

}

func one() {
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
