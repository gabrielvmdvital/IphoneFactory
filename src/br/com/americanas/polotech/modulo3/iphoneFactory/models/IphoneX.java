package br.com.americanas.polotech.modulo3.iphoneFactory.models;

public class IphoneX implements Iphone{

    @Override
    public void showDetails() {
        System.out.println(
                "Model name: IPhone X\n"
                        +"Processor: A15\n"
                        +"Memory: 4 GB RAM \n"
                        +"Storage: 64 GB ~ 256 GB \n"
                        +"Display: 5,4 inches - IPS display\n"
                        +"Rear Camera: 12 MP\n"
                        +"Front Camera: 7 MP\n"
                        +"Dimensions: 70,9 x 143,6 x 7,7 mm\n"
                        +"Weight: 174 g\n"
                        +"Battery: 2438 mAh \n"
                        +"OS: iOS v16.0"
        );

    }
}
