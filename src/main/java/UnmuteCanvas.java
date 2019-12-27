import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class UnmuteCanvas implements Command {

  public Syntax getSyntax() {
    return SyntaxJ.commandSyntax(
		new int[] {Syntax.StringType()});
  } //user-id canvas-id

  public void perform(Argument args[], Context context)
      throws ExtensionException {
  }
}