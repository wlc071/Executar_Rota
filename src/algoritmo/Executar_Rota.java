/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


class Localizacao{
    private String endereco;
    private Double distancia;
    private Double latitude;
    private Double longitude;
    private int numCasa;
    
    public Localizacao(String endereco, Double distancia, Double latitude, 
            Double longitude, int numCasa){
        this.endereco = endereco;
        this.distancia = distancia;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }
    
    
    
}


public class Executar_Rota {
    public static void main(String args[]) throws ClassNotFoundException, SQLException{
        
        List<Localizacao> listaLocalizacao = new ArrayList<>();
        
        listaLocalizacao.add(new Localizacao("Av. Nenê Sabino", 0.0, -19.7580403,-47.963857, 1801));
        
        listaLocalizacao.add(new Localizacao("Rua Amélio Moreira", 8.0, -19.7278559,-47.9514157, 18));
        listaLocalizacao.add(new Localizacao("Rua Itália", 1.0, -19.7295639,-47.9249147, 918));
        listaLocalizacao.add(new Localizacao("Rua Inglaterra", 2.0, -19.7284168,-47.9218753, 715));
        listaLocalizacao.add(new Localizacao("Rua Afrânio Francisco", 3.0, -19.7452085,-47.9173, 110));
        listaLocalizacao.add(new Localizacao("Rua Floriano Peioto", 4.0, -19.7552342,-47.9329708, 513));
        listaLocalizacao.add(new Localizacao("Rua Dinamarca", 5.0, -19.7245499,-47.9289894, 203));
            listaLocalizacao.add(new Localizacao("Av Cristo Rei", 6.0, -19.7779426,-47.9510948, 654));
        listaLocalizacao.add(new Localizacao("Rua Rafael Rosano", 7.0, -19.7866271,-47.9256467, 387));
        
        listaLocalizacao.add(new Localizacao("Rua Geraldo Crispim", 9.0, -19.7274398,-47.8829318, 90));
        
        List enderecos = new ArrayList<>();
        List distancia = new ArrayList<>();
        
        
      
        
            
        
 
    }
    
}


class Individuo {
    private List enderecos = new ArrayList<>();
    private List valores = new ArrayList<>();
    private Double limiteespacos;
    private Double notaAvaliacao;
}

class Local{
    private Double x;
    private Double y;
    private int id;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}