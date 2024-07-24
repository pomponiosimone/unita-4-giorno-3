package Sim;

import java.util.ArrayList;
import java.util.List;

public class Sim {

    // Attributi privati
    private int phoneNumber;
    private int balance;
    private List<Call> callHistory;

    // Costruttori
    public Sim(int number) {
        this.phoneNumber = number;
        this.balance = 0;
        this.callHistory = new ArrayList<>();
    }

    // Metodi
    public void makeCall(int number, int minutes) {
        Call call = new Call(number, minutes);
        callHistory.add(call);
        // Update balance or any other relevant information here if needed
    }

    public void stampaSim() {
        System.out.println("Dati Sim:  " + phoneNumber + " Saldo " + balance);
        System.out.println("Lista chiamate:");
        for (Call call : callHistory) {
            System.out.println("Numeri chiamati: " + call.getPhoneNumber() + " for " + call.getMinutes() + " minutes.");
        }
    }

    // Getter and Setter methods if needed
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    ;
};