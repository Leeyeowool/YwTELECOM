package YWTELECOM;

import java.util.List;
import java.util.Scanner;

public class TelecomMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DatabaseDao dao = DatabaseDao.getInstance();
		
		System.out.println();
		System.out.println("\t\t [ ���� �ڷ��� ���� ] ");
		
		
		while (true) {
			try {
				

				System.out.println();
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.print(" 1.���");
				System.out.print(" 2.���");
				System.out.print(" 3.�˻�");
				System.out.print(" 4.����");
				System.out.print(" 5.����/����");
				System.out.print(" 6.���α׷� ����");
				System.out.println();
				System.out.println("----------------------------------------------------");
				System.out.println();
				System.out.print("�Է�: ");
				int select = Integer.parseInt(sc.nextLine());

				if (select < 1 || select > 6)
					throw new IndexOutOfBoundsException("���� �ʰ� ���� �߻�");

				switch (select) {

/*���*/				case 1:	
						int sel1 = -1;
						while (sel1 >= 6 || sel1 < 1 ) {
							System.out.println("(1) �� ���");
							System.out.println("(2) �������� ���");
							System.out.println("(3) �ڵ��� ���� ���");
							System.out.println("(4) ����� ���");
							System.out.println("(5) ���԰� ���� ���");
							System.out.println("(0) �ڷΰ��� ");
							System.out.print("���� : ");
							sel1 = Integer.parseInt(sc.nextLine());

							if (sel1 == 0) {
	
								break;
							}
	
							else if (sel1 == 1) {
								System.out.println("�� �̸� : ");
								String name = sc.nextLine();
								System.out.println("�ֹι�ȣ : ");
								String socialunm = sc.nextLine();
								System.out.println("�ڵ�����ȣ : ");
								String phone = sc.nextLine();
								System.out.println("�ּ� : ");
								String addr = sc.nextLine();
								System.out.println("�̸��� : ");
								String email = sc.nextLine();
								CustomerDto dto = new CustomerDto(name, socialunm, phone, addr, email);
								dao.insertCustomer(dto);
								break;
							}
	
							else if (sel1 == 2) {
	
								System.out.println("���� ���� �̸� : ");
								String typename = sc.nextLine();
								JoinTypeDto dto = new JoinTypeDto(typename);
								dao.insertJoinType(dto);
								break;
							}
	
							else if (sel1 == 3) {
	
								System.out.println(" �ڵ��� ���� : ");
								String phoname = sc.nextLine();
								System.out.println(" ������ : ");
								String company = sc.nextLine();
								System.out.println(" ��� : ");
								int phoprice = Integer.parseInt(sc.nextLine());
								PhoneTypeDto dto = new PhoneTypeDto(phoname, company, phoprice);
								dao.insertPhoneType(dto);
								break;
							}
	
							else if (sel1 == 4) {
	
								System.out.println(" ����� �̸� : ");
								String pmname = sc.nextLine();
								System.out.println(" ��� : ");
								int psprice = Integer.parseInt(sc.nextLine());
								PaymentSysDto dto = new PaymentSysDto(pmname, psprice);
								dao.insertPaymentSys(dto);
								break;
							}
	
							else if (sel1 == 5) {
	
								System.out.println(" ����ȣ : ");
								String cusnum = sc.nextLine();
								System.out.println(" ������ �ڵ� : ");
								String phocode = sc.nextLine();
								System.out.println(" �������� : ");
								String jointype = sc.nextLine();
								System.out.println(" ������ڵ� : ");
								String joincode = sc.nextLine();
								System.out.println(" ������ : ");
								String joindate = sc.nextLine();
								System.out.println(" ���� : ");
								int preriod = Integer.parseInt(sc.nextLine());
								JoinCusDto dto = new JoinCusDto(cusnum, phocode, jointype, joincode, joindate, preriod);
								dao.insertJoinCus(dto);
								break;
							}
	
							else {
								System.out.println("0���� 5������ �����ϼ���!");
								break;
	
							}
							
						}
						break;
						

/*���*/				case 2:
						int sel2 = -1;
							while (sel2 >= 5 || sel2 < 1) {
								System.out.println("(1) �� ���");
								System.out.println("(2) �������� ���");
								System.out.println("(3) �Ǹű��� ���");
								System.out.println("(4) ����� ���");
								System.out.println("(0) �ڷΰ��� ");
								System.out.print("���� : ");
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
									System.out.println("0���� 4������ �����ϼ���");
									break;
								}
								
							}
							break;
							
					
/*�˻�*/				case 3:

					int sel3 = -1;
						while (sel3 >= 4 || sel3 < 0) {
							System.out.println("(1) ���԰� �˻� ");
							System.out.println("(2) ����� �˻� ");
							System.out.println("(3) ������ ���� �˻� ");
							System.out.println("(0) �ڷΰ��� ");
							System.out.print("���� : ");
							sel3 = Integer.parseInt(sc.nextLine());
	
							if (sel3 == 0) {
	
								break;
							}
	
							else if (sel3 == 1) {
								System.out.println("�˻��� ���� �̸� �Է� : ");
								String name = sc.nextLine();
	
								for (CusSelectDto o : dao.seachJoinCus(name)) {
									System.out.println(o.toString());
								}
								break;
	
							}
	
							else if (sel3 == 2) {
								System.out.println("�Է��Ͻô� �ݾ�����  ��������� ~ �ְ������� �˻��մϴ�.");
								System.out.println(" �����ݾ� : ");
								int min = Integer.parseInt(sc.nextLine());
								System.out.println(" �ְ�ݾ� : ");
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
								System.out.println("0���� 3������ �����ϼ���!");
								break;
							}
	
						}
						break;

/*����*/				case 4:
						int sel4 = -1;
							while (sel4 >= 3 || sel4 < 0) {
								System.out.println("(1) �� ���� ���� ");
								System.out.println("(2) ���԰� ����� ���� ");
								System.out.println("(0) �ڷΰ��� ");
								System.out.print("���� : ");
								sel4 = Integer.parseInt(sc.nextLine());
		
								if (sel4 == 0) {
		
									break;
								}
		
								else if (sel4 == 1) {
		
									System.out.println(" ������ �� ��ȣ : ");
									String cusnum = sc.nextLine();
									System.out.println(" �ڵ�����ȣ ���� : ");
									String phone = sc.nextLine();
									System.out.println(" �ּ� ���� : ");
									String addr = sc.nextLine();
		
									dao.updateCustoner(cusnum, phone, addr);
									break;
		
								} else if (sel4 == 2) {
		
									System.out.println(" ������ �� ��ȣ : ");
									int joinnum = Integer.parseInt(sc.nextLine());
									System.out.println(" ����� ���� : ");
									String pmcode = sc.nextLine();
		
									dao.updateJoinCus(joinnum, pmcode);
									break;
								} else {
									System.out.println("0���� 2������ �����ϼ���!");
									break;
								}
		
							}
							break;
					
/*����*/				case 5:

							System.out.println("(0) �ڷΰ��� ");
							System.out.println(" �� ���� ���� / ������ ���� ");
							System.out.println(" ������ ���� �������ڵ� : ");
							System.out.print("�Է� : ");
							int sel5 = Integer.parseInt(sc.nextLine());
		
							if (sel5 == 0) {
		
								break;
							}
		
							else {
		
								dao.deleteCus(sel5);
		
								break;
		
							}


/*����*/				case 6:
						System.out.println(" ���α׷��� �����մϴ�.");
						System.exit(0);
	
					}

			} catch (IndexOutOfBoundsException e) {
				System.out.println("1���� 6���� ���ڸ� �Է��ϼ���");

			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���");
			}
		}

	}
}
