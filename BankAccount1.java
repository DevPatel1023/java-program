import java.util.Scanner;

class BankAccount
{
static int acc_no=1;
String Depositor_name,Acc_type; 
int  Balance,amount;

void createAcc()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Deatils for acc_no: "+acc_no);

//For take input of depositer Name.
System.out.println("Enter the depositer name:");
Depositor_name=sc.next();


//For take input that what type of account is saving or current
System.out.println("Enter the type of account/current or saving:");
Acc_type=sc.next();

//For take input of Balance of that acc-holder.
System.out.println("Enter the money in your account:");
Balance=sc.nextInt();

acc_no++;

}

void Deposite()
{
   Scanner sc1=new Scanner(System.in);
   
   System.out.println("Enter the amount you want to deposite:");
   amount=sc1.nextInt();
  
   Balance=Balance+amount;
   System.out.println("The Updated balance in your account is:"+Balance);
   
}

void withdraw()
{
Scanner sc2=new Scanner(System.in);

 System.out.println("Enter the amount you want to withdraw:");
amount=sc2.nextInt();

if(amount>=Balance)
{
System.out.println("Insuffcient balance!!");
}
else{
Balance=Balance-amount;
System.out.println("Updateted balance is:"+Balance);
}

}

void BalanceInquiry()
{
System.out.println("FOR THE DEATILS OF :"+acc_no);
System.out.println("NAME IS :"+Depositor_name);
System.out.println("TYPE OF ACCOUNT IS:"+Acc_type);
System.out.println("THE BALANCE OF THAT ACCOUNT IS:"+Balance);
}

}
class bankaccount1
{
public static void main(String args[])
{
BankAccount b=new BankAccount();
  System.out.println("Enter 1 if you create an account ");
  System.out.println("Enter 2 if you want to deposite  money in your account ");
  System.out.println("Enter 3 if you withdraw money from your account ");
  System.out.println("Enter 4 if you cheak your balance of your account ");
  
  int choice ;
  int acc_nob;
  Scanner s = new Scanner (System.in );
  
 
  do{
  System.out.print("Enter the choice:");
  choice = s.nextInt();

  switch(choice){
    case 1 : 
        b.createAcc();
      break;
    
      case 2:
        System.out.println("Enter your account number:");
        acc_nob = s.nextInt();
        if (acc_nob == BankAccount.acc_no-1){
        b.Deposite();}
        else{
          System.out.println("cheak your acc no!");
        }
    break;

    case 3: 
        System.out.println("Enter your account number:");
        acc_nob = s.nextInt();
        if (acc_nob == BankAccount.acc_no-1){
        b.withdraw();}
        else{
          System.out.println("cheak your acc no!");
        }
    break;
    case 4:
        System.out.println("Enter your account number:");
        acc_nob = s.nextInt();
        if(acc_nob == BankAccount.acc_no-1)
        b.BalanceInquiry();
        else{
          System.out.println("cheak your acc no!");
        }
    break;
    
    default :
    System.out.println("You entered wrong no please cheak it again!!");
    break;
  }
}while(choice!=0);
}
}
