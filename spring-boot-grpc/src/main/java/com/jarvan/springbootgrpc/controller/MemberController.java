package com.jarvan.springbootgrpc.controller;

import com.jarvan.grpcdemo.grpc.Member;
import com.jarvan.grpcdemo.grpc.MemberListRequest;
import com.jarvan.grpcdemo.grpc.MemberListResponse;
import com.jarvan.grpcdemo.grpc.MemberListServiceGrpc;
import com.jarvan.grpcdemo.grpc.MemberLoginRequest;
import com.jarvan.grpcdemo.grpc.MemberLoginResponse;
import com.jarvan.grpcdemo.grpc.MemberLoginServiceGrpc;
import com.jarvan.springbootgrpc.vo.MemberVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * Created by zjw on 2021/5/25 10:34
 */
@RestController
public class MemberController {

    @Autowired
    private MemberListServiceGrpc.MemberListServiceBlockingStub memberListServiceBlockingStub;
    @Autowired
    private MemberLoginServiceGrpc.MemberLoginServiceBlockingStub memberLoginServiceBlockingStub;


    /**
     * curl -X POST http://localhost:8080/login -H "Content-type: application/json" -d "{\"username\":\"jarvan\", \"password\":\"123456\"}"
     * @param memberVO
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestBody MemberVO memberVO){
        MemberLoginRequest request = MemberLoginRequest.newBuilder()
                .setMember(Member.newBuilder().setPassword(memberVO.getPassword()).setUsername(memberVO.getUsername()).build())
                .build();
        MemberLoginResponse response = this.memberLoginServiceBlockingStub.memberLogin(request);
        return response.getToken();
    }

    /**
     * curl "http://localhost:8080/list"
     * @return
     */
    @GetMapping("/list")
    public List<MemberVO> list(){
        MemberListRequest request = MemberListRequest.newBuilder().setPage(1).setPerPage(2).build();
        MemberListResponse response = this.memberListServiceBlockingStub.memberList(request);
        return MemberVO.getList(response.getMemberList());
    }
}
