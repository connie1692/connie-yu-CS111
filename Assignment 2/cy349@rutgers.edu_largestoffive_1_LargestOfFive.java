public class LargestOfFive{
    public static void main (String[]args){
        int highest = Integer.MIN_VALUE;

        for (int i = 0;i < 5; i++){
            int x=Integer.parseInt(args[i]);
            if (highest < x)
            highest = x;
        }
        


        System.out.println(highest);

    }
}