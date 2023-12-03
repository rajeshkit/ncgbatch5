package reflection;

import annotationdemo.Batch5Annotation;

public class Batch5 implements  AutoCloseable {
    @Batch5Annotation
    int batchId;
    String batchName;
    void session(){

    }

    @Override
    public void close() throws Exception {
        System.out.println("Batch 5 resource object called close method");
    }
}
