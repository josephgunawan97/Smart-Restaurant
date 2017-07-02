package Menu;


public class Order{
	
	public Menus makanan;
	public int jumlah;
	public double bill;
	
	public Order(Menus n,int x)
	{
		makanan=n;
		jumlah=x;
		bill=(n.harga)*x;
	}
	
}
