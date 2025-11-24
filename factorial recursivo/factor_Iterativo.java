import java.util.Scanner;
public class factor_Iterativo{
    //get
    private static long getFactorial(int n){ return factorialIterativo(n);}
    //Calculo Factorial
    private static long factorialIterativo(int n){
    long Fact=1;
    if(n<=1){
        return 1;
    }
    else{
        for(int i=2;i<=n;i++){
        Fact*=i;
        }
        return Fact;
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

