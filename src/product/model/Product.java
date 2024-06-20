package product.model;

public class Product {
	
	private int code;
	private int type;
	private String name;
	private String description;
	private float price;
	private boolean attunementRequired;
	
	public Product (int code, int type, String name, String description, float price, boolean attunementRequired) {
		this.code = code;
		this.type = type;
		this.name = name;
		this.description = description;
		this.price = price;
		this.attunementRequired = attunementRequired;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	public boolean isAttunementRequired() {
		return attunementRequired;
	}

	public void setAttunementRequired(boolean attunementRequired) {
		this.attunementRequired = attunementRequired;
	}

	
	public void show() {
		
		String typeString = "";
		String attunementString = "";
		
		switch(this.type) {
		
		case 1:
			typeString = "Arma";
		break;
		
		case 2:
			typeString = "Armadura";
		break;
		
		}
		
		if (this.attunementRequired) {
			attunementString = "Sim";
		} else {
			attunementString = "Não";
		}
		
		System.out.println("\n***********************************************************");
		System.out.println("Mostrando dados do item " + this.code + ":");
		System.out.println("***********************************************************");
		System.out.println("Nome: " + this.name);
		System.out.println("Efeito mágico: " + this.description);
		System.out.println("Tipo: " + typeString);
		System.out.println("Preço: " + this.price);
		System.out.println("Requer sintonização: " + attunementString);
	}
}
