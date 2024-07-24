package Rettangolo;

public class Rettangolo {

    // Attributi privati
    private static int NumeroRettangolo;
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    // Costruttori
    public Rettangolo(double s1, double s2) {
        this.side1 = s1;
        this.side2 = s2;
    }

    // Costruttori II
    public Rettangolo(double s1, double s2, double s3, double s4) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        this.side4 = s4;
    }

    public static int getNumeroRettangolo() {
        return NumeroRettangolo;
    }

    public static void setNumeroRettangolo(int numeroRettangolo) {
        NumeroRettangolo = numeroRettangolo;
    }

    // Metodi getter e setter
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    // Metodi

    public void stampaRettangolo() {
        System.out.println("Perimetro rettangolo: " + (side1 + side2) * 2);
        System.out.println("Area rettangolo: " + side1 * side2);
    }

    public void stampaDueRettangoli() {
        double perimetro1 = (side1 + side2) * 2;
        double area1 = side1 * side2;
        double area2 = side3 * side4;
        double perimetro2 = (side3 + side4) * 2;
        System.out.println("Perimetro 1 rettangolo: " + perimetro1);
        System.out.println("Area 1 rettangolo: " + area1);
        System.out.println("Perimetro 2 rettangolo: " + perimetro2);
        System.out.println("Area 2 rettangolo: " + area2);
        System.out.println("Somma aree: " + (area1 + area2));
        System.out.println("Somma perimetri: " + (perimetro1 + perimetro2));
    }
}