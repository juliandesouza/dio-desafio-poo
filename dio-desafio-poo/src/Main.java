import edu.juliandesouza.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Básico");
        curso1.setCargaHoraria(180);

        System.out.println(curso1);

    }
}
