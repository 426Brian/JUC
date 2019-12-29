package com.jucInfo;

public enum CountryEnum {
    ONE(1, "齐"),
    TWO(2, "楚"),
    THREE(3, "燕"),
    FOUR(4, "韩"),
    FIVE(5, "赵"),
    SIX(6, "魏");

    private Integer retCode;
    private String retMessage;

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach_CountEnum(int index) {
        CountryEnum[] myArr = CountryEnum.values();
        for (CountryEnum ele : myArr) {
            if (index == ele.getRetCode()) {
                return ele;
            }
        }

        return null;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }
}
