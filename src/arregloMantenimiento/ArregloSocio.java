package arregloMantenimiento;


import java.util.ArrayList;

import EntidadMantenimiento.entidadSocio;

public class ArregloSocio {
	
	private ArrayList<entidadSocio> lista=new ArrayList<entidadSocio>();
	
	public int tamaño(){
		return lista.size();
	}
	public entidadSocio obtener(int pos){
		return lista.get(pos);
	}
	public void agregar(entidadSocio obj){
		if(lista.size()==10000){
			obj.setCodigoSocio(1);
		}else{
			obj.setCodigoSocio(maxId()+1);
		}
		lista.add(obj);
	}
	public int maxId(){
		int max=10000;
		for (entidadSocio x : lista) {
			if(x.getCodigoSocio()>max)
				max=x.getCodigoSocio();
		}return max;
	}
	
	
}
