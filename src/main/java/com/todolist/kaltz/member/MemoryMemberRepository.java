package com.todolist.kaltz.member;


import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemoryMemberRepository instance = new MemoryMemberRepository();

    public static MemoryMemberRepository getInstance() {
        return instance;
    }

    private MemoryMemberRepository() {

    }

    @Override
    public void save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

    public void clearStore() {
        store.clear();
    }
}
