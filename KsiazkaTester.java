package pl.adam.piechowicz;

class Ksiazka {
    String tytul;
    String autor;
}

public class KsiazkaTester {
        public static void main(String[] args) {
            Ksiazka[] mojeKsiazki = new Ksiazka[3];
            int x = 0;
            mojeKsiazki[0] = new Ksiazka();
            mojeKsiazki[1] = new Ksiazka();
            mojeKsiazki[2] = new Ksiazka();
            mojeKsiazki[0].tytul = "Czterej koderzy i java";
            mojeKsiazki[1].tytul = "Java nocy letniej";
            mojeKsiazki[2].tytul = "Java. Receptury";
            mojeKsiazki[0].autor = "janek";
            mojeKsiazki[1].autor = "wilhelm";
            mojeKsiazki[2].autor = "ian";

            while (x < 3) {
                System.out.println(mojeKsiazki[x].tytul);
                System.out.println(", autor");
                System.out.println(mojeKsiazki[x].autor);
                x = x + 1;
            }
        }
}
