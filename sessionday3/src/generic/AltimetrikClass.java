package generic;

public class AltimetrikClass<T extends Number> {
    T id;
    AltimetrikClass(){

    }
    public AltimetrikClass(T id) {
        this.id = id;
    }
    <T> void display(T t){
        System.out.println(this.id + "  "+this.id.getClass().getCanonicalName());
    }
}
