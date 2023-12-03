package exceptionhandling;

import reflection.Batch5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public void add() throws FileNotFoundException {
        System.out.println("add 1");
        FileReader fr=new FileReader("f:/customerdata.txt");
        Scanner s=new Scanner(System.in);
        System.out.println("add2");
        s.close();
    }
    public static void main(String[] args) throws IOException {
        System.out.println("line 1");
        System.out.println("line 2");
        Demo d=new Demo();
        d.add();
        System.out.println("line 3");
        try(FileReader fr=new FileReader("f:/customerdata.txt");
            Scanner s=new Scanner(System.in);
            Batch5 b=new Batch5();){
            //System.exit(1);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException
                 | IOException e){
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        //try {
//            //throw new ArithmeticException();
//       // FileReader fr=new FileReader("");
//
////            int k=10/5; //throw new ArithmeticException();
////            int[] arr={34,356,6};
////            System.out.println(arr[2]);
////        } catch (ArithmeticException e) {
////            e.printStackTrace();
////        } catch(ArrayIndexOutOfBoundsException e){
////            e.printStackTrace();
//        //}
//        System.out.println("line 4");
//        System.out.println("line 5");
//        System.out.println("line 6");

    }
}
