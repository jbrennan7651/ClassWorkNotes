package homework629;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

       

        BufferedOutputStream out = null;
        try{
            out = new BufferedOutputStream(new FileOutputStream("data.txt"));
            String outData = "Hello World 5.0";
            byte[] array = outData.getBytes();
            out.write(array);
         
        }
        catch(FileNotFoundException e){
           System.out.println(e.getMessage()); 
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                out.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        BufferedInputStream in = null;
        try{
            in = new BufferedInputStream(new FileInputStream("data.txt"));
            int data;
            {
                data = in.read();
                if(data != -1){
                    System.out.println(data);
                }
            }
            while(data != -1 );
        }
        
        catch(FileNotFoundException e){
           System.out.println(e.getMessage()); 
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try{
                in.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }


        
    }
}


