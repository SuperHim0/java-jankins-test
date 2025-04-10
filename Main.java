import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a test of the Java program structure.");
        System.out.println("The program is running successfully.");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(58);
        numbers.add(42);
        numbers.add(3);
        numbers.add(422);
        numbers.add(56);

        List<Integer> list= numbers.stream().filter(e -> e > 50).collect(Collectors.toList());
        System.out.println("Numbers greater than 50: " + list);
        System.out.println("using java 8 stream API to filter numbers.");

    }
}