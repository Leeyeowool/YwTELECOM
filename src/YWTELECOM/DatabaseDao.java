package YWTELECOM;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class DatabaseDao {

	
	private static DatabaseDao instance = null; 
	//생성자 
	
	private DatabaseDao() {

	}
		
		
	
	public static DatabaseDao getInstance() {
		synchronized (DatabaseDao.class) { 
			if (instance == null) { 				
				instance = new DatabaseDao();		 
			}
		}
		return instance;				
	}

	
	
	
	// [ 입력메소드 ] -------------------------------------------------------------------------
	
	
	
	// 1. 고객 정보 입력
	
	public void insertCustomer(CustomerDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ret = 0;
	
		String query = "insert into CUSTOMER values('C'||SEQ_CUSTOMER.nextval, ?, ?, ?, ?, ?, default)"; 
		try {																	
			conn = ConnectionUtil.getConnection();	
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getName());	
			pstmt.setString(2, dto.getSocialnum());	
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddr());
			pstmt.setString(5, dto.getEmail());				
			ret = pstmt.executeUpdate();           
			System.out.println(ret + "행이 등록되었습니다.");  
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {	
				try {
					pstmt.close();	
				} catch (SQLException e) {	
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	// 2. 가입 유형 등록 (이 항목은 변경 가능성이 없어서 사실상 사용x)

		public void insertJoinType(JoinTypeDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int ret = 0;
					
			String query = "insert into JOIN_TYPE values('JT'||SEQ_JOIN_TYPE.nextval, ?)"; 
			try {																	
				conn = ConnectionUtil.getConnection();	
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, dto.getTypename());	
				ret = pstmt.executeUpdate();           
				System.out.println(ret + "행이 등록되었습니다.");  
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {	
					try {
						pstmt.close();	
					} catch (SQLException e) {	
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	
	
	
		// 3. 핸드폰 기종 입력
		
		public void insertPhoneType(PhoneTypeDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int ret = 0;
					
			String query = "insert into PHONE_TYPE values('PH'||SEQ_PHONE_TYPE.nextval, ?, ?, ?)"; 
			try {																	
				conn = ConnectionUtil.getConnection();	
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, dto.getCompany());	
				pstmt.setString(2, dto.getCompany());	
				pstmt.setInt(3, dto.getPhoprice());
				ret = pstmt.executeUpdate();           
				System.out.println(ret + "행이 등록되었습니다.");  
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {	
					try {
						pstmt.close();	
					} catch (SQLException e) {	
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	
	
	
		// 4. 요금제 입력
		
		public void insertPaymentSys(PaymentSysDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int ret = 0;			
	
			String query = "insert into PAYMENT_SYSTEM values('PS'||SEQ_PAYMENT_SYSTEM.nextval, ?, ?)"; 
			try {																	
				conn = ConnectionUtil.getConnection();	
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, dto.getPmname());	
				pstmt.setInt(2, dto.getPsprice());
					
				ret = pstmt.executeUpdate();           
				System.out.println(ret + "행이 등록되었습니다.");  
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {	
					try {
						pstmt.close();	
					} catch (SQLException e) {	
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	
	
	
		// 5.가입고객 정보 등록
		
		public void insertJoinCus(JoinCusDto dto) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int ret = 0;
					
			String query = "insert into JOIN_CUS values(SEQ_JOINCUS.nextval, ?, ?, ?, ?, to_date(?, 'yyyy-mm-dd'), ? )"; 
			try {																	
				conn = ConnectionUtil.getConnection();	
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, dto.getCusnum());	
				pstmt.setString(2, dto.getPhocode());
				pstmt.setString(3, dto.getJointype());
				pstmt.setString(4, dto.getJoincode());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
				pstmt.setString(5, dto.getJoindate());
				pstmt.setInt(6, dto.getPreriod());
				ret = pstmt.executeUpdate();           
				System.out.println(ret + "행이 등록되었습니다.");  
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {	
					try {
						pstmt.close();	
					} catch (SQLException e) {	
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	
	
	//[ 조회 메소드 ]------------------------------------------------------------------------------------
		
			
	// 1. 전체 고객 조회
	
		public ArrayList<CustomerDto> selectCustomerAll() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ArrayList<CustomerDto> ls = new ArrayList<CustomerDto>();
			ResultSet rs = null;
			String query = "select * from CUSTOMER";
			try {
				conn = ConnectionUtil.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
						
					while(rs.next()) {
					CustomerDto dto = new CustomerDto();
					dto.setCusnum(rs.getString(1));
					dto.setName(rs.getString(2));
					dto.setSocialnum(rs.getString(3));
					dto.setPhone(rs.getString(4));
					dto.setAddr(rs.getString(5));
					dto.setEmail(rs.getString(6));
					dto.setJoinchk(rs.getString(7));
					ls.add(dto);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return ls;
		}
		
		
	
	
	

	// 2. 전체 가입유형 조회
	
	public ArrayList<JoinTypeDto> selectJoinTypeAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ArrayList<JoinTypeDto> ls = new ArrayList<JoinTypeDto>();
		ResultSet rs = null;
		String query = "select * from JOIN_TYPE";
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
				while(rs.next()) {
				JoinTypeDto dto = new JoinTypeDto();
				dto.setType(rs.getString(1));
				dto.setTypename(rs.getString(2));
				ls.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}
	
	
	
	
	
	// 3. 전체 판매 기종 조회
	
		public ArrayList<PhoneTypeDto> selectPhoneTypeAll() {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ArrayList<PhoneTypeDto> ls = new ArrayList<PhoneTypeDto>();
			ResultSet rs = null;
			String query = "select * from PHONE_TYPE";
			try {
				conn = ConnectionUtil.getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
					while(rs.next()) {
					PhoneTypeDto dto = new PhoneTypeDto();
					dto.setPhocode(rs.getString(1));
					dto.setPhoname(rs.getString(2));
					dto.setCompany(rs.getString(3));
					dto.setPhoprice(rs.getInt(4));
					ls.add(dto);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return ls;
		}
	
	
	
	
	
		// 4. 전체  요금제 조회
		
			public ArrayList<PaymentSysDto> selectPaymentAll() {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ArrayList<PaymentSysDto> ls = new ArrayList<PaymentSysDto>();
				ResultSet rs = null;
				String query = "select * from PAYMENT_SYSTEM";
				try {
					conn = ConnectionUtil.getConnection();
					pstmt = conn.prepareStatement(query);
					rs = pstmt.executeQuery();
						while(rs.next()) {
						PaymentSysDto dto = new PaymentSysDto();
						dto.setPmcode(rs.getString(1));
						dto.setPmname(rs.getString(2));
						dto.setPsprice(rs.getInt(3));
						ls.add(dto);
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					if(pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				return ls;
			}
		
	
		//[ 검색 메소드 ] ------------------------------------------------------------------------------------
			
		// 가입고객 이름으로 조회 (여러테이블 조인하여 정보 출력) 
			
						
			public ArrayList<CusSelectDto> seachJoinCus(String name) {
				Connection conn = null;
				StringBuffer sql = new StringBuffer();
				PreparedStatement pstmt = null;
				ArrayList<CusSelectDto> ls = new ArrayList<CusSelectDto>();
				ResultSet rs = null;
				
				sql.append("select JC.JOIN_CUS_CODE, C.CUS_NAME, C.CUS_PHONE, PT.PHO_NAME,");
				sql.append("JT.JOIN_TYPT_NAME, PS.PS_NAME, JC.JOIN_SDATE, JC.JOIN_PERIOD ");
				sql.append("from JOIN_CUS JC ");
				sql.append("join CUSTOMER C on (JC.JOIN_CUS_ID = C.CUS_ID) ");
				sql.append("join JOIN_TYPE JT on (JC.JOIN_CUS_TYPE = JT.JOIN_TYPE_CODE) ");
				sql.append("join PHONE_TYPE PT on(JC.JOIN_PHO_CODE = PT.PHO_CODE) ");
				sql.append("join PAYMENT_SYSTEM PS on(JC.JOIN_PS_CODE = PS.PS_CODE) ");
				sql.append("where CUS_NAME = ? ");
				
				
				try {
					conn = ConnectionUtil.getConnection();
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1,name);
					rs = pstmt.executeQuery();
				
					
					
						while(rs.next()) {
						CusSelectDto dto = new CusSelectDto();
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
						dto.setJoinnum(rs.getInt(1));
						dto.setName(rs.getString(2));
						dto.setPhone(rs.getString(3));
						dto.setPhoname(rs.getString(4));
						dto.setTypename(rs.getString(5));
						dto.setPmname(rs.getString(6));
						dto.setJoindate(df.format(rs.getDate(7)));
						dto.setPreriod(rs.getInt(8));
						ls.add(dto);
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					if(pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
				return ls;
			}
			
			
			
			
			
			
					
			
		// 4. 입력 금액 사이의 요금제 조회
			
				public ArrayList<PaymentSysDto> seachPayPrice(int a, int b) {
					Connection conn = null;
					PreparedStatement pstmt = null;
					ArrayList<PaymentSysDto> ls = new ArrayList<PaymentSysDto>();
					ResultSet rs = null;
					String query = "select * from PAYMENT_SYSTEM where PS_PRICE between ? and ? " + 
							"order by PS_PRICE asc";
					try {
						conn = ConnectionUtil.getConnection();
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(1,a);
						pstmt.setInt(2,b);
						rs = pstmt.executeQuery();
							while(rs.next()) {
							PaymentSysDto dto = new PaymentSysDto();
							dto.setPmcode(rs.getString(1));
							dto.setPmname(rs.getString(2));
							dto.setPsprice(rs.getInt(3));
							ls.add(dto);
						}
					}catch(SQLException e) {
						e.printStackTrace();
					}finally {
						if(pstmt != null) {
							try {
								pstmt.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						if(conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
					return ls;
				}
			
			
			// 5. 판매중인 최저가 모델 조회
				
				public ArrayList<PhoneTypeDto> seachMinPrice() {
					Connection conn = null;
					PreparedStatement pstmt = null;
					ArrayList<PhoneTypeDto> ls = new ArrayList<PhoneTypeDto>();
					ResultSet rs = null;
					String query = "select * from PHONE_TYPE where PHO_PRICE in (select min(PHO_PRICE) from PHONE_TYPE)";
					try {
						conn = ConnectionUtil.getConnection();
						pstmt = conn.prepareStatement(query);
						rs = pstmt.executeQuery();
							while(rs.next()) {
							PhoneTypeDto dto = new PhoneTypeDto();
							dto.setPhocode(rs.getString(1));
							dto.setPhoname(rs.getString(2));
							dto.setCompany(rs.getString(3));
							dto.setPhoprice(rs.getInt(4));
							ls.add(dto);
						}
					}catch(SQLException e) {
						e.printStackTrace();
					}finally {
						if(pstmt != null) {
							try {
								pstmt.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						if(conn != null) {
							try {
								conn.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
					return ls;
				}
				
				
				
						
	
	
		
	
	//[ 수정 메소드 ] ------------------------------------------------------------------------------------
	
	
	// 1. 고객 정보 수정하기 ( 고객번호 받아서  핸드폰번호, 주소 수정하기)
	
	
	public void updateCustoner(String cusnum, String phone, String addr) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ret = 0;
		String query = "update CUSTOMER set CUS_PHONE=?, CUS_ADDR=? where CUS_ID=?";
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, cusnum);
			ret = pstmt.executeUpdate();
			System.out.println(ret + "행이 수정되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	// 2. 가입 고객 정보 수정하기 (가입번호 받아서 요금제 수정)
	
	
		public void updateJoinCus(int joinnum, String pmcode) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			int ret = 0;
			String query = "update JOIN_CUS set JOIN_PS_CODE=? where JOIN_CUS_CODE=?";
			try {
				conn = ConnectionUtil.getConnection();
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, pmcode);
				pstmt.setInt(2, joinnum);
				ret = pstmt.executeUpdate();
				System.out.println(ret + "행이 수정되었습니다.");
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
	//[ 삭제 메소드 ] ------------------------------------------------------------------------------------	
		
	
	
	// (가입자 고유번호입력받아) 가입 해지/가입자삭제       다른 테이블은 거의 고정되어있는 내용들이기때문에 삭제가 필요 없을것같아요..
	
	public void deleteCus(int joinnum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int ret = 0;
		String query = "delete from JOIN_CUS where JOIN_CUS_CODE =?";
		try {
			conn = ConnectionUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, joinnum);
			ret = pstmt.executeUpdate();
			System.out.println(ret + "행이 삭제되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
