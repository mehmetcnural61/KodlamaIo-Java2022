package SecondDay.oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        //set value (değer atama)
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        //get  (okuma)
        //  System.out.println(product1.name);

        Product product2 = new Product();
        product2.setName("Nespresso Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(4);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Smeg Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(2);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("0555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Mehmet");
        individualCustomer.setLastName("Nural");

        CorporateCustomer corporateCustomer =new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Nural Enterprise");
        corporateCustomer.setPhoneNumber("0561");
        corporateCustomer.setCustomerNumber("123");
        corporateCustomer.setTaxNumber("V23242");

        Customer[] customers ={individualCustomer,corporateCustomer};



    }
}
