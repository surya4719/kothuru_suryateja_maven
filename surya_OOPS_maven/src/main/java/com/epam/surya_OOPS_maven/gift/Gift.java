package com.epam.surya_OOPS_maven.gift;

import com.epam.surya_OOPS_maven.chocolates.Chocolate;
import com.epam.surya_OOPS_maven.sweets.Sweets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gift {
	private ArrayList<Chocolate> chocolates;
    private ArrayList<Sweets> sweets;

    public Gift(){
        chocolates=new ArrayList<Chocolate>();
        sweets=new ArrayList<Sweets>();

}
    public void addChocolates(Chocolate... chocolates){
        this.chocolates.addAll(Arrays.asList(chocolates));
    }

    public void addSweets(Sweets... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }

    public void sort(){
        Collections.sort(chocolates);
        Collections.sort(sweets);
    }

    public ArrayList<Chocolate> getChocolates() {
        return chocolates;
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public int findTotalWeight(){
        int weight=0;

        for(Chocolate c: this.chocolates)
            weight+=c.getWeight();
        for(Sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }
}
