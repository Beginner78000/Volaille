/**
 * Class Poulet
 */
class Poulet extends Volaille {
    /**
     * @param prixKilo Le prix au kilo.
     */
    static double prixKilo;
    /**
     * @param poidsAbattage Poids min pour abattage
     */
    static double poidsAbattage = 1.2;

    /**
     * Instantiates a new Poulet.
     *
     * @param id identité d'un poulet
     * @param p  poids d'un poulet
     * @param pk prix au kilo d'un poulet
     */
    Poulet(int id, double p, double pk){
        super(id, p, pk);
    }

    /**
     * Modification du prix
     * En fonction du prix du jour
     *
     * @param cp prix changé
     */
    static void changePrix(double cp){
        prixKilo = cp;
    }

    /**
     * Calcul du prix d'un poulet
     * En fonction du prix au kilo du jour
     * @return
     */
    double prix(){
        return poids * prixKilo;
    }
}