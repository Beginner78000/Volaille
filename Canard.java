/**
 * Class Canard.
 */
public class Canard extends Volaille {
    /**
     * Prix au kilo.
     */
    static double prixKilo;

    /**
     * Instantiates a new Canard.
     *
     * @param id the id
     * @param p  Le poids
     * @param pk Le poids au kilo
     */
    public Canard(int id, double p, double pk) {
        super(id, p, pk);
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
