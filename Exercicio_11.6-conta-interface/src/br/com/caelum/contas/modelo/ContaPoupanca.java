package br.com.caelum.contas.modelo;

public class ContaPoupanca implements Conta{
	public int numero;
	protected String titular; // Havera um new Cliente para cada new Conta
	public String agencia;
	public Data dataAbertura;
	protected double saldo;
	private double limite; // adiciona limite a conta
	protected static int totalDeContas;
	
	@Override
	public double getSaldo() {
		return this.saldo + this.limite;
	}

	@Override
	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Valor a ser depositado � negativo");
		}
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= (valor + 0.10);
		
	}

	@Override
	public void atualiza(double taxaSelic) {
		// TODO Auto-generated method stub
		
	}

}
