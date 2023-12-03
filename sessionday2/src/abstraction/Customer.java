package abstraction;

public class Customer extends PassportHeadOffice {
    @Override
    public void verification() {

    }

    @Override
    public void passportStatus() {

    }

    public static void main(String[] args) {
       // PassportHeadOffice pho=new  PassportHeadOffice();// HAS-A
        //pho.applyNewPassport();
        PassportHeadOffice pho=new Customer();
        pho.applyNewPassport();
        pho.verification();

    }
}






