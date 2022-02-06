package Dummy.Monster;

import Dummy.Character.Character;

public class Monster extends Character{

	public String name;
	public int atk;
	public int dfs;
	public int atkSpeed;

	

	public int getAtkSpeed() {
		return atkSpeed;
	}

	public void setAtkSpeed(int atkSpeed) {
		this.atkSpeed = atkSpeed;
	}

	public int reflect =30;
	public int attacked;
	
	public int attack() {
		return atk;
	}
	
	public void attacked(int sum) {
		if(dfs >= sum) {
			
			hp =hp-0;
			
		}else {
			hp =hp + dfs - sum;
		}
	}
	
	public int CounterAtk() {
		int atkDamage = (atk *7)/10;
		System.out.println("카운터 데미지: "+atkDamage);
		return atkDamage;
		
	}

}
