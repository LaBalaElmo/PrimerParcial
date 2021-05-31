package interpreter.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterOperacion extends AbstractExpresion{
	private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public InterpreterOperacion(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                
            }

        }
    }


    public int interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context, 0);
        }
        return  context.output;
    }
	@Override
	public void interpreter(Context context, int valor) {
		// TODO Auto-generated method stub
		
	}
}
