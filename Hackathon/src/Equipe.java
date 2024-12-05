
import java.util.ArrayList;
import java.util.Scanner;

public class Equipe {

    private String nomeEquipe;
    private String paisOrigem;
    private String roboAssociado;
    private int numeroIntegrantes;
    private String[] nomeIntegrante;
    ArrayList <Integrante> integrantes = new ArrayList<>();
    Robo robo = new Robo();
    Scanner sc = new Scanner(System.in);
    public String getRoboAssociado() {
        return roboAssociado;
    }


    public void setRoboAssociado(String roboAssociado) {
        this.roboAssociado = roboAssociado;
    }

    public Equipe(String nomeEquipe, String paisOrigem, int numeroIntegrantes) {
        this.nomeEquipe = nomeEquipe;
        this.paisOrigem = paisOrigem;
        this.numeroIntegrantes = numeroIntegrantes;
        nomeIntegrante = new String[numeroIntegrantes];
        CadastrarIntegrantes();
        definirLider();
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }


    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }



    public String getNomeEquipe() {
        return nomeEquipe;
    }


    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }


    public Robo getRobo() {
        return robo;
    }


    public void setRobo(Robo robo) {
        this.robo = robo;
    }


    public String getPaisOrigem() {
        return paisOrigem;
    }


    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    public ArrayList<Integrante> getIntegrantes() {
        return integrantes;
    }


    public void setIntegrantes(ArrayList<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public void definirLider(){

        for(int i = 0; i < getNumeroIntegrantes(); i++){
            System.out.println("Nome do integrante "+(i+1)+": "+integrantes.get(i).getNomeIntegrante());
        }
        System.out.print("Digite o nome de quem vai ser o lider: ");
        String resposta = sc.next();
        for (int j = 0; j < integrantes.size(); j++) {
            if(resposta.equals(integrantes.get(j).getNomeIntegrante())){
                integrantes.get(j).setLider(true);
            }
        }
    }
    public void CadastrarIntegrantes(){
        for (int i = 0 ; i < getNumeroIntegrantes(); i++){
            System.out.println("Digite o nome do "+(i+1)+"º integrante:");

            nomeIntegrante[i] = sc.nextLine();
            integrantes.add(new Integrante(nomeIntegrante[i]));
        }
    }
    public void exibirInformacoes(){
        System.out.println(getNomeEquipe());
        for(int i = 0; i < integrantes.size(); i++){
            if (integrantes.get(i).isLider()==true) {
                System.out.println("Nome do lider: "+integrantes.get(i).getNomeIntegrante());
            }else{
                System.out.println("Nome do integrante: "+integrantes.get(i).getNomeIntegrante());
            }
        }
        if (robo.getAssociado().equals(true)) {
            System.out.println("Essa equipe tem um robo");
        }else{
            System.out.println("Essa equipe ainda não tem um robo");
        }
        System.out.println();
    }
    public void cadastrarRobo(Robo robo1){

        robo.setNomeRobo(robo1.getNomeRobo());
        robo.setPeso(robo1.getPeso());
        robo.setTipo(robo1.getTipo());
        robo.setSistemaOperacional(robo1.getSistemaOperacional());
        robo.setTipo(robo1.getTipo());
        robo.setAssociado(true);
        robo1.setAssociado(true);


    }

}








