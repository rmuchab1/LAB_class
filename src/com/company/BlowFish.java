package com.company;

public class BlowFish extends Fish{
    private int diametermuchie56850;

    BlowFish(){
        super();
        diametermuchie56850=10;
    }

    public BlowFish(String namemuchie56850String , int agemuchie56850 , int weightmuchie56850, String scaleColormuchie56850, int diametermuchie56850){
        super(namemuchie56850String,agemuchie56850,weightmuchie56850,scaleColormuchie56850);
        this.diametermuchie56850=diametermuchie56850;

    }

    public BlowFish(int agemuchie56850, String scaleColormuchie56850, int diametermuchie56850){
        super(agemuchie56850, scaleColormuchie56850);
        this.diametermuchie56850=diametermuchie56850;
    }

    public void swimmuchie56850(){
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getVoicemuchie56850() {
        System.out.println("The blowfish is howling");
    }

    public int getDiametermuchie56850() {
        return diametermuchie56850;
    }

    public void setDiametermuchie56850(int diametermuchie56850) {
        this.diametermuchie56850 = diametermuchie56850;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diametermuchie56850=" + diametermuchie56850 +
                '}';
    }
}
