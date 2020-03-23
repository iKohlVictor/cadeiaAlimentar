package cadeiaalimentar;
import java.util.ArrayList;
import java.util.Scanner;
public class Principal 
{
    public static void main(String[] args) 
    {
        //Criando o ArrayList para guardar os dados....
        ArrayList <Animal> listaDeAnimais = new ArrayList();
        
        //Criando o comando de entrada.
        Scanner entrada = new Scanner(System.in);
        
        //Variaveis.
        int opc1, opc2;
        Mamifero mamifero;
        Aves aves;
        Repteis repteis;
        
        opc1 = opc2 = -1;
        
        do
        {
            System.out.print("\n\n-----MENU----");
            System.out.print("\n 1 - Inserir.......:");
            System.out.print("\n 2 - Mostrar.......:");
            System.out.print("\n 3 - Mostrar todos.:");
            System.out.print("\n 0 - Sair..........:\n ->");
            opc1 = entrada.nextInt();
            switch(opc1)
            {
                case 1:
                    System.out.print("\n --Inserindo");
                    System.out.print("\n 1 - Mamifero..:");
                    System.out.print("\n 2 - Aves......:");
                    System.out.print("\n 3 - Repteis...:");
                    System.out.print("\n 0 - Sair......: \n ->");
                    opc2 = entrada.nextInt();
                    switch(opc2)
                    {
                        case 1:
                            mamifero = new Mamifero();
                            System.out.print("\n --Inserindo Mamíferos");
                            //Dados Gerais
                            System.out.print("\n Digite o código..:");
                            mamifero.setCod(entrada.nextInt());
                            //Validação.....
                            
                            System.out.print("\n Digite o peso...:");
                            mamifero.setPeso(entrada.nextFloat());
                            System.out.print("\n Qual o estado...:");
                            mamifero.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            mamifero.setCaca(entrada.nextBoolean());
                            //Dados Especificos
                            System.out.print("\n Hibernando......:");
                            mamifero.setHibernado(entrada.nextBoolean());
                            //Teste de Consistência
                        break;
                            
                        case 2:
                            aves = new Aves();
                            System.out.print("\n --Inserindo Aves");
                            //Dados Gerais
                            System.out.print("\n Digite o código..:");
                            aves.setCod(entrada.nextInt());
                            //Validação.....
                            
                            System.out.print("\n Digite o peso...:");
                            aves.setPeso(entrada.nextFloat());
                            System.out.print("\n Qual o estado...:");
                            aves.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            aves.setCaca(entrada.nextBoolean());
                            //Dados Especificos
                            System.out.print("\n Tamanho do Bico.:");
                            aves.setTamanhoDoBico(entrada.nextFloat());
                        break;
                            
                        case 3:
                            repteis = new Repteis();
                            System.out.print("\n --Inserindo repteis");
                            //Dados Gerais
                            System.out.print("\n Digite o código..:");
                            repteis.setCod(entrada.nextInt());
                            //Validação.....
                            
                            System.out.print("\n Digite o peso...:");
                            repteis.setPeso(entrada.nextFloat());
                            System.out.print("\n Qual o estado...:");
                            repteis.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            repteis.setCaca(entrada.nextBoolean());
                            //Dados Especificos
                            System.out.print("\n Temperaturo do Corpo..:");
                            repteis.setTemperaturaDoCorpo(entrada.nextFloat());
                        break;
                    }
                    
                    
            }
        }while(opc1 != 0);
    }
    
}
