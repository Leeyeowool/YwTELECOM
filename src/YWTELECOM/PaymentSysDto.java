package YWTELECOM;

public class PaymentSysDto {
	//�����
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
		
		return " [����� ����] �������ȣ : " + pmcode + ", ����� �̸� : " + pmname + ", ��� : " + psprice;
	}
	

	
}
