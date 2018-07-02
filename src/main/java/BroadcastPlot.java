import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class BroadcastPlot implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()});
		//plot name to broadcast
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}