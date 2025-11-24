import java.util.Scanner;
//localiza un elemento en el array y da su posicion
public class BusquedaB_Recursiva
{   
    //Calcular busqueda binaria Recursiva
    private static int BusquedaRec(int[] a,int elem,int ini,int end){
    int mid=(ini+end)/2;
    //casos base
    if(a[mid]==elem){
        return mid;//se ha encontrado solucion
    }
    if(ini>end){
        return -1;//no ha encontrado solucion
    }
    //casos generales
    if(elem<a[mid]){
        return BusquedaRec(a,elem,ini,mid-1);
    }else{
        return BusquedaRec(a,elem,mid+1,end);
    }
    
    
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
