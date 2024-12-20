package com.example.demo;

import java.time.LocalDateTime;

public class MemberRegisterService
{
    private MemberDao memberDao;

    public MemberRegisterService(MemberDao memberDao)
    {
        this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) throws Exception
    {
        Member member = memberDao.selectByEmail(req.getEmail());
        if (member != null)
        {
            throw new Exception("DuplicateMemberException");
        }
        Member newMember = new Member(req.getEmail(), req.getPassword(),
                req.getName(), LocalDateTime.now());
        memberDao.insert(newMember);
        return newMember.getId();
    }
}