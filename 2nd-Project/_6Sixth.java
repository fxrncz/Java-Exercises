public class _6Sixth {
  public static void main(String[] args) {
    int[] myArr = {20, 19, 21, 15};
    int sum = 1;

    for (int x = 0; x < myArr.length; x++) {
      sum = sum * myArr[x];
    }
    System.out.println(sum);
  }
}
