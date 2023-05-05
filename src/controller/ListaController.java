package controller;

import br.com.kauanpaulino.listaint.listaint;

public class ListaController {
	public listaint GeraLista(int[] vt) {
		listaint lista = new listaint();
		int tamanho = vt.length;
		
		for(int i=0;i<tamanho;i++) {
			boolean status=lista.isEmpty();
			int tamanholista = lista.size();
			if(status==true) {
				lista.addFirst(vt[0]*2);
			}
			else if(tamanholista<3) {
				try {
					lista.addLast((int) vt[i]/2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(tamanholista>10) {
				try {
					lista.add(vt[i]*3, 5);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				try {
					lista.add(vt[i], 1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return lista;
	}
	
	public void operacao(listaint lista) {
		boolean status=lista.isEmpty();
		while(status!=true) {
			int tamanho = lista.size();
			if(tamanho>10) {
				try {
					int valor=lista.get(3);
					System.out.print(valor+" ");
					lista.remove(3);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			else if(tamanho>5) {
				try {
					int valor=lista.get(tamanho-1);
					System.out.print(valor+" ");
					lista.removeLast();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(tamanho>3){
				try {
					int valor=lista.get(1);
					System.out.print(valor+" ");
					lista.remove(1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
			
			else {
				try {
					int valor = lista.get(0);
					System.out.print(valor+" ");
					lista.removeFirst();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			status=lista.isEmpty();	
			}
			
		}
	}

