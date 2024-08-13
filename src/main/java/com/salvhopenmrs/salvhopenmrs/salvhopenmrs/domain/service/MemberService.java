package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.domain.service;

import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.domain.entity.Member;
import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    final MemberRepository memberRepository;

    public Member findMember(String username) {
        return memberRepository.findByUsername(username);
    }

    public void update(Member member) {
        memberRepository.save(member);
    }

    public void resetToken(String token) {
        memberRepository.findByToken(token).ifPresent(member -> {
            member.reset(null);
            memberRepository.save(member);
        });
    }

}
