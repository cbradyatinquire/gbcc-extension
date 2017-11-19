import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CompileObserverCode implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.StringType()});
		//key, netlogo-code
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }

}