package Sim;

public class Call {

    private int minutes;
    private int phoneNumber;

    public Call(int phoneNumber, int minutes) {
        this.phoneNumber = phoneNumber;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}