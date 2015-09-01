/**
 * Rock Paper Scissors Lizard Spock game engine
 */
package com.api.rpsls;

/**
 * @author antti
 *
 */
public interface GameEngine {

	/**
	 * Warriors fight against others.
	 * @param warrior1
	 * @param warrior2
	 * @return Winning warrior.
	 */
	public FightResult fight(Warrior warrior1, Warrior warrior2);
	
}
