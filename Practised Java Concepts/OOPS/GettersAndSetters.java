/*
    Get: to return the value

    set: to modify the value 
 
 */

public class GettersAndSetters {
    
    public static void main(String[] args) {

        Pen p1 = new Pen(); // creating a pen object called p1

        p1.setColor("Red");// set color
        System.out.println(p1.getColor());
        
        p1.setTip(5);
        System.out.println(p1.getTip());
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "bhavanip";
        myAcc.setPassword("qwerty");
       
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color; // this: this keyword is used to refer to the current object
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}



