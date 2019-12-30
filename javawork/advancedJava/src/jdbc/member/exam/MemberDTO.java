package jdbc.member.exam;

import java.sql.Date;

public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String addr;
	private String deptno;
	private Date sysdate;
	private int point;
	
	public MemberDTO() {
		
	}
	

	
	

	public String getId() {
		return id;
	}

	public MemberDTO(String id, String pass, String name, String addr, String deptno) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.addr = addr;
		this.deptno = deptno;
		
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





	public Date getSysdate() {
		return sysdate;
	}





	public void setSysdate(Date sysdate) {
		this.sysdate = sysdate;
	}





	public int getPoint() {
		return point;
	}





	public void setPoint(int point) {
		this.point = point;
	}
	
}
