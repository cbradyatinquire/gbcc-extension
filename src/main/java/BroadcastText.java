import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class BroadcastText implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.StringType()});
		//tag for the text (label), text to broadcast
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}