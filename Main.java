public class Main {
    /**
     * Application qui permet d'ajouter une volaille, changer leur poids avant abattage et afficher les volailles par ordre d'arrivée.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        boolean ajoutBoucle = true;
        Elevage bassecour = new Elevage();

        do {
            Terminal.ecrireStringln("\n" +
                    "Menu - Saisir le chiffre pour atteindre l'option : \n " +
                    "1. Ajout volaille \n " +
                    "2. Changer le poids \n " +
                    "3. Afficher les volailles triées \n " +
                    "4. Quitter");
            Terminal.sautDeLigne();
            Terminal.ecrireString("Le chiffre : ");

            int responseMenu = Terminal.lireInt();

            if (responseMenu == 1) {
                Terminal.ecrireStringln("Souhaitez vous ajouter un poulet ou un canard ? (p/c)");
                char responseVolaille = Terminal.lireChar();

                if (responseVolaille == 'p') {

                    Terminal.ecrireString("(Poulet) Veuillez ajouter son poids initial : ");
                    double poidsPoulet = Terminal.lireDouble();

                    bassecour.ajouter(new Poulet(poidsPoulet));

                } else {
                    Terminal.ecrireString("(Canard) Veuillez ajouter son poids initial : ");
                    double poidsCanard = Terminal.lireDouble();

                    bassecour.ajouter(new Canard(poidsCanard));

                }
            } else if (responseMenu == 2) {
                Terminal.ecrireStringln("Veuillez saisir le matricule de la volaille dont vous voulez saisir le nouveau poids :");
                int responseMatricule = Terminal.lireInt();

                Terminal.ecrireStringln("Saisir le nouveau poids : ");
                int responseNouveauPoids = Terminal.lireInt();

                bassecour.changePoids(responseMatricule, responseNouveauPoids);

            } else if (responseMenu == 3) {
                bassecour.afficher();

                Terminal.ecrireString("Valeur des animaux a abattre: ");
                Terminal.ecrireDoubleln(bassecour.evalPoidsAbattage());

                bassecour.triParArrivee();

            } else if (responseMenu == 4) {
                Terminal.ecrireStringln("Bonne journée ! ");
                ajoutBoucle = false;

            } else {
                Terminal.sautDeLigne();
                Terminal.ecrireStringln("Vous avez fait une erreur ? Veuillez saisir un chiffre disponible dans le menu !");
            }
        } while (ajoutBoucle);
    }
}