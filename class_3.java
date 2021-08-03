import java.util.*;

class account {
    String acc_num;
    float balance, debit, credit;

    public void debit() {
        float remain_bal = balance - debit;
        System.out.println("Remaining balance after Rs." + debit + " debited from your account: " + remain_bal);
    }

    public void credit() {
        float remain_bal = balance + credit;
        System.out.println("Remaining balance after Rs." + credit + " credited in your account: " + remain_bal);
    }
}

class class_3 {
    public static void main(String[] args) {
        account obj = new account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Number: ");
        obj.acc_num = sc.nextLine();
        System.out.println("Enter Your Account Balance: ");
        obj.balance = sc.nextFloat();
        System.out.println("Enter the amount you want to take from your account: ");
        obj.debit = sc.nextFloat();
        System.out.println("Enter the amount you want to put in your account: ");
        obj.credit = sc.nextFloat();
        obj.debit();
        obj.credit();

        sc.close();
    }
}
