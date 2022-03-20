import java.util.ArrayList;

public class JavaTest {
  public static void foobar() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    java.util.function.Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
  
  /*
  public static void barfoo() {
    Set<Integer> numbers = new HashSet<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> method = (n) -> { System.err.print(n); };
    numbers.forEach( method );
  }
  */
}

