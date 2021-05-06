/* -------------------

   O Enum cria uma padronização no código.

   Se futuramente eu quiser que a descrição 
   retornada seja outra, basta alterar aqui.

                                ------------------- */

public enum Estado {

    AC("Acre"),
    AL("Alagoas"),
    AP("Amapá"),
    AM("Amazonas"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MT("Mato Grosso"),
    MS("Mato Grosso do Sul"),
    MG("Minas Gerais"),
    PA("Pará"),
    PB("Paraíba"),
    PR("Paraná"),
    PE("Pernambuco"),
    PI("Piauí"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    RO("Rondônia"),
    RR("Roraima"),
    SC("Santa Catarina"),
    SP("São Paulo"),
    SE("Sergipe"),
    TO("Tocantins");

    String descricao;

    Estado(String descricao) {            // construtor (usado pelo próprio Enum)
        this.descricao = descricao;
    }

    public String getDescricao() {        // método getter
        return descricao;
    }

    /*  -----------------
        Método Setter não se aplica a Enums
                             -------------- */

}
