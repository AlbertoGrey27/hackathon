import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    String resp1,resp2,resp3, resp4;
    int respInt1;
    int idEquipes=1;

    ArrayList<Robo> robos = new ArrayList<>();
    ArrayList<Equipe> equipes = new ArrayList<>();
    equipes.add(new Equipe("Inimigos da Suze","Brazil",4));
    
    
    
    

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
            respInt1 = sc.nextInt();
            equipes.add(new Equipe(resp1, resp2, respInt1));
            
            
        }else if (resposta.equals("2")) {
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
            for (Equipe equipe : equipes) {
                equipe.getNomeEquipe();
            }
            System.out.println("Digite o nome da equipe: ");
            resp1 = sc.next();
            for (int i = 0; i<equipes.size();i++) {
                if (equipes.get(i).getNomeEquipe().equals(resp1)) {
                    break;
                }
            }
            for (Robo robo : robos) {
                robo.getNomeRobo();
            }
            System.out.println("Digite o nome do robo: ");
            resp1 = sc.next();
            for (int j = 0; j<robos.size();j++) {
                if (equipes.get(j).getNomeEquipe().equals(resp1)) {
                    break;
                }
            }

        }else if (resposta.equals("4")) {
            
        }else if (resposta.equals("5")) {
            for (Equipe equipe : equipes) {
                equipe.exibirIntegrantes();
            }
        }else if (resposta.equals("6")) {
            System.out.println("Fechando...");
        }else{
            System.out.println("Invalido");
        }
    } while (!resposta.equals("6"));

    }

}
