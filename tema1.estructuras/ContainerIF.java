//(E e) significa que recive un elemento "e" de el iterador llamado E
/**
 * representa un contenedor,que es una coleccion de de elementos que no guardan orden entre si<-descripcion ContainerIF<E>
 */
public interface ContainerIF<E>{
    /**
    * añade un elemento al contenedor<-descripcion de add()
    */
    public int add(E e);
    /**
    * elimina un elemento del contenedor<-descripcion de remove()
    * @pre: this.contains(e)<-prerequisito recive un elemento que esta en el contenedor
    * @post: !this.contains(e)<-postrequisito el elemento no esta en el contenedor
    */
    public boolean remove(E e);
    /**
    * devuelve un iterador para el contenedor<-descripcion de iterator();
    */
    public IteradorIF<E> iterator();
}
