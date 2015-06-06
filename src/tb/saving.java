/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import static sun.misc.MessageUtils.out;
/**
 *
 * @author Asus
 */
public class saving {
    //private Object tb;
    
    public  Object save(){
       tb save = new tb();
        try
        {
            FileOutputStream fileOut = new FileOutputStream("tb.ser");
            ObjectOutputStream outn= new ObjectOutputStream(fileOut);
            out.writeObject(save);
            out.close();
            fileOut.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
            
            
        }
    public Object Output(){
        try{
            FileInputStream fileIn = new FileInputStream(tb.ser);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            Object sav = in.readObject();
            in.close();
            fileIn.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
         }
        return null;
    }

    
        
    }

