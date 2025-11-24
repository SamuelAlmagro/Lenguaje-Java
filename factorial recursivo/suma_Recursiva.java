import java.util.Scanner;
public class suma_Recursiva
{
    //get
    private static long getSuma(int a){return sumaRecursiva(a);}
    //calculo Suma
    private static long sumaRecursiva(int n){
    if(n==1){
        return 1;
    }else{
        return (sumaRecursiva(n-1)+n);
    }
    }
    //imprime
    public void main(){
    int suma;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número entero: ");
    suma=sc.nextInt();
    System.out.println("========================================="); 
    System.out.println("El Numero Introducido es:" + suma); 
    System.out.println("El Resultado Del Fibonacci Es:" + getSuma(suma));
    System.out.println("=========================================");
    System.out.println();
    }
}
