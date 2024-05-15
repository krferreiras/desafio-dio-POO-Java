package br.com.krferreiras.desafio.dominio.application;

import br.com.krferreiras.desafio.dominio.entities.Bootcamp;
import br.com.krferreiras.desafio.dominio.entities.Curso;
import br.com.krferreiras.desafio.dominio.entities.Dev;
import br.com.krferreiras.desafio.dominio.entities.Mentoria;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desafio de Código Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Desafio de Código Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        Dev devKaioRodrigo = new Dev();
        devKaioRodrigo.setNome("Kaio Rodrigo");
        devKaioRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Aluno: "
                + devKaioRodrigo.getNome()
                + "\nConteúdos inscritos\n"
                + devKaioRodrigo.getConteudoInscritos());
        devKaioRodrigo.progredir();
        devKaioRodrigo.progredir();
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Aluno: "
                + devKaioRodrigo.getNome()
                + "\nConteúdos inscritos\n"
                + devKaioRodrigo.getConteudoInscritos());
        System.out.println("Aluno: "
                + devKaioRodrigo.getNome()
                + "\nConteúdos concluídos\n"
                + devKaioRodrigo.getConteudoConcluidos());
        System.out.println("XP: " + devKaioRodrigo.calcularTotalXp());


        System.out.println("===========================");

        Dev devRodrigoKaio = new Dev();
        devRodrigoKaio.setNome("Rodrigo Kaio");
        devRodrigoKaio.inscreverBootcamp(bootcamp);
        System.out.println("Aluno: "
                + devRodrigoKaio.getNome()
                + "\nConteúdos inscritos\n"
                + devRodrigoKaio.getConteudoInscritos());
        devRodrigoKaio.progredir();
        devRodrigoKaio.progredir();
        devRodrigoKaio.progredir();
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Aluno: "
                + devRodrigoKaio.getNome()
                + "\nConteúdos inscritos\n"
                + devRodrigoKaio.getConteudoInscritos());
        System.out.println("Aluno: "
                + devRodrigoKaio.getNome()
                + "\nConteúdos concluídos\n"
                + devRodrigoKaio.getConteudoConcluidos());
        System.out.println("XP: " + devRodrigoKaio.calcularTotalXp());


    }
}
