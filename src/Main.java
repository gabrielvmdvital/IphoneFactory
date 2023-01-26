import br.com.americanas.polotech.modulo3.iphoneFactory.Enums.TypeIphoneEnum;
import br.com.americanas.polotech.modulo3.iphoneFactory.controller.concreteIphoneFactory;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Iphone> iphonesModels = new ArrayList<>();

        concreteIphoneFactory iPhoneFactory = new concreteIphoneFactory();

        for(TypeIphoneEnum typePhone: TypeIphoneEnum.values()){
            iphonesModels.add(iPhoneFactory.cadastrarIphone(typePhone));

        }

        for(Iphone model: iphonesModels){
            model.showDetails();
            System.out.println();
        }
    }

}