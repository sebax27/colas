
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola3 {

    private static final Scanner cp = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Empleado> lista = new LinkedList<>();
        int opt;
        do {

            Empleado em = new Empleado();

            System.out.println("Ingrese el nombre del empleado: ");
            em.setNombre(cp.next());

            System.out.println("Ingrese el apellido del empleado: ");
            em.setApellido(cp.next());

            System.out.println("Ingrese el salario del empleado: ");
            em.setSalario(cp.nextInt());

            lista.add(em);

            System.out.println("Desea agregar otro empleado? (1. si / 2. no)");
            opt = cp.nextInt();

        } while (opt != 2);

        Queue<Empleado> cola1 = new LinkedList<>();
        Queue<Empleado> cola2 = new LinkedList<>();
        Queue<Empleado> cola3 = new LinkedList<>();

        for (Empleado em : lista) {
            if (em.getSalario() > 0 && em.getSalario() < 2500000) {

                cola1.offer(em);

            } else if (em.getSalario() >= 2500000 && em.getSalario() < 3000000) {
                cola2.offer(em);
            } else {
                cola3.offer(em);
            }
        }

        System.out.println("\t\n--- cola #1 ---\n");
        Mostrar(cola1);
        System.out.println("\t\n--- cola #2 ---\n");
        Mostrar(cola2);
        System.out.println("\t\n--- cola #3 ---\n");
        Mostrar(cola3);
    }

    private static void Mostrar(Queue<Empleado> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola no tiene ningún empleado registrado.");
        } else {
            for (Empleado empleado : cola) {
                System.out.println("Nombre: " + empleado.getNombre() + "\n"
                        + "Apellido: " + empleado.getApellido() + "\n"
                        + "Salario: " + empleado.getSalario() + "\n");
            }
        }
    }
    
}
