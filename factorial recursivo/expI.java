import java.util.Scanner;
public class expI
{
    private static long Cexp(int num,int exp){
    long resul=1;
    for(int i=1;i<=exp;i++){
        resul*=num;
    }
    return resul;
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
