import java.util.Scanner;
public class suma_iterativa
{
    //get
    private static long getSuma(int n){return sumaIterativa(n);}
    //calculo Suma
    private static long sumaIterativa(int n){
    int x=1;
    for(int i=2;i<=n;i++){
        x+=i;
    }
    return x;
    }
    //imprime
    public void main(){
    int suma;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    suma=sc.nextInt();
    System.out.println("========================================="); 
    System.out.println("El Numero Introducido es:" + suma); 
    System.out.println("El Resultado De la suma Es:" + getSuma(suma));
    System.out.println("=========================================");
    System.out.println();
    }
}
