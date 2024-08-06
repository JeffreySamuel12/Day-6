import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class D66 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java", "consumer");

        
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

      
        strings.forEach(printUpperCase);
    }
}
