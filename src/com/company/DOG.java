package com.company;

public class DOG implements mudog {
    private String breedmuchie56850;

    DOG(){
        super();
        breedmuchie56850= "NN";
    }

    public DOG(String namemuchie56850 , int agemuchie56850,int weightmuchie56850,String rzadmuchie56850, String breedmuchie56850){
        super(namemuchie56850, agemuchie56850, weightmuchie56850, rzadmuchie56850);
        this.breedmuchie56850=breedmuchie56850;
    }

    public DOG(int agemuchie56850, String rzadmuchie56850, String breedmuchie56850){
        super(agemuchie56850,rzadmuchie56850);
        this.breedmuchie56850=breedmuchie56850;
    }

    public void sportmuchie56850(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkmuchie56850() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicemuchie56850() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatmuchie56850(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    public String getBreedmuchie56850() {
        return breedmuchie56850;
    }

    public void setBreedmuchie56850(String breedmuchie56850) {
        this.breedmuchie56850 = breedmuchie56850;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedmuchie56850='" + breedmuchie56850 + '\'' +
                '}';
    }
}
