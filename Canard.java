import java.text.DecimalFormat;

/**
 * Class Canard.
 */
public class Canard extends Volaille {
    /**
     * Prix au kilo.
     */
    static double prixKilo = PRIXKGCANARD;

    /**
     * Instantiates a new Canard.
     *
     * @param p  Le poids
     *
     */
    public Canard(double p) {
        super(p);
    }

    /**
     * Changement du prix.
     *
     * @param cp Le prix modifié
     */
    static void changePrix(double cp){
        prixKilo = cp;
    }

    double prix(){
        return poids * prixKilo;
    }
}
