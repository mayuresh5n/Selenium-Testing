package JavaPrograms;
//In method overriding we overied the parent class with local method in child class
public class methodOverrriding extends funcOverload {

    public static void main(String[] args) {

        methodOverrriding mo=new methodOverrriding();

        mo.audioSystem();
        mo.engine();
        mo.color();
    }

    public void audioSystem() {
        System.out.println("Pioneer");
    }

    public void engine() {
        System.out.println("W-24");

    }

    public void color() {
        System.out.println("Blue");
    }
}
