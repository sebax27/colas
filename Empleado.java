public class Empleado {
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(String apellido, String nombre, int salario) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(){

    }

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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    
}
