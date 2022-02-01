package exercice2;

public class TriSelection implements TriTableau{

    @Override
    public Integer[] trier(Integer[] tab) throws TableauVideException {
        if(tab.length==0){
            throw new TableauVideException();
        }
        for (int i = 0; i < tab.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < tab.length; j++){
                if (tab[j] < tab[index]){
                    index = j;
                }
            }
            int min = tab[index];
            tab[index] = tab[i];
            tab[i] = min;
        }
        return tab;
    }

}
