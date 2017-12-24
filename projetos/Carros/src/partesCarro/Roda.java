package partesCarro;

import java.util.ArrayList;
import java.util.List;

public class Roda {
	
	private List<Pneu> pneus = new ArrayList<Pneu>();
	
	public void adicionarPneu(Pneu pneu){
		pneus.add(pneu);
	}
	
}
