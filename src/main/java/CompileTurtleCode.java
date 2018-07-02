import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CompileTurtleCode implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.NumberType(), Syntax.StringType(), Syntax.StringType()});
		//who, key, netlogo-code, 
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }

}