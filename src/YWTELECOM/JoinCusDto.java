package YWTELECOM;


public class JoinCusDto {

	private int joinnum;	// �����ڰ�����ȣ
	private String cusnum;		// ����ȣ
	private String phocode; 	// ������
	private String jointype;	// ��������
	private String joincode;	// ������ڵ�
	private String joindate;	// ���Գ�¥
	private int preriod;	// ����
	
	
	
	//������
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
		
		return " [���԰�����] �����ڹ�ȣ : " + joinnum + ", ����ȣ : " + cusnum + ", ������ : " + phocode + ", �������� : " + jointype + 
				", ������ڵ� : " + joincode + ", ���Գ�¥ : " + joindate + ", �����Ⱓ(����) : " + preriod ;
	}
	

	
	
	
	
	
}
