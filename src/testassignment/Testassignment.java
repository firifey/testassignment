/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignment;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author She
 */
public class Testassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        trafficlight haha = new trafficlight();
        int i = 0;
        int select=0;
        Class1 thread1 = new Class1(haha,"N");
        Class2 thread2 = new Class2(haha,"EWL");
        thread1.setName("N");
        thread2.setName("EWL");
        
        System.out.println(thread2.getName()+" is green");
        System.out.println(thread1.getName()+" is red");
        
        thread1.setPriority(10);
        thread2.setPriority(1);
        
        thread1.start();
        thread2.start();
   
        
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
    
}

