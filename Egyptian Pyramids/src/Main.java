import java.util.List;

public class Main {

	public static void main(String[] args) {
		PyramidCSVDAO pDAO = new PyramidCSVDAO();
		List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("D:\\Course\\Workspace\\Java\\Egyptian Pyramids\\pyramids.csv");
		
		int i =0;
		for (Pyramid p:pyramids) {
			System.out.println("#"+ (i++) + " " + p);
		}
	}

}
