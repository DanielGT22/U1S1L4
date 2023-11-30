

import java.util.Objects;

public class Dipendente {

    public static double stipendioBase = 1000;

    public String matricola;
    public double stipendio;
    public double importoOrarioStraordinario;
    public String livello;
    public  String Dipartimento;

    public Dipendente(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metodi
    public void sayYourName() {
        System.out.println("Ciao sono un animale e mi chiamo " + this.name);
    }

    public void walk() {
        System.out.println("Ciao sono un animale e sto camminando");
    }



}