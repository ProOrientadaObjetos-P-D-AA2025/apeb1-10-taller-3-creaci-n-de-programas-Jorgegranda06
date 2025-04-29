package problema_3;

import java.util.Random;


public class Problema_3_InstitucionEducativaEjecutor {
     public static void main(String[] args) {
        Random random = new Random();

        String[] tipos = {"Colegio", "Instituto", "Universidad", "Escuela"};
        String nombre = "Instituto Educativo Juan Jose Flores";
        String tipoInstitucion = tipos[random.nextInt(tipos.length)];
        int numeroAlumnos = 300 + random.nextInt(1000); 
        int numeroDocentes = 50 + random.nextInt(900); 
        int numeroSedes = 5 + random.nextInt(10); 
        double gastosPorEstudiante = 900 + random.nextDouble() * 2500; 

        Problema_3_InstitucionEducativaBase institucion = 
                new Problema_3_InstitucionEducativaBase(
                nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, 
                        numeroSedes, gastosPorEstudiante);

        System.out.println(institucion);
    }
}

