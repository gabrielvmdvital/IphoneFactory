package br.com.americanas.polotech.modulo3.iphoneFactory.Enums;
public enum TypeIphoneEnum {
    IPHONE_X(1), IPHONE_9(2), IPHONE_13_MINI(3);
    private Integer iphoneTypeId;
    TypeIphoneEnum(Integer iphoneTypeId){
        this.iphoneTypeId = iphoneTypeId;
    }

    public Integer getIphoneTypeId() {
        return iphoneTypeId;
    }
}
