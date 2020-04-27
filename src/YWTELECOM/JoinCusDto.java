package YWTELECOM;


public class JoinCusDto {

	private int joinnum;	// 가입자관리번호
	private String cusnum;		// 고객번호
	private String phocode; 	// 사용기종
	private String jointype;	// 가입유형
	private String joincode;	// 요금제코드
	private String joindate;	// 가입날짜
	private int preriod;	// 약정
	
	
	
	//생성자
	public JoinCusDto() {}
	
	

	public JoinCusDto(String cusnum, String phocode, String jointype,
					String joincode, String joindate, int preriod ) {
		
		this.cusnum = cusnum;
		this.phocode = phocode;
		this.jointype = jointype;
		this.joincode = joincode;
		this.joindate = joindate;
		this.preriod = preriod;
		
	}

	
	
	


	public int getJoinnum() {
		return joinnum;
	}



	public void setJoinnum(int joinnum) {
		this.joinnum = joinnum;
	}



	public String getCusnum() {
		return cusnum;
	}



	public void setCusnum(String cusnum) {
		this.cusnum = cusnum;
	}



	public String getPhocode() {
		return phocode;
	}



	public void setPhocode(String phocode) {
		this.phocode = phocode;
	}



	public String getJointype() {
		return jointype;
	}



	public void setJointype(String jointype) {
		this.jointype = jointype;
	}



	public String getJoincode() {
		return joincode;
	}



	public void setJoincode(String joincode) {
		this.joincode = joincode;
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
		
		return " [가입고객정보] 가입자번호 : " + joinnum + ", 고객번호 : " + cusnum + ", 사용기종 : " + phocode + ", 가입유형 : " + jointype + 
				", 요금제코드 : " + joincode + ", 가입날짜 : " + joindate + ", 약정기간(개월) : " + preriod ;
	}
	

	
	
	
	
	
}
