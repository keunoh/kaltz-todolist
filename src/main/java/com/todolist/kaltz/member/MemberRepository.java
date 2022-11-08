package com.todolist.kaltz.member;


public interface MemberRepository{

    void save(Member member);

    Member findById(Long memberId);
}
