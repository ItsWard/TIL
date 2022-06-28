package ward.basic;

import ward.basic.member.Grade;
import ward.basic.member.Member;
import ward.basic.member.MemberService;
import ward.basic.order.Order;
import ward.basic.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId= 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 50000);

        System.out.println("order = " + order);
        System.out.println("order.cacluatePrice = " + order.calculaterPrice());

    }

}
