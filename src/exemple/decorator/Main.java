package exemple.decorator;

public class Main {
    public static void main(String[] args) {
        Bautura simpla = new Cafea();
        System.out.println(simpla.descriere() + ": " + simpla.pret());
        Bautura completa = new CuCaramel(new CuLapte(new Cafea()));
        System.out.println(completa.descriere() + ": " + completa.pret());
        Bautura alta = new CuLapte(new CuLapte(new Cafea()));
        System.out.println(alta.descriere() + ": " + alta.pret());
    }
}
