import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class ClearBroadcast implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {});
		//no arguments - just clears
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}