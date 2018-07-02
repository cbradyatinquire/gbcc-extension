import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class BroadcastAvatar implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(),Syntax.NumberType(),Syntax.StringType()});
		//Shape name (string)
		//Color (number)
		//name of avatar (user's name, often) (string)
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}