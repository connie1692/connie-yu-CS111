/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array){
        double []num=new double [array.length];
        for (int i=0; i<array.length;i++){
            num[i]=array[i];

        }
        return num;
        }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i < x.length; i++){
            x[i]=x[i]*alpha;
            y[i]=y[i]*alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
        for(int i=0;i<x.length;i++){
            x[i]=x[i]+dx;
            y[i]=y[i]+dy;
        }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
        Double j=Math.toRadians(theta);
        double[]num=copy(x);
        for (int i=0;i<x.length;i++){
            x[i]=x[i]*Math.cos(j)-y[i]*Math.sin(j);
            y[i]=y[i]*Math.cos(j)+num[i]*Math.sin(j);
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
/// Rotates polygon 45 degrees. 
StdDraw.setScale(-5.0, +5.0); 
double[] x = { 0, 1, 1, 0 }; 
double[] y = { 0, 0, 2, 1 }; 
double theta = 45.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
rotate(x, y, theta); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);
    }
}
