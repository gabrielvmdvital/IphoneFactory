package br.com.americanas.polotech.modulo3.iphoneFactory.models;

public class Iphone9 implements Iphone{
    @Override
    public void showDetails() {
        System.out.println(
                "Model name: IPhone 9\n"
                        +"Processor: A15\n"
                        +"Memory: 4 GB RAM \n"
                        +"Storage: 64 GB Memory Card Not Supported\n"
                        +"Display: 4,7 inches - IPS display\n"
                        +"Rear Camera: 12 MP\n"
                        +"Front Camera: 7 MP\n"
                        +"Dimensions: 67.3 x 138.4 x 7.3 mm\n"
                        +"Weight: 148 g\n"
                        +"Battery: 2050 mAh Battery\n"
                        +"OS: iOS v13.0"
        );

    }
}