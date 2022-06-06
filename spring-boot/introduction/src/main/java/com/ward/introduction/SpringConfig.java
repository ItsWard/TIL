package com.ward.introduction;

import com.ward.introduction.repository.JpaMemberRepository;
import com.ward.introduction.repository.MemberRepository;
import com.ward.introduction.repository.MemoryMemberRepository;
import com.ward.introduction.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Configuration // DI
public class SpringConfig {

    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean //컴포넌트 스캔을 사용하지않고 직접 스캔하는경우, 내부 데이터만 변경하면, 컨테이너에 등록이되어 편리하다
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }

}
