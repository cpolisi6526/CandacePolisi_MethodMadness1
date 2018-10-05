package candacepolisi;

public class candacepolisilib {

    public static int sumUp(int x) {
        int r = 0;
        for (int c = x; c > 0; c--) {
            //starting from number adds each number leading up to it
            r += c;
        }
        return r;
    }

    public static String table(int b, int r) {
        int a = 0;
        String x = "";
        for (int i = 1; r > i; i++) {
            a = a + b;
            /// makes x a multipication table
            x = " " + x + "  " + (b + " * " + i + " = " + a);
        }
        return x;
    }

    public static String pali(String pal) {
        // puts backwards string in new var then sees if equal
        String check = "";
        for (int c = pal.length(); c > 0; c--) {
            check = c + pal.substring(c, c + 1);
        }
        if (check.equals(pal)) {
            return "true";
        } else {
            return "false";
        }
    }

    public static boolean fibanacci(int z) {
        int a = 1;
        int b = 1;
        int c = 0;
        while (z > a && z > b && z > c) {
           // keeps adding three numbers together in loop bc thats what f seq is
            c = a + b;
            b = c + a;
            a = c + b;
        }
        return (z == a | z == b | z == c);
    }

    public static String quad(double a, double b, double c) {
        // -b +- sq root b^2 -4ac /2a
        double r = 0;
        // sqs b
        double s = b * b;
        String res = "";
        //gets stuff under the sqrt
        s = s - 4 * a * c;
        if (s < 0) {
            return "imaginary numbers sorry";
        } else {
            s = Math.sqrt(s);
            r = s;
            s = (-b + s) / (2 * a);
            r = (-b - s) / (a);
            res = "" + s + " and " + r;
            return res;
        }
    }

    public static String cutOut(String str, String sh) {
        String r = "";
        int c = str.indexOf(sh);
        ///strings together the two puts before and after the sh
        r = str.substring(0, c) + str.substring(c + sh.length() - 1);
        return r + " " + sh;
    }

    public static int LCM(int a, int b) {
        int m = a;
        if ((a == 1) || (b == 1)) {
            m = 1;
        }
        if ((a == 0) || (b == 0)) {
            m = 0;
        } else {
            while (m % b > 0) {
                m = m + a;
            }
        }
        return m;
    }

    public static int common(String a, String b, String c) {
        int r = 0;
        String le = "";
        int i = 1;
        for (int d = 0; a.length() > d; d++) {
            le = a.substring(d, d + 1);
            //puts  letter into own variable
            i = b.indexOf(le);
            // find var in other number
            if (i >= 0) {
                r++;
                while (i >= 0) {
                    //removes all common letter out of second word
                    b = b.substring(0, i) + b.substring(i + 1);
                    i = b.indexOf(le);
                }
            } else {
                i = c.indexOf(le);
                if (i >= 0) {
                    r++;
                    while (i >= 0) {
                        c = c.substring(0, i) + c.substring(i + 1);
                        i = c.indexOf(le);
                    }
                }
            }
        }
        for (int d = 0; b.length() - 2 > d; d++) {
//// changed to minus 2 idk why but it works
            le = b.substring(d, d + 1);
            i = b.indexOf(le);
            if (i >= 0) {
                r++;
                while (i >= 0) {
                    c = c.substring(0, i) + c.substring(i + 1);
                    i = c.indexOf(le);
                }
            }
        }
        return r;
    }

    public static String vig(String og, String sh) {
        //a shifts 0, b shifts by 1, c shifts by 2 (it was never specified like the am each letter was weighted technically)
        String r = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int ogl = 0;
        int shl = 0;
        String let = "";
        String shift = "";
        int d = 0;
        int rnum = 0;
        int c;
        for (c = 0; c < (og.length()); c++) {
            let = og.substring(c, c + 1);
            ogl = alphabet.indexOf(let);
            // find letter on place of alphabet string
            if (d > sh.length() - 1) {
                d = 0;
            }
            shift = sh.substring(d, d + 1);
            shl = alphabet.indexOf(shift);
            d++;
            rnum = ogl + shl;
            //if goes above 26 goes back 
            if (rnum > alphabet.length() - 1) {
                rnum = rnum - alphabet.length() - 1;
            }
            r = r + alphabet.substring(rnum, rnum + 1);
        }
        return r;
    }
}
