package polymorphsim;

public class UpiPayment extends Payment{
    @Override
    public void payBill(String upi) {
        System.out.println("UPIID");
        System.out.println("check balance");
        System.out.println("payment");
        System.out.println("payment status");
    }

    public static void main(String[] args) {
        Payment pay=new UpiPayment();//545454
        pay.payBill("4657UPI");
    }
}
