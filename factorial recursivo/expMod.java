/**
 * exponenciacion modular-recursividad
 * si n=0     ----> 1
 * si n=par   ----> {(x^(n/2)%m)*(x^(n/2)%m)}%m
 * si n=impar ----> {(x%m)*(x^(n-1)%m)}%m
 */
import java.util.Scanner;
public class expMod
{
    private static long Mod(int x,int n,int m){
    
        if (n==0){
            //si n=0
            return 1;
        }else if(n%2==0){
            //si n=par
            //y=x^(n/2)%m
            long y=Mod(x,n/2,m);
            return (y*y)%m;
        }else{
            //si n=impar
            return ((x%m)*Mod(x,n-1,m))%m;
        }
    }
    
    public void main(){
        int numero=0,exponente=0,modulo=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero(x)?:");
        numero=sc.nextInt();
        System.out.println("exponente(n)?:");
        exponente=sc.nextInt();
        System.out.println("modulo(m)?:");
        modulo=sc.nextInt();
        
        System.out.println("========================================================");
        System.out.println("el resultado de "+numero+"^"+exponente+" mod "+modulo+" es: "+Mod(numero,exponente,modulo));
        System.out.println("========================================================");
        
    }
}