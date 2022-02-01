package exercice2;

public class FabriqueTriBulle implements FabriqueTri {

    @Override
    public TriTableau getTri() {
        return new TriBulle();
    }
}
