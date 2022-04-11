package com.company;

abstract class ANIMAL {
    private String namemuchie56850;
    private int agemuchie56850;
    private int weightmuchie56850;

    public ANIMAL(){
        agemuchie56850 = weightmuchie56850 = 10;
        namemuchie56850 = "NN";
    }

    public ANIMAL(String namemuchie56850 , int agemuchie56850 , int weightmuchie56850){
        this.namemuchie56850 = namemuchie56850;
        this.agemuchie56850= agemuchie56850;
        this.weightmuchie56850= weightmuchie56850;
    }

    public ANIMAL(int agemuchie56850){
        this.agemuchie56850=agemuchie56850;
    }

    public abstract void eatmuchie56850(String FoodName);

    public abstract void getVoicemuchie56850();

    public String getNamemuchie56850() {
        return namemuchie56850;
    }

    public void setNamemuchie56850(String namemuchie56850) {
        this.namemuchie56850 = namemuchie56850;
    }

    public int getAgemuchie56850() {
        return agemuchie56850;
    }

    public void setAgemuchie56850(int agemuchie56850) {
        this.agemuchie56850 = agemuchie56850;
    }

    public int getWeightmuchie56850() {
        return weightmuchie56850;
    }

    public void setWeightmuchie56850(int weightmuchie56850) {
        this.weightmuchie56850 = weightmuchie56850;
    }
}