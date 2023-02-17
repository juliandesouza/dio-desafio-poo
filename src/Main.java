
import java.time.LocalDate;

import edu.juliandesouza.desafio.dominio.Bootcamp;
import edu.juliandesouza.desafio.dominio.Curso;
import edu.juliandesouza.desafio.dominio.Dev;
import edu.juliandesouza.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Básico");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Programação Orientada");
        curso2.setDescricao("Básico");
        curso2.setCargaHoraria(2);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Orientação a Objetos");
        mentoria.setDescricao("Básico");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Voltado para iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulian = new Dev();
        devJulian.setNome("Julian");
        devJulian.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Julian" + devJulian.getConteudosInscritos());
        devJulian.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Julian" + devJulian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Julian" + devJulian.getConteudosConcluidos());
        System.out.println("XP:" + devJulian.calcularTotalXp());
        
        System.out.println("--------------------");
        
        Dev devFagner = new Dev();
        devFagner.setNome("Fagner");
        devFagner.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Fagner" + devFagner.getConteudosInscritos());
        devFagner.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos de Fagner" + devFagner.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Fagner" + devFagner.getConteudosConcluidos());
        System.out.println("XP:" + devFagner.calcularTotalXp());
        
        
    }
    
}
