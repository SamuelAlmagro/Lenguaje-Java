package empleados;

public class AgendaNodo2 extends AgendaPadre
{
    public AgendaNodo2 next;//puntero siguiente nodo de agenda
    
         /**
     * constructor inserta una entrada en la agenda de un medico
     * 
     * @pre ninguno de los parametros es null.
     * @param nombrepaciente nombre del paciente.
     * @param anotacion anotacion del enf.
     * @param tratamiento tratamiento del paciente.
     * @param cadenaHoras fecha+hora.
     **/
    public AgendaNodo2(String nombrepaciente, String Prueba, String tratamiento, String cadenaHoras){
        super();
        this.nombrePaciente=nombrepaciente;
        this.cadenaHoras=cadenaHoras;
        this.tratamiento=tratamiento;
        this.Prueba=Prueba;
        this.next=null;
        
    }
}
