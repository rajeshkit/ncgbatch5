public class OnlineBanking {
    float calculateEmi(int amount,int tenure,float roi){
        float emi = amount * tenure * roi / 100; //logic
        return emi;
    }
    public static void main(String[] args) {
        OnlineBanking ob=new OnlineBanking();
        float emiValue=ob.calculateEmi(10000,2,7.5f);
        float finalEmi = emiValue*2000+5000;
        System.out.println(finalEmi);
    }
}
