/*representa un iterador de elementos*/
public interface IteradorIF<E>{
    /**
     * obtiene el siguiente elemento de la iteracion<-descripcion del metodo getNext()
     * @pre:hasNext()                               <-prerequisito
     * @return:el siguiente elemento de la iteracion<-devuelve
    */
    public E getNext();
    /**
     * comprueba si aun quedan elementos por iterar        <-descripcion del metodo hasNext()
     * @return:true si el iterador dispone de mas elementos<-devuelve
    */   
    public boolean hasNext();
    /**
     * vuelve la posicion del iterador al principio.  <-descripcion del metodo hasNext()
     * permite reusar el iterador sin hacer uno nuevo.<-descripcion del metodo hasNext()
    */ 
    public void reset();
}
