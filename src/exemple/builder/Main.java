package exemple.builder;

public class Main {
    public static void main(String[] args) {
        Pizza simpla = new Pizza.Builder().dimensiune("medie").build();
        System.out.println(simpla.descriere());
        Pizza completa = new Pizza.Builder()
                .dimensiune("mare")
                .sos("rosii")
                .extraBranza()
                .ciuperci()
                .build();
        System.out.println(completa.descriere());
        try {
            new Pizza.Builder().dimensiune("mica").extraBranza().build();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
