package exercice1;

public class CalculConcretTriple implements Calcul{

    @Override
    public double calculer(double... args) throws MauvaisNombreArgumentsException {
        if(args.length!=3){
            throw new MauvaisNombreArgumentsException();
        }
        else{
            return Math.sqrt(args[1]*(args[2]-1)/(args[0]*args[0]-1));
        }
    }
}
