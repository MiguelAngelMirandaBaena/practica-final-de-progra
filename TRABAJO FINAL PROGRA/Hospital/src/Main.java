import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //hospital
        Hospital cochabamba = new Hospital("HPTSLHLL", "MIRANDA" ,"Cochabamba","44447535","CIRUGIAS","JHONN");

        //paciente
        Paciente carlos = new Paciente ("6666","MIKE","SULLIVAN","MAYERS","50002300005","12/02/1999","8855325");

        //visitas
        Visita familiares = new Visita ("51","10/05/2022 23:41","CORDES","EXTIRPACION DE APENDICE","RAUL GUTIERREZ","APENDICE EXTIRPADO","REPOSO EN CAMA","32","18/5/2022","DOLORES EN EL INTESTINO");

        System.out.println("HOSPITAL");

        System.out.println(cochabamba.getCodHospital());
        System.out.println(cochabamba.getNombre());
        System.out.println(cochabamba.getCiudad());
        System.out.println(cochabamba.getTelefono());
        System.out.println(cochabamba.getServicios());
        System.out.println(cochabamba.getDirector());

        System.out.println("PACIENTE");

        System.out.println(carlos.getCodPaciente());
        System.out.println(carlos.getNombre());
        System.out.println(carlos.getPrimerApellido());
        System.out.println(carlos.getSegundoApellido());
        System.out.println(carlos.getDNI());
        System.out.println(carlos.getFechaNacimiento());
        System.out.println(carlos.getNumeroSeguridadSocial());

        System.out.println("VISITA");

        System.out.println(familiares.getCodVisita());
        System.out.println(familiares.getFechaHora());
        System.out.println(familiares.getHospital());
        System.out.println(familiares.getServicio());
        System.out.println(familiares.getMedico());
        System.out.println(familiares.getDiagnostico());
        System.out.println(familiares.getTratamiento());
        System.out.println(familiares.getNumeroCama());
        System.out.println(familiares.getFechaSalida());
        System.out.println(familiares.getHistorial());
            }
}
