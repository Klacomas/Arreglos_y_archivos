
public class negativosPositivos {

	public static void main(String[] args) {
		// declara variables
		int i, contPositivos, contNegativos, contCeros;
		contPositivos= contNegativos= contCeros=0;
		for (i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i])==0) {
				contCeros+=1;
			}
			else if(Integer.parseInt(args[i])<0) {
				contNegativos+=1;
			}
			else {
				contPositivos+=1;
			}
		}
		System.out.println(contPositivos);
		System.out.println(contNegativos);
		System.out.println(contCeros);
	}
}
