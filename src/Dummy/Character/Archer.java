package Dummy.Character;

import java.util.Scanner;

public class Archer extends User {
	
	
	public Archer(String name, int atk, int dfs, int atkSpeed, int rapid ,String status) {
		super(name, atk, dfs, atkSpeed, rapid ,status);
		
	}
	
	public int attack(int equipment) {
	
	
	int sum =0;
	if(equipment == 1) {
		sum += atk;
		sum += atkSpeed * 0.05;
		System.out.println("short bow 데미지는 "+sum+"입니다.");
	return sum;
	}else if(equipment == 2) {
		sum += atk;
		sum += atkSpeed * 0.10;
		System.out.println("Iron bow 데미지는"+sum+"입니다.");
	}
	
	
	return sum;

	}
	
	public void attacked(int sum) {
		if(dfs >= sum) {
			hp = hp - 0;
		}
		else {
			hp = hp +dfs -sum;
		}
	}
	
	
	public void skill(int skillNo) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("1.Heal(체력 50% 회복)");
		//System.out.println("2.Steam(공격력 20% 상승)");
		//System.out.println("3.Elusion(회피력 30% 상승)");
		
		//if(level == 99) {
		//	System.out.println("4.===궁극스킬===");
		//	System.out.println("엘프 Rapid (1분동안 공격속도가 500% 상승)");
		//}
		System.out.println("스킬번호를 입력하세요: "+skillNo);
		if(mp >=0) {
		
			switch (skillNo) { 
			case 1: 
				System.out.println("Heal!");
				hp += hp * 0.5;
				mp -= 30;
				break; 
			case 2:
				System.out.println("steam!");
				atk += atk * 0.2;
				mp -= 30;
				break;
			case 3:
				System.out.println("Elusion!");  
				rapid += rapid +30;
				status = "Elusion";
				break;
			case 4:
				System.out.println("Rapid!");
				atkSpeed += atkSpeed * 4.0;
				status = "Rapid";
				break;
				
			}
		}else {
			System.out.println("mp가 부족합니다.");
		}
		

		}
	
	public void vanish() {
		System.out.println("유저의 회피");
		hp= hp - 0; 

	}
	
	@Override
	public void Despell(int Despell) {
		
		
		if(Despell > 0) {
			switch(Despell) {
			case 1:
			System.out.println("궁극스킬해제");
			status ="일반";
			atkSpeed = atkSpeed / 5;
			break;
			
			case 2:
			System.out.println("전용스킬해제");
			status ="일반";
			rapid = 30;
			break;
			}
			
		}
	}
	
	
}
