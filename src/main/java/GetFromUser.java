import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetFromUser implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType(), Syntax.StringType()}, Syntax.WildcardType());
	//user id (now STRING), key
	//changed to permit wildcard return for compilation, stub actually returns 42
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    return Double.valueOf(42);
  }

}