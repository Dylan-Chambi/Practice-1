package ejercicio2;

public class Docente implements IDocente {
    private String nombre;
    private String apellido;
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcadoHoraEntrada;
    private String marcadoHoraSalida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraEntrada() {
        return marcadoHoraEntrada;
    }

    public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
        this.marcadoHoraEntrada = marcadoHoraEntrada;
    }

    public String getMarcadoHoraSalida() {
        return marcadoHoraSalida;
    }

    public void setMarcadoHoraSalida(String marcadoHoraSalida) {
        this.marcadoHoraSalida = marcadoHoraSalida;
    }

    public void showInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Carga horaria: " + this.cargaHoraria);
        System.out.println("Curso educacion superior: " + this.cursoEducacionSuperior);
        System.out.println("Acceso plataforma: " + this.accesoPlataforma);
        System.out.println("Marcado biometrico: " + this.marcadoBiometrico);
        System.out.println("Marcado hora entrada: " + this.marcadoHoraEntrada);
        System.out.println("Marcado hora salida: " + this.marcadoHoraSalida);
    }

    @Override
    public Docente clone() {
        Docente clone = new Docente();
        clone.setNombre(this.getNombre());
        clone.setApellido(this.getApellido());
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMarcadoBiometrico(this.isMarcadoBiometrico());
        clone.setMarcadoHoraEntrada(this.getMarcadoHoraEntrada());
        clone.setMarcadoHoraSalida(this.getMarcadoHoraSalida());
        return clone;
    }
}
