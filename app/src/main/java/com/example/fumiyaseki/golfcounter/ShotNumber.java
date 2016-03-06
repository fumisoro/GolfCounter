package com.example.fumiyaseki.golfcounter;

/**
 * Created by fumiyaseki on 2016/03/06.
 */
public class ShotNumber{
    private int shotNum;
    private int puttNum;

    ShotNumber(){
        shotNum = 0;
        puttNum = 0;
    }

    int shot(){
        shotNum += 1;
        return shotNum;
    }

    int putt(){
        shotNum += 1;
        puttNum += 1;
        return puttNum;
    }

    int deleteShot(){
        shotNum = positiveSub(shotNum);
        return shotNum;
    }

    int deletePutt(){
        shotNum = positiveSub(shotNum);
        puttNum = positiveSub(puttNum);
        return puttNum;
    }

    int getShotNum(){
        return shotNum;
    }

    int getPuttNum(){
        return puttNum;
    }

    private int positiveSub(int value){
        value -= 1;
        if(value < 0) value = 0;
        return value;
    }
}
