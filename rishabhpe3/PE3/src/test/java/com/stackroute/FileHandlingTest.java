package com.stackroute;
import org.junit.*;
import java.io.File;
import java.io.FileWriter;
import static org.junit.Assert.*;
public class FileHandlingTest {
    private static FileHandling fileHandling;
    @BeforeClass
    public static void setUp() throws Exception {
        fileHandling =new FileHandling();
    }
    @AfterClass
    public static void tearDown() throws Exception {
        fileHandling = null;
    }
    @Test
    public void textReadFile() throws Exception{

        assertEquals("THIS IS FILE HANDLING",fileHandling.printFileUpper("abc.txt"));
    }
}