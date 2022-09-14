package teste.celular;

/**
 *
 * @author fatec
 */
public class Celular {
    
    private String nome;
    private String marca;
    private float polegada;
    private double ip;
    private String cor;
    private int carga;
    private int foto;
    private int audio;
    private int app;

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public int getApp() {
        return app;
    }

    public void setApp(int app) {
        this.app = app;
    }
    
    

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPolegada() {
        return polegada;
    }

    public void setPolegada(float polegada) {
        this.polegada = polegada;
    }

    public double getIp() {
        return ip;
    }

    public void setIp(double ip) {
        this.ip = ip;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    public String carregar(){
        carga = carga + 5;
        if (carga == 100){
            return("A Bateria está cheia");
            
        }
        else if (carga > 100){
            carga = 0;
            return("A Bateria foi zerada");
        }
        else{
            return(String.valueOf(carga) + "%");
        }
             
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void tirarFoto(){
        foto = foto + 1;
        
    }
    
    public void escutarAudio(){
        audio = audio + 1;
    }
    
    public void abrirApp(){
        app = app + 1;
        
    }
    
    public String desligar(){
        return("Desligado");
    }
    
    public String ligar(){
        return("Ligado");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
