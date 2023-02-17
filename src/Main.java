
import java.time.LocalDate;

import edu.juliandesouza.desafio.dominio.Curso;
import edu.juliandesouza.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Básico");
        curso1.setCargaHoraria(180);
        
        System.out.print(curso1);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Orientação a Objetos");
        mentoria1.setDescricao("Básico");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
        
    }
    
}
