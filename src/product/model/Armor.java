package product.model;

public class Armor extends Product {
	
	private int baseArmosClass;

	public Armor(int code, int type, String name, String description, float price, boolean attunementRequired, int baseArmosClass) {
		super(code, type, name, description, price, attunementRequired);
		this.baseArmosClass = baseArmosClass;
	}

	
	public int getArmorClass() {
		return baseArmosClass;
	}


	public void setArmorClass(int armorClass) {
		this.baseArmosClass = armorClass;
	}


	@Override
	public void show() {
		super.show();
		
		System.out.println("Classe de armadura base: " + this.baseArmosClass);
	}
}
