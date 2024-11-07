import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);

        Curso curso2 = new Curso("Curso JavaScript", "Descrição curso JavaScript", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java",LocalDate.now().plusDays(1));

        Bootcamp bootcamp = new Bootcamp(60);
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);

        Dev dev1 = new Dev("Camila", "123456789-10");

        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamps Inscritos Camila:" + dev1.getBootcampsInscritos());
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        System.out.println("-");

        dev1.progredir(bootcamp);
        dev1.progredir(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        Dev dev2 = new Dev("João", "987654321-10");

        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Bootcamps Inscritos João:" + dev2.getBootcampsInscritos());
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        System.out.println("-");

        dev2.progredir(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}
