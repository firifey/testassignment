/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testassignment;

/**
 *
 * @author She
 */
public class trafficlight {
	
        boolean green = true;
        
        public synchronized void changeGreen(String name) throws InterruptedException{
            if (green = true){
                wait();
                }
		System.out.println(name+" change to green");
        }
		
	public synchronized void changeYellow(String name){
            
			System.out.println(name+" change to yellow");
	}
	
	public synchronized void changeRed(String name){
             green = false;
		System.out.println(name+" change to red");
               
                notify();
	}
        
        
}
