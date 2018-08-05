package com.lucasfernandes.cursojava.aula46.exercicio;

import java.text.DecimalFormat;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial{
	DecimalFormat df = new DecimalFormat("##,###.###");
	public String toString() {
		return super.toString()+"Área: "+df.format(this.calcularArea())+"cm";
	}
}
