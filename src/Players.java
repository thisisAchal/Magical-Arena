//import practice4.Dice1;

public class Players {
	 private int health;
	    private int strength;
	    private int attack;

	    public Players(int health, int strength, int attack) {
	        this.health = health;
	        this.strength = strength;
	        this.attack = attack;
	    }

	    public boolean is_alive() {
	        return health > 0;
	    }

	    public int attack_roll(Dice1 dice) {
	        return dice.roll() * attack;
	    }

	    public int defend_roll(Dice1 dice) {
	        return dice.roll() * strength;
	    }

	    public void take_damage(int damage) {
	        health -= damage;
	        if (health < 0) {
	            health = 0;
	        }
	    }

	    public int getHealth() {
	        return health;
	    }


}
