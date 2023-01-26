package br.com.americanas.polotech.modulo3.iphoneFactory.repository;

import br.com.americanas.polotech.modulo3.iphoneFactory.Enums.TypeIphoneEnum;
import br.com.americanas.polotech.modulo3.iphoneFactory.models.Iphone;

public interface IFactory {
    Iphone cadastrarIphone(TypeIphoneEnum model);
}
