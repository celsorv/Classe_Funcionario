/* -------------------

   O Enum cria uma padronização no código.

   Se futuramente eu quiser que Masculino.descricao
   retorne "Masculino", basta alterar aqui

                                ------------------- */

public enum Sexo {

    Masculino("M"),
    Feminino("F");

    String descricao;

    Sexo(String descricao) {            // construtor (usado pelo próprio Enum)
        this.descricao = descricao;
    }

    String getDescricao() {      // método getter
        return descricao;
    }

    /*  -----------------
        Método Setter não se aplica a Enums
                             -------------- */

}
