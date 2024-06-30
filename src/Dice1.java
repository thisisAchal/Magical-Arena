
import java.util.Random;

public class Dice1 {
 private Random random;

 public Dice1() {
     random = new Random();
 }

 public int roll() {
     return random.nextInt(6) + 1;
 }
}