package expression.generic;


import expression.generic.parser.UnsupportedTypeException;
import expression.generic.type.*;


public class GenericTabulator implements Tabulator {
    @Override
    public Object[][][] tabulate(String mode, String expression, int x1, int x2, int y1, int y2, int z1, int z2) throws Exception {
        return getTabulator(mode).execute(expression, x1, x2, y1, y2, z1, z2);
    }

    private TabulateExecutor<?> getTabulator(String mode) {
        switch (mode) {
            case "i":
                return new TabulateExecutor<>(SafeIntType::parse);
            case "d":
                return new TabulateExecutor<>(DoubleType::parse);
            case "bi":
                return new TabulateExecutor<>(BigIntType::parse);
            default:
                throw new IllegalArgumentException(mode);
        }
    }
}