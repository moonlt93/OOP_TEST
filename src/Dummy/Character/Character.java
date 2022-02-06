package Dummy.Character;

public class Character {
	
	public String name;
	public int hp;
	public int mp;
	public int level;
	public String Skill;
	public int atk;
	public int atkSpeed;
	public int dfs;
	public int Inventory;
	
	public int getInventory() {
		return Inventory;
	}
	public void setInventory(int inventory) {
		Inventory = inventory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtkSpeed() {
		return atkSpeed;
	}
	public void setAtkSpeed(int atkSpeed) {
		this.atkSpeed = atkSpeed;
	}
	public int getDfs() {
		return dfs;
	}
	public void setDfs(int dfs) {
		this.dfs = dfs;
	}
	public int getRapid() {
		return rapid;
	}
	public void setRapid(int rapid) {
		this.rapid = rapid;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getWeaponEffect() {
		return weaponEffect;
	}
	public void setWeaponEffect(int weaponEffect) {
		this.weaponEffect = weaponEffect;
	}
	public int rapid;
	public String weapon;
	public int weaponEffect;
	

}
