
import javax.sound.sampled.SourceDataLine;

public class logical_operators{
    
    public static void main(String[] args){
        //logical operators
        // && operators
        int a = 30;
        int b = 60;

        if(a<50 && b<50){
            System.out.println("both of them less than 50");
        }

        // below is or operator
        if(a<50 || b<50){
            System.out.println("Yes one of them are 50");
        }
    }
}