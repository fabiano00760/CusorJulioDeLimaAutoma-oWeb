package executores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robos.GaiaRobo;

public class PaginaInicialTest {

    @Test
    @DisplayName("validando se o titulo da pagina esta correto")
    public void ValidaTituloDaPagina() throws InterruptedException {

        GaiaRobo driver = new GaiaRobo();

        driver.acessaSaitChamado("http://www.juliodelima.com.br/taskit");
        String tituloDapagina = driver.tituloPagina();
        driver.fecharSait();
        System.out.println(tituloDapagina);
        Assertions.assertEquals("Task it!",tituloDapagina);





    }
}
