import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class CompilePatchCode implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.NumberType(), Syntax.NumberType(), Syntax.StringType(), Syntax.StringType()});
		//patchx, patchy, key, netlogo-code
  }
  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }

}