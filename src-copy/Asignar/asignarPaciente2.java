package Asignar;
import empleados.*;
import Pacientes.*;
import java.util.Scanner;

public class asignarPaciente2
{   
    public EnfermeriaNodo currentNode1;
        public medicoNodo currentNode1_2;

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
    public asignarPaciente2(EnfermeriaNodo enfermero, Pacientes_nodo paciente, altaPaciente list3){
        int error=0;
        int terminacion=0;
        
        System.out.print("ejecutado enferemero");
        
        
        Scanner scanner = new Scanner(System.in);
        
            if(enfermero.next2 == null){
                    AgendaNodo newNode = new AgendaNodo(paciente.Nombre, paciente.Prueba, paciente.Tratamiento, paciente.cadenaHoras);
                    
                    //historial
                    System.out.print("paciente:"+paciente.Nombre+"Ingrese su anotacion: ");
                    String anotacion = scanner.nextLine();
                    asignarHistorial newHistorial = new asignarHistorial(list3,paciente.Nombre, enfermero.nombre,anotacion, paciente.Tratamiento,paciente.cadenaHoras,paciente.uci, paciente.seguroMedico,paciente.Prueba);
                    
                    enfermero.next2 = newNode;
                    terminacion = 1;
            }else{
                    currentNode3 = enfermero.next2;

                    while(currentNode3 != null){
                    if(currentNode3.cadenaHoras == paciente.cadenaHoras){error=1;}
                    currentNode3 = currentNode3.next;
                    }
                    
                    if(error == 1){
                        error = 0;
                        terminacion = 1;
                    }else{
                        currentNode3 = enfermero.next2;
                        while(currentNode3.next != null){currentNode3 = currentNode3.next;}
                        AgendaNodo newNode = new AgendaNodo(paciente.Nombre, paciente.Prueba, paciente.Tratamiento, paciente.cadenaHoras);
                        
                        //historial
                        System.out.print("paciente"+paciente.Nombre+"Ingrese su anotacion: ");
                        String anotacion = scanner.nextLine();
                        asignarHistorial newHistorial = new asignarHistorial(list3,paciente.Nombre, enfermero.nombre,anotacion, paciente.Tratamiento,paciente.cadenaHoras,paciente.uci, paciente.seguroMedico,paciente.Prueba);
                        
                        currentNode3.next = newNode;
                        terminacion = 1;
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
public asignarPaciente2(medicoNodo medico, Pacientes_nodo paciente, altaPaciente list3){
        int error=0;
        int terminacion=0;
        
        Scanner scanner = new Scanner(System.in);
        
            if(medico.next2 == null){
                    AgendaNodo2 newNode = new AgendaNodo2(paciente.Nombre, paciente.Prueba, paciente.Tratamiento, paciente.cadenaHoras);
                    
                    //historial
                    System.out.print("paciente:"+paciente.Nombre+"Ingrese su anotacion: ");
                    String anotacion = scanner.nextLine();
                    asignarHistorial newHistorial = new asignarHistorial(list3,paciente.Nombre, medico.nombre,anotacion, paciente.Tratamiento,paciente.cadenaHoras,paciente.uci, paciente.seguroMedico,paciente.Prueba);
                    
                    medico.next2 = newNode;
                    terminacion = 1;
            }else{
                    currentNode3_2 = medico.next2;

                    while(currentNode3_2 != null){
                    if(currentNode3_2.cadenaHoras == paciente.cadenaHoras){error=1;}
                    currentNode3_2 = currentNode3_2.next;
                    }
                    
                    if(error == 1){
                        error = 0;
                        terminacion = 1;
                    }else{
                        currentNode3_2 = medico.next2;
                        while(currentNode3.next != null){currentNode3_2 = currentNode3_2.next;}
                        AgendaNodo2 newNode = new AgendaNodo2(paciente.Nombre, paciente.Prueba, paciente.Tratamiento, paciente.cadenaHoras);
                        
                        //historial
                        System.out.print("paciente"+paciente.Nombre+"Ingrese su anotacion: ");
                        String anotacion = scanner.nextLine();
                        asignarHistorial newHistorial = new asignarHistorial(list3,paciente.Nombre, medico.nombre,anotacion, paciente.Tratamiento,paciente.cadenaHoras,paciente.uci, paciente.seguroMedico,paciente.Prueba);
                        
                        currentNode3_2.next = newNode;
                        terminacion = 1;
                    }

            }
        
        
    }
}
