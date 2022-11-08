package com.todolist.kaltz.member.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.todolist.kaltz.AppConfig;
import com.todolist.kaltz.member.Member;
import com.todolist.kaltz.member.MemberService;
import com.todolist.kaltz.member.MemberServiceImpl;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "memberFormServlet", urlPatterns = "/members/form")
public class MemberFormServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    private AppConfig appConfig = new AppConfig();
    private MemberService memberService = appConfig.memberService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberFormServlet.service");

        ServletInputStream inputStream = request.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);

        System.out.println("messageBody = " + messageBody);

        MemberData memberData = objectMapper.readValue(messageBody, MemberData.class);

        Member member = new Member(1L, memberData.getName(), memberData.getPassword());
        memberService.join(member);

        System.out.println("member.name = " + memberData.getName());
        System.out.println("member.password = " + memberData.getPassword());

        Member storedMember = memberService.findMember(1L);

        response.getWriter().write("ok" + "\n");
        response.getWriter().write("memberName : " + storedMember.getName() + "\n");
        response.getWriter().write("password : " + storedMember.getPassword() + "\n");

    }
}
