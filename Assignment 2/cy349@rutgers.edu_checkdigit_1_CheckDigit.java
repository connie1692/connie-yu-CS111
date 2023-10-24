public class CheckDigit {
    public static void main (String[]args){
        long x=Long.parseLong(args[0]);
        long y=Long.parseLong(args[0]);
        int answer=0;
        int answer2=0;

        for (int i=0; i<args[0].length();i++){
            answer += x % 10;
            x/=100;
         }
            answer=answer % 10;
            y/=10;

        for (int i=0; i<args[0].length();i++){
            answer2 += y % 10;
            y/=100;
        }
        answer2 %=10;
        answer2*=3;
        answer2 %=10;
        answer=answer2 + answer;
        answer%=10;

        System.out.println(answer);

    }
}
