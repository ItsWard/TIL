package ward.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ward.basic.discount.DiscountPolicy;
import ward.basic.discount.FixDiscountPolicy;
import ward.basic.discount.RateDiscountPolicy;
import ward.basic.member.MemberRepository;
import ward.basic.member.MemberService;
import ward.basic.member.MemberServiceImpl;
import ward.basic.member.MemoryMemberRepository;
import ward.basic.order.OrderService;
import ward.basic.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    //생성된 객체 인스턴스의 참조를 생성자를 통해서 주입해준다.

    @Bean
    public MemberService memberService() {
        System.out.println("AppConfig.memberService");
        return new MemberServiceImpl(memberRepository()); //생성자 주입
    }
    @Bean
    public MemberRepository memberRepository() {
        System.out.println("AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        System.out.println("AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        System.out.println("AppConfig.discountPolicy");
        return new RateDiscountPolicy();

    }

}
