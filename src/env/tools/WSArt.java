// CArtAgO artifact code for project house-building

package tools;

import cartago.*;

public class WSArt extends Artifact {

	@OPERATION
	public void init(String taskDs, int maxValue) {
		// observable properties

	}

	@OPERATION
	public void adoptRolee(String role, ArtifactId GrArtId) throws Exception {
 
		execLinkedOp(GrArtId, "adoptRole", role);

	}

	@OPERATION
	public void createGroup(String id, String type, ArtifactId idd) {

		ArtifactId id1;
		try {
			id1 = makeArtifact("myorg", "ora4mas.nopl.OrgBoard", new ArtifactConfig("src/org/house-os.xml"));

			execLinkedOp(id1, "createGroup", id, type, idd);

		} catch (OperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
