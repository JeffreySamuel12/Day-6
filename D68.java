import java.util.function.BiFunction;

public class D68.java {
    public static void main(String[] args) {
       
        BiFunction<String, String, String> concatenateWithSpace = (str1, str2) -> str1 + " " + str2;

        String string1 = "Hello";
        String string2 = "World";

        // Concatenate the strings using the BiFunction
        String result = concatenateWithSpace.apply(string1, string2);

        System.out.println(result);
    }
}
