import org.antlr.v4.runtime.*;
public class Underline extends BaseErrorListener{
    public String underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine) {
        try {
            CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
            String input = tokens.getTokenSource().getInputStream().toString();
            String[] lines = input.split("\n");
            String errorLine = lines[line - 1];
            String under = "";
            under += errorLine + '\n';
            for (int i = 0; i < charPositionInLine; i++) {
                if (errorLine.charAt(i) == '\t') {
                    under += "\t";
                } else {
                    under += " ";
                }
            }
            under += "\u001B[31m";
            int start = offendingToken.getStartIndex();
            int stop = offendingToken.getStopIndex();
            if (start >= 0 && stop >= 0) {
                for (int i = start; i <= stop; i++) under += "~";
            }
            return under + "\u001B[39m";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
