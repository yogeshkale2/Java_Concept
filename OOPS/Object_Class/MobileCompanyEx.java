class Mobile {
    String CompanyName;
    String Model;
    int Price;

    public Mobile(String CompanyName, String Model, int Price) {
        this.CompanyName = CompanyName;
        this.Model = Model;
        this.Price = Price;

    }

    public void MobileInfo() {
        System.out.println("Company Name : " + CompanyName);
        System.out.println("Model Name : " + Model);
        System.out.println("Price : " + Price);
    }

}

public class MobileCompanyEx {
    public static void main(String[] args) {
        Mobile obj = new Mobile("Samsung", "S24", 70000);
        obj.MobileInfo();
    }

}
