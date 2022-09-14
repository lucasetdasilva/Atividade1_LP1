/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

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
    
    
    public void carregar(){
        carga = carga + 5;
        System.out.println("Agora a bateria do seu Celular está" + getCarga() + "%");
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void tirarFoto(String foto){
        
    }
    
    public void escutarAudio(String audio){
        
    }
    
    public void abrirfecharApp(){
        
    }
    
    public void abrirApp(){
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}