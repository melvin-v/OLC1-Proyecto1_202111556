package instrucciones;


import enums.TypeOperation;
import enums.EnumUnitaryOperations;
import enums.EnumOperaciones;
import enums.EnumTerminals;
import utilidades.Utils;
import utilidades.Python;

public class Operacion implements Instruccion {

    // Binary operations
    Operacion left;
    Operacion right;
    EnumOperaciones type;

    // Unitary operations;
    Operacion op;
    EnumUnitaryOperations typeUnitary;

    // Terminal expresions
    String value;
    EnumTerminals typeTerminal;

    // Group
    Operacion opGroup;

    // Flag Type
    private final TypeOperation typeOp;

    public Operacion(Operacion left, EnumOperaciones type, Operacion right){
        this.left = left;
        this.right = right;
        this.type = type;
        this.typeOp = TypeOperation.BINARY;
    }

    public Operacion(Operacion op, EnumUnitaryOperations typeUnitary){
        this.op = op;
        this.typeUnitary = typeUnitary;
        this.typeOp = TypeOperation.UNITARY;
    }

    public Operacion(String value, EnumTerminals typeTerminal){
        this.typeTerminal = typeTerminal;
        this.typeOp = TypeOperation.TERMINAL;
        this.value = value;

    }

    public Operacion(Operacion value){
        this.opGroup = value;
        this.typeOp = TypeOperation.GROUP;
    }


    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        switch (typeOp) {
            case BINARY -> {
                str.append(left.generarCodigo()).append(" ")
                        .append(Python.pythonSymbolBinaryOperators(type)).append(" ")
                        .append(right.generarCodigo());
            }
            case UNITARY -> {
                str.append(Python.pythonSymbolUnitaryOperators(typeUnitary)).append(" ").append(op.generarCodigo());
            }
            case TERMINAL -> {
                str.append(Python.pythonTerminals(value, typeTerminal));
            }
            case GROUP -> {
                str.append("(").append(opGroup.generarCodigo()).append(")");
            }

            default -> throw new AssertionError();
        }

        return str.toString();
    }

}
