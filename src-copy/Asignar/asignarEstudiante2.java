package Asignar;
import empleados.*;

public class asignarEstudiante2 {

    public asignarEstudiante2(String nombreE, String nombreP, LinkedListMedico list1, LinkedListEnfermeria list2, LinkedListEstudiante list3) {
        medicoNodo currentNode1 = list1.head;
        EnfermeriaNodo currentNode2 = list2.head;
        estudianteNodo currentNode3 = list3.head;
        boolean found = false;
        
        // Primero localiza al estudiante
        while (currentNode3 != null) {
            if (currentNode3.nombre.equals(nombreE)) {
                found = true;
                break;
            } else {
                currentNode3 = currentNode3.next;
            }
        }
        
        if (!found) {
            System.out.println("No existe el estudiante");
            return;
        }
        
        // Resetea found para la siguiente búsqueda
        found = false;

        // Verifica si el profesor es un medico
        if (currentNode3.med) {
            while (currentNode1 != null) {
                if (currentNode1.nombre.equals(nombreP)) {
                    found = true;
                    break;
                } else {
                    currentNode1 = currentNode1.next;
                }
            }

            if (found) {
                currentNode1.estudiante = currentNode3;
                System.out.println("Estudiante asignado al médico.");
            } else {
                System.out.println("No existe el profesor médico");
            }
        } else {
            // Verifica si el profesor es un enfermero
            while (currentNode2 != null) {
                if (currentNode2.nombre.equals(nombreP)) {
                    found = true;
                    break;
                } else {
                    currentNode2 = currentNode2.next;
                }
            }

            if (found) {
                currentNode2.estudiante = currentNode3;
                System.out.println("Estudiante asignado al enfermero.");
            } else {
                System.out.println("No existe el profesor enfermero");
            }
        }
    }
}
