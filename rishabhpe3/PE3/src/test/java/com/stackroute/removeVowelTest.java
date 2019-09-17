package com.stackroute;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class removeVowelTest {
    private static removeVowel removeVowel;
    @BeforeClass
    public static void setUp() throws Exception {
        removeVowel = new removeVowel();
    }
    @AfterClass
    public static void tearDown() throws Exception {
        removeVowel = null;
    }
    @Test
    public void testRemoveVowel(){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Egypt");
        countries.add("czechoslovakia");
        List<String> expected = new ArrayList<>();
        expected.add("Ind");
        expected.add("Untd Stts");
        expected.add("Grmny");
        expected.add("Egypt");
        expected.add("czchslvk");
        assertEquals("Error! ",expected,removeVowel.remove(countries));
    }
    @Test
    public void testRemoveVowel1() {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("United States");
        countries.add("Germany");
        countries.add("Egypt");
        countries.add("czechoslovakia");
        List<String> expected = new ArrayList<>();
        expected.add("nd");
        expected.add("Untd Stts");
        expected.add("Grmny");
        expected.add("gypt");
        expected.add("czchslvk");
        assertNotEquals("Error! ",expected,removeVowel.remove(countries));
    }

    @Test
    public void testRemoveVowel2() {
        List<String> countries = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertNull(removeVowel.remove(countries));
    }
}