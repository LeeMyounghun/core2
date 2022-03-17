package hello2.core2.ordderApp;

import hello2.core2.AppConfig;
import hello2.core2.member.Grade;
import hello2.core2.member.Member;
import hello2.core2.member.MemberService;
import hello2.core2.member.MemberServiceImpl;
import hello2.core2.order.Order;
import hello2.core2.order.OrderService;
import hello2.core2.order.OrderServiceImpl;

public class OrdderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();


        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        
        Order order = orderService.createOrder(memberId, "iteamA", 10000);

        System.out.println("order = " + order);
        //System.out.println("order.calculatePrioce() = " + order.calulatePrice());
    }
}
