import java.util.Scanner;


public class Main1 {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        Players player1 = new Players(sc.nextInt(), sc.nextInt(), sc.nextInt());
	        Players player2 = new Players(100, 10, 5);

	        Game1 game = new Game1();
	        game.play_game(player1, player2);
	    }
}
