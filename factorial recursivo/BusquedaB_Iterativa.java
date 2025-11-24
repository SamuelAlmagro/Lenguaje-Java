import java.util.Scanner;
//localiza un elemento en el array y da su posicion
public class BusquedaB_Iterativa
{   
    //Calcular busqueda binaria Recursiva
    private static int BusquedaRec(int[] a,int elem,int ini,int end){
    int pos=-1;
    
    while(pos<0 && ini<=end){
    int mid=(ini+end)/2;
    if(a[mid]==elem){
         pos=mid+1;
    }else if(a[mid]<elem){
        ini=mid+1;
    }else{
        end=mid-1;
    }
    }
    return pos-1;
    }
    //Main
    public void main(){
        int size=0,fin=0,inicio=0,elemento=0,resul=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño Del Array?:");
        size=sc.nextInt();
        int[] Array = new int [size];
        size=size-1;
        for(int i=0;i<=size;i++){
            System.out.println("El Valor Del Array En El Hueco"+i+"Es:");
            Array[i]=sc.nextInt();
        }
    
    System.out.println("inicio:");
    inicio = sc.nextInt();

    System.out.println("fin:");
    fin = sc.nextInt();

    System.out.println("Elemento:");
    elemento = sc.nextInt();

    resul=BusquedaRec(Array,elemento, inicio, fin);
    System.out.println("=============================");
    System.out.println("Resultado:"+resul);
    System.out.println("=============================");
    }
    
}
