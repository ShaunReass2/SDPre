public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 0;
    int sum = 0;

    while(counter <= 20)

    {
    sum += counter++; // Search required. I originally compiled with "sum = counter + 1;" but running the program caused an infinite loop.
    }

    System.out.println(sum);

  }
}
