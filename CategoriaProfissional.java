public class CategoriaProfissional {

    private Integer id;
    private String descricao;

    /*  -----------------
        Como são poucas propriedades, é possível passa-los
        já na instanciação do objeto da classe.
                                            -------------- */

    public CategoriaProfissional(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    /*  -----------------
        Getters and Setters
                    -------------- */

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

}
