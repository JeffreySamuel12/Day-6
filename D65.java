import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class D65 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "teststring", "example", "testing", "java");

        // Predicate for length greater than 5
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;

        // Predicate for containing the substring "test"
        Predicate<String> containsTest = s -> s.contains("test");

        // Combine predicates using and
        Predicate<String> combinedPredicate = lengthGreaterThan5.and(containsTest);

        // Filter the list using the combined predicate
        List<String> filteredStrings = strings.stream()
                                              .filter(combinedPredicate)
                                              .collect(Collectors.toList());

        // Print the filtered list
        filteredStrings.forEach(System.out::println);
    }
}
