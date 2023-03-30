package Email;

import java.util.Scanner;

public class Emailbackend{
    Scanner input = new Scanner(System.in);
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Company;
    Emailbackend(){
        System.out.println("Enter your first name: /n");
        String firstname=input.next();
        this.Firstname=firstname;
        System.out.println("Enter your second name: /n");
        String lastname=input.next();
        this.Lastname=lastname;
        System.out.println("Enter your company name: /n");
        String company=input.next();
        this.Company=company;
        this.Email=GenerateEmail();

    }
 String GenerateEmail(){
        return Firstname+"."+Lastname+"@"+Company+".com";
        
    }
    String Display()
    {
       return (Email);
    }
}
