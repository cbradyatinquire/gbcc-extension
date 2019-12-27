import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class Send implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType(), Syntax.StringType(), Syntax.WildcardType() });
		//user-id - now a STRING
		//key
		//value
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}