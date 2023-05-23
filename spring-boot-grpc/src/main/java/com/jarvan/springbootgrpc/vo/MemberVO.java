package com.jarvan.springbootgrpc.vo;

import com.jarvan.grpcdemo.grpc.Member;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 描述：
 * Created by zjw on 2021/5/25 10:23
 */
@AllArgsConstructor
@Getter
@Setter
public class MemberVO {
    private String username;
    private String password;
    private String info;

    public static List<MemberVO> getList(List<Member> members) {
        List<MemberVO> memberVOs = new ArrayList<>(members.size());
        members.forEach(a -> {
            MemberVO vo = new MemberVO(a.getUsername(), a.getPassword(), a.getInfo());
            memberVOs.add(vo);
        });
        return memberVOs;
    }
}
