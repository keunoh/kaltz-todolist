//package com.todolist.kaltz.member;
//
//import com.todolist.kaltz.AppConfig;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//class MemberRepositoryTest {
//
//    MemberRepository memberRepository;
//
//    MemoryMemberRepository memoryMemberRepository = MemoryMemberRepository.getInstance();
//
//    @BeforeEach
//    public void beforeEach() {
//        AppConfig appConfig = new AppConfig();
//        memberRepository = appConfig.memberRepository();
//        memoryMemberRepository.clearStore();
//    }
//
//
//    @Test
//    void save() {
//        //given
//        Member member = new Member("memberName", "1234");
//
//        //when
//        memberRepository.save(member);
//        Member findMember = memberRepository.findById(1L);
//
//        //then
//        Assertions.assertThat(findMember).isEqualTo(member);
//    }
//}