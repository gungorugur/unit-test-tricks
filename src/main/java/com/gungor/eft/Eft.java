package com.gungor.eft;

public class Eft {
    private String sourceIban;
    private String targetIban;
    private Double amount;

    public String getSourceIban() {
        return sourceIban;
    }

    public void setSourceIban(String sourceIban) {
        this.sourceIban = sourceIban;
    }

    public String getTargetIban() {
        return targetIban;
    }

    public void setTargetIban(String targetIban) {
        this.targetIban = targetIban;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
