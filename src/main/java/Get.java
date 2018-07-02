import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class Get implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType()}, Syntax.WildcardType());
	//key under which value was stored
	//return type permitted to be wildcard, since it's no longer numbers.
	//but of course, it will actually return a number (42)
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    return Double.valueOf(42);
  }

}