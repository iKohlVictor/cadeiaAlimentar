package cadeiaalimentar;
public class Mamifero extends Animal
{
    //Atributos...
    private boolean  hibernado;
    //Construtor Padrao
    public Mamifero(boolean hibernado, int cod, float peso, 
            boolean estado, boolean caca) 
    {
        super(cod, peso, estado, caca);
        this.hibernado = hibernado;
    }
    //Construtor de inicialização
    public Mamifero() 
    {
        super();
        this.hibernado = false;
    }
    //GETTER & SETTER
    public boolean isHibernado() 
    {
        return hibernado;
    }
    public void setHibernado(boolean hibernado) 
    {
        this.hibernado = hibernado;
    }
    //toString
    @Override
    public String toString() 
    {
        if(this.hibernado)
        {
            return (super.toString() + "\n Hibernando durante um bom tempo como eu queria!");
        }
        else
        {
            return (super.toString() + "\n Não estou Hibernando mas gostaria!");
        }
    }
    //método do mamífero
    @Override
    public String Alimentar()
    {
        return("Tomando leite... Pronto, barriga cheia e azia a caminho.");
    }
}
