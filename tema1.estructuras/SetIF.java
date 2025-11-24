
/**
 * representa un conjunto,que es un contenedor que permite: <-descripcion SetIF<E>
 * almacener elementos que seran unicos dentro del conjunto <-descripcion SetIF<E>
 */
public interface SetIF<E> extends ContainerIF<E>
{
    /**
    *realiza la union del conjunto llamante con el parametro<-descripcion union()
    *s es un conjunto de elementos de tipo e
    */
    public void union (SetIF<E> s);
        /**
    *realiza la interseccion del conjunto llamante con el parametro<-descripcion intersection()
    *s es un conjunto de elementos de tipo e
    */
    public void intersection (SetIF<E> s);
}
