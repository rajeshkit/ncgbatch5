package enumdemo;

public enum Directions {
    NORTH(10),SOUTH(5),EAST(6),WEST(7);
    int value;
    Directions(int value){
        this.value = value;
        System.out.println("constructor is called");
    }
    void display(){
        System.out.println("display method called");
    }


}
