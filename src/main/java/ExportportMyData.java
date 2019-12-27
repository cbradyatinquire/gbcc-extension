import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class ExportportMyData implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()});
  } //filename to export to

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}