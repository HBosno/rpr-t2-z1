package ba.unsa.etf.rpr;

public class Math{
    public static int faktorijel(int a){
        int fakt=1;
        for(int i=1; i<=a; i++){
            fakt=fakt*i;
        }
        return fakt;
    }
    public static double dajSinus(double a){ //implementacija funkcije sa neta
        double y;
        y = a* java.lang.Math.PI/180;
        int n = 10;
        int i,j,fac;
        double sine = 0;
        for(i=0; i<=n; i++){
            fac = 1;
            for(j=2; j<=2*i+1; j++){
                fac*=j;
            }
            sine+= java.lang.Math.pow(-1.0,i)* java.lang.Math.pow(y,2*i+1)/fac;
        }
        return sine;
    }
}
