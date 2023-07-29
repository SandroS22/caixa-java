package caixa;

public class ControladorCaixa {
	private CaixaEletronico caixa = new CaixaEletronico();

	public CaixaEletronico getCaixa() {
		return caixa;
	}

	public void setCaixa(CaixaEletronico caixa) {
		this.caixa = caixa;
	}

	private TelaCaixa tela = new TelaCaixa();

	public TelaCaixa getTela() {
		return tela;
	}

	public void setTela(TelaCaixa tela) {
		this.tela = tela;
	}

	public void main(String[] args) {
		menu();
	}

	public void menu() {
		int op = 9;
		while (op != 0) {
			op = tela.menu();
			try {
				switch (op) {
				case 1: {
					saldo();
					break;
				}
				case 2: {
					sacar();
					break;
				}
				case 3: {
					depositar();
					break;
				}
				case 0: {
					TelaCaixa.mostraMsg("Programa encerrado!");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + op);
				}
			} catch (IllegalArgumentException e) {
				TelaCaixa.mostraMsg("Valor inválido!");
			}
		}
	}

	private void depositar() {
		double quantia = tela.depositar();
		caixa.setSaldo(caixa.getSaldo() + quantia);
	}

	private void saldo() {
		TelaCaixa.mostraMsg(caixa.getSaldo().toString());

	}

	private void sacar() {
		double quantia = tela.sacar();
		if (quantia < caixa.getSaldo()) {
			caixa.setSaldo(caixa.getSaldo() - quantia);
		} else {
			TelaCaixa.mostraMsg("Quantidade superior ao disponível");
		}
	}
}