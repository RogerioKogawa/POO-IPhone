import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            Scanner input = new Scanner(System.in);
            IPhone iPhone = new IPhone();
            int opcao = 1;
            while(true && opcao != 0){
                System.out.println("Escolha uma opcao: ");
                System.out.println("1 - Ligar para um número");
                System.out.println("2 - Atender ligação");
                System.out.println("3 - Iniciar correio de voz");
                System.out.println("4 - Pesquisar pagina");
                System.out.println("5 - Abrir nova aba");
                System.out.println("6 - Atualizar pagina");
                System.out.println("7 - Tocar múica");
                System.out.println("8 - Pausar música");
                System.out.println("9 - Selecionar uma música");
                System.out.println("0 - Desligar o celular");

                opcao = Integer.parseInt(input.nextLine());
                switch (opcao){
                    case 0:
                        System.out.println("Desligando o celular");
                        break;
                    case 1:
                        long numeroTelefone = Long.parseLong(input.nextLine());
                        iPhone.ligar(numeroTelefone);
                        break;
                    case 2:
                        iPhone.atender();
                        break;
                    case 3:
                        iPhone.iniciarCorreioVoz();
                        break;
                    case 4:
                        System.out.println("Digite o nome da página: ");
                        String url = input.nextLine();
                        iPhone.exibirPagina(url);
                        break;
                    case 5:
                        iPhone.adicionarNovaAba();
                        break;
                    case 6:
                        iPhone.atualizarPagina();
                        break;
                    case 7:
                        iPhone.tocar();
                        break;
                    case 8:
                        iPhone.pausar();
                        break;
                    case 9:
                        System.out.println("Digite o nome da música: ");
                        String nomeMusica = input.nextLine();
                        iPhone.selecionarMusica(nomeMusica);
                        break;
                    default:
                        System.out.println("Digite uma opção válida.");
                        break;
                }
                System.out.println();
                System.out.println();
                System.out.println();
                //Adiciona um delay para dar tempo de ler as respostas
                Thread.sleep(1000);
            }
    }
}
