package exercice2;

public class FabriqueTriSelection implements FabriqueTri{

    @Override
    public TriTableau getTri() {
        return new TriSelection();
    }
}
