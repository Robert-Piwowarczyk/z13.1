import java.util.Random;
import java.util.Scanner;

public class CompetitionResults {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person person = new Person("Jan","Kowalski");
        Person person1 = new Person("Maria","Zawadzka");
        Person person2 = new Person("Piotr","Zabłocki");
        Integer[] results = new Integer[10];
        for (int i = 0; i < results.length; ) {
            System.out.println("Podaj wynik kolejnego gracza (lub stop):");
            System.out.println(person);
            int result = sc.nextInt();
            if (result > 0) {
                results[i] = result;
                i++;
            } else {
                if (result < 0)
                    System.out.println("Wynik ujemny NIE powinien być dodany do listry");
                break;
            }
        }
    }
}

