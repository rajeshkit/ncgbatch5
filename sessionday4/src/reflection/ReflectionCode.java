package reflection;

import annotationdemo.Batch5Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionCode {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Batch5 batch5=new Batch5();
        Class cl=batch5.getClass();
        Annotation[] annn = cl.getDeclaredAnnotationsByType(Batch5Annotation.class);
        for (Annotation annn1:annn) {
            System.out.println(annn1);
        }










        Class c=Class.forName("reflection.Batch5");
        Method[] methods =c.getDeclaredMethods();
        for (Method m:methods)
        {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(m.getModifiers());
            System.out.println(m.getParameterTypes());
        }
        Field[] fields=c.getDeclaredFields();
        Field ff=c.getDeclaredField("batchId");
        Annotation aaa = ff.getAnnotation(Batch5Annotation.class);
       if((Batch5Annotation)aaa!=null){
           System.out.println("Annotation is present");
           //do something
           System.out.println(aaa.annotationType().getCanonicalName());
       }
        for (Field f:fields){
            System.out.println(f.getName());
            System.out.println(f.getType());

        }
        Annotation[] ann = c.getAnnotationsByType(Batch5Annotation.class);

        for (Annotation an:ann){
            System.out.println(an);
        }











    }
}
