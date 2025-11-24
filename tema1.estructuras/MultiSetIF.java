/**
 * representa un multiconjunto, que es un contenedor que                  <-descripcion de MultiSetIF<E> 
 * permite almacener elementos de los que puede haber multiples instancias<-descripcion de MultiSetIF<E>
 * dentro del multiconjunto
 */
public interface MultiSetIF<E> extends ContainerIF<E>
{
    /**
    * añade varias instancias de un elemento al multiconjunto<-descripcion de addMultiple()
    * @pre: n>0 && premult = multiplicity(e)                 <-n tiene que ser mayor que 0 y el valor de la musltiplicidad del elemento "e" antes de ejecutar el metodo addMultiple
    * @post: multiplicity (e) = premult + ns                 <-multiplicidad de "e" despues metodo = multipicidad antes de addMultiple + n
    */
    public void addMultiple (E e, int n);
    /**
    * elimina varias instancias de un elemento del multiconjunto<-descripcion de removeMultiple()
    * @pre: 0<n<=multiplicity(e) && premult = multiplicity(e)   <-n tiene que ser mayor que 0 y menor e igual la multiplicidad de "e" Y la multiplicidad de "e" antes dejecutar el metodo = multiplicidad de "e" despues del metodo
    * @post: multiplicity (e) = premult - n                     <-multiplicidad de "e" despues metodo = multipicidad antes de addMultiple - n
    */
    public void removeMultiple (E e, int n);
    /**
    * devuelve la multiplicidad de un elemento dentro del multiconjunto<-descripcion de removeMultiple()
    * @return: multiplicidad de e (0 si no esta en el conteo)   <-devuelve
    */
   public int multiplicity (E e);
    /**
    *realiza la union del multiconjunto llamante con el parametro<-descripcion union()
    */
   public void union (MultiSetIF<E> s);
    /**
    *realiza la interseccion del multiconjunto llamante con el parametro<-descripcion intersection()
    */
   public void intersection (MultiSetIF<E> s);
    /**
    *realiza la diferencia del multiconjunto llamante con el parametro<-descripcion difference()
    */
   public void difference (MultiSetIF<E> s);
    /**
    *devuelve true si el parametro es un submulticonjunto del llamante<-descripcion difference()
    */
   public boolean isSubMultiSet (MultiSetIF<E> s);
}
