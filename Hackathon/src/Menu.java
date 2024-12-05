import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void exibir(){
        
        Scanner sc = new Scanner(System.in);
        String resp1,resp2,resp3, resp4;
        int respInt1;
        int idEquipes=1;
        int contadorEquipes;
        boolean check1,check2;
        ArrayList<Robo> robos = new ArrayList<>();
        ArrayList<Equipe> equipes = new ArrayList<>();
        ArrayList<Torneio> torneios = new ArrayList<>();
        equipes.add(new Equipe("Hackathon","Brazil",4));
        robos.add(new Robo("Lobinho", "Medio", "Cortante", "Arduino"));
        robos.add(new Robo("Rei", "Medio", "Perfurante", "Rasberrypie"));
        



        String resposta;
        do {
            System.out.println("1)Cadastrar Equipe\n" +
                    "2)Cadastrar Robos\n" +
                    "3)Vincular robo\n" +
                    "4)Criar Torneios\n" +
                    "5)Entrar em um torneio\n" +
                    "6)Cadastrar Combate\n" +
                    "7)Cadastrar Juíz\n" +
                    "8)Verificar Equipes\n" +
                    "9)Verificar Robo\n" +
                    "10)Verificar Torneios\n" +
                    "11)Verificar Combates\n" +
                    "12)Verificar Robos nos Combates\n" +
                    "13)\n" +
                    "14)Sair");
                    
            resposta = sc.next();
            switch (resposta) {
                case "1":
                     //Cadastrar equipes
                    System.out.println("Nome da equipe");
                    resp1 = sc.next();
                    System.out.println("País de origem da equipe");
                    resp2 = sc.next();
                    System.out.println("Número de integrantes");
                    respInt1 = sc.nextInt();
                    equipes.add(new Equipe(resp1, resp2, respInt1));

                    break;
                case "2":
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
                    break;    
                case "3":
                    //Vincular robo a uma equipe
                    
                    int contadorRobos;
                    check1=true;
                    check2=true;
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

                    break;
                case "4":
                    int respTemporaria = -1; // resp em int para evita o erro de varios sc.next alinhados
                    System.out.println("Nome do nome do Torneio: ");
                    resp1 = sc.next();
                    System.out.println("data do torneio: ");
                    resp2 = sc.next();
                    System.out.println("Digite o número da categoria de peso(Leve[1], Medio[2], Pesado[3]): ");
                    respTemporaria = sc.nextInt();
                    System.out.println("local do torneio: ");
                    resp3 = sc.next();
                    switch (respTemporaria) {
                        case 1:
                            torneios.add(new Torneio(resp1, resp2, resp3, "Leve"));
                            break;
                        case 2:
                            torneios.add(new Torneio(resp1, resp2, resp3, "Medio"));    
                            break;
                        case 3:
                            torneios.add(new Torneio(resp1, resp2, resp3, "Pesado"));    
                            break;
                        default:
                            System.out.println("Categoria inválida");
                            break;
                        }
                    
                    break;
                case "5":
                    if (torneios.isEmpty()){
                        System.out.println("Não a torneios Disponiveis");
                    } else if (equipes.isEmpty()) {
                        System.out.println("Não a equipes cadastradas");
                    }else if (robos.isEmpty()) {
                        System.out.println("Não a robos cadastrados");
                    } else {
                    //Começo do cadastro
                    int contadorTorneios;
                    check1=true;
                    check2=true;
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
                        System.out.println("Equipe cadastrada com sucesso!");
                    }
                }

                    break;
                case "8":
                    if (equipes.isEmpty()) {
                        System.out.println("Não há equipes cadastradas");
                    }else{
                        for (Equipe equipe : equipes) {
                            equipe.exibirInformacoes();
                        }
                    }

                    break;
                case "9":
                    if (robos.isEmpty()) {
                        System.out.println("Não a robos cadastrados");
                    }else{
                        for (Robo robo : robos) {
                            robo.exibirInformacoes();
                        }
                    }

                    break;
                case "10":
                    if (torneios.isEmpty()) {
                        System.out.println("Não a torneios cadastrados");
                    }else {
                        for (Torneio torneio : torneios) {
                            torneio.exibirInformacoes();
                        }
                    }   

                    break;
                case "6":
                    if (torneios.isEmpty()){
                        System.out.println("Não há torneios Disponiveis");
                    } else if (equipes.size() < 2) {
                        System.out.println("Não há equipes suficientes(< 2)");
                    }else if (robos.isEmpty()) {
                        System.out.println("Não há robos cadastrados");
                    } else {
                    //Começo do cadastro
                    int contadorTorneios,contadorEquipes2;
                    check1=true;
                    check2=true;
                    System.out.println("Torneios Disponiveis");
                        for (Torneio torneio : torneios) {
                            torneio.exibirInformacoes();
                        }
                        System.out.println("Digite o nome do torneio: ");
                        resp2 = sc.next();
                        for (contadorTorneios = 0; contadorTorneios<torneios.size();contadorTorneios++) {
                            if (torneios.get(contadorTorneios).getNomeTorneio().equals(resp2)) {
                                break;
                            }
                        }
                        System.out.println(contadorTorneios);
                        if (contadorTorneios==torneios.size()) {
                            System.out.println("Esse torneio não existe");
                            check2=false;
                            contadorEquipes = 0;
                            contadorEquipes2 = 0;
                            check1 = false;
                        }else{
                            torneios.get(contadorTorneios).exibirEquipes();
                            System.out.println("Digite o nome da primeira equipe no torneio!");
                            resp3 = sc.next();
                            for (contadorEquipes = 0; contadorEquipes<equipes.size();contadorEquipes++) {
                                if (equipes.get(contadorEquipes).getNomeEquipe().equals(resp3)) {
                                    break;
                                }
                            }if (contadorEquipes==equipes.size()) {
                                System.out.println("Essa equipe não existe");
                                check1=false;
                            }
                            torneios.get(contadorTorneios).exibirEquipes();
                            System.out.println("Digite o nome da primeira equipe no torneio!");
                            resp4 = sc.next();
                            for (contadorEquipes2 = 0; contadorEquipes2<equipes.size();contadorEquipes2++) {
                                if (equipes.get(contadorEquipes2).getNomeEquipe().equals(resp4)) {
                                    break;
                                }
                            }if (contadorEquipes2==equipes.size()) {
                                System.out.println("Essa equipe não existe");
                                check1=false;
                            }
                            if (torneios.get(contadorTorneios).equipesTorneio.get(contadorEquipes).getRobo().getTipo().equals(torneios.get(contadorTorneios).equipesTorneio.get(contadorEquipes2).getRobo().getTipo())){
                               if (torneios.get(contadorTorneios).getCategoriaPeso().equals(torneios.get(contadorTorneios).equipesTorneio.get(contadorEquipes).getRobo().getTipo())){
                                    torneios.get(contadorTorneios).cadastrarCombate(torneios.get(contadorTorneios).equipesTorneio.get(contadorEquipes).getRobo(),torneios.get(contadorTorneios).equipesTorneio.get(contadorEquipes2).getRobo());
                               }
                               else{
                                System.out.println("Categorias de peso diferentes do torneio!");
                               }     
                            }
                            else{
                                System.out.println("Categorias de peso diferentes!");
                            }        
                        }
                }
                    break;
                case "7":
                    //Cadastro de juízes.
                    break;
                case "11":
                    if (!torneios.isEmpty()){
                        for (Torneio torneio : torneios) {
                            torneio.exibirCombates();
                        }    
                    }
                    else{
                        System.out.println("Não há combates!");   
                    }
                        
                    break;    
                case "12":

                    break;
                case "13":
                    //verificar combates
                    break;
                case "14":
                    //verificar robos nos combates
                    
                    break;
                case "15":
                    System.out.println("Fechando...");
                    break;                    
                default:
                    System.out.println("Invalido");
                    break;
            }
        } while (!resposta.equals("15"));

    }
}
