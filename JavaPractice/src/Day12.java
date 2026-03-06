class Payment{
   void pay(){
        System.out.println("Payment processing");
    }
}
class CreditCard extends Payment{
    @Override
    void pay(){
        System.out.println("Paid using credit card");
    }
}
class UPI extends Payment{
    @Override
    void pay(){
        System.out.println("Paid using UPI");
    }
}

public class Day12 {
    public static void main(String[] args){
Payment p;
p = new CreditCard();
p.pay();
p = new UPI();
p.pay();
    }
}
