package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello(){
		Hello hello = new Hello();
		hello.show();
	}

}
