package n1exercici3;

import java.util.*;

public class App {
	

    public static int numLista (int indice) throws IndexOutOfBoundsException {
    	int numElegido;
    	ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

    	if (indice <= num.size()) {
    		numElegido = num.get(indice);
    	} else {
    		throw new IndexOutOfBoundsException("Array index out of bounds");
    	}
        
		return numElegido;
    }
	
}