package empleados;

public class AgendaNodo extends AgendaPadre
{
    public AgendaNodo next;//puntero a siguiente nodo de enf
         /**
     * constructor inserta una entrada en la agenda de un enfermero
     * 
     * @pre ninguno de los parametros es null.
     * @param nombrepaciente nombre del paciente.
     * @param anotacion anotacion del enf.
     * @param tratamiento tratamiento del paciente.
     * @param cadenaHoras fecha+hora.
     **/
    public AgendaNodo(String nombrepaciente, String Prueba, String tratamiento, String cadenaHoras){
        super();
        this.nombrePaciente=nombrepaciente;
        this.cadenaHoras=cadenaHoras;
        this.tratamiento=tratamiento;
        this.Prueba=Prueba;
        this.next=null;
        
    }
}
