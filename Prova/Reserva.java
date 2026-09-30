public class Reserva {
    private int codigo;
    private String nomeCliente;
    private String data;
    private String horario;
    private int quantidadeConvidados;
    private String statusReserva;

	public Reserva(int codigo, String nomeCliente, String data, String horario, int quantidadeConvidados,
            String statusReserva) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.horario = horario;
        this.quantidadeConvidados = quantidadeConvidados;
        this.statusReserva = statusReserva;
    }

    public void imprimir(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome cliente"+nomeCliente);
        System.out.println("Data"+data);
        System.out.println("Horario"+horario);
        System.out.println("Quantidade de convidados"+quantidadeConvidados);
        System.out.println("Status"+statusReserva);
    }

    public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getQuantidadeConvidados() {
		return quantidadeConvidados;
	}
	public void setQuantidadeConvidados(int quantidadeConvidados) {
		this.quantidadeConvidados = quantidadeConvidados;
	}
	public String getStatusReserva() {
		return statusReserva;
	}
	public void setStatusReserva(String statusReserva) {
		this.statusReserva = statusReserva;
	}
    
    
}
