package candacepolisi;

public class candacepolisilib {

    public static int sumUp(int x){
        int r= 0;
        for (int c=x; c>0; c--){
            r+=c;
        }
        return r;
    }

    public static String table(int b, int r) {
        int a = 0;
        String x = "";
        for (int i = 1; r > i; i++) {
            a = a + b;
            x = " " + x + "  " + (b + " * " + i + " = " + a);
        }
        return x;
    }

    public static String pali(String pal) {
        String check = "";
        for (int c = pal.length(); c > 0; c--) {
            check = c + pal.substring(c, c + 1);
        }
        if (check.equals(pal)){
            return "true";
        }
        else {
            return "false";
        }
    }

    public static boolean fibanacci(int z){
        int a= 1;
        int b= 1;
        int c= 0;
        while (z>a && z>b && z>c){
            c= a +b;
            b= c+ a;
            a= c+b;
        }
        return (z==a | z==b | z==c);
    }

    public static String quad(double a, double b, double c){
        // -b +- sq root b^2 -4ac /2a
        double r=0 ;
        // sqs b
        double s= b*b;
        String res= "";
        //gets stuff under the sqrt
        s= s-4*a*c;
        if (s<0){
            return "imaginary numbers sorry";
        }
        else{
            s= Math.sqrt(s);
            r=s;
            s= (-b + s)/ (2*a);
            r= (-b -s)/ (2*a);
            res= "" + s + " and " + r;
            return res;
        }
    }

    public static String cutOut(String str, String sh){
        String r= "";
        int c= str.indexOf(sh);
        r= str.substring(0,c) + str.substring(c+sh.length()-1);
        return r + " " + sh;
    }

    public static int LCM(int a, int b){
        int m=a;
        if ((a==1)||(b==1)){
            m=1;
        }
        if ((a==0)||(b==0)) {
            m = 0;
        }
        else{
            while (m%b>0){
                m=m+a;
            }
        }
        return m;
    }

    public static int 
}