
package testassignment;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
public class trafficlight {
	
        boolean green = true;
        
        public synchronized void changeGreen(String name) throws InterruptedException{
            if (green = true){
                wait();
                }
            System.out.print(new SimpleDateFormat("mmss").format(new Date()) + " L " + name + " G \n");
//            System.out.println(name+" change to green");
        }
		
	public synchronized void changeYellow(String name){
            System.out.print(new SimpleDateFormat("mmss").format(new Date()) + " L " + name + " Y \n");
//			System.out.println(name+" change to yellow");
	}
	
	public synchronized void changeRed(String name){
             green = false;
             System.out.print(new SimpleDateFormat("mmss").format(new Date()) + " L " + name + " R \n");
//		System.out.println(name+" change to red");
               
                notify();
	}
        
        
}
