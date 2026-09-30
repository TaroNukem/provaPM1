import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Reserva> reservasSoltas = new ArrayList<>();
        ArrayList<Reserva> reservas1 = new ArrayList<>();
        ArrayList<Reserva> reservas2 = new ArrayList<>();
        ArrayList<Reserva> reservas3 = new ArrayList<>();


        Organizador o1 = new Organizador("Daniel", "231", "9999", "Supervisor");
        Organizador o2 = new Organizador("Vitor", "677", "676767", "AudioVisual");
        Organizador o3 = new Organizador("Rafael", "189", "12345", "Contador");

        ArrayList<Organizador> organizadores = new ArrayList<>();
        organizadores.add(o1);
        organizadores.add(o2);
        organizadores.add(o3);

        Salao salaoPobre = new Salao(1, 100, "Contagem", "Baixo custo", reservas1);
        Salao salaoMedio = new Salao(2, 300, "Cabral", "Medio custo",  reservas2);
        Salao salaoRico = new Salao(3, 500, "Coração Eucaristico", "Alto custo", reservas3);

        ArrayList<Salao> saloes = new ArrayList<>();
        saloes.add(salaoPobre);
        saloes.add(salaoMedio);
        saloes.add(salaoRico);


        do{
            int opcao;
            System.out.println("===Sistema=De=Eventos===");
            System.out.println("Digite 1 para cadastrar uma reserva");
            System.out.println("Digite 2 para associar um organizador a um salao");
            System.out.println("Digite 3 para atribuir uma reserva em um salao");
            System.out.println("Digite 4 para exibir todas as reservas confirmadas em um salão específico");
            System.out.println("Digite 5 para ver a quantidade total de reservas finalizadas para cada salão");
            System.out.println("DIgite 6 para buscar reservas por status");
            System.out.println("Digite 7 para exibir os detalhes completos de uma reserva específica");
            System.out.println("Digite 8 para sair");
            opcao = scanner.nextInt();
            if(opcao == 1){
                System.out.println("Digite o código da reserva: ");
                int codigo = scanner.nextInt();
                
                System.out.println("Digite o nome do cliente: ");
                String nomeCliente = scanner.next();


                System.out.println("Digite a data da reserva: ");
                String dataReserva = scanner.next();

                System.out.println("Digite o horario da reserva(manha, tarde ou noite): ");
                String horario = scanner.next();

                System.out.println("Digite a quantidade de pessoas: ");
                int quantidadePessoas = scanner.nextInt();

                System.out.println("Digite o status da reserva: ");
                String status = scanner.next();

                
                
                reservasSoltas.add(new Reserva(codigo, nomeCliente, dataReserva, horario, quantidadePessoas, status));
            }
            if(opcao == 2){
                int escolha;
                int escolhaOrg;
                System.out.println("Digite o salao que deseja associar um organizador: 1, 2, 3");
                escolha = scanner.nextInt();
                if(saloes.get(escolha -1).getResponsavel() == null){
                System.out.println("Digite o organizador que deseja associar ao salao escolhido: ");
                for(int i = 0; i < organizadores.size(); i++){
                    System.out.println(organizadores.get(i).getNome() + ": "+ (i+1));
                }
                System.out.println("Digite o número do organizador que deseja atrelar: ");
                escolhaOrg = scanner.nextInt();

                saloes.get(escolha-1).setResponsavel(organizadores.get(escolhaOrg-1));
            }
        else{
            System.out.println("Ja possui organizador");
        }}
            if(opcao == 3){
                int escolha;
                int escolhaRes;

                System.out.println("Digite o salao que deseja associar um organizador: 1, 2, 3");
                escolha = scanner.nextInt();

                System.out.println("Qual reserva deseja escolher para associar a um salao?");
                for(int i = 0; i < reservasSoltas.size(); i++){
                    System.out.println("Reserva " + i);
                }
                escolhaRes = scanner.nextInt();

                for(Reserva res : saloes.get(escolha -1 ).getReservas()){
                    if(reservasSoltas.get(escolhaRes).getData().equals(res.getData()) && reservasSoltas.get(escolhaRes).getHorario().equals(res.getHorario())){
                        System.out.println("Horario indisponivel");
                        break;
                    }   
                } saloes.get(escolha-1).adicionar(reservasSoltas.get(escolhaRes));
            }
            if(opcao == 4){
                int escolha;

                System.out.println("Digite o salao que deseja ver as informações: 1, 2, 3");
                escolha = scanner.nextInt();

                saloes.get(escolha - 1).mostrar();
            }
            if(opcao == 5){
                int escolha;

                System.out.println("Digite o salao que deseja ver as informações: 1, 2, 3");
                escolha = scanner.nextInt();

                saloes.get(escolha - 1).finalizadas();
            }
            if(opcao == 6){
                String status;
                System.out.println("Digite o status que deseja ver :");
                status = scanner.next();
                for(Reserva reserva : reservasSoltas){
                    if(reserva.getStatusReserva().equals(status)){
                        reserva.imprimir();
                    }
                }
            }
            if(opcao == 7){
                int escolha;
                for(Reserva reserva : reservasSoltas){
                    System.out.println("Codigo da reserva: " + reserva.getCodigo());
                }
                escolha = scanner.nextInt();
                reservasSoltas.get(escolha - 1).imprimir();
            }
            if (opcao == 8) {
                break;
            }
        }
        while(true);

    }
}
