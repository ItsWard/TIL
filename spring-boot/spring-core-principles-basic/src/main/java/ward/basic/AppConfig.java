package ward.basic;

import ward.basic.discount.DiscountPolicy;
import ward.basic.discount.FixDiscountPolicy;
import ward.basic.discount.RateDiscountPolicy;
import ward.basic.member.MemberRepository;
import ward.basic.member.MemberService;
import ward.basic.member.MemberServiceImpl;
import ward.basic.member.MemoryMemberRepository;
import ward.basic.order.OrderService;
import ward.basic.order.OrderServiceImpl;

public class AppConfig {

    //생성된 객체 인스턴스의 참조를 생성자를 통해서 주입해준다.


    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository()); //생성자 주입
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();

    }

}
