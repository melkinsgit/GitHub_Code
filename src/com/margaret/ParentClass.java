package com.margaret;

import javax.print.attribute.standard.MediaSize;

public class ParentClass {

    public static void main(String[] args) {
	BabyClass LittleNoise = new BabyClass();
    BabyClass OtherNoise = new BabyClass();
    BabyClass NotMuchNoise = new BabyClass();

    // it's cool the way the file name changes blue when it has been edited
    LittleNoise.roar();
    OtherNoise.roar();
    NotMuchNoise.roar();
    OtherNoise.roar();
    }
}
