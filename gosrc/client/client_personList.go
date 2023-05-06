package main

import (
	"fmt"
	"google.golang.org/protobuf/proto"
	stProto "gosrc/protos"
	"io"
	"net"
	"strconv"
	"time"
	//protobuf编解码库,下面两个库是相互兼容的，可以使用其中任意一个
	//"github.com/golang/protobuf/proto"
	//"github.com/gogo/protobuf/proto"
)

func clientPersonList() {
	strIP := "127.0.0.1:7788"
	var conn net.Conn
	var err error

	//连接服务器
	for conn, err = net.Dial("tcp", strIP); err != nil; conn, err = net.Dial("tcp", strIP) {
		fmt.Println("connect", strIP, "fail")
		time.Sleep(time.Second)
		fmt.Println("reconnect...")
	}

	// 将缓冲区大小设置为4096字节
	_ = conn.(*net.TCPConn).SetWriteBuffer(2048 * 4)

	fmt.Println("connect", strIP, "success")
	defer func(conn net.Conn) {
		err := conn.Close()
		if err != nil {

		}
	}(conn)

	_ = conn.(*net.TCPConn).SetWriteBuffer(2048 * 4)

	person := make([]*stProto.Person, 0)

	// 循环写入数据
	for i := 0; i < 100; i++ {
		person = append(person, getOnePerson(i))
	}

	s := &stProto.PersonList{Person: person}

	//protobuf编码，编完的是一个 []byte 类型
	var pData, err2 = proto.Marshal(s)
	if err2 != nil {
		panic(err2)
	}

	fmt.Println(len(pData))

	//发送
	_, _ = conn.Write(pData)

	var (
		all, _ = io.ReadAll(conn)
	)
	fmt.Println(all)
	fmt.Println(string(all))

}

func getOnePerson(number int) *stProto.Person {

	name := "name" + strconv.Itoa(number)
	id := int32(number)
	email := "email" + strconv.Itoa(number)

	numberStr := "123456789" + strconv.Itoa(number)
	var a stProto.Person_PhoneType = stProto.Person_MOBILE

	phoneNumberSlice := make([]*stProto.Person_PhoneNumber, 0)
	phoneNumberSlice = append(phoneNumberSlice, &stProto.Person_PhoneNumber{
		Number: &numberStr,
		Type:   &a,
	})

	stSend := &stProto.Person{
		Name:   &name,
		Id:     &id,
		Email:  &email,
		Phones: phoneNumberSlice,
	}

	return stSend

}
