package ExamenED;

import static org.junit.*;

import org.junit.Test;

public class ExamenEDtest {
	ExamenED ex;
	@BeforeClass
	public void beforeClass() {
	ExamenED ex = new ExamenED();
}
	@Test
	
	public void test() {
		 
		int resultado = ex.metodoExamen(-1,"S");
		assertEquals(resultado,1);
	}
	@Test
	
	public void test() {
		 
		int resultado = ex.metodoExamen(1000000,"N");
		assertEquals(resultado,2);
	}
	@Test
	
	public void test() {
		 
		int resultado = ex.metodoExamen(3,"S");
		assertEquals(resultado,3);
	}
	@AfterClass
	public void afterClass(){}
	

}
