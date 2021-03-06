package expression.operator;

import expression.TripleExpression;

public abstract class UnaryOperator implements TripleExpression {
    private TripleExpression val;

    public UnaryOperator(TripleExpression val) {
        this.val = val;
    }

    protected abstract int evaluateImpl(int val);

    @Override
    public int evaluate(int x, int y, int z) {
        return evaluateImpl(val.evaluate(x, y, z));
    }
}