public class Cadeira extends Movel{
    private float largura;
    private float altura;

    public Cadeira(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void instalarPernasCadeira(int numeroPernas){
        System.out.println("Cadeira com "+numeroPernas+" instalada");
    }

    public String fabricarTecido(){
        return this.tecido.implementarTecido()+" colocado na Cadeira";
    }
}
