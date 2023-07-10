package backWeb.a01_dao;



import java.util.Scanner;

import backWeb.z01_vo.Member;

public class B01_ShopptingMall {
	private A05_MemberDao dao;

	public void B01_ShoppingMall() {
		dao = new A05_MemberDao();
	}
	public static void registerMemberMenu() {
		A05_MemberDao m = new A05_MemberDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("# 회원가입 #");
		while(true) {
			try {
				System.out.print("아이디 입력: ");
				String id = sc.nextLine();
				System.out.print("패스워드 입력: ");
				String pass = sc.nextLine();
				System.out.print("이름 입력: ");
				String name = sc.nextLine();
				System.out.print("포인트 입력: ");
				int point = Integer.parseInt(sc.nextLine());
				System.out.print("권한 입력: ");
				String auth = sc.nextLine();
				
				if(id.equals("")||pass.equals("")||name.equals("")||auth.equals("")) {
					System.out.println("정보 입력이 잘못 되었습니다.");
					System.out.println("다시 입력해주세요.");
					continue;
				}
				m.insertMember(new Member(id,pass,name,point,auth));
				break;
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
	}
	public static void loginMenu() {
		A05_MemberDao dao = new A05_MemberDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("# 로그인 #");
		while(true){
			System.out.print("아이디 입력: ");
			String id = sc.nextLine();
			System.out.print("패스워드 입력: ");
			String pass = sc.nextLine();
			Member mem = dao.login(id, pass);
			if(mem!=null) {
				System.out.println("로그인 성공");
				System.out.println(mem.getName()+"님 환영합니다.");
				break;
			} else {
				System.out.println("로그인 실패");
				System.out.println(id+"는 인증계정이 아닙니다.");
				System.out.println("계속 하시겠습니까?(Y/N)");
				String isCon = sc.nextLine();
				if(!isCon.equals("Y")) {
					break;
				}
			}
		}
		System.out.println("# 로그인 종료 #");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B01_ShopptingMall b = new B01_ShopptingMall();
		b.registerMemberMenu();
		b.loginMenu();
				

	}

}
