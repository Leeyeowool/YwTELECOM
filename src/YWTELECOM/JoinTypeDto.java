package YWTELECOM;

public class JoinTypeDto {

	
	private String type;			// ���������ڵ�
	private String typename;		// ���������̸�
	
	
	public JoinTypeDto() {}
	
	
	public JoinTypeDto(String typename) {
		this.typename = typename;
	}

	
	
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTypename() {
		return typename;
	}


	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	
	@Override
	public String toString() {
		
		return " [ �������� ���� ] �����ڵ� : " + type + ", ���������̸� : " + typename;
	}
	

	
}
