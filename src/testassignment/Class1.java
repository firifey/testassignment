/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignment;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author She
 */
public class Class1 extends Thread  {
    private trafficlight trafficlight;
    String threadname;
    
    public Class1(trafficlight whichtrafficlight, String threadname){
        trafficlight = whichtrafficlight;
        this.threadname = threadname;
    }
	
	public void run(){
            System.out.println(new SimpleDateFormat("mmss").format(new Date())+ " S "+ threadname );
            
            
        try {
            trafficlight.changeGreen(threadname);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		try {
//                    System.out.print(new Timestamp(System.currentTimeMillis()) + " L N Y \n" );
//                    System.out.println(" N Change to yellow in 6 sec:");
			sleep(6000);
                        trafficlight.changeYellow(threadname);
//                    System.out.print(new Timestamp(System.currentTimeMillis()) + "L N R \n");
//                    System.out.println(" N Change to Red in 6 sec:");
			sleep(6000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} trafficlight.changeRed(threadname);
                
}
}
