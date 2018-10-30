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
public class Division extends BinaryExpression {

    public Division(Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }

    @Override
    public String toString() {
        String rs;
        if (left instanceof Square || left instanceof Division
                || left instanceof Numeral || left instanceof Multiplication) {
            rs = left.toString() + "/";
        } else {
            rs = "(" + left.toString() + ")/";
        }
        if (right instanceof Numeral || right instanceof Square || right instanceof Multiplication) {
            rs += right.toString();
        } else {
            rs += ("(" + right.toString() + ")");
        }
        return rs;
    }

    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
