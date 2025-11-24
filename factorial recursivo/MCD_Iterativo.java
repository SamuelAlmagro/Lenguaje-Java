import java.util.Scanner;
public class MCD_Iterativo
{
    private static long C_MCD(long a, long b){
        //buscamos que el divisor sea grande
        long dividendo = a>=b? a:b;
        //buscamos que el divisor sea peque
        long divisor = a<=b? a:b;
        while(divisor != 0){
            long resto = dividendo%divisor;
            dividendo = divisor;
            divisor = resto;
        }
        return dividendo;
    }
    
    public void main(){
        int pri=0,seg=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Primer Numero?:");
        pri=sc.nextInt();
        System.out.println("Segundo Numero?:");
        seg=sc.nextInt();
        
        System.out.println("============================");
        System.out.println("el MCD de "+pri+" y "+seg+" es:"+C_MCD(pri,seg));
        System.out.println("============================");
        
    }
}
