package jdbc.member.exam;

public interface MemberDAO {
	int insert(MemberDTO member);
	int update(String id, String addr);
	int delete(String id);
}