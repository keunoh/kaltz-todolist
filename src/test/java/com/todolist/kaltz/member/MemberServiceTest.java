//package com.todolist.kaltz.member;
//
//
//import com.todolist.kaltz.AppConfig;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class MemberServiceTest {
//
//    MemberService memberService;
//    MemoryMemberRepository memoryMemberRepository = MemoryMemberRepository.getInstance();
//
//    @BeforeEach
//    public void beforeEach() {
//        AppConfig appConfig = new AppConfig();
//        memberService = appConfig.memberService();
//        memoryMemberRepository.clearStore();
//    }
//
//
//    @Test
//    void join() {
//        //given
//        Member member = new Member("memberA", "1234");
//
//        //when
//        memberService.join(member);
//        Member findMember = memberService.findMember(1L);
//
//        //then
//        Assertions.assertThat(member).isEqualTo(findMember);
//    }
//}