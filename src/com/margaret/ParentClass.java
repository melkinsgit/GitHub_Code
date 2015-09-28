package com.margaret;

public class ParentClass {

    public static void main(String[] args) {
	BabyClass LittleNoise = new BabyClass();
    BabyClass OtherNoise = new BabyClass();
    BabyClass NotMuchNoise = new BabyClass();

    LittleNoise.roar();
    OtherNoise.roar();
    NotMuchNoise.roar();
    }
}
