package hjh.spring.POS.service;

import hjh.spring.POS.model.Member;
import hjh.spring.POS.repository.MemberRepository;

public class MemberService
{
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository)
    {
        this.memberRepository = memberRepository;
    }

    public void register(Member member)
    {
        memberRepository.save(member);
    }

    public Member login(String email, String password)
    {
        return memberRepository.findByEmailAndPassword(email, password);
    }

    public boolean checkDuplicateEmail(String email)
    {
        return memberRepository.checkDuplicateEmail(email);
    }
}
