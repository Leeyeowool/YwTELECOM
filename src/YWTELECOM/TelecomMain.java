package YWTELECOM;

import java.util.List;
import java.util.Scanner;

public class TelecomMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DatabaseDao dao = DatabaseDao.getInstance();
		
		System.out.println();
		System.out.println("\t\t [ 여울 텔레콤 어드민 ] ");
		
		
		while (true) {
			try {
				

				System.out.println();
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.print(" 1.등록");
				System.out.print(" 2.목록");
				System.out.print(" 3.검색");
				System.out.print(" 4.수정");
				System.out.print(" 5.해지/삭제");
				System.out.print(" 6.프로그램 종료");
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println();
				System.out.print("입력: ");
				int select = Integer.parseInt(sc.nextLine());

				if (select < 1 || select > 6)
					throw new IndexOutOfBoundsException("범위 초과 오류 발생");

				switch (select) {

/*등록*/				case 1:	
						int sel1 = -1;
						while (sel1 >= 6 || sel1 < 1 ) {
							System.out.println("(1) 고객 등록");
							System.out.println("(2) 가입유형 등록");
							System.out.println("(3) 핸드폰 기종 등록");
							System.out.println("(4) 요금제 등록");
							System.out.println("(5) 가입고객 정보 등록");
							System.out.println("(0) 뒤로가기 ");
							System.out.print("선택 : ");
							sel1 = Integer.parseInt(sc.nextLine());

							if (sel1 == 0) {
	
								break;
							}
	
							else if (sel1 == 1) {
								System.out.println("고객 이름 : ");
								String name = sc.nextLine();
								System.out.println("주민번호 : ");
								String socialunm = sc.nextLine();
								System.out.println("핸드폰번호 : ");
								String phone = sc.nextLine();
								System.out.println("주소 : ");
								String addr = sc.nextLine();
								System.out.println("이메일 : ");
								String email = sc.nextLine();
								CustomerDto dto = new CustomerDto(name, socialunm, phone, addr, email);
								dao.insertCustomer(dto);
								break;
							}
	
							else if (sel1 == 2) {
	
								System.out.println("가입 유형 이름 : ");
								String typename = sc.nextLine();
								JoinTypeDto dto = new JoinTypeDto(typename);
								dao.insertJoinType(dto);
								break;
							}
	
							else if (sel1 == 3) {
	
								System.out.println(" 핸드폰 기종 : ");
								String phoname = sc.nextLine();
								System.out.println(" 제조사 : ");
								String company = sc.nextLine();
								System.out.println(" 출고가 : ");
								int phoprice = Integer.parseInt(sc.nextLine());
								PhoneTypeDto dto = new PhoneTypeDto(phoname, company, phoprice);
								dao.insertPhoneType(dto);
								break;
							}
	
							else if (sel1 == 4) {
	
								System.out.println(" 요금제 이름 : ");
								String pmname = sc.nextLine();
								System.out.println(" 요금 : ");
								int psprice = Integer.parseInt(sc.nextLine());
								PaymentSysDto dto = new PaymentSysDto(pmname, psprice);
								dao.insertPaymentSys(dto);
								break;
							}
	
							else if (sel1 == 5) {
	
								System.out.println(" 고객번호 : ");
								String cusnum = sc.nextLine();
								System.out.println(" 사용기종 코드 : ");
								String phocode = sc.nextLine();
								System.out.println(" 가입유형 : ");
								String jointype = sc.nextLine();
								System.out.println(" 요금제코드 : ");
								String joincode = sc.nextLine();
								System.out.println(" 가입일 : ");
								String joindate = sc.nextLine();
								System.out.println(" 약정 : ");
								int preriod = Integer.parseInt(sc.nextLine());
								JoinCusDto dto = new JoinCusDto(cusnum, phocode, jointype, joincode, joindate, preriod);
								dao.insertJoinCus(dto);
								break;
							}
	
							else {
								System.out.println("0부터 5까지만 선택하세요!");
								break;
	
							}
							
						}
						break;
						

/*목록*/				case 2:
						int sel2 = -1;
							while (sel2 >= 5 || sel2 < 1) {
								System.out.println("(1) 고객 목록");
								System.out.println("(2) 가입유형 목록");
								System.out.println("(3) 판매기종 목록");
								System.out.println("(4) 요금제 목록");
								System.out.println("(0) 뒤로가기 ");
								System.out.print("선택 : ");
								sel2 = Integer.parseInt(sc.nextLine());
		
								if (sel2 == 0) {
		
									break;
								}
		
								else if (sel2 == 1) {
		
									for (CustomerDto o : dao.selectCustomerAll()) {
										System.out.println(o.toString());
									}
									break;
								}
		
								else if (sel2 == 2) {
		
									for (JoinTypeDto o : dao.selectJoinTypeAll()) {
										System.out.println(o.toString());
									}
									break;
		
								}
		
								else if (sel2 == 3) {
		
									for (PhoneTypeDto o : dao.selectPhoneTypeAll()) {
										System.out.println(o.toString());
									}
									break;
		
								}
		
								else if (sel2 == 4) {
		
									for (PaymentSysDto o : dao.selectPaymentAll()) {
										System.out.println(o.toString());
									}
									break;
		
								} else {
									System.out.println("0부터 4까지만 선택하세요");
									break;
								}
								
							}
							break;
							
					
/*검색*/				case 3:

					int sel3 = -1;
						while (sel3 >= 4 || sel3 < 0) {
							System.out.println("(1) 가입고객 검색 ");
							System.out.println("(2) 요금제 검색 ");
							System.out.println("(3) 최저가 기종 검색 ");
							System.out.println("(0) 뒤로가기 ");
							System.out.print("선택 : ");
							sel3 = Integer.parseInt(sc.nextLine());
	
							if (sel3 == 0) {
	
								break;
							}
	
							else if (sel3 == 1) {
								System.out.println("검색할 고객의 이름 입력 : ");
								String name = sc.nextLine();
	
								for (CusSelectDto o : dao.seachJoinCus(name)) {
									System.out.println(o.toString());
								}
								break;
	
							}
	
							else if (sel3 == 2) {
								System.out.println("입력하시는 금액으로  최저요금제 ~ 최고요금제를 검색합니다.");
								System.out.println(" 최저금액 : ");
								int min = Integer.parseInt(sc.nextLine());
								System.out.println(" 최고금액 : ");
								int max = Integer.parseInt(sc.nextLine());
	
								for (PaymentSysDto o : dao.seachPayPrice(min, max)) {
									System.out.println(o.toString());
								}
								break;
	
							}
							else if (sel3 == 3) {
								
								for (PhoneTypeDto o : dao.seachMinPrice()) {
									System.out.println(o.toString());
								}
								break;
	
							}						
							
							
							else {
								System.out.println("0부터 3까지만 선택하세요!");
								break;
							}
	
						}
						break;

/*수정*/				case 4:
						int sel4 = -1;
							while (sel4 >= 3 || sel4 < 0) {
								System.out.println("(1) 고객 정보 수정 ");
								System.out.println("(2) 가입고객 요금제 변경 ");
								System.out.println("(0) 뒤로가기 ");
								System.out.print("선택 : ");
								sel4 = Integer.parseInt(sc.nextLine());
		
								if (sel4 == 0) {
		
									break;
								}
		
								else if (sel4 == 1) {
		
									System.out.println(" 변경할 고객 번호 : ");
									String cusnum = sc.nextLine();
									System.out.println(" 핸드폰번호 변경 : ");
									String phone = sc.nextLine();
									System.out.println(" 주소 변경 : ");
									String addr = sc.nextLine();
		
									dao.updateCustoner(cusnum, phone, addr);
									break;
		
								} else if (sel4 == 2) {
		
									System.out.println(" 변경할 고객 번호 : ");
									int joinnum = Integer.parseInt(sc.nextLine());
									System.out.println(" 요금제 변경 : ");
									String pmcode = sc.nextLine();
		
									dao.updateJoinCus(joinnum, pmcode);
									break;
								} else {
									System.out.println("0부터 2까지만 선택하세요!");
									break;
								}
		
							}
							break;
					
/*삭제*/				case 5:

							System.out.println("(0) 뒤로가기 ");
							System.out.println(" 고객 가입 해지 / 가입자 삭제 ");
							System.out.println(" 삭제할 고객의 가입자코드 : ");
							System.out.print("입력 : ");
							int sel5 = Integer.parseInt(sc.nextLine());
		
							if (sel5 == 0) {
		
								break;
							}
		
							else {
		
								dao.deleteCus(sel5);
		
								break;
		
							}


/*종료*/				case 6:
						System.out.println(" 프로그램을 종료합니다.");
						System.exit(0);
	
					}

			} catch (IndexOutOfBoundsException e) {
				System.out.println("1부터 6까지 숫자를 입력하세요");

			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
		}

	}
}
