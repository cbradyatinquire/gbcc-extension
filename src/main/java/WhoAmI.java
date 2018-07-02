import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class WhoAmI implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {}, Syntax.StringType());
	//Returns my own user-id string
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    return "ItIsI";
  }

}