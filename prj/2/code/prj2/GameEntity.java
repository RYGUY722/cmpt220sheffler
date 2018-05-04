package prj2;

public class GameEntity {
	String name;
	int maxhealth;
	int health;
	int attack;
	int defense;
	int mental;
	int speed;
	int precision;
	
	//Accessors

	public String getName() {
		return name;
	}
	public int getMaxHP() {
		return maxhealth;
	}
	public int getHP() {
		return health;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}
	public int getMental() {
		return mental;
	}
	public int getSpeed() {
		return speed;
	}
	public int getPrecision() {
		return precision;
	}
	
	//Battle
	
	public int calcDamage(boolean isMagic, boolean isCrit) {
		if(isMagic) {
			if(isCrit) {
				return (int) Math.round((mental*1.5));
			}
			else {
				return (int) Math.round((mental*1.1));
			}
		}
		else {
			if(isCrit) {
				return (int) Math.round((attack*1.5));
			}
			else {
				return (int) Math.round((attack*1.1));
			}
		}
	}


}
