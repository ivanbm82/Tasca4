package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class AppTest {
	
	@Test
	
	public void exceptionTesting() {
		
		Assertions.assertThrows(IndexOutOfBoundsException.class, new Executable(){

			@Override
			public void execute() throws IndexOutOfBoundsException {
				App.numLista(2);
		
			}
		});
	}
	
}