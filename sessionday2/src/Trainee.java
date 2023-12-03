public class Trainee {
    static{
        System.out.println("static block");
    }
    public Trainee(int traineeId, String traineeName, long phone) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.phone = phone;
    }

    public Trainee() {
    }

    public Trainee(int traineeId) {
        this.traineeId = traineeId;
    }

    int traineeId;// instance variable



    String traineeName;// instance variable
    static String email;// instance variable
    long phone;// instance variable
    static void display(){

    }
    void displayTrainee(){ //instance method
        System.out.println("Name: "+traineeName);
        System.out.println("Id: "+traineeId);
        System.out.println("Email: "+Trainee.email);
        System.out.println("Phone no: "+phone);
    }

    public static void main(String[] args) { //static method
        Trainee t1=new Trainee(123,"vijay",4676);
        t1.displayTrainee();

    }



















}
