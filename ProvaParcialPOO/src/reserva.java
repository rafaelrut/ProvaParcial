

public class reserva implements Pagamento {
	
	Cliente cliente;
	Boolean pagamentoavista;
	
	public reserva(Cliente cliente, boolean pagamentoavista) {
		this.cliente = cliente;
		this.pagamentoavista = pagamentoavista;
	}
	
	public boolean getpagamentoavista() {
		return pagamentoavista;
	}
	
	
	@Override
	public double calcularpagamento() {
		return 0;
	}
	
}
