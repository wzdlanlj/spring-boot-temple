package xyz.xkun.po;

public class Commodity {
    private Integer fkSpNo;

    private String fkSpName;

    private Float fkSpPrice;

    public Integer getFkSpNo() {
        return fkSpNo;
    }

    public void setFkSpNo(Integer fkSpNo) {
        this.fkSpNo = fkSpNo;
    }

    public String getFkSpName() {
        return fkSpName;
    }

    public void setFkSpName(String fkSpName) {
        this.fkSpName = fkSpName == null ? null : fkSpName.trim();
    }

    public Float getFkSpPrice() {
        return fkSpPrice;
    }

    public void setFkSpPrice(Float fkSpPrice) {
        this.fkSpPrice = fkSpPrice;
    }
}