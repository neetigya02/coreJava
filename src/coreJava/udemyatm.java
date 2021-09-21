package coreJava;

public class udemyatm {
    public static void main(String[] args) {
        
        bankacc bobsAccount = new bankacc("12345", 0, "Bob sharma", "bob.sharma@gmail.com", "987654321");

        
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);



    }
    
}
