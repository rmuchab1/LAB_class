package com.company;

public class Fish extends ANIMAL{
    private String scaleColormuchie56850;

    public Fish(){
        super();
        scaleColormuchie56850= "NN";
    }

    public Fish(String namemuchie56850, int agemuchie56850 , int weightmuchie56850, String scaleColormuchie56850){
        super(namemuchie56850, agemuchie56850, weightmuchie56850);
        this.scaleColormuchie56850= scaleColormuchie56850;
    }

    public Fish(int agemuchie56850 , String scaleColormuchie56850){
        super(agemuchie56850);
        this.scaleColormuchie56850=scaleColormuchie56850;
    }

    public void drinkWatermuchie56850(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoicemuchie56850() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColormuchie56850() {
        return scaleColormuchie56850;
    }

    public void setScaleColormuchie56850(String scaleColormuchie56850) {
        this.scaleColormuchie56850 = scaleColormuchie56850;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorShava56415='" + scaleColormuchie56850 + '\'' +
                '}';
    }
}
