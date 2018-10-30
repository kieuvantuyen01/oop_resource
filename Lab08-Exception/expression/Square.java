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
public class Square extends Expression{

    public Expression expression;
    public Square (Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {
        if (expression instanceof Numeral) {
            return expression.toString() + "^2";
        }
        return "(" + expression.toString() + ")^2";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int evaluate() {
        return (int) Math.pow((double) expression.evaluate(), 2);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
