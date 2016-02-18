/**
 * Rock Paper Scissors Lizard Spock game engine
 */
package com.api.rpsls;

import java.util.Map;

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
	FightResult fight(Warrior warrior1, Warrior warrior2);

	/**
	 * List of availabe warriors
	 * @return List of warriors.
     */
	Map<String, Warrior> getWarriors();

	/**
	 * Returns warrior with given name
	 * @param name
	 * @return warrior
     */
	Warrior getWarriorByName(String name);
	
}
