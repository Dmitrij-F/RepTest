package Generics;

public class GenericDemo<G> {

    G obg;

    public GenericDemo(G o) {
        obg = o;
    }

    public G getObg() {
        return obg;
    }

    public void ShowG() {
        System.out.println("Type of G = " + obg.getClass().getName());
    }



}
