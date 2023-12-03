package abstraction;
public abstract class PassportHeadOffice {
    private int passportId;
    public String countryName;
    public void applyNewPassport(){
        System.out.println("http://passport.seva.com");
        System.out.println("Register your details");
        System.out.println("Make the payment");
        System.out.println("Done");
    }
    public abstract void verification();     // abstarct method

    public abstract void passportStatus();
}










