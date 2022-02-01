package exercice2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class TestsTrisTableau {

    protected TriTableau triTableau;

    protected FabriqueTri fabriqueTri;

    public TestsTrisTableau(FabriqueTri fabriqueTri){
        this.fabriqueTri = fabriqueTri;
    }

    @Before
    public void initTest(){
        triTableau = this.fabriqueTri.getTri();
    }

    /**
     * appel de la méthode de tri sur un tableau vide
     * doit lever l'exception TableauVideException
     */
    @Test(expected = TableauVideException.class)
    public void testTableauVide() throws TableauVideException {
        Integer[] tab = new Integer[0];
        triTableau.trier(tab);
    }

    /**
     * appel de la méthode de tri sur un tableau déjà trié
     * doit retourner le même tableau que celui passé en paramètres
     */
    @Test
    public void testTriTabDejaTrie() throws TableauVideException {
        Integer[] start = {1, 2, 3, 4, 5};
        Integer[] end = {1, 2, 3, 4, 5};
        Integer[] tabTrie = triTableau.trier(start);
        Assert.assertArrayEquals(end,start);
        Assert.assertArrayEquals(end,tabTrie);
    }

    /**
     * appel de la méthode de tri sur un tableau trié de manière décroissante
     * doit retourner le tableau trié de manière croissante
     */
    @Test
    public void testTriTabTrieDecroissant() throws TableauVideException {
        Integer[] start = {5, 4, 3, 2, 1};
        Integer[] end = {1, 2, 3, 4, 5};
        Integer[] tabTrie = triTableau.trier(start);
        Assert.assertArrayEquals(end,tabTrie);
    }

    /**
     * appel de la méthode de tri sur un tableau non trié
     * doit retourner le tableau trié de manière croissante
     */
    @Test
    public void testTriTabAleatoire() throws TableauVideException {
        Integer[] start = {2, 4, 5, 3 ,1};
        Integer[] end = {1, 2, 3, 4, 5};
        Integer[] tabTrie = triTableau.trier(start);
        Assert.assertArrayEquals(end,tabTrie);
    }

    /**
     * appel de la méthode de tri sur un tableau contenant des nombres egaux entre eux
     * doit retourner le tableau trié de manière croissante
     */
    @Test
    public void testTriAvecDoubles() throws TableauVideException {
        Integer[] start = {2, 2, 5, 3 ,5};
        Integer[] end = {2, 2, 3, 5, 5};
        Integer[] tabTrie = triTableau.trier(start);
        Assert.assertArrayEquals(end,tabTrie);
    }

    /**
     * appel de la méthode de tri sur un tableau contenant un seul nombre
     * doit retourner le même tableau que celui passé en entrée
     */
    @Test
    public void testTriUnSeulNb() throws TableauVideException {
        Integer[] start = {2};
        Integer[] end = {2};
        Integer[] tabTrie = triTableau.trier(start);
        Assert.assertArrayEquals(end,tabTrie);
        Assert.assertArrayEquals(end,start);
    }














}
