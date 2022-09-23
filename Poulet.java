/**
 * Class Poulet
 */
class Poulet extends Volaille {
    /**
     * @param prixKilo Le prix au kilo.
     */
    static double prixKilo = PRIXKGPOULET;
    /**
     * @param poidsAbattage Poids min pour abattage
     */
    static double poidsAbattage = 1.2;

    boolean isOK(){
        return poids >= poidsAbattage;
    }

    /**
     * Instantiates a new Poulet.
     *
     * @param p  poids d'un poulet
     *
     */
    Poulet(double p){
        super( p);
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
     * @return prix d'une volaille pour un jour donné
     */
    double prix(){
        return poids * prixKilo;
    }
}