package com.yang.va.enumerate;

public enum ResourcesType {

    PICTURE("图片"),
    VIDEO("视频"),
    ;

    private String text;

    ResourcesType(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
