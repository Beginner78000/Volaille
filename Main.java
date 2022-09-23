public class Main {
    public static void main(String[] args){
        boolean ajoutBoucle;
        Elevage bassecour = new Elevage();
        for (int i=0; i<15; i++){
            bassecour.ajouter(new Poulet(i+1,150, 10));
        }
        for (int i=0; i<15; i++){
            bassecour.ajouter(new Canard(i+1,380, 15));
        }
        for (int i=0; i<10; i++){
            bassecour.ajouter(new Poulet(i+1,700, 18));
        }
        bassecour.ajouter(new Canard(0,825, 20));
        for (int i=0; i<8; i++){
            bassecour.changePoids(0,1.3);
            bassecour.changePoids(1,1.55);
        }

        bassecour.afficher();
        Terminal.ecrireString("Valeur des animaux a abattre: ");
        Terminal.ecrireDoubleln(bassecour.evalPoidsAbattage());
        bassecour.triParPoids();
        bassecour.afficher();
        Terminal.ecrireString("Valeur des animaux a abattre: ");
        Terminal.ecrireDoubleln(bassecour.evalPoidsAbattage());
    }
}

