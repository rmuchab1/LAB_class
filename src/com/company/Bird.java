package com.company;

public class Bird extends ANIMAL{
    private String featherColormuchie56850;



    public Bird(){
        super();
        featherColormuchie56850="NN";

    }

    public Bird (String namemuchie56850, int agemuchie56850, int weightmuchie56850, String featherColormuchie56850){
        super(namemuchie56850, agemuchie56850, weightmuchie56850);
        this.featherColormuchie56850=featherColormuchie56850;
    }

    public Bird(int agemuchie56850 , String featherColormuchie56850){
        super(agemuchie56850);
        this.featherColormuchie56850=featherColormuchie56850;
    }

    public void takingFlightmuchie56850(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicemuchie56850() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColormuchie56850() {
        return featherColormuchie56850;
    }

    public void setFeatherColormuchie56850(String featherColormuchie56850) {
        this.featherColormuchie56850 = featherColormuchie56850;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorSmuchie56850='" + featherColormuchie56850 + '\'' +
                '}';
    }
}
