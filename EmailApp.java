import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        System.out.print("Enter the number of clients to be processed:");
        Scanner input = new Scanner(System.in);
        int numOfClients = input.nextInt();

        Email[] clients = new Email[numOfClients];
        for (int c = 0; c < numOfClients; c++) {
            Scanner in = new Scanner(System.in);
            clients[c] = new Email(in.nextLine(),in.nextLine());
            clients[c].setMailboxCapacity(1000);
        }
    }
}
