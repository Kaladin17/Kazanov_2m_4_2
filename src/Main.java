import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namesA = new ArrayList<>();
        ArrayList<String> namesB = new ArrayList<>();
        ArrayList<String> namesC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            namesA.add(scanner.next());
        }System.out.println(namesA);
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            namesB.add(scanner.next());
        }System.out.println(namesB);

        namesC.addAll(namesA);
        for (int i = 5; i > 0; i--) {
            namesC.add(i, namesB.get(-i+5));
        }
        System.out.println(namesC);

        namesC.sort(Comparator.comparingInt(String::length));
        namesC.forEach(System.out::println);

    }
}