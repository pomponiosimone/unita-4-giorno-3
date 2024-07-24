package Sim;

public class Main2 {


    public static void main(String[] args) {
        Sim mySim = new Sim(391551008);
        mySim.makeCall(331659060, 8);
        mySim.makeCall(333976908, 9);
        mySim.makeCall(381658060, 8);
        mySim.makeCall(323976798, 20);
        mySim.makeCall(335959069, 5);

        mySim.stampaSim();
    }
}
