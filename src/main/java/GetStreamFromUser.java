import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class GetStreamFromUser implements Reporter {
	
  public Syntax getSyntax() {
    return SyntaxJ.reporterSyntax(
	new int[] {Syntax.StringType(), Syntax.StringType()}, Syntax.ListType());
	//user id (now STRING), key
	//changed to permit wildcard return for compilation, stub actually returns 42
  }

  public Object report(Argument args[], Context context)
      throws ExtensionException {
    		LogoListBuilder list = new LogoListBuilder();
			list.add(42);
			return list.toLogoList();
  }

}