import java.util.ArrayList;

public class Estado {

	
	public ArrayList<Municipio> listaDeMunicipios = new ArrayList<Municipio>();
	
	public Estado(Municipio ...municipios )	{
		for(int i = 0; i < municipios.length;i++) {
			listaDeMunicipios.add(municipios[i]);
		}
	}
	
	public void incluir( Municipio municipio) {	// inclui um novo munic�pio no estado
		this.listaDeMunicipios.add(municipio);
	}
	
	public int populacao() {// calcula e retorna a popula��o total do estado
		int populacao = 0;
		for(Municipio municipio : listaDeMunicipios) {
			populacao += municipio.populacao();
		}
		return populacao;
	}
	
	public double area() {// calcula e retorna a �rea total do estado
		double area = 0;
		for(Municipio municipio : listaDeMunicipios) {
			area += municipio.area();
		}
		return area;
	}
	double densidade() {
		return populacao() / area(); 
	}
}
