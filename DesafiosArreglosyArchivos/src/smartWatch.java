import java.lang.reflect.Array;
import java.util.ArrayList;
public class smartWatch {

	public static void main(String[] args) {
		//Declaración de variables

		int i,suma;
		suma=0;
		ArrayList <Integer> argsOut= new ArrayList<Integer>();
		
		argsOut=clearSteps(args);//llamado al método que limpia el arreglo

		//recorre el arreglo retornado para calcular el promedio
		for (i=0;i<argsOut.size();i++) {
			suma+=argsOut.get(i);
		}
		System.out.printf("%d",suma/i);
	}

	static ArrayList<Integer> clearSteps(String[] args) {//método que limpia el arreglo
		//Declaracion de variables
		int i, j;
		ArrayList <Integer> argsOut= new ArrayList<Integer>();
		
		for(i=0;i<args.length;i++) {//recorre el arreglo
			if(Integer.parseInt(args[i]) > 200 
					&& Integer.parseInt(args[i]) < 100000) {//si el valor está dentro de los parametros
				argsOut.add(Integer.parseInt(args[i]));//lo agrega al arreglo de salida
			}
		}
		return argsOut;
	}
}
