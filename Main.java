package pl.adam.piechowicz;

class Pies {
    String imie;


    public void szczekaj() {
        System.out.println(imie + " szczeka: Hau, Hau!!");
    }
}
public class Main {
    public static void main(String[] args){
        Pies pies1 = new Pies();
        pies1.szczekaj();
        pies1.imie = "Rafa";
        Pies[] mojePsy = new Pies[3];
        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = pies1;

        mojePsy[0].imie = "Rafa";
        mojePsy[1].imie = "Dora";

        System.out.println("Ostatni pies ma na imię: ");
        System.out.println(mojePsy[2].imie);

        int x = 0;
        while (x < mojePsy.length) {
            mojePsy[x].szczekaj();
            x = x + 1;
        }

    }

    public void jedz() {};
    public void gonKota() {};
}
