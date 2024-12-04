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
    equipes.add(new Equipe("Hackathon","Brazil",4));
    robos.add(new Robo("Lobinho", "Medio", "Cortante", "Arduino"));
    robos.add(new Robo("Rei do ovibe", "Medio", "Perfurante", "Rasberrypie"));
    
    
    

    String resposta;
    do {
        System.out.println("1) Cadastrar Equipe\n2) Cadastrar Robos\n3) Vincular robo \n4) Criar combates\n5) Verificar Equipes\n6) Verificar Robo \n7) Sair ");
        resposta = sc.next();
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
            int contadorEquipes;
            int contadorRobos;
            boolean check1=true,check2=true;
            for (Equipe equipe : equipes) {
                System.out.println(equipe.getNomeEquipe());
                
            }
            System.out.println("Digite o nome da equipe: ");
            resp1 = sc.next();
            for ( contadorEquipes = 0; contadorEquipes<equipes.size();contadorEquipes++) {
                if (equipes.get(contadorEquipes).getNomeEquipe().equals(resp1)) {
                    break;
                }
            }
            System.out.println(contadorEquipes);
            if (!equipes.get(contadorEquipes-1).getNomeEquipe().equals(resp1)) {
                System.out.println("Essa equipe não existe");
                check1=false;
                contadorRobos=0;
                check2=false;
            }else{
                for (Robo robo : robos) {
                    if (robo.getAssociado().equals(false)) {
                        System.out.println(robo.getNomeRobo());
                    }
                }
                System.out.println("Digite o nome do robo: ");
                resp1 = sc.next();
                for ( contadorRobos = 0; contadorRobos<robos.size();contadorRobos++) {
                    if (robos.get(contadorRobos).getNomeRobo().equals(resp1)) {
                        break;
                    }
                }
                System.out.println(contadorRobos);
                if (!robos.get(contadorRobos-1).getNomeRobo().equals(resp1)) {
                    System.out.println("Esse robo não existe");
                    check2=false;
                }
            }

            

            if (check1==true && check2==true) {
                equipes.get(contadorEquipes).robo.setNomeRobo(robos.get(contadorRobos).getNomeRobo());
                equipes.get(contadorEquipes).robo.setPeso(robos.get(contadorRobos).getPeso());
                equipes.get(contadorEquipes).robo.setTipo(robos.get(contadorRobos).getTipo());
                equipes.get(contadorEquipes).robo.setSistemaOperacional(robos.get(contadorRobos).getSistemaOperacional());
                equipes.get(contadorEquipes).robo.setAssociado(true);
                robos.get(contadorRobos).setAssociado(true);
            }
            

        }else if (resposta.equals("4")) {
            
        }else if (resposta.equals("5")) {
            for (Equipe equipe : equipes) {
                equipe.exibirInformacoes();
            }
        }else if(resposta.equals("6")){
            for (Robo irobo : robos) {
                irobo.exibirInformacoes();
            }
        }else if (resposta.equals("7")) {
            System.out.println("Fechando...");
        }else{
            System.out.println("Invalido");
        }
    } while (!resposta.equals("7"));

    }

}
