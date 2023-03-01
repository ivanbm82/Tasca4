package n1exercici2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	
	@ParameterizedTest

	@CsvSource({"00000000,T","00000001,R","00000002,W","00000003,A","00000004,G","00000005,M",
		"00000006,Y","00000007,F","53060632,T","53060631,E"})
 
	public void testCalculoDni(int numeroDni, String letraDni) {
		
		String letraEsperada = CalculoDni.obtenerLetra(numeroDni);
		
		assertEquals(letraDni, letraEsperada);
	}
}