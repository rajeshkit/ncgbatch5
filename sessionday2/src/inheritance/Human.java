package inheritance;

public class Human{
    Heart heart;
    Human(){
        heart=new Heart();
    }
    void isAlive(){
        heart.heartBeat();
    }

    public static void main(String[] args) {
        Human h=new Human();
        h.isAlive();
        h=null;
    }
}
