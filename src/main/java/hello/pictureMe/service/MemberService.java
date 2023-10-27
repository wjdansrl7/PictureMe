package hello.pictureMe.service;

import hello.pictureMe.entity.Member;
import hello.pictureMe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 회원가입
     */
    public Long join(Member member) {
        memberRepository.save(member);
        return member.getId();
    }


}
