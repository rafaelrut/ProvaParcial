import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		List<Cliente> clientes = new ArrayList<>();
        int indexCliente = 0;

		

        boolean running = true;
        String line;
        while (running) {
            System.out.print("> ");
            line = teclado.nextLine();
            switch (line.toLowerCase()) {
                case "help":
                    printMenu();
                    break;
                case "bye":
                case "exit":
                    running = false;
                    break;
                case "1":
                case "add cliente":
                	clientes.add(Reservar());
                    break;
                case "2":
                case "list":
                    listarReserva(clientes);
                    break;
                //case "3":
               // case "pesquisar":
                	//pesquisar();
                   // break;
              //  case "6":
              //  case "remove":
             //       remover(listaPessoa);
                case "7":
                case "Finalizar" :
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }
        System.out.println("Bye bye!");

    }

	
	public static void printMenu() {
		System.out.println("-------Menu-------");
		System.out.println("1.Fazer a reserva");
		System.out.println("2.Listar Reserva");
		System.out.println("3.Pesquisar Reserva");
		System.out.println("4.Listar empregados");
		System.out.println("5.Listar clientes");
		System.out.println("6.Remover");
		System.out.println("7.Finalizar");
	}
	
	
		
	
		
		 public static Cliente Reservar() {
		        Scanner scanner = new Scanner(System.in);

		        Cliente cliente = null;

		        String tipoPessoa = inputTipoPessoa();
		        switch (tipoPessoa) {
		            case "j":
		                cliente = cadastrarPJ();
		                break;
		            case "f":
		                cliente = cadastrarPF();
		                break;
		        }
		        return cliente;
		    }
		 private static String inputTipoPessoa() {
		        String tipoPessoa = null;
		        while (tipoPessoa == null) {
		            System.out.print("Pessoa Juridica (j) ou Pessoa Fisica (f): ");
		            tipoPessoa = new Scanner(System.in).nextLine();
		            if (!"f".equals(tipoPessoa) && !"j".equals(tipoPessoa)) {
		                tipoPessoa = null;
		                System.out.println("Opcao invalida, aceito apenas f ou p");
		            }
		        }
		        return tipoPessoa;
		    }

		    private static PessoaFisica cadastrarPF() {
		    	
		    	System.out.print("Nome: ");
		    	String nome = new Scanner(System.in).nextLine();
		        System.out.print("CPF: ");
		        String cpf = new Scanner(System.in).nextLine();

		        PessoaFisica pf = new PessoaFisica(nome, cpf);
		        pf.setCpf(cpf);
		        return  pf;
		    }

		    private static PessoaJuridica cadastrarPJ() {
		    	
		    	System.out.print("Nome: ");
		    	String nome = new Scanner(System.in).nextLine();
		    	System.out.print("CNPJ: ");
		        String cnpj = new Scanner(System.in).nextLine();

		        PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
		        pj.setCnpj(cnpj);
		        return pj;
		    }
		    
		    public static void listarReserva(List<Cliente> clientes) {
		    	clientes.forEach(cliente -> {
		            System.out.println(cliente.getClass().getName());
		            if (cliente instanceof PessoaFisica) {
		                PessoaFisica pf = (PessoaFisica) cliente;
		                System.out.println(pf.getCpf() + " - " + cliente);
		            } else if (cliente instanceof PessoaJuridica) {
		                PessoaJuridica ph = (PessoaJuridica) cliente;
		                System.out.println(ph.getCnpj() + " - " + cliente);
		            }
		        });
		    }
		    
		    

}
