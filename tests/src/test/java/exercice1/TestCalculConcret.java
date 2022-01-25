package exercice1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculConcret {

    private double x;
    private CalculConcret calcul;


    @Before
    public void initCalcul(){
        calcul = new CalculConcret();
    }

    @Test
    public void testCalculOkNbSupUn() {
        try{
            x = calcul.calculer(8.0);
            Assert.assertFalse(Double.isNaN(x));
            Assert.assertFalse(Double.isInfinite(x));
        }
        catch (MauvaisNombreArgumentsException e){
            Assert.fail();
        }

    }

    @Test
    public void testCalculOkNbInfMoinsUn() {
        try{
            x = calcul.calculer(-18.0);
            Assert.assertFalse(Double.isNaN(x));
            Assert.assertFalse(Double.isInfinite(x));
        }
        catch (MauvaisNombreArgumentsException e){
            Assert.fail();
        }
    }

    @Test
    public void testCalculUn() {
        try{
            x = calcul.calculer(1.0);
            Assert.assertFalse(Double.isNaN(x));
            Assert.assertTrue(Double.isInfinite(x));
        }
        catch (MauvaisNombreArgumentsException e){
            Assert.fail();
        }
    }

    @Test
    public void testCalculMoinsUn() {
        try{
            x = calcul.calculer(-1.0);
            Assert.assertFalse(Double.isNaN(x));
            Assert.assertTrue(Double.isInfinite(x));
        }
        catch (MauvaisNombreArgumentsException e){
            Assert.fail();
        }
    }

    @Test
    public void testCalculNbEntreUnEtMoinsUN() {
        try{
            x = calcul.calculer(0.5);
            Assert.assertTrue(Double.isNaN(x));
            Assert.assertFalse(Double.isInfinite(x));
        }
        catch (MauvaisNombreArgumentsException e){
            Assert.fail();
        }
    }

    @Test(expected = MauvaisNombreArgumentsException.class)
    public void testTropArguments() throws MauvaisNombreArgumentsException {
        x = calcul.calculer(0.5,5,8,1);
    }

    @Test(expected = MauvaisNombreArgumentsException.class)
    public void testPasArguments() throws MauvaisNombreArgumentsException {
        x = calcul.calculer();
    }

}
