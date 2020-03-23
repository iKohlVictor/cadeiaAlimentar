package cadeiaalimentar;
import java.util.ArrayList;
import java.util.Collections;
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
        Mamifero mamifero, mamifero2;
        Aves aves, aves2;
        Repteis repteis, repteis2;
        int cod, localizacao;
        //Inicializar
        opc1 = opc2 = -1;
        cod = 0;
        localizacao = -1;
        
        
        do
        {
            System.out.print("\n\n --------MENU--------");
            System.out.print("\n 1 - Inserir.......:");
            System.out.print("\n 2 - Mostrar.......:");
            System.out.print("\n 3 - Mostrar todos.:");
            System.out.print("\n 4 - Alterar Status:");
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
                            cod = entrada.nextInt();
                            //Validação.....
                            for(int i = 0; i < listaDeAnimais.size(); i++)
                            {
                                while(listaDeAnimais.get(i).getCod() == cod)
                                {
                                    System.out.print("Codigo exiteste..digite outro..:");
                                    cod = entrada.nextInt();
                                    i = 0;
                                }
                            }
                            mamifero.setCod(cod);
                            System.out.print("\n Digite o peso...:");
                            mamifero.setPeso(entrada.nextFloat());
                            System.out.print("\n Hibernando......:");
                            mamifero.setHibernado(entrada.nextBoolean());
                            //Validação
                            if(mamifero.isHibernado() == false)
                            {
                                System.out.print("\n Qual o estado...:");
                                mamifero.setEstado(entrada.nextBoolean());
                                if(mamifero.isEstado() == true)
                                {
                                    System.out.print("\n Caçando.........:");
                                    mamifero.setCaca(entrada.nextBoolean());
                                }
                                else
                                {
                                    mamifero.setCaca(false);
                                }
                            }
                            else
                            {
                                mamifero.setEstado(false);
                                mamifero.setCaca(false);
                            }
                            //Alocando no ArrayList
                            listaDeAnimais.add(mamifero);
                        break;
                        //------------------------------------------------------    
                        case 2:
                            aves = new Aves();
                            System.out.print("\n --Inserindo Aves");
                            //Dados Gerais
                            System.out.print("\n Digite o código..:");
                            cod = entrada.nextInt();
                            //Validação.....
                            for(int i = 0; i < listaDeAnimais.size(); i++)
                            {
                                while(listaDeAnimais.get(i).getCod() == cod)
                                {
                                    System.out.print("Codigo exiteste..digite outro..:");
                                    cod = entrada.nextInt();
                                    i = 0;
                                }
                            }
                            aves.setCod(cod);
                            System.out.print("\n Digite o peso...:");
                            aves.setPeso(entrada.nextFloat());
                            System.out.print("\n Qual o estado...:");
                            aves.setEstado(entrada.nextBoolean());
                            if(aves.isEstado() == true)
                            {
                                System.out.print("\n Caçando.........:");
                                aves.setCaca(entrada.nextBoolean());
                            }
                            else
                            {
                                aves.setCaca(false);
                            }
                            //Dados Especificos
                            System.out.print("\n Tamanho do Bico.:");
                            aves.setTamanhoDoBico(entrada.nextFloat());
                            //Alocando no ArrayList
                            listaDeAnimais.add(aves);
                        break;
                        //------------------------------------------------------    
                        case 3:
                            repteis = new Repteis();
                            System.out.print("\n --Inserindo repteis");
                            //Dados Gerais
                            System.out.print("\n Digite o código..:");
                            cod = entrada.nextInt();
                            //Validação.....
                            for(int i = 0; i < listaDeAnimais.size(); i++)
                            {
                                while(listaDeAnimais.get(i).getCod() == cod)
                                {
                                    System.out.print("Codigo exiteste..digite outro..:");
                                    cod = entrada.nextInt();
                                    i = 0;
                                }
                            }
                            repteis.setCod(cod);
                            System.out.print("\n Digite o peso...:");
                            repteis.setPeso(entrada.nextFloat());
                            System.out.print("\n Qual o estado...:");
                            repteis.setEstado(entrada.nextBoolean());
                            if(repteis.isEstado() == true)
                            {
                                System.out.print("\n Caçando.........:");
                                repteis.setCaca(entrada.nextBoolean());
                            }
                            else
                            {
                                repteis.setCaca(false);
                            }
                            //Dados Especificos
                            System.out.print("\n Temperaturo do Corpo..:");
                            repteis.setTemperaturaDoCorpo(entrada.nextFloat());
                            //Alocando no ArrayList
                            listaDeAnimais.add(repteis);
                        break;
                        //--------------------------------------------------------------    
                    }
                break;
                //-------------------------------------------------------------------------------------    
                case 2:
                    System.out.print("\n\n --Mostrando");
                    System.out.print("\n 1 - Mamifero..:");
                    System.out.print("\n 2 - Aves......:");
                    System.out.print("\n 3 - Repteis...: \n ->");
                    opc2 = entrada.nextInt();
                    switch(opc2)
                    {
                        case 1:
                            for(int i = 0; i<listaDeAnimais.size(); i++)
                            {
                                if(listaDeAnimais.get(i) instanceof Mamifero)
                                {
                                    System.out.println("\n Mamifero:" + listaDeAnimais.get(i));
                                }
                            }
                        break;
                        case 2:
                            for(int i = 0; i<listaDeAnimais.size(); i++)
                            {
                                if(listaDeAnimais.get(i) instanceof Aves)
                                {
                                   System.out.println("\n Aves:" + listaDeAnimais.get(i));
                                }
                            }
                        break; 
                        case 3:
                            for(int i = 0; i<listaDeAnimais.size(); i++)
                            {
                                if(listaDeAnimais.get(i) instanceof Repteis)
                                {
                                    System.out.println("\n Repteis:" + listaDeAnimais.get(i));
                                }
                            }
                        break;    
                    }
                break;
                //-------------------------------------------------------------------------------------    
                case 3:
                    System.out.print("\n\n --Mostrando Tudo");
                    for(int i = 0; i<listaDeAnimais.size(); i++)
                    {
                        System.out.print("\n ->" + listaDeAnimais.get(i).
                                getClass().getSimpleName() + ": " + listaDeAnimais.get(i).toString());
                    }
                break;
                //-------------------------------------------------------------------------------------
                case 4:
                    System.out.print("\n\n\n --Alterando Status");
                    System.out.print("\n Digite o código do animal..:");
                    cod = entrada.nextInt();
                    
                    //Validando existencia.
                    for(int i = 0; i < listaDeAnimais.size(); i++)
                    {
                        if(listaDeAnimais.get(i).getCod() != cod)
                        {
                            System.out.print("Codigo Inexistente..digite outro..:");
                            cod = entrada.nextInt();
                            i = 0;
                        }
                     }
                    //Achando a localização
                    for(int i = 0; i < listaDeAnimais.size(); i++)
                    {
                        if(listaDeAnimais.get(i).getCod() == cod)
                        {
                            localizacao = i;        
                        }
                    }
                    //Mostrando dados
                    if(localizacao != -1)
                    {
                        System.out.print("\n\n ->" + listaDeAnimais.get(localizacao).
                                getClass().getSimpleName() + 
                                ":" + listaDeAnimais.get(localizacao).toString());
                    }
                    //Validação para os possiveis casos
                    if(localizacao != -1)
                    {
                        if(listaDeAnimais.get(localizacao) instanceof Mamifero)
                        {
                            //Inicialziando o Mamifero
                            mamifero = (Mamifero) listaDeAnimais.get(localizacao);
                            //Criando a Class
                            mamifero2 = new Mamifero();                            
                            //Recebendo novos dados
                            mamifero2.setCod(cod);
                            mamifero2.setPeso(mamifero.getPeso());
                          
                            
                            System.out.print("\n Qual o estado...:");
                            mamifero.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            mamifero.setCaca(entrada.nextBoolean());
                            //Dados Especificos
                            System.out.print("\n Hibernando......:");
                            mamifero.setHibernado(entrada.nextBoolean());
                            //Teste de Consistência
                            if(mamifero.isHibernado() == true)
                            {
                                mamifero.setEstado(false);
                                mamifero.setCaca(false);
                            }
                            //Atualizando os dados..
                            Collections.replaceAll(listaDeAnimais, mamifero, mamifero2);
                        }
                        if(listaDeAnimais.get(localizacao) instanceof Aves)
                        {
                            //Inicializando a Ave
                            aves = (Aves) listaDeAnimais.get(localizacao);
                            //Criando a Class
                            aves2 = new Aves();
                            //Recebendo novos dados
                            aves2.setCod(cod);
                            aves2.setPeso(aves.getPeso());
                            aves2.setTamanhoDoBico(aves.getTamanhoDoBico());
                            
                            System.out.print("\n Qual o estado...:");
                            aves2.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            aves2.setCaca(entrada.nextBoolean());
                            
                            //Atualizando os dados..
                            Collections.replaceAll(listaDeAnimais, aves, aves2);
                        }
                        if(listaDeAnimais.get(localizacao) instanceof Repteis)
                        {
                            repteis = (Repteis) listaDeAnimais.get(localizacao);
                            //Criando a Class
                            repteis2 = new Repteis();
                            //Recebendo novos dados
                            repteis2.setCod(cod);
                            repteis2.setPeso(repteis.getPeso());
                            repteis2.setTemperaturaDoCorpo(repteis.getTemperaturaDoCorpo());
                            
                            System.out.print("\n Qual o estado...:");
                            repteis2.setEstado(entrada.nextBoolean());
                            System.out.print("\n Caçando.........:");
                            repteis2.setCaca(entrada.nextBoolean());
                            
                            //Atualizando os dados..
                            Collections.replaceAll(listaDeAnimais, repteis, repteis2);
                        }
                    }
                    
                break;
            }
        }while(opc1 != 0);
    }
    
}
