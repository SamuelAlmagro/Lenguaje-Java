/**
 * representa una secuencia, que es una coleccion de elementos que se organizan linealmente<-descripcion SequenceIF<E>
 * 
 */
public interface sequenceIF<E> extends CollectionIF<E>{
    
/**
 * devuelve el iterador sobre la secuencia, no necesita parametros spuesto que el recorrido es lineal y unico<-descripcion IteradorIF<E>
 */
public Iterator<E> iterator();
}