import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java Spring Boot");
        curso1.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria voltada a boas práticas SOLID");
        mentoria1.setTitulo("Solid");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        conteudo.setTitulo("JavaScript");
        conteudo.setDescricao("Curso de JavaScript");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Dio - Java Developer");
        bootcamp.setDescricao("Voltado para estudos e prativa de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev developer1 = new Dev();
        developer1.setNome("Sara");
        System.out.println(developer1.getNome());
        developer1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + developer1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + developer1.getConteudosConcluidos());
        System.out.println("XP: "+ developer1.calcularTotalXp());

        System.out.println("--------------------------------");
        Dev developer2 = new Dev();
        developer2.setNome("João");
        System.out.println(developer2.getNome());
        developer2.inscreverBootcamp(bootcamp);
        developer2.progredir();
        developer2.progredir();
        System.out.println("Conteúdos Inscritos: " + developer2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + developer2.getConteudosConcluidos());
        System.out.println("XP: "+ developer2.calcularTotalXp());
    }
}