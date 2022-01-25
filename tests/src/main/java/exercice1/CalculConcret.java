package exercice1;

public class CalculConcret implements Calcul{

    @Override
    public double calculer(double... args) throws MauvaisNombreArgumentsException{
        if(args.length!=1){
            throw new MauvaisNombreArgumentsException();
        }
        else {
            return Math.sqrt(1/(args[0]*args[0]-1));
        }
    }
}
