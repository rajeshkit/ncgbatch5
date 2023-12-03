package abstraction;

import com.sun.security.jgss.GSSUtil;

public class ChennaiPassportOffice extends PassportHeadOffice{
    @Override
    public void verification() {
        System.out.println("Aadhar card");
    }

    @Override
    public void passportStatus() {
        System.out.println("sms");
    }
}
