package com.todolist.kaltz.member;

import com.todolist.kaltz.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class MemberRepositoryTest {

    MemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberRepository = appConfig.memberRepository();
    }

    @Test
    void save() {
        //given
        Member member = new Member(1L, "memberName", "1234");

        //when
        memberRepository.save(member);
        Member findMember = memberRepository.findById(1L);

        //then
        Assertions.assertThat(findMember).isEqualTo(member);
    }
}