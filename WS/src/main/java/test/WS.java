package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cartago.*;
import tools.WSArt;

@RestController
@RequestMapping("api/v1")
public class WS extends Artifact{

	
	@RequestMapping("/adopt")
	void adoptRolee(@RequestParam String role,@RequestParam String idd) throws Exception {
		//t.adoptRolee(role, GrArtId);
		System.out.println("called");  
		System.out.println(idd+""+""+role);
		
		execLinkedOp(idd, "adoptRole", role);
	}

	@RequestMapping("/create")
	public void createGroup(@RequestParam String id, @RequestParam String type, ArtifactId idd) {

		//t.createGroup(id, type, idd);
		ArtifactId id1;
		try {
			id1 = makeArtifact("myorg", "ora4mas.nopl.OrgBoard", new ArtifactConfig("src/org/house-os.xml"));

			execLinkedOp(id1, "createGroup", id, type, idd);

		} catch (OperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}

	@RequestMapping("/test")
	public void test() {

		System.out.println("ẗest reussi");

	}

}
