import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Funcionario {

    /*  -----------------
        Não precisa do Construtor ?

        Java cria automaticamente um construtor padrão

        ... e passar tantas propriedades na instanciação
        talvez fique meio sem sentido.
                                          -------------- */

    private Integer id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private CategoriaProfissional categoria;
    private Sexo sexo;
    private String cidade;

    // private String uf;       // código refatorado
    private Estado uf;

    // poderia ser...
    // private Cidade cidade;   // com o Enum Estado dentro dela
    //

    public String getNomeCompleto() {
        return getNome().trim() + " " + getSobrenome();
    }

    public long getIdade() {
        if (getDataNascimento() == null) return -1;

        // idade é a diferença de hoje até a dataNascimento
        return ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

    @Override
    public String toString() {  // chamado, por exemplo, ao imprimir o objeto da classe
        return String.format(
                "Olá eu sou %s %s, tenho %d ano%s e sou da cidade de %s/%s",
                Sexo.Masculino.equals(getSexo()) ? "o" : "a",   // entra no 1o. %s da string
                getNomeCompleto(),                              // entra no 2o. %s da string
                getIdade(), getIdade() > 1 ? "s" : "",          // entra no %d da string
                getCidade(),                                    // entra no ultimo %s
                getUf()
        );
    }

    /*  -----------------
        Getters and Setters
             -------------- */

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}

    public Sexo getSexo() {return sexo;}
    public void setSexo(Sexo sexo) {this.sexo = sexo;}

//  -------------------------------------------- refatorado
//  public String getUf() {return uf;}
//  public void setUf(String uf) {this.uf = uf;}
// ---------------------------------------------------------
    public Estado getUf() {return uf;}
    public void setUf(Estado uf) {this.uf = uf;}

    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public CategoriaProfissional getCategoria() {return categoria;}
    public void setCategoria(CategoriaProfissional categoria) {this.categoria = categoria;}

}
