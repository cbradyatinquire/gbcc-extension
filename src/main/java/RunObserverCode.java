import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class RunObserverCode implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()});
		//the key under which the code was stored
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}