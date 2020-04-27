package YWTELECOM;

public class CustomerDto {

	private String cusnum;	//����ȣ
	private String name;	//���̸�	
	private String socialnum ;	//�ֹι�ȣ
	private String phone; 		//�ڵ�����ȣ
	private String addr;	//�ּ�
	private String email;	//�̸���
	private String joinchk;  // ���Կ���
	
	//������
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
		
		return " [ �� ���� ] ����ȣ : " + cusnum + ", ���̸� : " + name + ", �ֹι�ȣ : " + socialnum + ", �ڵ�����ȣ : " + phone + 
				", �ּ� : " + addr + ", �̸��� : " + email + ", ���Կ��� : " + joinchk;
	}
	
	
	

	
	
}
