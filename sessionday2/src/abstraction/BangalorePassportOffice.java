package abstraction;

public class BangalorePassportOffice extends PassportHeadOffice{
    @Override
    public void verification() {

        System.out.println("Pan card");
    }

    @Override
    public void passportStatus() {
        System.out.println("email");
    }
}
