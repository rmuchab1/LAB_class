package com.company;

public class Main {

    public static void main(String[] args) {
        ANIMAL animal[]= new Animal[6];

        animal[0]=new MAMMAL("Little brown",2,3,"Bat");
        animal[1]=new DOG("Tom",3,16,"Carnivora","German Shepard");
        animal[2]= new ANIMAL("CatFish",2,1,"Yellow");
        animal[3]= new ANIMAL("Kevin",2,5,"Purple",10);
        animal[4]= new ANIMAL("Falcon",4,10,"Brown");
        animal[5]=new Pigeon("Smith",3,4,"Grey","Argentina");

        animal[2].getVoicemuchie56850();
        animal[4].getVoicemuchie56850();

    }



}