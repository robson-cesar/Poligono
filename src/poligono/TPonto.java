package poligono;

public class TPonto {
    public static void main (String args[]){
        Ponto p1 = new Ponto ();
        System.out.println(p1.getLocalizacao());
        Ponto p2 = new Ponto (0.0,8.3);
        System.out.println(p2.getLocalizacao());
        System.out.println(p1.getDistancia(p2));
    } 
}
