import java.util.ArrayList;
import java.util.Scanner;

public class Torneio {

    private String nomeTorneio;
    private String dataTorneio;
    private String local;
    private String categoriaPeso;
    Scanner sc = new Scanner(System.in);

    ArrayList<Combate> combates = new ArrayList<>();
    ArrayList<Equipe> equipesTorneio = new ArrayList<>();


    public Torneio(String nomeTorneio, String dataTorneio, String local,String categoriaPeso) {
        this.nomeTorneio = nomeTorneio;
        this.dataTorneio = dataTorneio;
        this.local = local;
        this.categoriaPeso = categoriaPeso;
    }
    public String getCategoriaPeso() {
        return categoriaPeso;
    }
    public void setCategoriaPeso(String categoriaPeso) {
        this.categoriaPeso = categoriaPeso;
    }
    public String getNomeTorneio() {
        return nomeTorneio;
    }
    public void setNomeTorneio(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }
    public String getDataTorneio() {
        return dataTorneio;
    }
    public void setDataTorneio(String dataTorneio) {
        this.dataTorneio = dataTorneio;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public void cadastrarCombate(Robo robo1,Robo robo2){
        String resp1,resp2;
            System.out.println("Qual a duração do combate?");
            resp1 = sc.next();
            System.out.println("Qual o local");
            resp2 = sc.next();
            combates.add(new Combate(resp1, resp2, robo1, robo2));
    }

    public void cadastrarEquipe(Equipe equipe){
        equipesTorneio.add(equipe);
    }
    public void exibirInformacoes(){
        System.out.println("Nome: "+getNomeTorneio());
        System.out.println("Data: "+getDataTorneio());
        System.out.println("Local: "+getLocal());
        System.out.println("Categoria de peso: "+getCategoriaPeso());
    }
    public void exibirEquipes(){
        for (Equipe equipe : equipesTorneio) {
            equipe.exibirInformacoes();
        }
    }
    public void exibirCombates(){
        for (Combate combate : combates) {
            System.out.println(combate.getLocal()+" " + combate.getDuraçao());
            combate.saberParticipantes();
        }
    }


}
