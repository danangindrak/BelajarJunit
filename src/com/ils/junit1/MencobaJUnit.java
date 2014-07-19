package com.ils.junit1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MencobaJUnit {

	@Test
	public void testingMenambahkan() {
		assertEquals(" hasil penjumlahan  :", 126, addition(27,99));//penjumlahan 
	}
	
	@Test
    public void testingHelloWorld(){
        assertEquals("Here is test for Hello World String: ", "Hello World", helloWorld());
    }
 
    public int addition(int x, int y) {
        return x + y;
    }
 
    public String helloWorld() {
        String helloWorld = "Hello " + "World";
        return helloWorld;
    }
}
