import java.util.Random;

public class Computer {
  public static int decidesComputerHand() {
    Random random = new Random();
    int rnd = random.nextInt(3)+1;
    return rnd;
  }
}
