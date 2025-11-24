import java.util.Scanner;
public class expR
{
    private static long Cexp(int num,int exp){
    if(exp==0){
        return 1;
    }else{
        return (num*Cexp(num,exp-1));
    }
    }
    
    public void main(){
    int numero,exponente;
    Scanner sc=new Scanner(System.in);
    System.out.println("numero?:");
    numero=sc.nextInt();
    System.out.println("exponente?:");
    exponente=sc.nextInt();
    
    System.out.println("========================================");
    System.out.println("el resultado es: "+Cexp(numero,exponente));
    System.out.println("========================================");
    }

}
