package ExamenED;

public class ExamenED {
public int metodoExamen (int variable1, char variable2){

		int resultado = 0;

		if (variable1<0 && variable2 == 'S') {

	                 System.out.print("Número "+ variable1 + " no puede ser menor que 0");

	                 resultado = 1;

	    	 } else if (variable1 > 100000  && variable2 == 'N')  {

	    	        System.out.print("Número " + variable1 + " demasiado grande");

	                 resultado = 2;

	    	 } else if ((variable1 <= 100000) && (variable1 > 1) && variable2 == 'S') {

	    		 System.out.print("Número " + variable1 + " correcto");

	                  resultado = 3;

	    	}

	         return resultado;

	     }
}
