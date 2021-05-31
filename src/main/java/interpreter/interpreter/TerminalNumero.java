package interpreter.interpreter;

public class TerminalNumero extends AbstractExpresion {

	@Override
	public void interpreter(Context context, int valor) {
		context.output= context.output+(valor * context.signo);
        // el borrado de la letra/simbolo ya interpretado en el input
        context.input=context.input.substring(1);
	}

}
