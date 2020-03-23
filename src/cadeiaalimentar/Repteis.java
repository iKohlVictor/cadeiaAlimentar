package cadeiaalimentar;
public class Repteis extends Animal
{
    //Atributos...
    private float temperaturaDoCorpo;
    //Construtor Padrão
    public Repteis(float temperaturaDoCorpo, int cod, float peso, 
            boolean estado, boolean caca) 
    {
        super(cod, peso, estado, caca);
        this.temperaturaDoCorpo = temperaturaDoCorpo;
    }
    //Construtor de Inicialização
    public Repteis() 
    {
        super();
        this.temperaturaDoCorpo = 0;
    }
    //GETTER & SETTER
    public float getTemperaturaDoCorpo() 
    {
        return temperaturaDoCorpo;
    }
    public void setTemperaturaDoCorpo(float temperaturaDoCorpo) 
    {
        this.temperaturaDoCorpo = temperaturaDoCorpo;
    }
    //toString
    @Override
    public String toString() 
    {
        return (super.toString() + ", temperatura Do Corpo =" + temperaturaDoCorpo);
    }
    //método dos repteis
    public String defender()
    {
        return("\n\n Defendendo-se, com a sua pele grossa e resistente!");
    }
    
}
