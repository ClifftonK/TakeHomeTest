import java.util.Scanner;

public class Program {

    private static Scanner input;
    static int count = 1;
    static int count1 = 1;
    private static float withdrawal;
    private static float balance = 0;

    input = new Scanner(System.in);

    public static void main(String args[]) {
        transaction();
    }

    private static void transaction() {

        int choice;

        //menu options
        System.out.println("1. BALANCE");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");
        System.out.println("4. QUITE");
        System.out.println("\n\nEnter Menu Option");
        System.out.println(">>");
        System.out.println("*********************************************************************");

        choice = input.nextInt();

        switch(choice) {

            case 1:
                System.out.println("BALANCE \n"+balance+"\n");
                anotherTransaction();
                break;

            default:
                System.out.println("Invalid option:\n\n");
                transaction();
                break;

            case 2:
                while (count <= 4)
                {
                    float deposit;

                    System.out.println("DEPOSIT: ");
                    System.out.println("Current Balance: " + balance);

                    deposit = input.nextFloat();

                    if(deposit>40000)
                    {
                        System.out.println("Max Deposit amount of 40000 per transaction surpassed");
                        transaction();
                    }

                    balance = deposit + balance;

		                 if(balance>150000)
                {
                    System.out.println("Max Deposit amount of 150000 per day surpassed");
                }

                else if
                {
                    System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
                    ++count;
                }
                    anotherTransaction();

                }
                System.out.println("Max Deposit Frequency surpassed");

                break;

            case 3:
                while(count1<=3)
                {
                    float amount;
                    System.out.println("WITHDRAWAL: ");
                    System.out.println("Current Balance: " + balance);
                    amount = input.nextFloat();
                    //check if they have enough money to withdraw
                    if(amount > balance || amount == 0)
                    {
                        System.out.println("You have insufficient funds\n\n");
                        anotherTransaction();
                    } else
                    {
                        //check the transaction amount does not exceed 20k
                        if(amount>20000 )
                        {
                            System.out.println("Max Withdrawal cannot exceed 20000 per transaction");
                            //Max withdrawal per transaction =20k
                            anotherTransaction();
                        }
                        withdrawal=withdrawal+amount;
                        //check total withdrawn amount does not exceed 50000
                        if(withdrawal>50000)
                        {
                            System.out.println("Max Withdrawal cannot exceed 50000 per day");
                            anotherTransaction();
                        }
                        //deduct the withdrawn amount from the account balance
                        balance = balance - amount;
                        System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
                        ++count1;
                        anotherTransaction();
                    }
                }
                System.out.println("Max Withdrawal Frequency surpassed");
                break;

            case 4:
                System.out.print("Are you sure you want to quit? 'YES' or 'NO'\n");
                String value = input.next();
                if(value.equalsIgnoreCase("yes"))
                {
                    System.out.println("Goodbye");
                    System.exit(0);
                }else if
                {
                    transaction();
                }
        }
    }

    private void anotherTransaction() {
        System.out.println("Type 'MENU' and press enter to go back to main menu");
        String value = input.next();
        if(value.equalsIgnoreCase("menu")) {
            transaction();
        }
    }
}
