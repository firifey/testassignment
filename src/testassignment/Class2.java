/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignment;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author She
 */
public class Class2 extends Thread{
    private trafficlight trafficlight;
    String threadname;

     public Class2(trafficlight whichtrafficlight, String threadname){
        trafficlight = whichtrafficlight;
        this.threadname = threadname;
    }
	
	public void run(){
		try {
                    System.out.println(" EWL Change to yellow in 6 sec:");
			sleep(6000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();}
            trafficlight.changeYellow(threadname);
		try {
                    System.out.println("EWL Change to Red in 6 sec:");
			sleep(6000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();}
                trafficlight.changeRed(threadname);
//		try {
//                    System.out.println("Change to green in 2 sec:");
//			sleep(2000);
//		} catch (InterruptedException ex) {
//			ex.printStackTrace();}
        try {
            trafficlight.changeGreen(threadname);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
}
}
