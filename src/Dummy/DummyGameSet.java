package Dummy;


import java.util.Random;
import java.util.Scanner;


import Dummy.Character.Archer;
import Dummy.Character.Oak;
import Dummy.Character.User;
import Dummy.Character.Warrior;
import Dummy.Monster.CrazyPig;
import Dummy.Monster.Monster;
import Dummy.Monster.QueenBee;
import Dummy.Monster.Rabbit;
import Dummy.Monster.ScareCrow;
import Dummy.Monster.Wolf;
import Exam.*;

public class DummyGameSet {
	
	private static User[] UserArray = new User[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) throws Exception {
		
		
		
		String JoinView1 = "YES";
		String JoinView2 = "NO";
		
		System.out.println("접속 하시겠습니까?(Yes/No)");
		
		String selectWord = scanner.next();
		String upperStr1 =selectWord.toUpperCase();
		System.out.println("selectWord===>"+ selectWord);

		if(upperStr1.equals(JoinView1)) {
			User user = new User("", size, size, size, size,"");	
			
			System.out.println("이름을 입력해 주세요.");
			System.out.println("============");
			System.out.println("==>");
			
			user.name= scanner.next();
			System.out.println("selectName===>"+ user.name);
			
		
		System.out.println("종족을 골라주세요");
		System.out.println("============");
		System.out.println("1.휴먼 2.엘프 3.오크");
		
		int selectStat = scanner.nextInt();
	
		System.out.println("selectStat===>"+ selectStat);
		
		if(selectStat > 0) {

		if(selectStat == 1) {
			System.out.println("Warrior가 선택 되었습니다.");
			user =new Warrior(user.name, size, size, size, size,user.status);
			user.atk =30;
			user.dfs =15;
			user.level = 1;
			user.hp =100;
			user.mp =30;
			user.atkSpeed=15;
			user.Inventory=0;
			user.job=1;
			user.rapid = 20;
			user.status = "일반";
			
			
			
		} if(selectStat == 2) {
			System.out.println("Archer가 선택 되었습니다.");
			user =new Archer(user.name, size, size, size, size,user.status);
			user.atk =35;
			user.dfs =10;
			user.level = 1;
			user.hp =90;
			user.mp =30;
			user.atkSpeed=25;
			user.Inventory=0;
			user.job=2; 
			user.rapid = 30;
			user.status = "일반";
			
		} if(selectStat == 3) {
			System.out.println("Oak가 선택 되었습니다.");
			user =new Oak(user.name, size, size, size, size,user.status);
			user.atk =40;
			user.dfs =12;
			user.level = 1;
			user.hp = 110;
			user.mp = 30;
			user.atkSpeed = 12;
			user.Inventory = 0;
			user.job = 3; 
			user.rapid = 15;
			user.status = "일반";
			
		} 
	

		user.setAtkSpeed(user.atkSpeed);
		user.setInventory(user.Inventory);
		user.setJob(user.job);
		user.setRapid(user.rapid);
		
		
	}
		if( selectWord != null ) {
		boolean run = true;

		while (run) {
			System.out.println("*************************");
			System.out.println("현재 "+user.name+"의 이름 :"+user.name);
			System.out.println("현재 "+user.name+"의 level :"+user.level);
			System.out.println("현재 "+user.name+"의 job :"+user.job);
			System.out.println("현재 "+user.name+"의 공격력 :"+user.atk);
			System.out.println("현재 "+user.name+"의 방어력 :"+user.dfs);
			System.out.println("현재 "+user.name+"의 hp :"+user.hp);
			System.out.println("현재 "+user.name+"의 mp :"+user.mp);
			System.out.println("현재 "+user.name+"의 rapid :"+user.rapid);
			System.out.println("현재 "+user.name+"의 status :"+user.status);
			System.out.println("**************************");
			
			System.out.println("----------------------------------------------");
			System.out.println("1.소지품확인 |2.보유스킬 확인|3.사냥하기 |4.이상한 상점|5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택->");

			int selectNo = scanner.nextInt();
			int JobNum = user.job;
			int candy = user.Inventory;
			
			
			  switch (selectNo) { 
			 
			  case 1: 
			    EquipList(JobNum,candy);
				if(candy > 0) {
			    System.out.println("캔디를 사용하시겠습니까?");
				System.out.println("1.사용한다.");
				System.out.println("2.사용하지 않는다.");
				
				int CandyUse = scanner.nextInt();
				while(candy >0) {
					switch (CandyUse) { 
					 case 1:
						user.atk =990;
						user.dfs =990;
						user.level = 99;
						user.hp =4950;
						user.mp =4930;
						user.atkSpeed=100;
						user.Inventory=0;

				     System.out.println("캔디를 사용하였습니다.");
				     System.out.println("캔디 갯수"+user.Inventory+"개");
					 
				     break;
					 case 2:
					 System.out.println("캔디를 사용하지 않았습니다.");
					 System.out.println("캔디 갯수"+user.Inventory+"개");
					 break;
					}
					break;
				}	
				}
			   break; 
			  
			  case 2:
				  skilList(JobNum);
			   break;
			   
			  case 3:
					int num = 0;
					System.out.println("----------------");
					System.out.println("장비를 선택합니다.");
					System.out.println("----------------");
					
					System.out.println("1.1번무기");
					System.out.println("2.2번무기");
					int Equipnum = scanner.nextInt();
					user.Equipment =Equipnum;
					System.out.println(user.Equipment +"번 무기를 골랐습니다.");
					
					
					System.out.println("----------------");
					System.out.println("사냥터에 입장합니다.");
					System.out.println("----------------");
				
					Monster monster = new Monster();
					System.out.println("1.토끼");
					System.out.println("2.맷돼지");
					System.out.println("3.늑대");
					System.out.println("4.여왕벌");
					System.out.println("5.허수아비");
					System.out.println("싸워볼 상대를 입력하시오: ");
				
					num = scanner.nextInt();
					
					if(num == 1) {
						monster =new Rabbit();
						monster.name ="토끼";
						monster.hp = 50;
						monster.mp = 50;
						monster.dfs= 5;
						monster.level = 1;
						monster.atk = 16;
						monster.reflect = 30;
						monster.atkSpeed =10;
						
						System.out.println(monster.name+"와 전투를 시작합니다.");
					}
					if(num == 2) {
						monster =new CrazyPig();
						monster.name ="맷돼지";
						monster.hp = 500;
						monster.mp = 100;
						monster.dfs= 15;
						monster.level = 1;
						monster.atk = 100;
						monster.reflect = 30;
						monster.atkSpeed =20;
						
						System.out.println(monster.name+"와 전투를 시작합니다.");
					}if(num == 3) {
						monster =new Wolf();
						monster.name ="늑대";
						monster.hp = 400;
						monster.mp = 100;
						monster.dfs= 10;
						monster.level = 1;
						monster.atk = 60;
						monster.reflect = 30;
						monster.atkSpeed =25;
						
						System.out.println(monster.name+"와 전투를 시작합니다.");
					}if(num == 4) {
						monster =new QueenBee();
						monster.name ="여왕벌";
						monster.hp = 250;
						monster.mp = 100;
						monster.dfs= 10;
						monster.level = 1;
						monster.atk = 30;
						monster.reflect = 60;
						monster.atkSpeed =70;
						
						System.out.println(monster.name+"와 전투를 시작합니다.");
					}if(num == 5) {
						monster =new ScareCrow();
						monster.name ="허수아비";
						monster.hp = 99999;
						monster.mp = 100;
						monster.dfs= 999;
						monster.level = 1;
						monster.atk = 30;
						monster.reflect = 60;
						monster.atkSpeed =10;
						
						System.out.println(monster.name+"와 전투를 시작합니다.");
					}
					
					
					while(true) {
						
						//공격할때마다 랜덤한 수를 뽑기
						Random rand = new Random();
						Random rand2 = new Random();
						
						int randomNum = rand.nextInt(9);
						
						int UserRanNum= rand2.nextInt(40)+ user.rapid;
						
						int UserSpeed =user.getAtkSpeed() * 100;
						int MonsterSpeed = monster.getAtkSpeed() * 100;
						
						int cnt1 = user.getAtkSpeed() / monster.getAtkSpeed() ;
						int cnt2 = monster.getAtkSpeed() / user.getAtkSpeed()   ;
						
						Math.floor(cnt1);
						Math.floor(cnt2);
						
						System.out.println("유저공격속도 카운트:"+ Math.floor(cnt1));
						System.out.println("몬스터공격속도 카운트:"+ Math.floor(cnt2));
						
						 System.out.println(user.name + "와 전투를 시작합니다.");
						
						if(user.status != "일반") {
							
							System.out.println("-----------------------------------");
							System.out.println("1.기본공격 |2.스킬 해제|3.도구 사용 |4.도망가기");
							System.out.println("-----------------------------------");
							System.out.print("선택->");
							
						} else {
							
							System.out.println("-----------------------------------");
							System.out.println("1.기본공격 |2.스킬 사용|3.도구 사용 |4.도망가기");
							System.out.println("-----------------------------------");
							System.out.print("선택->");
							
						}
						int attackNo = scanner.nextInt();
						
				
					switch (attackNo) { 
					
						 case 1:
							int AtkCnt = 0;
							int MonCnt =0;
							
							 if(randomNum > 2) {
									monster.attacked(user.attack(user.Equipment));
									AtkCnt += 1;
									
									System.out.println(monster.name+"는 얌전히 맞았다.");
									System.out.println("해당 "+monster.name+"의 남은 체력"+monster.hp);
									System.out.println("=====================================");
									//랜덤한 수 초기화
									randomNum =0; UserRanNum =0;
									
								}else {
									if(monster.hp>0) {
									
									monster.attacked(user.attack(user.Equipment));
									monster.CounterAtk();
									System.out.println(monster.name+"는 카운터 어택을 날렸다.");
									AtkCnt += 1;
								
									System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
									System.out.println("해당 "+monster.name+"의 남은 체력"+monster.hp);
									System.out.println("=====================================");
									//랜덤한 수 초기화
									 randomNum =0; UserRanNum =0;
										
								}else {
										 
										  System.out.println(monster.name +"가 죽었습니다.");
											 user.level += 1 ;
											 user.atk += 10;
											 user.hp += 50;
											 user.mp +=50;
											 user.dfs +=10;
											 user.atkSpeed +=1;
											 user.rapid=30;
										
											 System.out.println("=====================================");
											 break;  
										
									  }
								
								    }

							 
							 if(monster.hp<=0) {
								 System.out.println(monster.name +"가 죽었습니다.");
								 user.level += 1 ;
								 user.atk += 10;
								 user.hp += 50;
								 user.mp +=50;
								 user.dfs +=10;
								 user.atkSpeed +=1;
								 user.rapid=30;
							
								 break;
							 }else if(monster.hp>0) {
 
								 while(true) {
								 //1. 공속에 따라 공격 횟수가 부여됨 
							     //2. 몬스터는 반격, 유저는 회피 가능 
									 if(UserSpeed>MonsterSpeed) {
										//유저 공속이 빨라서 먼저때림
											
												//랜덤한 수 부여
												randomNum = rand.nextInt(9);
												UserRanNum = rand2.nextInt(40)+ user.rapid;
												
												System.out.println("공격속도가 빠른"+user.name+"의 공격차례");
												if(randomNum > 2 && user.hp>0) {
												
													Thread.sleep(1000);
													monster.attacked(user.attack(user.Equipment));
													AtkCnt += 1;
													
													System.out.println(monster.name+"는 얌전히 맞았다.");
													System.out.println(monster.name+"의 체력은 "+monster.hp+"가 남았다.");
													System.out.println("=====================================");
													
												}else if(user.hp>0) {
												//카운터가 터졌을때
											
												Thread.sleep(1000);
												monster.attacked(user.attack(user.Equipment));
												monster.CounterAtk();
												System.out.println(monster.name+"는 카운터 어택을 날렸다.");
												AtkCnt += 1;
												
												System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
												System.out.println(monster.name+"의 체력은 "+monster.hp+"가 남았다.");
												System.out.println("=====================================");
												
											} else {
												// monster 피통이 0이하 일때 
												if(monster.hp < 1) {
													System.out.println(monster.name +"가 죽었습니다.");
													System.out.println("=====================================");
													user.level += 1 ;
													user.atk += 10;
													user.hp += 50;
													user.mp +=50;
													user.dfs +=10;
													user.atkSpeed +=1;
													user.rapid=30;
													
													break;
													
												}else if(user.hp < 1) {
													
													System.out.println(user.name+"가 죽었습니다.");
													System.out.println("=====================================");
													user.hp = 0;
													user.hp += user.hp + 100 ;
													user.mp += user.mp * 0.5 ;
													user.rapid=30;
												
													break;
													
													
												}else {
													System.out.println("싸움은 계속된다.");
													System.out.println("=====================================");
													continue;
												}
												
												
											}
										
											//유저 공격이 끝남.
							
										if(	monster.hp > 0) {
											
											if(UserRanNum>55) {
											
												Thread.sleep(1000);
												user.vanish();
												MonCnt += 1;
												
												System.out.println("유저가 잘 피했다.");
												System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
												System.out.println("=====================================");
											}else if(user.hp > 0) {
												
												Thread.sleep(1000);
												user.attacked(monster.attack());
												MonCnt += 1;
									
												System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
												System.out.println("=====================================");
												
											}else {
												// monster 피통이 0이하 일때 
												if(monster.hp < 1) {
													System.out.println(monster.name +"가 죽었습니다.");
													System.out.println("=====================================");
													user.level += 1 ;
													user.atk += 10;
													user.hp += 50;
													user.mp +=50;
													user.dfs +=10;
													user.atkSpeed +=1;
													user.rapid=30;
												
													break;
													
												}else if(user.hp < 1) {
													
													System.out.println(user.name+"가 죽었습니다.");
													System.out.println("=====================================");
													user.hp = 0;
													user.hp += user.hp + 100 ;
													user.mp += user.mp * 0.5 ;
													user.rapid=30;
											
													break;
													
													
												}else {
													System.out.println("싸움은 계속된다.");
													System.out.println("=====================================");
													continue;
												}
												
											}
										}else {
											
											// monster 피통이 0이하 일때 
											if(monster.hp < 1) {
												System.out.println(monster.name +"가 죽었습니다.");
												System.out.println("=====================================");
												user.level += 1 ;
												user.atk += 10;
												user.hp += 50;
												user.mp +=50;
												user.dfs +=10;
												user.atkSpeed +=1;
												user.rapid=30;
											
												break;
												
											}else if(user.hp < 1) {
												
												System.out.println(user.name+"가 죽었습니다.");
												System.out.println("=====================================");
												user.hp = 0;
												user.hp += user.hp + 100 ;
												user.mp += user.mp * 0.5 ;
												user.rapid=30;
											
												break;
												
												
											}else {
												System.out.println("싸움은 계속된다.");
												System.out.println("=====================================");
												continue;
											}
											
										}
										
											
											
									 }else if(UserSpeed < MonsterSpeed) {
										 
									
											//랜덤한 수 부여
											randomNum = rand.nextInt(9);
											UserRanNum = rand2.nextInt(40)+ user.rapid;
										//몬스터가 공속이 빠른 경우
										//유저가 먼저 공격을 받고 
											if(	monster.hp > 0) {
												
												if(UserRanNum>55 && user.hp>0) {
													Thread.sleep(1000);
													
													user.vanish();
													//user.attacked(monster.attack());
													System.out.println("유저가 잘 피했다.");
													MonCnt += 1;
													
													System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
													System.out.println("=====================================");
												}else if(user.hp > 0) {
													
													
													Thread.sleep(1000);
													user.attacked(monster.attack());
													Thread.sleep(1000);
													MonCnt += 1;
												
													System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
													System.out.println("=====================================");
													
												}else {
													// monster 피통이 0이하 일때 
													if(monster.hp < 1) {
														System.out.println(monster.name +"가 죽었습니다.");
														System.out.println("=====================================");
														user.level += 1 ;
														user.atk += 10;
														user.hp += 50;
														user.mp +=50;
														user.dfs +=10;
														user.atkSpeed +=1;
														user.rapid=30;
													
														break;
														
													}else if(user.hp < 1) {
														
														System.out.println(user.name+"가 죽었습니다.");
														System.out.println("=====================================");
														user.hp = 0;
														user.hp += user.hp + 100 ;
														user.mp += user.mp * 0.5 ;
														user.rapid=30;
													
														break;
														
														
													}else {
														System.out.println("싸움은 계속된다.");
														System.out.println("=====================================");
														continue;
													}
													
												}
											}else {
												// monster 피통이 0이하 일때 
												if(monster.hp < 1) {
													System.out.println(monster.name +"가 죽었습니다.");
													System.out.println("=====================================");
													user.level += 1 ;
													user.atk += 10;
													user.hp += 50;
													user.mp +=50;
													user.dfs +=10;
													user.atkSpeed +=1;
													user.rapid=30;
													
													break;
													
												}else if(user.hp < 1) {
													
													System.out.println(user.name+"가 죽었습니다.");
													System.out.println("=====================================");
													user.hp = 0;
													user.hp += user.hp + 100 ;
													user.mp += user.mp * 0.5 ;
													user.rapid=30;
												
													break;
													
													
												}else {
													System.out.println("싸움은 계속된다.");
													System.out.println("=====================================");
													continue;
												}
												
												
											}
											if(monster.hp>0) {
												if(randomNum > 2 && user.hp>0) {
													
													Thread.sleep(1000);
													monster.attacked(user.attack(user.Equipment));
													AtkCnt += 1;
												
													System.out.println(monster.name+"는 얌전히 맞았다.");
													System.out.println(monster.name+"의 체력은 "+monster.hp+"가 남았다.");
													System.out.println("=====================================");
												}else if(user.hp>0) {
												//카운터가 터졌을때
												
												Thread.sleep(1000);
												monster.attacked(user.attack(user.Equipment));
												monster.CounterAtk();
												System.out.println(monster.name+"는 카운터 어택을 날렸다.");
												AtkCnt += 1;
											
												System.out.println(user.name+"의 체력은 "+user.hp+"가 남았다.");
												System.out.println(monster.name+"의 체력은 "+monster.hp+"가 남았다.");
												System.out.println("====================================="); 
											} else {
												// monster 피통이 0이하 일때 
												if(monster.hp < 1) {
													System.out.println(monster.name +"가 죽었습니다.");
													System.out.println("=====================================");
													user.level += 1 ;
													user.atk += 10;
													user.hp += 50;
													user.mp +=50;
													user.dfs +=10;
													user.atkSpeed +=1;
													user.rapid=30;
													
													break;
													
												}else if(user.hp < 1) {
													
													System.out.println(user.name+"가 죽었습니다.");
													System.out.println("=====================================");
													user.hp = 0;
													user.hp += user.hp + 100 ;
													user.mp += user.mp * 0.5 ;
													user.rapid=30;
												
													break;
													
													
												}else {
													System.out.println("싸움은 계속된다.");
													System.out.println("=====================================");
													continue;
												}
												
												
											}
											
											//유저 공격이 끝남.
							
												
											}
											
											
									 }
								 }
							 }
							 System.out.println("유저 공격횟수 카운트==>"+ AtkCnt);
							 System.out.println("몬스터 공격횟수 카운트==>"+ MonCnt); 
						 break;
						 
						 case 2:
							 if(user.status =="일반") {
								 
							 
							 	if(user.job == 1) {
							 		System.out.println("1.Heal(체력 50% 회복)");
							 		System.out.println("2.Steam(공격력 20% 상승)");
							 		System.out.println("3.전용스킬Guard(방어력 30% 상승)");
							 		
							 		if(user.level >= 99) {
							 			System.out.println("4.===궁극스킬===");
							 			System.out.println("휴먼invincible(10초 무적)");
							 		}
							 	
							 	} if(user.job == 2) {
							 		System.out.println("1.Heal(체력 50% 회복)");
							 		System.out.println("2.Steam(공격력 20% 상승)");
							 		System.out.println("3.Elusion(회피력 30% 상승)");
							 		
							 		if(user.level >= 99) {
							 			System.out.println("4.===궁극스킬===");
							 			System.out.println("엘프 Rapid (1분동안 공격속도가 500% 상승)");
							 		}
							 	
							 	}if(user.job == 3) {
							 		System.out.println("1.Heal(체력 50% 회복)");
							 		System.out.println("2.Steam(공격력 20% 상승)");
							 		System.out.println("3.Anger(공격력 50% 상승, 방어력 10% 하락)");
							 		
							 		if(user.level >= 99) {
							 			System.out.println("4.===궁극스킬===");
							 			System.out.println("오크 Frenzy (1분동안 공격력이 500% 상승)");
							 		}
							 	}
							 	System.out.println("----------------------");
								System.out.println("1.공용스킬 |2.공용스킬|3.전용스킬 |4.궁극스킬");
								System.out.println("----------------------");
								System.out.print("선택->");
								
								int skillNo = scanner.nextInt();
				
								user.skill(skillNo);
								System.out.println(user.name+"가 스킬을 사용했습니다.");
								 continue;
							 }else {
									if(user.job == 1) {
										
									System.out.println("공격력: "+user.atk);
									System.out.println("레벨: "+user.level );
									System.out.println("체력: "+user.hp);
									System.out.println("마력: "+user.mp);
									System.out.println("공격속도: "+user.atkSpeed);
									System.out.println("소지물: "+user.Inventory);
									System.out.println("직업: "+user.job);
									System.out.println("속도: "+user.rapid);
									System.out.println("상태: "+user.status);
									
				
									}else if(user.job == 2) {
										
									System.out.println("공격력: "+user.atk);
									System.out.println("레벨: "+user.level );
									System.out.println("체력: "+user.hp);
									System.out.println("마력: "+user.mp);
									System.out.println("공격속도: "+user.atkSpeed);
									System.out.println("소지물: "+user.Inventory);
									System.out.println("직업: "+user.job);
									System.out.println("속도: "+user.rapid);
									System.out.println("상태: "+user.status);
									
				
									}else if(user.job == 3) {
										
									System.out.println("공격력: "+user.atk);
									System.out.println("레벨: "+user.level );
									System.out.println("체력: "+user.hp);
									System.out.println("마력: "+user.mp);
									System.out.println("공격속도: "+user.atkSpeed);
									System.out.println("소지물: "+user.Inventory);
									System.out.println("직업: "+user.job);
									System.out.println("속도: "+user.rapid);
									System.out.println("상태: "+user.status);
									
				
									}
								
									System.out.println("스킬해제");
									System.out.println("----------------------");
									System.out.println("1.궁극스킬 |2.전용스킬");
									System.out.println("----------------------");
									System.out.print("선택->");
									int Despell = scanner.nextInt();
									
									user.Despell(Despell);
								
									System.out.println(user.name+"가 스킬을 해제했습니다.");
									
							 }
								 continue;
						 }
					
						 break;
					}
			  
					 break;
 
			  
			  case 4:
			  StrangeStore();
			  System.out.println("캔디를 구매하시겠습니까?");
		 		System.out.println("1.캔디를 구매한다.");
		 		System.out.println("2.구매하지 않는다.");
				
		 		int candyBuy = scanner.nextInt();
		 		
			while(true) {
				switch (candyBuy) { 
				 case 1:
				 user.Inventory += 1;
			     System.out.println("캔디를 구입하였습니다.");
			     System.out.println("캔디 갯수"+user.Inventory+"개");
				 break;
				 case 2:
				 System.out.println("캔디를 구입하지 않았습니다.");
				 break;
				}
				break;
			}
			
			
			  break; 
			  
			  case 5: 
			  run = false;
			  break;
			  
			  }
		
			  
			 
		}
		
		
		}
		System.out.println("프로그램 종료");
	}else {
		System.out.println("프로그램 종료");
	}

	}

	
	private static void EquipList(int JobNum,int candy) {
		System.out.println("-----------");
		System.out.println("소지품창");
		System.out.println("-----------");
		
		if(JobNum == 1 ) {
			System.out.println("====숏 소드====");
			System.out.println("공격력 +5%");
			System.out.println("====롱 소드====");
			System.out.println("공격력 +10%");
			
			System.out.println("둘 중 하나를 선택해서 공격가능");
			
		}if(JobNum == 2 ) {
			System.out.println("====short bow====");
			System.out.println("공격속도 +5%");
			System.out.println("====Iron bow====");
			System.out.println("공격속도 +10%");
			
			System.out.println("둘 중 하나를 선택해서 공격가능");
			
		}if(JobNum == 3 ) {
			System.out.println("====Short Axe====");
			System.out.println("공격력 +10%,공격속도 -5%");
			System.out.println("====Iron Hammer====");
			System.out.println("공격력 +20%,공격속도 -10%");
			
			System.out.println("둘 중 하나를 선택해서 공격가능");
			
		}
		if(candy >0) {
			
			System.out.println("캔디를 가지고 있는 유저 입니다.");
	
		}else {
			System.out.println(" 캔디를 사용했거나 아직 구매하지 않았습니다.");
		}
	
	}	


	
	private static void skilList(int JobNum) {
		
		System.out.println("-----------");
		System.out.println("스킬list");
		System.out.println("-----------");
		
		
		if(JobNum == 1) {
			
		 		
		 		System.out.println("======전용스킬========");
		 		System.out.println("Guard(방어력 30% 상승)");
		 		
		 		System.out.println("=======궁극스킬=======");
		 		System.out.println("휴먼 Invincible(10초 무적) LEVEL 99이상");
		 		
		 	}
		
		if(JobNum == 2) {
			
	 		
			System.out.println("======전용스킬========");
	 		System.out.println("Elusion(회피력 30% 상승)");
	 		
	 		System.out.println("=======궁극스킬=======");
			System.out.println("엘프 Rapid (1분동안 공격속도가 500% 상승) LEVEL 99이상");
	 		
	 	}if(JobNum == 3) {
			
	 		
			System.out.println("======전용스킬========");
			System.out.println("Anger(공격력 50% 상승, 방어력 10% 하락)");
	 		
	 		System.out.println("=======궁극스킬=======");
	 		System.out.println("오크 Frenzy (1분동안 공격속도가 500% 상승) LEVEL 99이상");
	 		
	 	}
		
		
			
			
		}
	
	
		private static void StrangeStore() {
			
			System.out.println("======상점 목록========");
	 		System.out.println("이상한 캔디(사용시 LV99달성)");
	 		System.out.println("====================");
	 		
		
		}
	
	
		
	
		
		
	
	
	
}

	

	



