import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     //Condicional switch-Condicional multiple
     Scanner lector=new Scanner(System.in);
     double ValorA,ValorB,Resultado;
     double cociente;
     System.out.println("Menu de opciones");
     System.out.println("a) Sumar");
     System.out.println("b) restar");
     System.out.println("c)Multiplicar");
     System.out.println("d)Dividir");
     System.out.println("e)Potenciacion");
     System.out.println("f)cerrar");
     System.out.println("Ingrese opcion para entrar el Menu");
     char opc = lector.next().charAt(0);
     
      switch(opc){
      
        case 'a':
            System.out.println("1)suma");
            System.out.println("ingerese el valor A");
            ValorA=lector.nextInt();
           System.out.println("ingrese el valor B");
            ValorB=lector.nextInt();
            Resultado=ValorA+ValorB;
            System.out.println("La Resultado de la suma "+ValorA+ "+" +ValorB+" es de:"+Resultado);
          break;
        case 'b':
         System.out.println("2)restar");
            System.out.println("ingerese el valor A");
            ValorA=lector.nextInt();
           System.out.println("ingrese el valor B");
            ValorB=lector.nextInt();
            Resultado=ValorA-ValorB;
            System.out.println("El Resultado de la Diferencia "+ ValorA +"-" +ValorB+" es de:"+Resultado);
            break;
        case 'c':
         System.out.println("3)Multiplicar");
            System.out.println("ingerese el valor A");
            ValorA=lector.nextInt();
           System.out.println("ingrese el valor B");
            ValorB=lector.nextInt();
            Resultado=ValorA*ValorB;
            System.out.println("El Resultado de la Multplicacion "+ ValorA +"*"+ValorB+ " es de:"+Resultado);
       
        break;
          case 'd':
           System.out.println("4)Dividir");
            System.out.println("ingerese el valor A");
            ValorA=lector.nextInt();
           System.out.println("ingrese el valor B");
            ValorB=lector.nextInt();
            if(ValorB==0){
                System.out.println("El divisor no puede ser 0");
            }else{
                cociente=ValorA/ValorB;
            }
            Resultado=ValorA/ValorB;
            System.out.println("El Resultado de la Diferencia "+ ValorA +"/"+ValorB+" es de:"+Resultado);
             break;
         
             case 'e':
          System.out.println("e)potenciacion");
            System.out.println("ingerese el valor A");
            ValorA=lector.nextInt();
           System.out.println("ingrese el valor B");
            ValorB=lector.nextInt();
            Resultado=Math.pow(ValorA,ValorB);
            System.out.println("El Resultado de Valor A y su Exponente Valor B"+ValorA+ "+" +ValorB+" es de:"+Resultado);
             case 'f':
          System.out.println("Saliendo de la App");

          default:
          System.out.println("opcion incorrecta/no valida");
          System.out.println("Saliendo de la APP");
            break;
     }
  lector.close();
    }
}


