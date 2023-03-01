package executores;


import robos.GaiaRobo;


public class Executora {
    public static void main(String[] args) throws InterruptedException {

        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessaSaitChamado("https://www.google.com");
       // umaGaiaRobo.fecharSait();
        umaGaiaRobo.lancarNota();

      //  GaiaRobo umaOutroRobo = new GaiaRobo();
        umaGaiaRobo.acessaSaitChamado("https://www.terra.com.br");
        umaGaiaRobo.fecharSait();

    }

}
