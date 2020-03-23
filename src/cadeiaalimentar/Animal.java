package cadeiaalimentar;
public class Animal 
{
    //Atributos.....
    private int cod;
    private float peso;
    private boolean estado;
    private boolean caca;
    //Construtor Padrão
    public Animal(int cod, float peso, boolean estado, 
            boolean caca) 
    {
        this.cod = cod;
        this.peso = peso;
        this.estado = estado;
        this.caca = caca;
    }
    //Construtor de Inicialização....
    public Animal() 
    {
        this.cod = 0;
        this.peso = 0;
        this.estado = false;
        this.caca = false;
    }
    //GETTER & SETTER

    public int getCod() 
    {
        return cod;
    }

    public void setCod(int cod) 
    {
        this.cod = cod;
    }

    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float peso) 
    {
        this.peso = peso;
    }

    public boolean isEstado() 
    {
        return estado;
    }

    public void setEstado(boolean estado) 
    {
        this.estado = estado;
    }

    public boolean isCaca() 
    {
        return caca;
    }

    public void setCaca(boolean caca) 
    {
        this.caca = caca;
    }
    //toString
    @Override
    public String toString() 
    {
        return " cod = " + cod + ", peso = " + peso +
                ", estado = " + estado + ", caca = " + 
                caca;
    }
    //método do animal
    public String Alimentar()
    {
        return "Alimentando... Pronto animal de barriguinha cheia";
    }
}
