package com.api.rpsls;

import java.util.List;

public abstract class Warrior {
	
	private String name;

	/**
	 * List of warriors which this warrior wins.
	 * @return Warrior
	 */
	public abstract List<String> wins();
	
	/**
	 * List of warriors who beats this warrior.
	 * @return Warrior
	 */
	public abstract List<String> loses();
	
	/**
	 * Fight against another warrior.
	 * @param enemy warrior
	 * @return fight result
	 */
	public FightResult fight(Warrior enemy) {
		if (loses().contains(enemy.getName())) {
			return FightResult.LOSE;
		} else if (wins().contains(enemy.getName())) {
			return FightResult.WIN;
		} else {
			return FightResult.TIE;
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
