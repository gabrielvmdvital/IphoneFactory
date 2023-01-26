package br.com.americanas.polotech.modulo3.iphoneFactory.controller;
import br.com.americanas.polotech.modulo3.iphoneFactory.Enums.TypeIphoneEnum;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone13Mini;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone9;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.IphoneX;
import br.com.americanas.polotech.modulo3.iphoneFactory.repository.IFactory;

public class concreteIphoneFactory implements IFactory {

    @Override
    public Iphone cadastrarIphone(TypeIphoneEnum model) {
        switch (model){
            case IPHONE_X: {
                return new IphoneX();
            }

            case IPHONE_9:{
                return new Iphone9();
            }

            case IPHONE_13_MINI:{
                return new Iphone13Mini();
            }
        }
        return null;
    }
}

