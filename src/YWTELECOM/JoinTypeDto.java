package YWTELECOM;

public class JoinTypeDto {

	
	private String type;			// 가입유형코드
	private String typename;		// 가입유형이름
	
	
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
		
		return " [ 가입유형 정보 ] 유형코드 : " + type + ", 가입유형이름 : " + typename;
	}
	

	
}
