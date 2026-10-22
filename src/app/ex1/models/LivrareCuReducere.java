package app.ex1.models;

public class LivrareCuReducere implements LivrareStrategie{

    private LivrareStrategie strategie;
    private double procent;


    public LivrareCuReducere(LivrareStrategie strategie, double procent){

        this.strategie = strategie;
        this.procent = procent;
    }

    @Override
    public String getNume() {
        return "REDUCERE";
    }

    @Override
    public double calculeazaCost(double greutateKg, double distantaKm){

        double costTotal = strategie.calculeazaCost(greutateKg, distantaKm);
        double costRedus = costTotal * procent / 100;

        return  costRedus;
    }

}
