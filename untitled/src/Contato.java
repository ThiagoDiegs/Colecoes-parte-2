import java.util.Objects;

public class Contato implements Comparable<Contato>{

    private String nome;
    private String sexo;

    public Contato(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
/*

serve para converter em texto

 */
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contato Contato) {
        return this.sexo.compareTo(Contato.getNome());
    }

    public void add(Contato contato) {
    }
}

