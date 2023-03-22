import desafio.dominio.Conteudo;
import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java Spring Boot");
        curso1.setCargaHoraria(2);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria voltada a boas práticas SOLID");
        mentoria1.setTitulo("Solid");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("JavaScript");
        conteudo.setDescricao("Curso de JavaScript");

        System.out.println(conteudo);
    }
}