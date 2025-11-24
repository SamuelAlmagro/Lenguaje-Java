package Asignar;
import empleados.*;

public class asignarEstudiante {
    public EnfermeriaNodo currentNode1;
    public medicoNodo currentNode2;
    public estudianteNodo currentNode3;
    public int terminacion;
    /**
     * constructor que asigna estudantes a enfermeros.
     *
     * @pre lista no vacia (list1).
     * @pre nodo no vaci0 (estudiante).
     * @pre nodo estudiante.med == false.
     * @param list1 la lista con todos los enfermeros.
     * @param estudiante nodo con la informacion del estudiante.
     */
        public asignarEstudiante(LinkedListEnfermeria list1, estudianteNodo estudiante) {
        currentNode1 = list1.head;
        currentNode3 = estudiante;
        terminacion = 0;
        
            while(currentNode1 != null && terminacion != 1){
                if(currentNode1.estudiante == null && currentNode1.especialidad==currentNode3.especialidad){
                    currentNode1.estudiante=currentNode3;
                    terminacion = 1;
                }else{
                    currentNode1=currentNode1.next;
                }
            }
            if(currentNode1==null){
                System.out.println("no hay enfermero para estudiante");
            }
        }
                    /**
     * constructor que asigna estudantes a enfermeros.
     *
     * @pre lista no vacia (list1).
     * @pre nodo no vaci0 (estudiante).
     * @pre nodo estudiante.med == true.
     * @param list1 la lista con todos los medicos.
     * @param estudiante nodo con la informacion del estudiante.
     */
        public asignarEstudiante(LinkedListMedico list1, estudianteNodo estudiante) {
        currentNode2 = list1.head;
        currentNode3 = estudiante;
        terminacion = 0;
        
            while(currentNode2 != null && terminacion != 1){
                if(currentNode2.estudiante == null && currentNode2.especialidad==currentNode3.especialidad){
                    currentNode2.estudiante=currentNode3;
                    terminacion = 1;
                }else{
                    currentNode2=currentNode2.next;
                }
            }
            if(currentNode2==null){
                System.out.println("no hay enfermero para estudiante");
            }
        }
}
