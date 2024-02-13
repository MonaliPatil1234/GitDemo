package DataDrivenExcel.DataDrivenApachePOI;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDriven d = new dataDriven();
		ArrayList<String> data = new ArrayList<String>();
		data = d.getData("Login");
		int n = data.size();
		for (int i = 0;i<n;i++) {
			System.out.println(data.get(i));
		}

	}

}
