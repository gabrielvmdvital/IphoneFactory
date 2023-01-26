package br.com.americanas.polotech.modulo3.iphoneFactory.models;

public class Iphone13Mini implements Iphone{
    @Override
    public void showDetails() {
        System.out.println(
                "Model name: IPhone 13 mini\n"
                        +"Processor: A15\n"
                        +"Memory: 4 GB RAM \n"
                        +"Storage: 128GB ~ 512GB\n"
                        +"Display: 5.4 inches - OLED display\n"
                        +"Rear Camera: 12 MP\n"
                        +"Front Camera: 7 MP\n"
                        +"Dimensions: 67.3 x 138.4 x 7.3 mm\n"
                        +"Weight: 141 grams\n"
                        +"Battery: 2050 mAh\n"
                        +"OS: iOS v13.0"
        );
    }
}
