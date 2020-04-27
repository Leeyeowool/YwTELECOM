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
	//������ 
	
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

	
	
	
	// [ �Է¸޼ҵ� ] -------------------------------------------------------------------------
	
	
	
	// 1. �� ���� �Է�
	
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
			System.out.println(ret + "���� ��ϵǾ����ϴ�.");  
			
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
	
	
	
	// 2. ���� ���� ��� (�� �׸��� ���� ���ɼ��� ��� ��ǻ� ���x)

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
				System.out.println(ret + "���� ��ϵǾ����ϴ�.");  
				
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
	
	
	
	
		// 3. �ڵ��� ���� �Է�
		
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
				System.out.println(ret + "���� ��ϵǾ����ϴ�.");  
				
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
		
	
	
	
		// 4. ����� �Է�
		
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
				System.out.println(ret + "���� ��ϵǾ����ϴ�.");  
				
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
	
	
	
	
		// 5.���԰� ���� ���
		
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
				System.out.println(ret + "���� ��ϵǾ����ϴ�.");  
				
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
	
	
	
	//[ ��ȸ �޼ҵ� ]------------------------------------------------------------------------------------
		
			
	// 1. ��ü �� ��ȸ
	
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
		
		
	
	
	

	// 2. ��ü �������� ��ȸ
	
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
	
	
	
	
	
	// 3. ��ü �Ǹ� ���� ��ȸ
	
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
	
	
	
	
	
		// 4. ��ü  ����� ��ȸ
		
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
		
	
		//[ �˻� �޼ҵ� ] ------------------------------------------------------------------------------------
			
		// ���԰� �̸����� ��ȸ (�������̺� �����Ͽ� ���� ���) 
			
						
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
			
			
			
			
			
			
					
			
		// 4. �Է� �ݾ� ������ ����� ��ȸ
			
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
			
			
			// 5. �Ǹ����� ������ �� ��ȸ
				
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
				
				
				
						
	
	
		
	
	//[ ���� �޼ҵ� ] ------------------------------------------------------------------------------------
	
	
	// 1. �� ���� �����ϱ� ( ����ȣ �޾Ƽ�  �ڵ�����ȣ, �ּ� �����ϱ�)
	
	
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
			System.out.println(ret + "���� �����Ǿ����ϴ�.");
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
	
	
	// 2. ���� �� ���� �����ϱ� (���Թ�ȣ �޾Ƽ� ����� ����)
	
	
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
				System.out.println(ret + "���� �����Ǿ����ϴ�.");
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
		
		
		
		
		
		
		
		
		
	//[ ���� �޼ҵ� ] ------------------------------------------------------------------------------------	
		
	
	
	// (������ ������ȣ�Է¹޾�) ���� ����/�����ڻ���       �ٸ� ���̺��� ���� �����Ǿ��ִ� ������̱⶧���� ������ �ʿ� �����Ͱ��ƿ�..
	
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
			System.out.println(ret + "���� �����Ǿ����ϴ�.");
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
