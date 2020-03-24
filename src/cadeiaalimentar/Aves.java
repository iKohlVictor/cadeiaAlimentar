package cadeiaalimentar;
public class Aves extends Animal
{
    //Atributos....
    private float tamanhoDoBico;
    //Construtor Padrão
    public Aves(float tamanhoDoBico, int cod, float peso,
            boolean estado, boolean caca) 
    {
        super(cod, peso, estado, caca);
        this.tamanhoDoBico = tamanhoDoBico;
    }
    //Construtor de Inicialização
    public Aves() 
    {
        this.tamanhoDoBico = 0;
    }
    //GETTER & SETTER
    public float getTamanhoDoBico() 
    {
        return tamanhoDoBico;
    }

    public void setTamanhoDoBico(float tamanhoDoBico) 
    {
        this.tamanhoDoBico = tamanhoDoBico;
    }
    
    //toString
    @Override
    public String toString() 
    {
        return (super.toString() + ", tamanho Do Bico = " + tamanhoDoBico + "cm");
    }
    //Metodo das aves
    public String Voar()
    {
        return("\n Voando!");
    }
}
