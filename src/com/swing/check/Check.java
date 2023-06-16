/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.check;

/**
 *
 * @author Tran Minh Duy
 */
public class Check {

    public boolean containsLetter(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
