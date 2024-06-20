package product.model;

public class Weapon extends Product {
	
	private String baseDamageDice;
	
	public Weapon(int code, int type, String name, String description, float price, boolean attunementRequired, String baseDamageDice) {
		super(code, type, name, description, price, attunementRequired);
		this.baseDamageDice = baseDamageDice;
	}

	public String getDamageDice() {
		return baseDamageDice;
	}

	public void setDamageDice(String damageDice) {
		this.baseDamageDice = damageDice;
	}
	
	@Override
	public void show() {
		super.show();
		
		System.out.println("Dados de dano: " + this.baseDamageDice + "\n");
	}
}
