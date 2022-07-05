package com.example.pocchainofresponsabilityspring.enums;

public enum PositionEnum {
    GERENTE("manager"),
    TECNICO("technician"),
    DESENVOLVEDOR("developer"),
    ANALISTA("analyst");

    String positionName;

    PositionEnum(String positionName) {this.positionName = positionName;}

    public static PositionEnum getByString(String positionName) {
        for(PositionEnum position : PositionEnum.values()) {
            if(position.positionName.equals(positionName.toLowerCase())) {
                return position;
            }
        }
        return null;
    }



}
