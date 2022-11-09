package com.todolist.kaltz;

import com.todolist.kaltz.member.MemberRepository;
import com.todolist.kaltz.member.MemberService;
import com.todolist.kaltz.member.MemberServiceImpl;
import com.todolist.kaltz.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return MemoryMemberRepository.getInstance();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
