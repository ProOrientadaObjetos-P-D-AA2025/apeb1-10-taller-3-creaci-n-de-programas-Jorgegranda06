package problema_3;


public class Problema_3_InstitucionEducativaBase {
    private String nombre;
    private String tipoInst;
    private int numeroAlum;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosPorEstudiante;
    private double presupuesto;

    public Problema_3_InstitucionEducativaBase(String nombre, String tipoInstitucion,
                                               int numeroAlumnos, int numeroDocentes,
                                               int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipoInst = tipoInstitucion;
        this.numeroAlum = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto(); 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInst = tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlum = numeroAlumnos;
        calcularPresupuesto(); 
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto(); 
    }

    private void calcularPresupuesto() {
        presupuesto = numeroAlum * gastosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s\nTipo de Institucion: %s\nNumero de Alumnos:"
                        + " %d\nNumero de Docentes: %d\nNumero de Sedes: "
                        + "%d\nGasto Proyectado por Estudiante: %.2f\n"
                        + "Presupuesto Total: %.2f",
                nombre, tipoInst, numeroAlum, numeroDocentes, numeroSedes,
                gastosPorEstudiante, presupuesto);
    }
}

