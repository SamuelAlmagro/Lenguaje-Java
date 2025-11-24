import java.util.Scanner;
public class MCD_Recursivo
{
    private static long cMCD(long a, long b){
        if(b==0){
            return a;
        }else{
            return cMCD(b,a % b);
        }
    }
    
    public void main(){
        int pri=0,seg=0;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Primer Numero?:");
        pri=sc.nextInt();
        System.out.println("Segundo Numero?:");
        seg=sc.nextInt();
        
        System.out.println("============================");
        System.out.println("el MCD de "+pri+" y "+seg+" es:"+cMCD(pri,seg));
        System.out.println("============================");
        
    }
}
