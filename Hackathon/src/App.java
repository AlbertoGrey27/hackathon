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
        ArrayList<Torneio> torneios = new ArrayList<>();
        equipes.add(new Equipe("Hackathon","Brazil",4));
        robos.add(new Robo("Lobinho", "Medio", "Cortante", "Arduino"));
        robos.add(new Robo("Rei", "Medio", "Perfurante", "Rasberrypie"));




        String resposta;
        do {
            System.out.println("1) Cadastrar Equipe\n" +
                    "2) Cadastrar Robos\n" +
                    "3) Vincular robo\n" +
                    "4) Criar Torneios\n" +
                    "5) Entrar em um torneio\n" +
                    "6) Verificar Equipes\n" +
                    "7) Verificar Robo\n" +
                    "8) Verificar Torneios\n" +
                    "14) Sair ");
            resposta = sc.next();
            if (resposta.equals("1")) {
                //Cadastrar equipes
                System.out.println("Nome da equipe");
                resp1 = sc.next();
                System.out.println("País de origem da equipe");
                resp2 = sc.next();
                System.out.println("Número de integrantes");
                respInt1 = sc.nextInt();
                equipes.add(new Equipe(resp1, resp2, respInt1));


            }
            else if (resposta.equals("2")) {
                //Cadastrar robos
                System.out.println("Nome do nome do robo: ");
                resp1 = sc.next();
                System.out.println("Categoria de Peso(Leve, Medio, Pesado): ");
                resp2 = sc.next();
                System.out.println("Tipo do robo: ");
                resp3 = sc.next();
                System.out.println("Sistema do robo: ");
                resp4 = sc.next();
                robos.add(new Robo(resp1, resp2, resp3, resp4));

            }
            else if (resposta.equals("3")) {
                //Vincular robo a uma equipe
                int contadorEquipes;
                int contadorRobos;
                boolean check1=true,check2=true;
                if (equipes.isEmpty()) {
                    System.out.println("Não a equipes cadastradas");
                }else if (robos.isEmpty()) {
                    System.out.println("Não a robos cadastrados");
                } else{
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
                    if (contadorEquipes==equipes.size()) {
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
                        resp2 = sc.next();
                        for ( contadorRobos = 0; contadorRobos<robos.size();contadorRobos++) {
                            if (robos.get(contadorRobos).getNomeRobo().equals(resp2)) {
                                break;
                            }
                        }
                        System.out.println(resp2);
                        System.out.println(contadorRobos);
                        if (contadorRobos==robos.size()) {
                            System.out.println("Esse robo não existe");
                            check2=false;
                        }
                    }
                    if (check1==true && check2==true) {
                        equipes.get(contadorEquipes).cadastrarRobo(robos.get(contadorRobos));
                        System.out.println("Robo cadastrado com sucesso");
                    }
                }
            }
            else if (resposta.equals("4")) {
                System.out.println("Nome do nome do Torneio: ");
                resp1 = sc.next();
                System.out.println("data do torneio: ");
                resp2 = sc.next();
                System.out.println("local do torneio: ");
                resp3 = sc.next();
                System.out.println("categoria de peso(Leve, Medio, Pesado): ");
                resp4 = sc.next();
                torneios.add(new Torneio(resp1, resp2, resp3, resp4));
            }
            else if (resposta.equals("5")) {
                if (torneios.isEmpty()){
                    System.out.println("Não a torneios Disponiveis");
                } else if (equipes.isEmpty()) {
                    System.out.println("Não a equipes cadastradas");
                }else if (robos.isEmpty()) {
                    System.out.println("Não a robos cadastrados");
                } else {
                    //Começo do cadastro
                    int contadorEquipes;
                    int contadorTorneios;
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
                    }if (contadorEquipes==equipes.size()) {
                        System.out.println("Essa equipe não existe");
                        check1=false;
                        contadorTorneios=0;
                        check2=false;
                    }else{
                        System.out.println("Torneios Disponiveis");
                        for (Torneio torneio : torneios) {
                            torneio.exibirInformacoes();
                        }
                        System.out.println("Digite o nome do torneio: ");
                        resp2 = sc.next();
                        for ( contadorTorneios = 0; contadorTorneios<torneios.size();contadorTorneios++) {
                            if (torneios.get(contadorTorneios).getNomeTorneio().equals(resp2)) {
                                break;
                            }
                        }
                        System.out.println(contadorTorneios);
                        if (contadorTorneios==torneios.size()) {
                            System.out.println("Esse torneio não existe");
                            check2=false;
                        }
                        if (!torneios.get(contadorTorneios).getCategoriaPeso().equals(equipes.get(contadorEquipes).getRobo().getPeso())) {

                        }
                    }
                    if (check1==true && check2==true) {
                        torneios.get(contadorTorneios).equipesTorneio.add(equipes.get(contadorEquipes));
                        System.out.println("Robo cadastrado com sucesso");
                    }
                }
            }
            else if (resposta.equals("6")) {
                if (equipes.isEmpty()) {
                    System.out.println("Não a equipes cadastradas");
                }else{
                    for (Equipe equipe : equipes) {
                        equipe.exibirInformacoes();
                    }
                }

            }
            else if(resposta.equals("7")){
                if (robos.isEmpty()) {
                    System.out.println("Não a robos cadastrados");
                }else{
                    for (Robo robo : robos) {
                        robo.exibirInformacoes();
                    }
                }

            }
            else if (resposta.equals("8")) {
                if (torneios.isEmpty()) {
                    System.out.println("Não a torneios cadastrados");
                }else {
                    for (Torneio torneio : torneios) {
                        torneio.exibirInformacoes();
                    }
                }

            }
            else if (resposta.equals("14")) {
                System.out.println("Fechando...");
            }
            else{
                System.out.println("Invalido");
            }
        } while (!resposta.equals("14"));

    }

}