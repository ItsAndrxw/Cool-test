import java.util.Scanner;
public class scannertest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first;
        String last;
        int age;
         
        System.out.println ("Enter First Name");
        first = scanner.nextLine();

        System.out.println ("Enter Last Name");
        last = scanner.nextLine();

        System.out.println ("Enter Age ");
        age = scanner.nextInt() + 10;

        System.out.println("Hi my name is " + first + " " + last  + ", and in 10 years I will be " + age );

        scanner.close();
    }

}