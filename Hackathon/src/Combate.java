import java.util.ArrayList;

public class Combate {
    private String duraçao;
    private String local;
    ArrayList <Robo> robos = new ArrayList<>();


    public Combate(String duraçao, String local, Robo robo1, Robo robo2) {
        this.duraçao = duraçao;
        this.local = local;
        robos.add(robo1);
        robos.add(robo2);
    }

    public String getDuraçao() {
        return duraçao;
    }

    public void setDuraçao(String duraçao) {
        this.duraçao = duraçao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    

    public void saberParticipantes(){
        int i = 0;
        for (Robo robo : robos) {
            System.out.println("Robo "+ (i+1) +":"+ robo.getNomeRobo());
        }
    }

}
