package generalization;

public class TestGeneralization1 {

	public static void main(String[] args) {
		RCPIT rc=new RCPIT();
		rc.time();
		rc.lunch();
		rc.meeting();
		rc.city();
		rc.classes();
		System.out.println("================================");
		bambhori bm=new bambhori();
		bm.time();
		bm.city();
		bm.time();
		bm.exam();
		bm.meeting();
		System.out.println("================================");
		GTP g =new GTP();
		g.lunch();
		g.meeting();
		g.sport();
		g.time();
		g.trip();
	}

}
