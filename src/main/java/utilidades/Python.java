package utilidades;
import enums.EnumOperaciones;
import enums.EnumTerminals;
import enums.EnumUnitaryOperations;

public class Python {


    /**
     *
     * @param op the value of op
     * @return
     */
    public static String pythonSymbolBinaryOperators(EnumOperaciones op) {
        switch (op) {
            case SUMA -> {
                return "+";
            }
            case AND -> {
                return "and";
            }
            case DIVISION -> {
                return "/";
            }
            case IGUAL -> {
                return "==";
            }
            case MAYOR -> {
                return ">";
            }
            case MAYOR_IGUAL -> {
                return ">=";
            }
            case MENOR -> {
                return "<";
            }
            case MENOR_IGUAL -> {
                return "<=";
            }
            case MULTIPLICACION -> {
                return "*";
            }
            case NO_IGUAL -> {
                return "!=";
            }
            case OR -> {
                return "or";
            }
            case RESTA -> {
                return "-";
            }
            default -> throw new AssertionError();
        }
    }

    /**
     *
     * @param value the value of value
     * @param type the value of type
     * @return
     */
    public static String pythonTerminals(String value, EnumTerminals type) {
        switch (type) {
            case BOOL -> {
                if ("verdadero".equals(value)) {
                    return "True";
                } else if ("falso".equals(value)) {
                    return "False";
                }
            }
            case CHAR -> {
                return "'" + value + "'";
            }
            case ID, NUM -> {
                return value;
            }
            case STR -> {
                boolean contains = value.contains("\n");
                if (!contains)
                    return "\"" + value + "\"";
                else
                    return "'''" + value + "'''";
            }
            default -> throw new AssertionError();
        }
        return null;
    }

    /**
     *
     * @param op the value of op
     * @return
     */
    public static String pythonSymbolUnitaryOperators(EnumUnitaryOperations op) {
        switch (op) {
            case NEGATIVE -> {
                return "-";
            }
            case NOT -> {
                return "not";
            }
            default -> throw new AssertionError();
        }
    }

}
