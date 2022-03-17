package hello2.core2;

import hello2.core2.discount.FixDiscountPolicy;
import hello2.core2.member.MemberService;
import hello2.core2.member.MemberServiceImpl;
import hello2.core2.member.MemoryMemberRepository;
import hello2.core2.order.OrderService;
import hello2.core2.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
