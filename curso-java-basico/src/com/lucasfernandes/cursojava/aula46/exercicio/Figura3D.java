package com.lucasfernandes.cursojava.aula46.exercicio;

import java.text.DecimalFormat;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
	DecimalFormat df = new DecimalFormat("###,###.##");
	public String toString() {
		return super.toString()+"Área: "+df.format(this.calcularArea())+"cm²"+" - Volume: "+df.format(this.calcularVolume())+"cm³";
	}
}
