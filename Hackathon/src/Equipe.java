import java.util.ArrayList;
import java.util.Scanner;

public class Equipe {

    private String nomeEquipe;
    private String paisOrigem;
    private String roboAssociado;
    private int numeroIntegrantes;
    private String[] nomeIntegrante = new String[numeroIntegrantes];
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
        CadastrarIntegrantes();
        
    }

    public int getNumeroIntegrantes() {
        return numeroIntegrantes;
    }


    public void setNumeroIntegrantes(int numeroIntegrantes) {
        this.numeroIntegrantes = numeroIntegrantes;
    }

    ArrayList <Integrante> integrantes = new ArrayList<>();
    Robo robo = new Robo();

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
        int i = 1;
        for (Integrante integrante : integrantes) {
            System.out.println(i+". "+integrante.getNomeIntegrante());
            i++;
        }
        
        String resposta = sc.nextLine();
        for (int j = 0; j < integrantes.size(); j++) {
            if(resposta.equals(integrantes.get(j))){
                integrantes.get(j).setLider(true);
            }
        }
    }

    public void associarRobo(Robo robo){
        if (robo.getAssociado() == false){
            setRoboAssociado(robo.getNomeRobo());
            robo.setAssociado(true);
        }    
        else{
            System.out.println("Esse robõ ja foi vinculado!");
        }
            
    }

    public void cadastrarRobo(Robo robo){
        
    }
    public void CadastrarIntegrantes(){
        for (int i = 0 ; i < getNumeroIntegrantes(); i++){
            System.out.println("Digite o nome do integrante:");
            nomeIntegrante[i] = sc.next();
        }
    }
    public void exibirIntegrantes(){
        for(int i = 0; i < getNumeroIntegrantes(); i++){
            System.out.println("Nome do integrante "+(i+1)+":"+nomeIntegrante[i]);
        }
    }
            
}
    







