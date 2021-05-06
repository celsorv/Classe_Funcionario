/* ------------------------
   UNIVESP - Universidade Virtual do Estado de São Paulo
            
             Java e Programação Orientada a Objetos
                                ------------------------ */

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        CategoriaProfissional analista = new CategoriaProfissional(1, "Analista de Sistemas");
        CategoriaProfissional frontDev = new CategoriaProfissional(2, "Desenvolvedor Frontend");
        CategoriaProfissional backDev  = new CategoriaProfissional(3, "Desenvolvedor Backend");

        /* ----------------
           quando não tem um construtor
           o valor de cada propriedade tem que ser passada via método setter
                                                          ------------------ */
        Funcionario miguel = new Funcionario();
        miguel.setId(1);
        miguel.setNome("Miguel");
        miguel.setSobrenome("de Coimbra");
        miguel.setDataNascimento(LocalDate.of(1985, Month.JUNE, 8));
        miguel.setSexo(Sexo.Masculino);
        miguel.setCategoria(backDev);
        miguel.setCidade("Pirassununga");

        // tim.setUf("SP"); // código refatorado
        miguel.setUf(Estado.SP);


        Funcionario fabi = new Funcionario();
        fabi.setId(1);
        fabi.setNome("Fabiana");
        fabi.setSobrenome("da Costa");
        fabi.setDataNascimento(LocalDate.of(1981, Month.JUNE, 8));
        fabi.setCidade("Salvador");
        fabi.setSexo(Sexo.Feminino);
        fabi.setCategoria(frontDev);

        // fabi.setUf("ba"); // código refatorado
        fabi.setUf(Estado.BA);


        System.out.println("\n\n");
        System.out.println(fabi);
        System.out.println(miguel);
        System.out.println("\n\n");


        /* -------------
           Observe que a menos que eu trate no método setter da classe
           o estado tá recebendo minúsculas e maiúsculas

           Entendeu a importância do enum?
           ------------- */

    }
}
