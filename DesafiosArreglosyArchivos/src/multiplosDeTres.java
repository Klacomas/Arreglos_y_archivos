import java.util.ArrayList;
public class multiplosDeTres {

	public static void main(String[] args) {
		
		ArrayList <Float> salida = filtro(args);
		float sum = suma(salida);
		float promedio = promedio(salida.size(),sum);
		System.out.println(sum);	
		System.out.println(promedio);	
		
	}

	static float promedio(int cont, float suma) {
		return (suma/cont);
	}

	static ArrayList <Float> filtro(String[] args) {
		int i;
		ArrayList <Float> salida = new ArrayList <Float>();
	
		for(i=0;i<args.length;i++) {
			if(Float.parseFloat(args[i])%3==0) {
				salida.add(Float.parseFloat(args[i]));
			}
			
		}
		return salida;
	}
	
	static float suma(ArrayList<Float> args) {	
		// Declaración de variables
		int i;
		float suma;
		suma=0.0f;
	
		for (i=0;i<args.size();i++) {
			suma=suma+args.get(i);
		}
		return suma;
	}

}
