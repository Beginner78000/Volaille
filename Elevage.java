/**
 * Class Elevage.
 */
public class Elevage {
    /**
     * The Tab.
     */
    Volaille[] tab = new Volaille[50];

    /**
     * @param nbVolailles Représente le nb de volaille
     */
    int nbVolailles = 0;

    /**
     * Ajouter d'une Volaille
     *
     * @param v Volaille ajoutée (Poulet ou Canard)
     */
    void ajouter(Volaille v){
        tab[nbVolailles] = v;
        nbVolailles++;
    }

    /**
     * Chercher volaille via son id
     * @param id identifiant d'une volaille
     * @return La volaille recherchée
     */
    Volaille chercher(int id){
        for(int i=0; i<nbVolailles; i++){
            if(tab[i].identite == id){
                return tab[i];
            }
        }
        return null;
    }

    /**
     * Change poids après abattage.
     *
     * @param id id de la volaille souhaitée
     * @param cp modification du prix de la volaille
     */
    void changePoids(int id, double cp){
        chercher(id).changePoids(cp);
    }

    /**
     * Calcul du poids abattage.
     *
     * @return poids après abattage
     */
    double evalPoidsAbattage(){
        double pOk = 0;
        for(int i = 0; i < nbVolailles; i++){
            if(tab[i].isOK()){
                pOk = pOk + tab[i].prix();
            }
        }
        return pOk;
        //return cp * ( 60.0 / 100.0 );
    }

    /**
     * Tri par poids volaille.
     *
     * @return l'ensemble des volailles trié par poids
     */
    Volaille[] triParPoids() {
        Volaille[] res = new Volaille[100];
        int nb = 0;
        int i = 0;
        while (i < nbVolailles) {
            Terminal.ecrireChar('+');
            if (tab[i].isOK()) {
                res[nb] = tab[i];
                nb++;
                tab[i] = tab[nbVolailles - 1];
                nbVolailles--;
            } else {
                i++;
            }
        }
        return res;

    }

    /**
     * Afficher toutes les infos de chaque volaille
     */
    void afficher(){
        for(int i = 0; i < nbVolailles; i++){
            Terminal.ecrireStringln(tab[i].identite+ ". "+tab[i].poids+ " / "+tab[i].prix());
        }
    }

}
