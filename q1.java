import java.util.Scanner;
class q1{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        int size = scan.nextInt();
        scan.nextLine();
        String mom = scan.nextLine();
        System.out.println("My name is " +name);
        System.out.println("my age age " +age);
        System.out.println("my address is "+address);
        System.out.println("my size is"+size);
        System.out.println("my mom name is "+mom);
    }
}

