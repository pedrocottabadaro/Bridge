public abstract class Movel {

    protected Tecido tecido;

    protected float largura;
    protected float altura;


    public void setTecido(Tecido tecido) {
        this.tecido = tecido;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
}
