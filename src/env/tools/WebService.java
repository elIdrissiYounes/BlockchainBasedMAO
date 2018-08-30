package tools;



import cartago.Artifact;
import cartago.ArtifactConfig;
import cartago.ArtifactId;
import cartago.CartagoException;
import cartago.OpFeedbackParam;
import cartago.OperationException;
import jason.NoValueException;
import jason.asSyntax.parser.ParseException;
import moise.common.MoiseException;
import ora4mas.nopl.GroupBoard;


public class WebService extends Artifact{
    //introspection
    //recuperer instance de groupboard existante
    //static GroupBoard gb= new GroupBoard();
     
    //@RequestMapping("/adopt")
    public void adoptRole(/*@RequestParam(value="ag")*/ String ag,/*@RequestParam(value="role")*/String role) throws NoValueException, CartagoException, ParseException, MoiseException, npl.parser.ParseException {
         String s="adoptRole ("+ag+"," + role+")";

      //  gb.admCommand(s);
    }
    public  void createGroup(String id,String type,OpFeedbackParam<ArtifactId> idd) {
        
        Artifact a = new BCArt();
      ArtifactId id1;
        try {
            id1 = makeArtifact("myorg", "ora4mas.nopl.OrgBoard", new ArtifactConfig("src/org/house-os.xml"));
        
            
         execLinkedOp(id1, "createGroup", "hsh_group", "house_group", idd);
        
    
        } catch (OperationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    
    
}
}
