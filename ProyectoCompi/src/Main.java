import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.BaseErrorListener;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    static ArrayList<ErrorManagement> ListaErrores= new ArrayList<>();
    public static void main(String[] args) throws Exception{

        String input = "";
        File fichero = null;
        try {
            JFileChooser filechooser = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "txt");
            filechooser.setFileFilter(filtro);
            int seleccion = filechooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = filechooser.getSelectedFile();
                input = fichero.getName();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        CharStream ch = fromFileName(input);

        MiniPascalLexer lexer = new MiniPascalLexer(ch);
       // MiniPascalLexer lexer2 = new MiniPascalLexer(ch);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        lexer.removeErrorListeners();

        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
               // String under  = underlineError(recognizer, (Token)offendingSymbol, line, charPositionInLine)
                //Underline underl = new Underline();
                //String under = underl.underlineError(recognizer,(Token)offendingSymbol,line,charPositionInLine);
                String error_color = "\033[31m";
                String msgTranslated = msg.replace("no viable alternative at input", "ninguna alternativa viable en la entrada");
                msgTranslated = msgTranslated.replace("token recognition error at:","error de reconocimiento de token en:");
                msgTranslated = msgTranslated.replace("extraneous input","entrada ajena");
                msgTranslated = msgTranslated.replace("expecting","se esperaba");
                msgTranslated = msgTranslated.replace("missing","falta");
                msgTranslated = msgTranslated.replace("mismatched input","entrada incorrecta");
                msgTranslated = msgTranslated.replace("at","en");
                ListaErrores.add(new ErrorManagement(line, charPositionInLine, "Lex", msgTranslated, ErrorManagement.ErrorTipo.Lexico));
                System.out.println(error_color + "Error Léxico: " + line + ":" + charPositionInLine + " " + msgTranslated);

            }

        });

        parser.removeErrorListeners();

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
                String msgTranslated = msg.replace("no viable alternative at input", "ninguna alternativa viable en la entrada");
                msgTranslated = msgTranslated.replace("token recognition error at:","error de reconocimiento de token en:");
                msgTranslated = msgTranslated.replace("extraneous input","entrada ajena");
                msgTranslated = msgTranslated.replace("expecting","se esperaba");
                msgTranslated = msgTranslated.replace("missing","falta");
                msgTranslated = msgTranslated.replace("mismatched input","entrada incorrecta");
                msgTranslated = msgTranslated.replace("at","en");
                ListaErrores.add(new ErrorManagement(line, charPositionInLine, "Lex", msgTranslated, ErrorManagement.ErrorTipo.Sintactico));
                String error_color = "\033[31m";

                System.out.println(error_color + "Error Sintactico: " + line + ":" + charPositionInLine + " " + msgTranslated);
                underlineError(recognizer,(Token)offendingSymbol, line, charPositionInLine);
            }
            public  void underlineError(Recognizer recognizer,
                                        Token offendingToken, int line,
                                        int charPositionInLine) {
                CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
                String input = tokens.getTokenSource().getInputStream().toString();
                String[] lines = input.split("\n");
                String errorLine = lines[line - 1];
                System.err.println(errorLine);
                for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
                int start = offendingToken.getStartIndex();
                int stop = offendingToken.getStopIndex();
                if ( start>=0 && stop>=0 ) {
                    for (int i=start; i<=stop; i++) System.err.print("^");
                }
                System.err.println();
            }
        });

        ParseTree arbolito = parser.program();
        MiniPascalNewVisitor visitante = new MiniPascalNewVisitor();
        String str = visitante.visit(arbolito);
        System.out.println(ANSI_RESET + str  );
    }

}
