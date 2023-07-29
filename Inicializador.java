package caixa;

public class Inicializador {
	static ControladorCaixa caixa = new ControladorCaixa();

	public static void main(String[] args) {
		try {
			caixa.menu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}