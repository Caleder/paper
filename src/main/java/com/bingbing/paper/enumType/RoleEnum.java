package com.bingbing.paper.enumType;

public enum RoleEnum implements EnumBase<Integer> {

    ADMIN("管理员"),

    OTHER("普通用户"),;

    private String message;

    RoleEnum(String message){
        this.message=message;
    }

    @Override
    public String message() {
        return null;
    }

    @Override
    public Integer value() {
        return null;
    }
}
