package expression.operator.checked;

import expression.variable.Const;
import expression.exceptions.ConstantOverflowException;


public class CheckedConst {
    public static Const valueOf(String val, int idx) throws ConstantOverflowException {
        try {
            int number = Integer.parseInt(val);
            return new Const(number);
        } catch (NumberFormatException e) {
            throw new ConstantOverflowException(val, idx);
        }
    }
}