package operacoes_poo;

public class Opera��es {
	
	
	//Atributos.
	private int   num1;
	private float num2; 
	private float soma;
	private float  sub;
	private float  div;
	private float  mult;
	private int    fat;
	
	
	//Construtores.
	public Opera��es() {	
	}


	public Opera��es(int num1, float num2, float soma, float sub, float div, float mult, int fat) {
		this.num1 = num1;
		this.num2 = num2;
		this.soma = soma;
		this.sub = sub;
		this.div = div;
		this.mult = mult;
		this.fat = fat;
	}
	

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public float getNum2() {
		return num2;
	}


	public void setNum2(float num2) {
		this.num2 = num2;
	}


	public float getSoma() {
		return soma;
	}


	public void setSoma(float soma) {
		this.soma = soma;
	}
	
	//M�todos de Classe.
	public void Somar() {
		
		 System.out.println("Soma = " + (this.getNum1()+this.getNum2()));
		
		 
	}
	
	public float getSub() {
		return sub;
	}


	public void setSub(float sub) {
		this.sub = sub;
	}
	
	
	//M�todos de Classe.
	public void Subtra��o() {
		
		 System.out.println("Subtra��o = " + (this.getNum1()-this.getNum2()));
	}
	
	
	public float getDiv() {
		return div;
	}


	public void setDiv(float div) {
		this.div = div;
	}
	
	//M�todos de Classe.
	public void Divis�o() {
		
		 System.out.println("Divis�o = " + (this.getNum1()/this.getNum2()));
	}
	
	
	public float getMult() {
		return mult;
	}


	public void setMult(float mult) {
		this.mult = mult;
	}
	
	//M�todos de Classe.
	public void Multiplica��o() {
		
		 System.out.println("Multiplica��o = " + (this.getNum1()*this.getNum2()));
	}
	
	
	public int getFat() {
		return fat;
	}


	public void setFat(int fat) {
		this.fat = fat;
	}
	
	//M�todos de Classe.
	public void Fatorial() {
		
		
		int fatorial = 1;
		
		for(int i = this.getNum1(); i >= 1; i--) {	
			fatorial *= i;	
		}
		
		num1 = fatorial;
		 System.out.println("Fatorial = " + this.getNum1());
	}
	

}
