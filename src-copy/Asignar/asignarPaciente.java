package Asignar;
import empleados.*;
import Pacientes.*;
import java.util.Scanner;

public class asignarPaciente
{   
    public EnfermeriaNodo currentNode1;
        public medicoNodo currentNode1_2;
    public EnfermeriaNodo cabeza;
        public medicoNodo cabeza_2;
    public Pacientes_nodo currentNode2;
    public AgendaNodo currentNode3;
        public AgendaNodo2 currentNode3_2;
    
    /**
     * constructor que asigna un paciente a un enfermero.
     *
     * @pre en el nodo de paciente med=false.
     * @pre el nodo de pacinete != null.
     * @param la lista con todos los enfermeros.
     * @param un nodo Pacientes_nodo (es la lista de los pacientes a tratar).
     * @param la lista de pacientes(esto es el historial).
     */
    public asignarPaciente(LinkedListEnfermeria list1, Pacientes_nodo paciente, altaPaciente list3){
        int error=0;
        int terminacion=0;
        
        currentNode1 = list1.head;
        cabeza = list1.head;
        currentNode2 = paciente;
        
        Scanner scanner = new Scanner(System.in);
        
        while(terminacion != 1){
            
            while(currentNode1.especialidad != currentNode2.Tratamiento && currentNode1.next != null){
                currentNode1 = currentNode1.next;
            }
            
            if(currentNode1.next2 == null){
                    AgendaNodo newNode = new AgendaNodo(currentNode2.Nombre, currentNode2.Prueba, currentNode2.Tratamiento, currentNode2.cadenaHoras);
                    
                    //historial
                    System.out.print("paciente"+currentNode2.Nombre+"Ingrese su anotacion: ");
                    String anotacion = scanner.nextLine();
                    asignarHistorial newHistorial = new asignarHistorial(list3,currentNode2.Nombre, currentNode1.nombre,anotacion, currentNode2.Tratamiento,currentNode2.cadenaHoras,currentNode2.uci, currentNode2.seguroMedico,currentNode2.Prueba);
                    
                    currentNode1.next2 = newNode;
                    currentNode1 = list1.head;
                    terminacion = 1;
            }else{
                    currentNode3 = currentNode1.next2;

                    while(currentNode3 != null){
                    if(currentNode3.cadenaHoras == currentNode2.cadenaHoras){error=1;}
                    currentNode3 = currentNode3.next;
                    }
                    
                    if(error == 1){
                        error = 0;
                        currentNode1 = currentNode1.next;
                        if(currentNode1 == null){terminacion = 1;}
                    }else{
                        currentNode3 = currentNode1.next2;
                        while(currentNode3.next != null){currentNode3 = currentNode3.next;}
                        AgendaNodo newNode = new AgendaNodo(currentNode2.Nombre, currentNode2.Prueba, currentNode2.Tratamiento, currentNode2.cadenaHoras);
                        
                        //historial
                        System.out.print("paciente"+currentNode2.Nombre+"Ingrese su anotacion: ");
                        String anotacion = scanner.nextLine();
                        asignarHistorial newHistorial = new asignarHistorial(list3,currentNode2.Nombre, currentNode1.nombre,anotacion, currentNode2.Tratamiento,currentNode2.cadenaHoras,currentNode2.uci, currentNode2.seguroMedico,currentNode2.Prueba);
                        
                        currentNode3.next = newNode;
                        terminacion = 1;
                    }

            }
        
        }
    }
        /**
     * constructor que asigna un paciente a un medico.
     *
     * @pre en el nodo de paciente med=true.
     * @pre el nodo de pacinete != null.
     * @param list1 la lista con todos los medicos.
     * @param paciente un nodo Pacientes_nodo (es la lista de los pacientes a tratar).
     * @param list3 la lista de pacientes(esto es el historial).
     */
    public asignarPaciente(LinkedListMedico list1, Pacientes_nodo paciente, altaPaciente list3){
        int error=0;
        int terminacion=0;
        
        currentNode1_2 = list1.head;
        cabeza_2 = list1.head;
        currentNode2 = paciente;         
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("se ha ejecutado asignarPacientemed");
        
        while(terminacion != 1){
            
            while(currentNode1_2.especialidad != currentNode2.Tratamiento && currentNode1_2.next != null){
                currentNode1_2 = currentNode1_2.next;
            }
            
            if(currentNode1_2.next2 == null){
                    AgendaNodo2 newNode = new AgendaNodo2(currentNode2.Nombre, currentNode2.Prueba, currentNode2.Tratamiento, currentNode2.cadenaHoras);
                    //historial
                    System.out.print("Ingrese su anotacion: ");
                    String anotacion = scanner.nextLine();
                    asignarHistorial newHistorial = new asignarHistorial(list3,currentNode2.Nombre, currentNode1_2.nombre,anotacion, currentNode2.Tratamiento,currentNode2.cadenaHoras,currentNode2.uci, currentNode2.seguroMedico,currentNode2.Prueba);
                    
                    currentNode1_2.next2 = newNode;
                    currentNode1_2 = list1.head;
                    terminacion = 1;
                    System.out.println("ha metido dato en med");
            }else{
                    currentNode3_2 = currentNode1_2.next2;

                    while(currentNode3_2 != null){
                    if(currentNode3_2.cadenaHoras == currentNode2.cadenaHoras){error=1;}
                    currentNode3_2 = currentNode3_2.next;
                    }
                    
                    if(error == 1){
                        error = 0;
                        currentNode1_2 = currentNode1_2.next;
                        if(currentNode1_2 == null){terminacion = 1;}
                    }else{
                        currentNode3_2 = currentNode1_2.next2;
                        while(currentNode3_2.next != null){currentNode3_2 = currentNode3_2.next;}
                        AgendaNodo2 newNode = new AgendaNodo2(currentNode2.Nombre, currentNode2.Prueba, currentNode2.Tratamiento, currentNode2.cadenaHoras);
                        
                        //historial
                        System.out.print("Ingrese su anotacion: ");
                        String anotacion = scanner.nextLine();
                        asignarHistorial newHistorial = new asignarHistorial(list3,currentNode2.Nombre, currentNode1_2.nombre,anotacion, currentNode2.Tratamiento,currentNode2.cadenaHoras,currentNode2.uci, currentNode2.seguroMedico,currentNode2.Prueba);
                        
                        currentNode3_2.next = newNode;
                        currentNode1_2 = list1.head;
                        terminacion = 1;
                        System.out.println("ha metido dato en med");
                    }

            }
        
        }
    }
}
