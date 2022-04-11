package com.company;

public class Pigeon {
    private String speciesmuchie56850;

    Pigeon(){
        super();
        speciesmuchie56850="NN";
    }

    public Pigeon(String namemuchie56850, int agemuchie56850, int weightmuchie56850, String featherColormuchie56850, String speciesmuchie56850){
        super(namemuchie56850, agemuchie56850, weightmuchie56850,featherColormuchie56850);
        this.speciesmuchie56850= speciesmuchie56850;
    }

    public Pigeon(int agemuchie56850, String featherColormuchie56850, String speciesmuchie56850){
        super(agemuchie56850, featherColormuchie56850);
        this.speciesmuchie56850=speciesmuchie56850;
    }

    public void peckingWoodmuchie56850(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoicemuchie56850() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesmuchie56850() {
        return speciesmuchie56850;
    }

    public void setSpeciesmuchie56850(String speciesmuchie56850) {
        this.speciesmuchie56850 = speciesmuchie56850;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesmuchie56850='" + speciesmuchie56850 + '\'' +
                '}';
    }
}
