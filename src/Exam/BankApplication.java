package Exam;

import java.util.Scanner;

public class BankApplication {
	
	// 예시로 사용하였습니다.
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			}
		}
		System.out.println("프로그램 종료");
	}

	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		String ano;
		int money;
		
		System.out.print("계좌번호:");
		ano = scanner.next();
		System.out.print("출금액:");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() - money;
		cur.setBalance(sum);		
		
		System.out.println("출금이 성공되었습니다.");
	}

	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		String ano;
		int money;
		
		System.out.print("계좌번호:");
		ano = scanner.next();
		System.out.print("예금액:");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
	}
	
	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		
		return null;
	}

	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for (int i = 0; i < size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}
		
	}

	private static void createAccount() {
		String ano;
		String owner;
		int money;
		
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기입금액: ");
		money = scanner.nextInt();
		
		Account account = new Account(ano, owner, money);
		accountArray[size] = account;
		size++;
		
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	
	
}












