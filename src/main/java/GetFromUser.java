import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetFromUser implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.NumberType(), Syntax.StringType()}, Syntax.NumberType());
	//user id (#), key
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    return Double.valueOf(0);
  }

}