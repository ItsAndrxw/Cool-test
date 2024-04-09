import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner block = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");


    // String input
    String name = block.nextLine();

    // Numerical input
    int age = block.nextInt();
    double salary = block.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
   
  }

}