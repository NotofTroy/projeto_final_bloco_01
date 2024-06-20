package product.model;

public class Weapon extends Product {
	
	private String damageDice;
	
	public Weapon(int code, int type, String name, String description, float price, boolean attunementRequired, String damageDice) {
		super(code, type, name, description, price, attunementRequired);
		this.damageDice = damageDice;
	}

	public String getDamageDice() {
		return damageDice;
	}

	public void setDamageDice(String damageDice) {
		this.damageDice = damageDice;
	}
	
	@Override
	public void show() {
		super.show();
		
		System.out.println("Dados de dano: " + this.damageDice);
	}
}
