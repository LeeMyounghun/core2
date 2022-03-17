package hello2.core2.member;

import hello2.core2.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void BeforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        // given 2022
        Member member = new Member(1L, "memberA", Grade.VIP);
        // when 03
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        // then 16
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
