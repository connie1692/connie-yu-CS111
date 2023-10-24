public class RURottenTomatoes {
    public static void main (String[]args){
        int rows=Integer.parseInt(args[0]);
        int cols=Integer.parseInt(args[1]);
        int counter= 2;

        int b[]=new int [cols];
        int a [][]=new int [rows][cols];

        for (int i=0; i<rows;i++){
            for (int j=0;j<cols;j++){
                a[i][j]=Integer.parseInt(args[counter]);
                counter++;
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                b[j]+=a[i][j];
            }
        }
        int index=0;
        int largest=0;
        for (int i=0;i<cols;i++){
            if(largest<b[i]){
                largest=b[i];
                index=i;
            }

        }
        System.out.println(index);
    }    
}
