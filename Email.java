import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordlength = 10;
    private int mailboxCapacity;
    private String email;
    private String alternateEmail;
    private String companySuffix = "company.edu.africa";

    public Email(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.firstName + " " + this.lastName);

        this.department = requestDepartment();
        System.out.println(this.department);

        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your password is " + this.password);

        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("EMAIL GENERATED: " + email);
    }

    private String requestDepartment() {
        System.out.print("DEPARTMENT CODES\nS001 for Sales\nD002 for Development\nA003 for Accounting\nN004 for none\nEnter department code:");
        Scanner input = new Scanner(System.in);
        int deptCode = input.nextInt();
        if (deptCode == 1) {
            return "Sales";
        } else if (deptCode == 2) {
            return "Development";
        } else if (deptCode == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";
        char[] password = new char[length];
        for (int i = 0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }

}
