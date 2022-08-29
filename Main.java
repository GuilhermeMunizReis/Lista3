import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Jardim jardim = new Jardim("Tereza", "39 99999-9999", "Rua da Esquina");

        int op;     // Opção selecionada pelo usuario
        boolean flag = true;

        while(flag){
            System.out.println("1 - Adicionar arvore");
            System.out.println("2 - Mostrar informacoes");
            System.out.println("3 - Media dos precos");
            System.out.println("4 - Arvores prontas para replantio");
            System.out.println("5 - Sair");

            op = scan.nextInt();

            switch (op){
                case 1:
                    Arvore arv = new Arvore();
                    System.out.print("Entre com a especie da arvore: ");
                    arv.especie = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Entre com a altura: ");
                    arv.altura = scan.nextFloat();
                    System.out.print("Entre com o diametro: ");
                    arv.diametro = scan.nextInt();
                    System.out.print("Entre com o preco: ");
                    arv.preco = scan.nextFloat();
                    jardim.addArvore(arv);
                    break;
                case 2:
                    jardim.mostraInfo();
                    break;
                case 3:
                    jardim.precoMedio();
                    break;
                case 4:
                    jardim.replantar();
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

            System.out.println();
        }
    }
}
