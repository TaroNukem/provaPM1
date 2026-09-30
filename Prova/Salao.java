import java.util.ArrayList;

public class Salao {
    private int numero;
    private int capacidadeMax;
    private String localizacao;
    private String tipo;
    private Organizador responsavel;
    private ArrayList<Reserva> reservas;

    public Salao( int numero,int capacidadeMax,String localizacao,String tipo,ArrayList<Reserva> reservas){
        this.numero = numero;
        this.capacidadeMax = capacidadeMax;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.reservas = reservas;
     }

     public void mostrar(){
        int contador = 0;
        for(Reserva reserva : reservas){
            contador += 1;
            if(reserva.getStatusReserva().equals("confirmada")){
                System.out.println(reserva.getCodigo());
            }
        }
        System.out.println("Total de reservas: " + contador);
     }

     public void finalizadas(){
        int contador = 0;
        for(Reserva reserva : reservas){
            if(reserva.getStatusReserva().equals("finalizada")){
                contador += 1;
            }
        }
        System.out.println("Total de reservas finalizadas: " + contador);
     }

     public void adicionar(Reserva reserva){
        reservas.add(reserva);
     }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Organizador getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Organizador responsavel) {
		this.responsavel = responsavel;
	}

	public ArrayList<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}
}


