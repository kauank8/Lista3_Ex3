package view;

import br.com.kauanpaulino.listaint.listaint;
import controller.ListaController;

public class main {
	public static void main(String[] args) {
		listaint lista = new listaint();
		int[] vt = {25,42,23,74,80,77,13,41,59,35,68,53,75,84,44,94,39,71,88};
		ListaController l = new ListaController();
		lista=l.GeraLista(vt);
		l.operacao(lista);
	}
}
