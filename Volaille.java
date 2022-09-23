public class Volaille {
    int identite;
    double poids;
    double prixKilo;

    Volaille(int id, double p, double pk ){
        this.identite = id;
        this.poids = p;
        this.prixKilo = pk;
    }

    void changePoids(double cp){
        poids = cp;
    }

    double prix(){
        return 0;
    }

    boolean isOK(){return false;}
}