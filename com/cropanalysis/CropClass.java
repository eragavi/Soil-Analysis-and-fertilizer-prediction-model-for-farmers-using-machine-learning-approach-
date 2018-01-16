package com.cropanalysis;

public class CropClass {
    public static double f9m;
    public static double mground;
    public static double mi;
    public static double mk200;
    public static double mk400;
    public static double mm;
    public static double mn120;
    public static double mn140;
    public static double mn40;
    public static double mn60;
    public static double mn80;
    public static double mp;
    public static double mp100;
    public static double mp250;
    public static double mpaddy;
    public static double mr;
    public static double msb;
    public static double msr;
    public static double probm;
    public static double probu;
    public static double f10u;
    public static double uground;
    public static double ui;
    public static double uk200;
    public static double uk400;
    public static double um;
    public static double un120;
    public static double un140;
    public static double un40;
    public static double un60;
    public static double un80;
    public static double up;
    public static double up100;
    public static double up250;
    public static double upaddy;
    public static double ur;
    public static double usb;
    public static double usr;

    public static void assignment() {
        un40 = 0.3076d;
        un60 = 0.269d;
        un80 = 0.269d;
        un120 = 0.153d;
        un140 = 0.001d;
        mpaddy = 1.0d;
        mground = 1.0d;
        upaddy = 1.0d;
        uground = 1.0d;
        up100 = 0.5576d;
        up250 = 0.423d;
        uk200 = 0.538d;
        uk400 = 0.461d;
        usr = 0.3076d;
        usb = 0.365d;
        ui = 0.173d;
        ur = 0.153d;
        um = 0.538d;
        up = 0.4615d;
        f10u = 0.5531d;
        mn40 = 0.0714d;
        mn60 = 0.119d;
        mn80 = 0.38d;
        mn120 = 0.238d;
        mn140 = 0.19d;
        mp100 = 0.547d;
        mp250 = 0.447d;
        mk200 = 0.785d;
        mk400 = 0.214d;
        msr = 0.285d;
        msb = 0.261d;
        mi = 0.214d;
        mr = 0.238d;
        mp = 0.4137d;
        mm = 0.625d;
        f9m = 0.4469d;
        probu = 1.0d;
        probm = 1.0d;
    }

    public static String fertilizerRecommendation(double n, double p, double k, String soil, String irrigation, String place, String crop) {
        assignment();
        probu *= f10u;
        probm *= f9m;
        if (crop.equals("paddy")) {
            probu *= upaddy;
            probm *= mpaddy;
        } else {
            probu *= uground;
            probm *= mground;
        }
        if (crop.equals("paddy")) {
            if (soil.equals("r")) {
                probu *= usr;
                probm *= msr;
            } else {
                probu *= usb;
                probm *= msb;
            }
        }
        if (!crop.equals("paddy")) {
            if (irrigation.equals("i")) {
                probu *= ui;
                probm *= mi;
            } else {
                probu *= ur;
                probm *= mr;
            }
        }
        if (place.equals("p")) {
            probu *= up;
            probm *= mp;
        } else {
            probu *= um;
            probm *= mm;
        }
        if (n > 0.0d && n <= 50.0d) {
            probu *= un40;
            probm *= mn40;
        }
        if (n > 50.0d && n <= 70.0d) {
            probu *= un60;
            probm *= mn60;
        }
        if (n > 70.0d && n <= 100.0d) {
            probu *= un80;
            probm *= mn80;
        }
        if (n > 100.0d && n <= 130.0d) {
            probu *= un120;
            probm *= mn120;
        }
        if (n > 130.0d) {
            probu *= un140;
            probm *= mn140;
        }
        if (p > 0.0d && p <= 150.0d) {
            probu *= up100;
            probm *= mp100;
        }
        if (p > 150.0d) {
            probu *= up250;
            probm *= mp250;
        }
        if (k > 0.0d && k <= 300.0d) {
            probu *= uk200;
            probm *= mk200;
        }
        if (k > 300.0d) {
            probu *= uk400;
            probm *= mk400;
        }
        if (probu > probm) {
            return "Urea";
        }
        if (probu < probm) {
            return "Muriate Of Potash";
        }
        return "Either Urea and Muriate of Potash";
    }

    public static void main(String[] args) {
        System.out.println(fertilizerRecommendation(100.0d, 200.0d, 100.0d, "r", "i", "p", "paddy"));
    }
}
