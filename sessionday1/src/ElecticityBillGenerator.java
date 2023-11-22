public class ElecticityBillGenerator {
    void caluclateEbBill(){
        int unitCost=7;
        int totalUnitConsumed=2000;
        float gst=10.0f;
        float total = unitCost * totalUnitConsumed * gst / 100;
        System.out.println(total);
    }
    public static void main(String[] args) {
        ElecticityBillGenerator eb=new ElecticityBillGenerator();
        eb.caluclateEbBill();
    }
}
