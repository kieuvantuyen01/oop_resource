/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author CACLV
 */
public class Subtraction extends BinaryExpression{
    public Expression left;
    public Expression right;
    
    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    
    @Override
    public String toString() {
        return left.toString() + "-" + right.toString();
    }
    
    @Override
    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }
}
