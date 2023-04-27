package main

import (
	"fmt"
	"gosrc/protos"
)

func main() {

	fmt.Print("Hello, world.\n")

	info := protos.UserInfo{
		Message: "John",
		Length:  12,
		Cnt:     10,
	}
	fmt.Println(info.Message)

}
