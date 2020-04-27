package YWTELECOM;

public class PhoneTypeDto {
	
	private String phocode;
	private String phoname;
	private String company;
	private int phoprice;
	
	
	public PhoneTypeDto() {}
	
	public PhoneTypeDto(String phoname, String company, int phoprice) {
	
		this.phoname = phoname;
		this.company = company;
		this.phoprice = phoprice;
	}
	
	
	
	
	
	public String getPhocode() {
		return phocode;
	}
	public void setPhocode(String phocode) {
		this.phocode = phocode;
	}
	public String getPhoname() {
		return phoname;
	}
	public void setPhoname(String phoname) {
		this.phoname = phoname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPhoprice() {
		return phoprice;
	}
	public void setPhoprice(int phoprice) {
		this.phoprice = phoprice;
	}
	
	
	@Override
	public String toString() {
		
		return " [ 기종 정보 ] 기종코드 : " + phocode + ", 기종이름 : " + phoname + ", 제조사 : " + company + ", 출고가 : " + phoprice;
	}
	

}
