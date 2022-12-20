package practica3;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Puerto Belen");
        direccion1.setNum(10);
        direccion1.setPiso(1);
        direccion1.setLetra("A");
        direccion1.setCodPos(11630);
        direccion1.setLocalidad("Arcos de la Frontera");
        direccion1.setProvincia("Cádiz");

        Direccion direccion2 = new Direccion();
        direccion1.setCalle("Peral");
        direccion1.setNum(54);
        direccion1.setPiso(2);
        direccion1.setLetra("C");
        direccion1.setCodPos(11630);
        direccion1.setLocalidad("Arcos de la Frontera");
        direccion1.setProvincia("Cádiz");

        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Luis");
        alumno1.setApellidos("Garcia Merino");
        alumno1.setEdad(20);
        alumno1.setRepetidor(false);
        alumno1.setNotamed(7.8f);
        alumno1.setCorreo("luigm@gmail.com");
        alumno1.setDireccion(direccion1);


        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Manuel");
        alumno2.setApellidos("Soto Lara");
        alumno2.setEdad(21);
        alumno2.setRepetidor(true);
        alumno2.setNotamed(5.8f);
        alumno2.setCorreo("manusola@gmail.com");
        alumno2.setDireccion(direccion2);
    }
}
