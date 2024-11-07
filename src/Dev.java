import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private final String nome;
    private final String cpf;
    private Set<Bootcamp> bootcampsInscritos = new LinkedHashSet<>();
    private Set<Bootcamp> bootcampsConcluidos = new HashSet<>();

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    public Dev(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.bootcampsInscritos.add(bootcamp);
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(Bootcamp bootcamp) {
        if (bootcampsInscritos.contains(bootcamp)) {
            Optional<Conteudo> conteudo = conteudosInscritos.stream()
                    .filter(c -> bootcamp.getConteudos().contains(c))
                    .findFirst();

            conteudo.ifPresentOrElse(c -> {
                conteudosInscritos.remove(c);
                conteudosConcluidos.add(c);
            }, () -> System.err.println("Você não está matriculado em nenhum conteúdo!"));
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Set<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public Set<Bootcamp> getBootcampsConcluidos() {
        return bootcampsConcluidos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
