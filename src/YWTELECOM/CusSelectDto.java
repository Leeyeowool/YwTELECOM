package YWTELECOM;

public class CusSelectDto {
 
	private int joinnum;
	private String name;
	private String phone;
	private String phoname;
	private String typename;
	private	String pmname;
	private String joindate;
	private int preriod;
	
	
	
	
	
	public int getJoinnum() {
		return joinnum;
	}
	public void setJoinnum(int joinnum) {
		this.joinnum = joinnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoname() {
		return phoname;
	}
	public void setPhoname(String phoname) {
		this.phoname = phoname;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getPmname() {
		return pmname;
	}
	public void setPmname(String pmname) {
		this.pmname = pmname;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public int getPreriod() {
		return preriod;
	}
	public void setPreriod(int preriod) {
		this.preriod = preriod;
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		return " [가입 고객] 가입자번호 : " + joinnum + ", 고객이름 : " + name + ", 핸드폰번호 : " + phone + ", 가입유형 : " + typename + 
				", 요금제이름 : " + pmname + ", 가입날짜 : " + joindate + ", 약정기간(개월) : " + preriod ;
	}
	
	
	
	
	
	
	
}
