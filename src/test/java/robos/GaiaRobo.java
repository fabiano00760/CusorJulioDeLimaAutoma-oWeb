package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {


    public GaiaRobo(){
     // o que estiver  sera executado no new
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }


    private ChromeDriver driver ;//criação de propriedade

    public void acessaSaitChamado(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
    }

    public String tituloPagina(){
        return driver.getTitle();

    }

        public void fecharSait(){

        driver.quit();
    }

    public void fazerLogin(){
        System.out.println("vou fazer login!");

    }

    public void lancarNota(){
        System.out.println("vou lança uma nota !");

    }

}
