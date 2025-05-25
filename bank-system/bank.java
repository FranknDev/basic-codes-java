import java.util.Scanner;
public class bank{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        accounts_bank contas = new accounts_bank();
        System.out.println("|-------------------BANK------------------|\n\n1 - Sign Up\n2 - Login\n3 - accounts");
        int opc = input.nextInt();
        if(opc==1){
            System.out.println("Name: ");
            String name = input.next();
            
            System.out.println("Password: ");
            String password = input.next();
            
            System.out.println(contas.RegisterAccount(name, password));
        }
    }
}