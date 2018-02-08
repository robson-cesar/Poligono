package poligono;

public class Ponto {

    private Double x;
    private Double y;

    public String getLocalizacao() {
        if (x > 0 && y > 0) {
            return "1º Quadrante";
        } else if (x < 0 && y > 0) {
            return "2º Quadrante";
        } else if (x < 0 && y < 0) {
            return "3º Quadrante";
        } else if (x > 0 && y < 0) {
            return "4º Quadrante";
        } else if (x == 0 && y > 0 || y < 0) {
            return "Ponto no Eixo Y";
        } else if (y == 0 && x > 0 || x < 0) {
            return "Ponto no Eixo X";
        } else {
            return "Ponto no Origem do Plano Cartesiano";
        }
    }

    public Ponto(Double x, Double y) { //Método Construtor (mesmo nome da Classe
        this.x = x; //Associando o atributo ao parâmetro utilizando this
        this.y = y;
    }
}
