package exemple.strategy;

public class Main {
    public static void main(String[] args) {
        Cos cos = new Cos(200, new PlataNumerar());
        System.out.println(cos.getMetoda() + ": " + cos.dePlata());
        cos.schimbaMetoda(new PlataCard());
        System.out.println(cos.getMetoda() + ": " + cos.dePlata());
    }
}
