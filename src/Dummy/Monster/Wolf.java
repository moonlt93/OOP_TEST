package Dummy.Monster;

public class Wolf extends Monster {
	
	
	public int atkSpped;
	
	public int attack() {
		System.out.println("늑대 데미지는 "+atk+ "입니다.");
		return atk;
	}
	
	public void attacked(int sum) {
		if(dfs >= sum) {
			hp = hp - 0;
		}else {
			hp =hp + dfs - sum;
		}
	}
	public int CounterAtk() {
		
		return (atk *7)/10;
		
	}
	

}
