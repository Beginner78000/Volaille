/**
 * Class Volaille.
 */
abstract class Volaille {
    /**
     * id d'une volaille
     */
    static int lastId = 0;
    static double PRIXKGCANARD = 8.00;
    static double PRIXKGPOULET = 12;
    int identite;
    /**
     * poids d'une volaille
     */
    double poids;

    /**
     * Instantiates a new Volaille.
     *
     * @param p  le poids d'une volaille
     *
     */
    Volaille(double p){
        identite = lastId++;
        poids = p;
    }

    /**
     * Modification du poids.
     *
     * @param cp poids après évolution de la volaille
     */
    public void changePoids(double cp){
        poids = cp;
    }

    /**
     * Prix d'une volaille
     *
     * @return retourne pok
     */
    abstract double prix();

    /**
     * Boolean
     *
     * @return return false
     */
    boolean isOK(){return false;}
}