package exercice1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculConcretTriple {

    // cas de test pour x : x = 1; -1 < x < 1; x > 1;
    // cas de test pour y : y = 0; y < 0; y > 0;
    // cas de test pour z : z = 1; z < 1; z > 1;

    private double x;
    private CalculConcretTriple calcul;


    @Before
    public void initCalcul(){
        calcul = new CalculConcretTriple();
    }

    /**
     * appel de la méthode de calcul avec x=1, y=0, z=1
     * doit être égal à NaN
     */
    @Test
    public void test1(){
        try {
            x = calcul.calculer(1,0,1);
            Assert.assertTrue(Double.isNaN(x));
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=0.5, y=-8, z=1
     * doit être égal à 0
     */
    @Test
    public void test2(){
        try {
            x = calcul.calculer(0.5,-8,1);
            Assert.assertEquals(0.0,x,0);
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=12, y=14, z=1
     * doit être égal à 0
     */
    @Test
    public void test3(){
        try {
            x = calcul.calculer(12,14,1);
            Assert.assertEquals(0.0,x,0);
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=12, y=-8, z=0
     * doit être un nombre fini
     */
    @Test
    public void test4(){
        try {
            x = calcul.calculer(12,-8,0);
            Assert.assertTrue(Double.isFinite(x));
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=0.5, y=0, z=0
     * doit être égal à 0
     */
    @Test
    public void test5(){
        try {
            x = calcul.calculer(0.5,0,0);
            Assert.assertEquals(0.0,x,0);
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=1, y=14, z=0
     * doit être NaN
     */
    @Test
    public void test6(){
        try {
            x = calcul.calculer(1,14,0);
            Assert.assertTrue(Double.isNaN(x));
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=1, y=-8, z=5
     * doit être NaN
     */
    @Test
    public void test7(){
        try {
            x = calcul.calculer(1,-8,5);
            Assert.assertTrue(Double.isNaN(x));
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=0.5, y=14, z=5
     * doit être NaN
     */
    @Test
    public void test8(){
        try {
            x = calcul.calculer(1,-8,5);
            Assert.assertTrue(Double.isNaN(x));
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec x=12, y=0, z=5
     * doit être égal à 0
     */
    @Test
    public void test9(){
        try {
            x = calcul.calculer(12,0,5);
            Assert.assertEquals(0.0,x,0);
        } catch (MauvaisNombreArgumentsException e) {
            Assert.fail();
        }
    }

    /**
     * appel de la méthode de calcul avec trop de nombres en paramètres
     * doit lever l'exception MauvaisNombreArgumentsException
     */
    @Test(expected = MauvaisNombreArgumentsException.class)
    public void testTropArguments() throws MauvaisNombreArgumentsException {
        x = calcul.calculer(0,1,0,5,2);
    }

    /**
     * appel de la méthode de calcul sans nombre en paramètres
     * doit lever l'exception MauvaisNombreArgumentsException
     */
    @Test(expected = MauvaisNombreArgumentsException.class)
    public void testPasArguments() throws MauvaisNombreArgumentsException {
        x = calcul.calculer();
    }


}
