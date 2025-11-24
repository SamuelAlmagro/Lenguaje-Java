import java.util.Scanner;
public class fibonacci_Iterativo{
    //get
    private static long getFibonacci(int n){ return FibonacciIterativo(n);}
    //Calculo Factorial
    private static long FibonacciIterativo(int n){
    long x=1;
    long y=1;
    long z=0;
    if(n==1 || n==0){
    return 1;
    }else{
    for(int i=2;i<=n;i++){
        z=x+y;
        x=y;
        y=z;
    }
    return z;
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
