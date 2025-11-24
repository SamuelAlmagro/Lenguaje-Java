public class  apuntes_tema1_A{}
/**
 * =====================
 * INTERFACES
 * =====================
 * interfaces Java->representa un TAD
 *  -no lo completa es solo una descripcion del TAD indicando que hace cada metodo
 * las descripciones son:
 *  -@param->descripción parámetros
 *  -@return->descripción valor devuelto (si procede)
 *  -@pre-> precondición
 *  -@post->postcondición
 *  
 *  precondición:
 *      -que espera el metodo en su entrada(basicamente los datos que le enviamos)
 *      -el metodo no comprueba la precondicion
 *      -¿quien comprueba? el que llama al metodo
 *  postcondicion
 *      -que sale nuestro metodo
 *  
 * definiremos los unos TAD en funcion de otros
 *      -esto se hara por relacion de extension:
 *          -Lista->Extiende Secuencia->Extiende Colecion
 *          -es decir el interfaz de lista sera una extension del de secuencia y a su vez este de colecion
 *      -Cada Tad tendra nombres distintos dependiendo de las operaciones
 *          -almacenar->distinto nombre si es para lista o pila
 *              -lista->se llama insertar
 *              -pila->se llama apilar
 * importante es remarcar que un interfaz no es ejecutable es decir no tiene codigo solo es una estructura de apoyo
 */


/**
 * =======================
 * ITERADORES
 * =======================
 * los iteradores son:
 *      -sencillos de usar
 *      -eficientes
 *      -costosos de producir
 *      -pueden violar la semantica del TAD
 * las operaciones que realiza un iterador si HAY ELEMTOS POR RECORRER son:
 *      -da el siguente elemento
 *      -vuelve a situarte al principio
 *  
 */

/**
 * =======================
 * COLECCIONES
 * =======================
 * sin restricciones solo importa si un elemento esta o no
 *      -TODOS los demas TAD extienden la coleccion es decir que las operaciones que definamos en coleccion van a tener que ser implementadas por todos los TAD de la coleccio
 * operaciones:
 *      -añadir,elminar,obtener y modificar elementos
 *      -tamaño(decir el tamaño)
 *      -vaciar
 *      -pertenece un elemnto
 *  
 */

/**
 * =======================
 * COLECTOR
 * =======================
 * son un tipo de coleccion y por lo tanto tienen que cumplir con todas las caracteristicas y operaciones de una coleccion
 * ademas tienen como caracteristicas:
 *      -son colecciones de elementos sin orden entre si
 *          -importa si un elemento esta o no
 *          -se pueden añadir y quitar elementos
 *      -habria que añadir las operaciones:
 *          -añadir elemento
 *          -eliminar elemento existente
 *          -recorer elementos
 */

/**
 * =======================
 * CONJUNTO
 * =======================
 * son un tipo de contenedor y por lo tanto cumple con todas sus caracteristicas y operaciones
 * ademas tienen como caracteristicas:
 *      -cada elemento esta solo una vez
 * operaciones:
 *      -conjuntivistas:union, intersecion, diferencia
 *      -comprobar si es subconjunto de otro
 */

/**
 * =======================
 * MULICONJUNTO
 * =======================
 * son un tipo de Conjunto y por lo tanto cumple con todas sus caracteristicas y operaciones
 * ademas tienen como caracteristicas:
 *      -puede haber varias instancias de cada elementossss
 * operaciones:
 *      -MiltiConjuntivistas:union, intersecion, diferencia
 *      -comprobar si es submulticonjunto de otro
 *      -obtener multiplicidad de un elemento
 *      -añadir varias instancias de un elemento
 *      -eliminar varias instancias de un elemento
 * diferencias conjunto vs multiconjunto
 *      -si tanto en un conjunto como un multiconjunto tenemos un elemento "1" e intentamos
 *      -añadir otra vez el elemento tanto al multiconjunto como a conjunto obtenemos:
 * ====================================
 * conjunto     |       multiconjunto
 * ====================================
 * 1            |                     1     <-antes de añadir el 1 extra
 * ====================================
 * 1            |                    11     <-despues de añadir el 1 extra
 * ====================================
 * el conjunto no cambia ya que no permite multiples instancias de un elemento sin embargo el multiconjunto si lo permite
 */
