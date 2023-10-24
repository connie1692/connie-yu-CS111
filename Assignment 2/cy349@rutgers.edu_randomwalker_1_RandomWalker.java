import java.time.YearMonth;
import java.io.*;
public class RandomWalker {
    public static void main (String[]args){
     int n=Integer.parseInt(args[0]);
     int x=0;
     int y=0;
     double answer=0;
     System.out.println("(" + x + ","+ y + ")");
     for (int a=0; a<n; a++){
        int b=(int)Math.floor((Math.random()*4)+1);
        if (b==1){
         y++;  
        }
        if (b==2){
         y--;
        }
        if (b==3){
        x++;
        }
        if (b==4){
            x--;
        }
        System.out.println("(" + x + ","+ y + ")");
        
     }

     answer=Math.pow(x,2)+Math.pow(y,2);
     System.out.println(answer);

    }
    
}
