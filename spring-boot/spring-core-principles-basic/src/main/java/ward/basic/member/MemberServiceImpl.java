package ward.basic.member;

public class MemberServiceImpl implements MemberService{

    //설계 변경으로 MemberSerivceImpl은 MemoryMemberRepository를 의존하지 않음
    //MemberSerVice만 의존함

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
