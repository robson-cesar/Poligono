
package poligono;

public class Reta {
    private Ponto p1;
    private Ponto p2;
    
    public Double getTamanho(){
        return this.p1.getDistancia(this.p2);
    }  
    public Reta (Ponto p1, Ponto p2){
        this.p1=p1;
        this.p2=p2;
    }
}
