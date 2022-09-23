import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        boolean ajoutBoucle;
        Elevage bassecour = new Elevage();

        bassecour.ajouter(new Poulet(100));
        bassecour.ajouter(new Canard(1.5));
        bassecour.ajouter(new Poulet(1.9));
        bassecour.ajouter(new Canard(0.5));


        bassecour.changePoids(0, 1.3);
        bassecour.changePoids(1, 1.55);

        bassecour.afficher();
        Terminal.ecrireString("Valeur des animaux a abattre: ");
        Terminal.ecrireDoubleln(bassecour.evalPoidsAbattage());
        bassecour.triParArrivee();
        /*bassecour.afficher();
        Terminal.ecrireString("Valeur des animaux a abattre: ");
        Terminal.ecrireDoubleln(bassecour.evalPoidsAbattage());
    }*/
    }
}

