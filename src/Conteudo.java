public abstract class Conteudo {
    protected static final double XP = 10d;

    private String titulo;
    private String descricao;

    public Conteudo() {
        this.titulo = "Não definido.";
        this.descricao = "Não definido.";
    }

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
