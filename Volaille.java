/**
 * Class Volaille.
 */
public class Volaille {
    /**
     * id d'une volaille
     */
    public int identite;
    /**
     * poids d'une volaille
     */
    double poids;
    /**
     * Prix au kilo.
     */
    double prixKilo;

    /**
     * Instantiates a new Volaille.
     *
     * @param id l'identifiant unique d'une volaille
     * @param p  le poids d'une volaille
     * @param pk le prix au kilo d'une volaille
     */
    Volaille(int id, double p, double pk ){
        this.identite = id;
        this.poids = p;
        this.prixKilo = pk;
    }

    /**
     * Modification du poids.
     *
     * @param cp poids après abattage
     */
    public void changePoids(double cp){
        poids = cp;
    }

    /**
     * Prix d'une volaille
     *
     * @return
     */
    double prix(){
        return 0;
    }

    /**
     * Boolean
     *
     * @return return false
     */
    public boolean isOK(){return false;}
}