package main

import (
	"fmt"
	"google.golang.org/protobuf/proto"
	"gosrc/protos"
)

func main() {

	fmt.Print("Hello, world.\n")

	info := protos.UserInfo{
		Message: "John",
		Length:  12,
		Cnt:     10,
	}

	var marshal, _ = proto.Marshal(&info)

	fmt.Println(marshal)

}
