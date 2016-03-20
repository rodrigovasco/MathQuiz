package com.example.android.mathquiz;

import android.util.Log;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by RodrigoVasco on 14/03/2016.
 */
public class Player {
    private String name;
    private boolean ready;
    private int sumField1;
    private int sumField2;
    private int subtField1;
    private int subtField2;
    private int multField1;
    private int multField2;
    private int divField1;
    private int divField2;
    private double sumEdit;
    private double subtEdit;
    private double multEdit;
    private double divEdit;
    private String sumResultText;
    private String subtResultText;
    private String multResultText;
    private String divResultText;
    private int pontuation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public int getSumField1() {
        return sumField1;
    }

    public int getSumField2() {
        return sumField2;
    }

    public int getSubtField1() {
        return subtField1;
    }

    public int getSubtField2() {
        return subtField2;
    }

    public int getMultField1() {
        return multField1;
    }

    public int getMultField2() {
        return multField2;
    }

    public int getDivField1() {
        return divField1;
    }

    public int getDivField2() {
        return divField2;
    }

    public double getSumEdit() {
        return sumEdit;
    }

    public void setSumEdit(double sumEdit) {
        this.sumEdit = sumEdit;
    }

    public double getSubtEdit() {
        return subtEdit;
    }

    public void setSubtEdit(double subtEdit) {
        this.subtEdit = subtEdit;
    }

    public double getMultEdit() {
        return multEdit;
    }

    public void setMultEdit(double multEdit) {
        this.multEdit = multEdit;
    }

    public double getDivEdit() {
        return divEdit;
    }

    public void setDivEdit(double divEdit) {
        this.divEdit = divEdit;
    }

    public String getSumResultText() {
        return sumResultText;
    }

    public void setSumResultText(String sumResultText) {
        this.sumResultText = sumResultText;
    }

    public String getSubtResultText() {
        return subtResultText;
    }

    public void setSubtResultText(String subtResultText) {
        this.subtResultText = subtResultText;
    }

    public String getMultResultText() {
        return multResultText;
    }

    public void setMultResultText(String multResultText) {
        this.multResultText = multResultText;
    }

    public String getDivResultText() {
        return divResultText;
    }

    public void setDivResultText(String divResultText) {
        this.divResultText = divResultText;
    }

    public int getPontuation() {
        return pontuation;
    }

    public void setPontuation(int pontuation) {
        this.pontuation = pontuation;
    }

    public void randomFields() {
        Random rand = new Random();
        //set sum fields
        this.sumField1 = rand.nextInt(10); // Gives n such that 0 <= n < 10
        this.sumField2 = rand.nextInt(10 - 1) + 1; // Gives n such that 1 <= n < 10

        //set subtraction fields
        this.subtField1 = rand.nextInt(10);
        this.subtField2 = rand.nextInt(10 - 1) + 1;

        //set multiplication fields
        this.multField1 = rand.nextInt(10);
        this.multField2 = rand.nextInt(10 - 1) + 1;

        //set division fields
        this.divField1 = rand.nextInt(10);
        this.divField2 = rand.nextInt(10 - 1) + 1;
    }

    public double sum() {
        return sumField1 + sumField2;
    }

    public double subtraction() {
        return subtField1 - subtField2;
    }

    public double multiplication() {
        return multField1 * multField2;
    }

    public double division() {

        double divField1ToDouble = divField1;
        double divField2ToDouble = divField2;

        return divField1ToDouble/divField2ToDouble ;
    }

}
