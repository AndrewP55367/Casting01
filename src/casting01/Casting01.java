
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        
        //byte x = 128;
        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        byte myByte;
        long y = 128;
         
         myByte = (byte)y;
         System.out.println(myByte);
        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again 
        byte z = 127;
        
        z++;
        System.out.println(z);
        
        z++;
        System.out.println(z);
        
        

        
        
        
    }    
}
