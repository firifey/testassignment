
package testassignment;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testassignment {

    public static void main(String[] args) throws InterruptedException {
        String readfile = null;
        String [] huhu = new String[2];
        trafficlight haha = new trafficlight();
        int i = 0;
        int select=0;
        Class1 thread1 = new Class1(haha,"N");
        Class2 thread2 = new Class2(haha,"EWL");
        thread1.setName("N");
        thread2.setName("EWL");
        
//        System.out.println(new SimpleDateFormat("mmss").format(new Date())+ " L " + thread2.getName()+" G");
//        System.out.println(new SimpleDateFormat("mmss").format(new Date())+ " L " + thread1.getName()+" R");
        
        thread1.setPriority(10);
        thread2.setPriority(1);
        
        try{
            Scanner inputStream = new Scanner(new FileInputStream("input.txt"));
                    while(inputStream.hasNextLine()){
                    readfile=inputStream.nextLine();
                    huhu[i] = readfile;
                        System.out.println(huhu[i]);
                    i++;
                    }
                    inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
         System.out.println(new SimpleDateFormat("mmss").format(new Date())+ " L " + thread2.getName()+" G");
        System.out.println(new SimpleDateFormat("mmss").format(new Date())+ " L " + thread1.getName()+" R");

//for(int k=0;k<huhu.length;k++){        
  // if (readfile.equals("N")){
    //    thread1 = new Class1(haha,"N");
        thread1.start();
      //  thread2 = new Class2(haha,"EWL");
        thread2.start();
        
}
        
////	while(i<2)
////             select = new Random().nextInt(2);
//                switch (select){
//			case 0:
//			System.out.println("signal come from "+thread1.getName());
//			thread1.start();
//			break;
//			
//			default:
//			//EWL remain green
//			break;
    }
    


