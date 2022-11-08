package com.todolist.kaltz.member;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private Long id;
    private String name;
    private String password;

    public Member(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
