package com.company;

public class MAMMAL {
    private String ordermuchie56850;

    public MAMMAL(){
        super();
        ordermuchie56850 = "NN";
    }

    public MAMMAL(String namemuchie56850, int agemuchie56850 , int weightmuchie56850, String ordermuchie56850){
        super(namemuchie56850, agemuchie56850, weightmuchie56850);
        this.ordermuchie56850=ordermuchie56850;
    }

    public MAMMAL(int agemuchie56850 , String ordermuchie56850){
        super(agemuchie56850);
        this.ordermuchie56850=ordermuchie56850;
    }

    public void drinkMilkmuchie56850(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicemuchie56850() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrdermuchie56850() {
        return ordermuchie56850;
    }

    public void setOrdermuchie56850(String ordermuchie56850) {
        this.ordermuchie56850 = ordermuchie56850;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "ordermuchie56850='" + ordermuchie56850 + '\'' +
                '}';
    }
}
}