public class Sofa extends Movel{
    private float largura;
    private float altura;

    public Sofa(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public String ConstruirTecido(){
        return "Sofa feito com "+this.tecido.implementarTecido();
    }

    public void instalarSofaCama(){
        System.out.println("Sofar Cama instalado");
    }
}
