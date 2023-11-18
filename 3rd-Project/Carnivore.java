public interface Carnivore {
  int pieces = 10;
  public static void eatGrass() {
  }

  public int chew();

}

interface Hashwings {
  public int getNumberOfWings();
}

abstract class Insect implements Hashwings {
  abstract int getNumberOfLegs();
}

public class Dragonfly extends Insect {
  int getNumberOfLegs() {
    return 6;
  }
}
