public class visitas {

	public static void main(String[] args) {
		System.out.println(promedio(args));
	}
	
	static float promedio(String[] args) {	
		// Declaración de variables
		int i;
		float suma;
		suma=0.0f;
		for (i=0;i<args.length;i++) {
			suma+=Float.parseFloat(args[i]);
		}
		return suma/(i);
	}

}
