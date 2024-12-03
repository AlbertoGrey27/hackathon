import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    String resp1,resp2,resp3, resp4;
    int respInt;


    ArrayList<Robo> robos = new ArrayList<>();
    ArrayList<Equipe> equipes = new ArrayList<>();
    
    
    
    
    

    String resposta;
    do {
        System.out.println("1) Cadastrar Equipe\n2) Cadastrar Robos\n3) Vincular robo \n4) Criar combates\n5) Verificar \n6) Sair ");
        resposta = sc.next();
        System.out.println(resposta);
        if (resposta.equals("1")) {
            System.out.println("Nome da equipe");
            resp1 = sc.next();
            System.out.println("País de origem da equipe");
            resp2 = sc.next();
            System.out.println("Número de integrantes");
            respInt = sc.nextInt();
            equipes.add(new Equipe(resp1, resp2, respInt));


            
        }else if (resposta.equals("2")) {
            /*nomeRobo;
            private String peso;
            private String tipo;
            private String sistemaOperacional*/
            System.out.println("Nome do nome do robo: ");
            resp1 = sc.next();
            System.out.println("Categoria de Peso: ");
            resp2 = sc.next();
            System.out.println("Tipo do robo: ");
            resp3 = sc.next();
            System.out.println("Sistema do robo: ");
            resp4 = sc.next();
            robos.add(new Robo(resp1, resp2, resp3, resp4));

        }else if (resposta.equals("3")) {
            for (Equipe e : equipes) {
                e.getNomeEquipe();
            }
            System.out.println("Digite o nome da equipe: ");
            resp1 = sc.next();
            for (Equipe e : equipes) {
                if (e.getNomeEquipe().equals(resp1)) {

                }
            }
        }else if (resposta.equals("4")) {
            
        }else if (resposta.equals("5")) {
            
        }else if (resposta.equals("6")) {
            System.out.println("Fechando...");
        }else{
            System.out.println("Invalido");
        }
    } while (!resposta.equals("6"));

    }

}
