import java.util.*;
import java.util.stream.*;

public class D62 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

        
        List<String> filteredStrings = strings.stream().filter(s -> !s.startsWith("A")).collect(Collectors.toList());

        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }
}
