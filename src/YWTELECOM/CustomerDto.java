package YWTELECOM;

public class CustomerDto {

	private String cusnum;	//고객번호
	private String name;	//고객이름	
	private String socialnum ;	//주민번호
	private String phone; 		//핸드폰번호
	private String addr;	//주소
	private String email;	//이메일
	private String joinchk;  // 가입여부
	
	//생성자
	public CustomerDto() {}
	
	
	public CustomerDto(String name, String socialnum, String phone, String addr, String email){
		this.name = name;
		this.socialnum = socialnum;
		this.phone = phone;
		this.addr = addr;
		this.email = email;
	}
	
	
		


	public String getCusnum() {
		return cusnum;
	}


	public void setCusnum(String cusnum) {
		this.cusnum = cusnum;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSocialnum() {
		return socialnum;
	}
	public void setSocialnum(String socialnum) {
		this.socialnum = socialnum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
		
	public String getJoinchk() {
		return joinchk;
	}


	public void setJoinchk(String joinchk) {
		this.joinchk = joinchk;
	}


	
	
	@Override
	public String toString() {
		
		return " [ 고객 정보 ] 고객번호 : " + cusnum + ", 고객이름 : " + name + ", 주민번호 : " + socialnum + ", 핸드폰번호 : " + phone + 
				", 주소 : " + addr + ", 이메일 : " + email + ", 가입여부 : " + joinchk;
	}
	
	
	

	
	
}
