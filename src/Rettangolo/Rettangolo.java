package Rettangolo;

public class Rettangolo {

    //Attributi
    public static int NumeroRettangolo;
    public double Side1;
    public double Side2;
    public double Side3;
    public double Side4;

    //Costruttori
    public Rettangolo(double S1, double S2) {
        this.Side1 = S1;
        this.Side2 = S2;

    }

    //Costruttori II
    public Rettangolo(double S1, double S2, double S3, double S4) {
        this.Side1 = S1;
        this.Side2 = S2;
        this.Side3 = S3;
        this.Side4 = S4;
    }


    //Metodi

    public void stampaRettangolo() {
        System.out.println("Perimetro rettangolo: " + (Side1 + Side2) * 2);
        System.out.println("Area rettangolo: " + Side1 * Side2);
    }

    public void stampaDueRettangoli() {
        double perimetro1 = (Side1 + Side2) * 2;
        double area1 = Side1 * Side2;
        double area2 = Side3 * Side4;
        double perimetro2 = (Side3 + Side4) * 2;
        System.out.println("Perimetro 1 rettangolo: " + perimetro1);
        System.out.println("Area 1 rettangolo: " + area1);
        System.out.println("Perimetro  2 rettangolo: " + perimetro2);
        System.out.println("Area 2 rettangolo: " + area2);
        System.out.println("somma aree: " + (area1 + area2));
        System.out.println("somma perimetri: " + (perimetro1 + perimetro2));

    }

}