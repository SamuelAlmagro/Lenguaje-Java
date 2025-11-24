import java.util.Scanner;
public class fibonacci_Recursivo{
    //get
    private static long getFibonacci(int a){ return FibonacciRecursivo(a);}
    //Calculo Factorial
    private static long FibonacciRecursivo(int n){
    if(n==1 || n==0){
    return 1;
    }else{
    return (FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2));
    }
    }
    //imprime
    public void main(){
    int Fibonacci;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    Fibonacci = sc.nextInt();
    System.out.println("========================================="); 
    System.out.println("El Numero Introducido es:" + Fibonacci); 
    System.out.println("El Resultado Del Fibonacci Es:" + getFibonacci(Fibonacci));
    System.out.println("=========================================");
    System.out.println();
    }
}
