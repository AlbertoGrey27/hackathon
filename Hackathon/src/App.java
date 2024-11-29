import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    String resp1,resp2,resp3;
    int resp4;
    Torneio flamengo = new Torneio("Cesupa", "123123123", "Cesupa lab 1", "pesado");

    ArrayList<Robo> robos = new ArrayList<>();
    ArrayList<Equipe> equipes = new ArrayList<>();
    
    
    
    
    

    String resposta;
    do {
        System.out.println("1) Cadastrar Equipe\n2) Cadastrar Robos\n3) Criar Torneios \n4) Criar combates\n5) Verificar \n6) Sair ");
        resposta = sc.next();
        System.out.println(resposta);
        if (resposta.equals("1")) {
            System.out.println("Nome da equipe");
            resp1 = sc.next();
            System.out.println("País de origem da equipe");
            resp2 = sc.next();
            System.out.println("Número de integrantes");
            resp4 = sc.nextInt();
            Equipe equipe = new Equipe(resp1, resp2, resp4);
            
        }else if (resposta.equals("2")) {
            
        }else if (resposta.equals("3")) {
            
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
