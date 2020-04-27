package YWTELECOM;

public class PaymentSysDto {
	//요금제
	private String pmcode;	
	private String pmname;
	private int psprice;
	
	
	public PaymentSysDto() {}
	
	
	public PaymentSysDto(String pmname, int psprice) {
	
		this.pmname = pmname;
		this.psprice = psprice;
	}
	
	
	
	public String getPmcode() {
		return pmcode;
	}
	public void setPmcode(String pmcode) {
		this.pmcode = pmcode;
	}
	public String getPmname() {
		return pmname;
	}
	public void setPmname(String pmname) {
		this.pmname = pmname;
	}
	public int getPsprice() {
		return psprice;
	}
	public void setPsprice(int psprice) {
		this.psprice = psprice;
	}
	
	
	
	@Override
	public String toString() {
		
		return " [요금제 정보] 요금제번호 : " + pmcode + ", 요금제 이름 : " + pmname + ", 요금 : " + psprice;
	}
	

	
}
