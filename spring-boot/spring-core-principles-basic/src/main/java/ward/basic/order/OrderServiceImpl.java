package ward.basic.order;

import ward.basic.discount.DiscountPolicy;
import ward.basic.discount.FixDiscountPolicy;
import ward.basic.discount.RateDiscountPolicy;
import ward.basic.member.Member;
import ward.basic.member.MemberRepository;
import ward.basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    //어떤 데이터가 들어올지 모름, 실제 데이터는 AppConfig에서 생성자를 통해서 주입
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    //  private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//  private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); //OrderService에 의존 하고있음! DIP 위반, OCP 위반

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
