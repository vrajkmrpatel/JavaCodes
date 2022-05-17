import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class acount {
    int ac_no;
    String name;
    double amount;

    void insert(int acount, String n, double amt) {
        ac_no = acount;
        name = n;
        amount = amt;
        System.out.println("Data insered sucessfully!");
    }

    void deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited!");
    }

    void withraw(double amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withrawn");
        }
    }

    void checkBalace() {
        System.out.println("Balance is.." + amount);
    }

    void display() {
        System.out.println(ac_no + " " + name + " " + amount);
    }

    public void exit() {
    }
}

public class Testatm {
    public static void main(String[] args) {
        acount a1 = new acount();
        int acount;
        String n;
        double amt;

        // manual method
        // a1.insert(919200, "Vraj", 1000);
        // a1.display();
        // a1.checkBalace();
        // a1.deposit(50000);
        // a1.checkBalace();
        // a1.withraw(23000);
        // a1.checkBalace();

        // menu driven approach
        while (true) {
            System.out.println();
            System.out.println("\tATM WITHRAWAL MACHINE\t");
            System.out.println();
            System.out.println("\t1) Insert data");
            System.out.println("\t2) Deposit Money");
            System.out.println("\t3) Withrawal Money");
            System.out.println("\t4) Check Balance");
            System.out.println("\t5) Display");
            System.out.println("\t6) Exit");
            System.out.println("Enter your choice....");
            int ch;
            Scanner input = new Scanner(System.in);
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    a1.insert(919200, "Vraj", 1000);
                    break;

                case 2:
                    System.out.println("Enter the amount to be deposit");
                    Scanner ip = new Scanner(System.in);
                    amt = ip.nextInt();
                    a1.deposit(amt);
                    break;

                case 3:
                    System.out.println("Enter the amount to be withraw");
                    Scanner op = new Scanner(System.in);
                    amt = op.nextInt();
                    a1.withraw(amt);
                    break;

                case 4:
                    a1.checkBalace();
                    break;

                case 5:
                    a1.display();
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }

        }
    }

}
