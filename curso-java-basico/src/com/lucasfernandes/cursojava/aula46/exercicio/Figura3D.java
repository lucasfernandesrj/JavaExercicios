package com.lucasfernandes.cursojava.aula46.exercicio;

import java.text.DecimalFormat;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial, DimensaoVolumetrica {
	DecimalFormat df = new DecimalFormat("###,###.##");
	public String toString() {
		return super.toString()+"�rea: "+df.format(this.calcularArea())+"cm�"+" - Volume: "+df.format(this.calcularVolume())+"cm�";
	}
}
