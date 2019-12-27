package jdbc.member.exam;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String deptno;
	
	public MemberDTO() {
		
	}
	
	//insert¿ë
	public MemberDTO(String id, String pass, String name, String addr, String deptno) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	
}
