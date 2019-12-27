import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class RestoreStateFromUser implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()});
		//user-id - now a STRING
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}