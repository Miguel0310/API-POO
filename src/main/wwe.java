/*
Clase que nao importa
*/

public class wwe {
    private String nome;
    private String lutador;
    private String golpe;
    private String altura;

    @Override
    public String toString() {
        return "Lutador da WWE: [nome = " + nome + ", golpe = " + golpe + ", altura = " + altura
                + "]";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLutador() {
        return lutador;
    }
    public void setLutador(String lutador) {
        this.lutador = lutador;
    }
    public String getGolpe() {
        return golpe;
    }
    public void setGolpe(String golpe) {
        this.golpe = golpe;
    }
    public String getAltura() {
        return altura;
    }
    public void setAltura(String altura) {
        this.altura = altura;
    }
}