package fundamentos;

public class AreaCircunferencia {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		System.out.println(calcArea(3));
		System.out.println(calcCircunferencia(3));
	}
	
	private static double calcArea(double raio) {		
		return PI * raio * raio;
	}
	
	private static double calcCircunferencia(double raio) {		
		return PI * raio * 2;
	}
}
