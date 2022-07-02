package ward.basic.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
