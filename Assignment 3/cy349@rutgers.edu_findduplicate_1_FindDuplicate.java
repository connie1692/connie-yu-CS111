public class FindDuplicate {
    public static void main (String[]args){
      int n=args.length;
      boolean duplicate = false;
      for (int i=0; i<n; i++){
        for (int j=i+1; j<n; j++){
            int x=Integer.parseInt(args[i]);
            int y=Integer.parseInt(args[j]);
            if (x==y){
                duplicate=true;
                break;
            }
        }
      }  
      System.out.println(duplicate);
    }
}

