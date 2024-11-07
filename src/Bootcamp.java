import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal;

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(int duracaoDias) {
        this.nome = "Não definido.";
        this.descricao = "Não definido.";
        this.dataFinal = dataInicial.plusDays(duracaoDias);
    }

    public Bootcamp(String nome, String descricao, int duracaoDias) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataFinal = dataInicial.plusDays(duracaoDias);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void addDevInscrito(Dev dev) {
        this.devsInscritos.add(dev);
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
