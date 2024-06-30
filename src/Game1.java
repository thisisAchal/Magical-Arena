//import practice4.Dice1;
//import practice4.Players;

public class Game1 {

    public void play_game(Players player1, Players player2) {
        Dice1 dice = new Dice1();
        Players attacker = player1;
        Players defender = player2;

        while (player1.is_alive() && player2.is_alive()) {
            int attackDamage = attacker.attack_roll(dice);
            int defendDamage = defender.defend_roll(dice);

            int damageTaken = Math.max(0, attackDamage - defendDamage);
            defender.take_damage(damageTaken);

            System.out.printf("%s attacks with damage %d. %s defends with strength %d. %s's health is now %d. %n",
                    attacker, attackDamage, defender, defendDamage, defender, defender.getHealth());

            // Swap roles for next turn
            Players temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (!player1.is_alive()) {
            System.out.println("Player 1 has been defeated. Player 2 wins!");
        } else {
            System.out.println("Player 2 has been defeated. Player 1 wins!");
        }
    }


}
