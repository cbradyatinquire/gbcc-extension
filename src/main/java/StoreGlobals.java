import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class StoreGlobals implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {});
		//no args
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}