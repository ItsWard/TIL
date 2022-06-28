package ward.basic.discount;

import ward.basic.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
