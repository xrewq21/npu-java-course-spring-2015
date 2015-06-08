/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import tw.edu.npu.mis.*;
/**
 *
 * @author user
 */
public class model {
    private float numA,numB;
    private String operator;
    public void saveNumberA(float numA,String operator){
        this.numA=numA;
        this.operator=operator;
    }
    public Object calculate(Object numB){
        switch(operator){
            default:
                this.numB=(float)numB;
            case "+":
                numB=this.numA+this.numB;
                break;
            case "-":
                numB=this.numA-this.numB;
                break;
            case "*":
                numB=this.numA*this.numB;
                break;
            case "/":
                numB=this.numA/this.numB;
                break;
        }
        return numB;
    }
}
