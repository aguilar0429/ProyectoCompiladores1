import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.BaseErrorListener;

import org.antlr.v4.runtime.tree.*;
import java.util.Collections;
import java.util.List;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import org.antlr.v4.runtime.tree.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
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

        ArrayList<ErrorManagement> ListaErrores= new ArrayList<>();

        lexer.removeErrorListeners();

        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
                ListaErrores.add(new ErrorManagement(line, charPositionInLine, "Lex", msg, ErrorManagement.ErrorTipo.Lexico));
                String error_color = "\033[31m";
                System.out.println(error_color + "Error Léxico: " + line + ":" + charPositionInLine + " " + msg);
            }
        });
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MiniPascalParser parser = new MiniPascalParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                //throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
                ListaErrores.add(new ErrorManagement(line, charPositionInLine, "Lex", msg, ErrorManagement.ErrorTipo.Sintactico));
                String error_color = "\033[31m";
                System.out.println(error_color + "Error Sintactico: " + line + ":" + charPositionInLine + " " + msg);
            }
        });
        parser.program();
    }
}

