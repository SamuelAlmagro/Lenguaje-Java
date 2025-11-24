import java.util.Scanner;
public class factor_Recursivo{
    //get
    private static long getFactorial(int a){ return factorialRecursivo(a);}
    //Calculo Factorial
    private static long factorialRecursivo(int n){
    if(n<=1){
        return 1;
    }
    else{
    return n*(factorialRecursivo(n-1));
    }
    }
    //imprime
    public void main(){
    int Factorial;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    Factorial = sc.nextInt();
    System.out.println("========================================="); 
    System.out.println("El Numero Introducido es:" + Factorial); 
    System.out.println("El Resultado Del Factorial Es:" + getFactorial(Factorial));
    System.out.println("=========================================");
    System.out.println();
    }
}