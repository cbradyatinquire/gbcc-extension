import org.nlogo.api.*;

public class GbccExtension extends DefaultClassManager {
  public void load(PrimitiveManager primitiveManager) {
    primitiveManager.addPrimitive("set", new Set());
	primitiveManager.addPrimitive("get", new Get());
	primitiveManager.addPrimitive("get-from-user", new GetFromUser());
	primitiveManager.addPrimitive("store-globals", new StoreGlobals());
	primitiveManager.addPrimitive("restore-globals", new RestoreGlobals());
	primitiveManager.addPrimitive("restore-globals-from-user", new RestoreGlobalsFromUser());

	primitiveManager.addPrimitive("broadcast-view", new BroadcastView());
	primitiveManager.addPrimitive("broadcast-text", new BroadcastText());
	primitiveManager.addPrimitive("broadcast-plot", new BroadcastPlot());
	primitiveManager.addPrimitive("broadcast-avatar", new BroadcastAvatar());
	primitiveManager.addPrimitive("clear-broadcast", new ClearBroadcast());

	primitiveManager.addPrimitive("compile-observer-code", new CompileObserverCode());
	primitiveManager.addPrimitive("run-observer-code", new RunObserverCode());
	primitiveManager.addPrimitive("compile-turtle-code", new CompileTurtleCode());
	primitiveManager.addPrimitive("run-turtle-code", new RunTurtleCode());
	primitiveManager.addPrimitive("compile-patch-code", new CompilePatchCode());
	primitiveManager.addPrimitive("run-patch-code", new RunPatchCode());
	
	primitiveManager.addPrimitive("who-am-i", new WhoAmI());
	
	primitiveManager.addPrimitive("show-patches", new ShowPatches());
	primitiveManager.addPrimitive("hide-patches", new HidePatches());
	
	primitiveManager.addPrimitive("add-to-stream", new AddToStream());
	primitiveManager.addPrimitive("get-stream", new GetStream());
	primitiveManager.addPrimitive("get-stream-from-user", new GetStreamFromUser());
	
	primitiveManager.addPrimitive("send", new Send());
	primitiveManager.addPrimitive("broadcast", new Broadcast());
	
	//December21 2018
	primitiveManager.addPrimitive("clear-broadcasts", new ClearBroadcasts());
	primitiveManager.addPrimitive("my-role", new MyRole());
	primitiveManager.addPrimitive("get-user-list", new GetUserList());
	primitiveManager.addPrimitive("get-active-user-list", new GetActiveUserList());
	primitiveManager.addPrimitive("adopt-canvas", new AdoptCanvas());
	primitiveManager.addPrimitive("mute-canvas", new MuteCanvas());
	primitiveManager.addPrimitive("unmute-canvas", new UnmuteCanvas());
	primitiveManager.addPrimitive("get-canvas-list", new GetCanvasList());
	primitiveManager.addPrimitive("get-vacant-indices", new GetVacantIndices());
	
	primitiveManager.addPrimitive("import-our-data", new ImportOurData());
	primitiveManager.addPrimitive("import-our-data-file", new ImportOurDataFile());
	
	primitiveManager.addPrimitive("import-my-data", new ImportMyData());
	primitiveManager.addPrimitive("import-my-data-file", new ImportMyDataFile());
	
	primitiveManager.addPrimitive("export-our-data", new ExportportOurData());
	primitiveManager.addPrimitive("export-my-data", new ExportportMyData());
	
	//December 22 2018 
	primitiveManager.addPrimitive("store-state", new StoreState());
	primitiveManager.addPrimitive("restore-state", new RestoreState());
	primitiveManager.addPrimitive("restore-state-from-user", new RestoreStateFromUser());
  }
}