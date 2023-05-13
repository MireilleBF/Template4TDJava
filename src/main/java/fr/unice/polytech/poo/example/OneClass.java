package fr.unice.polytech.poo.example;
public class OneClass {
    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        OneClass oneClass = new OneClass();
        System.out.println(oneClass.hello());
    }
}
