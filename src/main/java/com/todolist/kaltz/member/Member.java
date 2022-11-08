package com.todolist.kaltz.member;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Member {

    private Long id;
    private String name;
    private String password;


}
