interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paid using credit card");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Paid using UPI");
    }
}

public class Interface {
    public static void main(String[] args){
Payment p;

p = new CreditCard();
p.pay();
p = new UPI();
p.pay();
    }
}
