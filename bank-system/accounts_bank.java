import java.util.ArrayList;
public class accounts_bank{
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();
    ArrayList<Double> moneys = new ArrayList<Double>();
    protected String RegisterAccount(String name, String password){
        if(name.length()<5) return "The length this name is not valide.";
        if(password.length()<5) return "The length this password is not valide.";
        names.add(name);
        passwords.add(password);
        moneys.add(0.0);
        return "Sucessfull!";
    }
}