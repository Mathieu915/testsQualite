package exercice2;

public class TriBulle implements TriTableau{

    @Override
    public Integer[] trier(Integer[] tableau) throws TableauVideException {
        int taille = tableau.length;
        int tmp = 0;
        if(taille==0){
            throw new TableauVideException();
        }
        else {
            for(int i=0; i < taille; i++) {
                for(int j=1; j < (taille-i); j++) {
                    if(tableau[j-1] > tableau[j]) {
                        tmp = tableau[j-1];
                        tableau[j-1] = tableau[j];
                        tableau[j] = tmp;
                    }
                }
            }
        }
        return tableau;
    }
}
