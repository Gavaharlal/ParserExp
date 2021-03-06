package expression.generic.operator;


import expression.generic.TripleExpression;
import expression.generic.type.Type;


public class Subtract<T extends Number> extends BinOperator<T> {
    public Subtract(TripleExpression<T> left, TripleExpression<T> right) {
        super(left, right);
    }

    @Override
    protected Type<T> evaluateImpl(Type<T> left, Type<T> right) {
        return left.subtract(right);
    }

}