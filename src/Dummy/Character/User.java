package Dummy.Character;

public class User extends Character {

		public String name;
		public int atk;
		public int dfs;
		public int atkSpeed;
		public int rapid;
		public int sum;
		public int Equipment;
		public String status;
		
	
		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public int getEquipment() {
			return Equipment;
		}


		public void setEquipment(int equipment) {
			Equipment = equipment;
		}

		public int level;
		public int job;
		
		public int getJob() {
			return job;
		}


		public void setJob(int job) {
			this.job = job;
		}

		private Warrior warrior;
		private Archer archer;
		private Oak oak;
		
		public User(String name,int atk,int dfs,int atkSpeed,int rapid, String status) {
		
			this.name = name;
			this.atk =atk;
			this.dfs =dfs;
			this.atkSpeed =atkSpeed;
			this.rapid =atkSpeed;
			this.status = status;
		}

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAtk() {
			return atk;
		}

		public void setAtk(int atk) {
			this.atk = atk;
		}

		public int getDfs() {
			return dfs;
		}

		public void setDfs(int dfs) {
			this.dfs = dfs;
		}

		public int getAtkSpeed() {
			return atkSpeed;
		}

		public void setAtkSpeed(int atkSpeed) {
			this.atkSpeed = atkSpeed;
		}

		public int getRapid() {
			return rapid;
		}

		public void setRapid(int rapid) {
			this.rapid = rapid;
		}

		public int attack(int equipment) {
		  
		  return atk; 				
		}
		
		public void attacked(int sum) {
			if(dfs >=sum) {
				hp = hp-0;
			}else {
				hp =hp + dfs - sum;
			}
			
		}
		
		public void skill(int skillNo) {
			warrior.skill(skillNo);
			archer.skill(skillNo);
			oak.skill(skillNo);
		}
	
		public void Despell(int Despell) {
			warrior.Despell(Despell);
			archer.Despell(Despell);
			oak.Despell(Despell);
		}
		
		public void vanish() {
			System.out.println("유저의 회피");
			hp= hp - 0; 

		}

		
		
}
