package com.oops.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.Serializable;

class A implements Serializable 
{ 
    int i; 
      
    // parameterized constructor 
    public A(int i)  
    { 
        this.i = i; 
    } 
      
} 
class B extends A 
{ 
    int j; 
      
    // parameterized constructor 
    public B(int i,int j)  
    { 
        super(i); 
        this.j = j; 
    } 
      
    // By implementing writeObject method,  
    // we can prevent 
    // subclass from serialization 
    private void writeObject(ObjectOutputStream out) throws IOException 
    { 
        throw new NotSerializableException(); 
    } 
      
    // By implementing readObject method,  
    // we can prevent 
    // subclass from de-serialization 
    private void readObject(ObjectInputStream in) throws IOException 
    { 
        throw new NotSerializableException(); 
    } 
      
} 
public class Test {
	public static void main(String[] args)  
            throws Exception  
    { 
        B b1 = new B(10, 20); 
          
        System.out.println("i = " + b1.i); 
        System.out.println("j = " + b1.j); 
          
        // Serializing B's(subclass) object  
          
        //Saving of object in a file 
        FileOutputStream fos = new FileOutputStream("E:/File/TestWS.txt"); 
        java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
              
        // Method for serialization of B's class object 
        oos.writeObject(b1); 
              
        // closing streams 
        oos.close(); 
        fos.close(); 
              
        System.out.println("Object has been serialized"); 
          
        // De-Serializing B's(subclass) object  
          
        // Reading the object from a file 
        FileInputStream fis = new FileInputStream("E:/File/TestWS.txt"); 
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
              
        // Method for de-serialization of B's class object 
        B b2 = (B)ois.readObject(); 
              
        // closing streams 
        ois.close(); 
        fis.close(); 
              
        System.out.println("Object has been deserialized"); 
          
        System.out.println("i = " + b2.i); 
        System.out.println("j = " + b2.j); 
    } 
}
