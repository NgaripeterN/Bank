package bank;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("SAVINGS ACCOUNT DETAILS");
        SavingsAccount sac=new SavingsAccount(1001,"Ann Kamau","07200000","test@gmail.com",1000);
        sac.accountholder();
        sac.deposit(500);
        sac.displayBalance();
        System.out.println("\nCURRENT ACCOUNT DETAILS");
        CurrentAccount cac=new CurrentAccount(1001,"Peter Smith","08100000","admin@gmail.com",0.0);
        cac.accountholder();
       cac.deposit(300);
        cac.displayBalance();
        }

}
