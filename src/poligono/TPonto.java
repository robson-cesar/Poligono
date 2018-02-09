package poligono;

public class TPonto {
    public static void main (String args[]){
        Ponto p1 = new Ponto ();
        System.out.println("Localização de P1: " + p1.getLocalizacao());
        Ponto p2 = new Ponto (0.0,8.3);
        System.out.println("Localização de P2: " + p2.getLocalizacao());
        System.out.println("Distãncia de P1 para p2: " + p1.getDistancia(p2));
        Reta r = new Reta(p1,p2);

        System.out.println("O tamanho da reta r é: " + r.getTamanho());
    } 
}
