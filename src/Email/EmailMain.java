package Email;

import java.util.Scanner;

public class EmailMain {
    public static void main(String[] args) {
        int Number;
        System.out.println("Enter the number of employees /n");
        Scanner input = new Scanner(System.in);
        Number = input.nextInt();
        int i = 1;
        while (i <= Number) {
            System.out.println("Enter the "+i+" Employee details :");
            Emailbackend em = new Emailbackend();
            System.out.println(em.Display());
            i++;
        }

    }
}