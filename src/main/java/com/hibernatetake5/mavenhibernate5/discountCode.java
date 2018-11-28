/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernatetake5.mavenhibernate5;

/**
 *
 * @author JRome
 */
class discountCode {
    
    private String discountCode;
    private int amount ;

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "discountCode{" + "discountCode=" + discountCode + ", amount=" + amount + '}';
    }
    
    

}
