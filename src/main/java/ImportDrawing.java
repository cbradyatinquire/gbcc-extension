import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class ImportDrawing implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.ListType() });
		//list containing, key, value, xmin, ymin, width, height
  }

  public void perform(Argument args[], Context context)
      throws ExtensionException {
	
  }
}