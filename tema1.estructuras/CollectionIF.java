
/**
 * representa una coleccion de elementos,                                       <-descripcion collectionIF<E>
 * sin ningun tipo de relacion entre ellos mas que la pertenencia a la coleccion<-descripcion collectionIF<E> 
 */
public interface CollectionIF<E>{
    /**
    * devuelve el numero de elementos de la coleccion<-descripcion de size()
    */
    public int size();
    /**
    * devuelve true si la coleccion no contiene elementos<-descripcion de isEmpty()
    */
    public boolean isEmpty();
    /**
    * devuelve true si "e" esta en la coleccion<-descripcion de contains();
    */
    public boolean contains(E e);
    /**
    * elimina todos los elementos de la coleccion<-descripcion de clear();
    */
    public void clear();
}

