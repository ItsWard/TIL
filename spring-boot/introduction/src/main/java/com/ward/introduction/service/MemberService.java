package com.ward.introduction.service;

import com.ward.introduction.domain.Member;
import com.ward.introduction.repository.MemberRepository;
import com.ward.introduction.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service //스프링 컨테이너에 서비스를 등록하는 에노테이션
public class MemberService {

    private final MemberRepository memberRepository; //DI 생성

    @Autowired //서비스를 생성 할 때 스프링 컨테이너에 있는 리포지토리를 놓어줌(DI)
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        // 같은 이름 중복회원 X
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
