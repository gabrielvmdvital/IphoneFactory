package br.com.americanas.polotech.modulo3.iphoneFactory.controller;
import br.com.americanas.polotech.modulo3.iphoneFactory.Enums.TypeIphoneEnum;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone13Mini;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone9;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.IphoneX;


public class concreteIphoneFactory {

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

