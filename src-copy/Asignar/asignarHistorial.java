package Asignar;
import Pacientes.pacienteLista;
import Pacientes.pacienteHistorial;
import Pacientes.altaPaciente;

public class asignarHistorial
{
    public pacienteLista currentNode1h;
    public pacienteHistorial currentNode2;
    public int terminacion = 0;
    public int error= 0;
    public int iterador=0;
    /**
     * constructor que actualiza el expediente/historial clinico de un paciente.
     *
     * @pre en el paciente debe de estar en la lista.
     * @param list la lista con todos los pacientes y sus historiales.
     * @param NombreP nombre del paciente.
     * @param NombreM nombre del medico/enfermero.
     * @param anotacion anotacion del medico/enfermero.
     * @param Tratamiento Tratamiento que requirio el paciente.
     * @param cadenaHoras fecha y hora de la cita.
     * @param uci requirio el paciente de uci?.
     * @param seguroMedico el paciente tiene seguro Medico.
     */
    public asignarHistorial(altaPaciente list,String NombreP, String NombreM,String anotacion,String Tratamiento,String cadenaHoras,boolean uci,boolean seguroMedico,String Prueba){
        currentNode1h = list.head;
        terminacion =0;
        error=0;
         while (currentNode1h != null) {
               if (currentNode1h.Nombre.equals(NombreP)) {
                    // El nombre coincide, sal del bucle
                   break;
              } else {
                    // Continuar con el siguiente nodo
                  currentNode1h = currentNode1h.next;
              }
        }
        
        if (currentNode1h == null){
        System.out.println("no existe el paciente:"+NombreP);
        while(currentNode1h!=null){
            System.out.println(currentNode1h.Nombre+",");
            currentNode1h=currentNode1h.next;
        }
        }else{
        if(currentNode1h.next2 == null){
            pacienteHistorial newNode = new pacienteHistorial(NombreM,anotacion, Tratamiento, cadenaHoras,uci, seguroMedico,Prueba); 
            currentNode1h.next2=newNode;
        }else{
            currentNode2=currentNode1h.next2;
            while(currentNode2.next!=null){currentNode2=currentNode2.next;}
            pacienteHistorial newNode = new pacienteHistorial(NombreM,anotacion, Tratamiento, cadenaHoras,uci, seguroMedico,Prueba);
            currentNode2.next=newNode;
        }
        }
    }
}
