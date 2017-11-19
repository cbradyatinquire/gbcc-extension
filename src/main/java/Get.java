import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class Get implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.NumberType());
	//key under which value was stored
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    return Double.valueOf(0);
  }

}