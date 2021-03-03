package _12_java_collection_framework.exercises.product_arraylist_linkedlist.araylist;

import java.util.*;

public class ProductMain {
    public static void main(String[] args) {
        List<Product>list = new ArrayList<>();
        list.add(new Product(1,"Sang" ,5000.1));
        list.add(new Product(2,"Dong" ,2000.0));
        list.add(new Product(3,"Cong" ,500.1));
        list.add(new Product(4,"Dong" ,1000.1));
        System.out.println("Menu Main \n" +
                "1.Add new product\n" +
                "2.Show all product\n" +
                "3.Edit product with id\n" +
                "4.Delete product with id\n" +
                "5.Search product by name\n" +
                "6.Sort product list \n" +
                "0.Exit");
        int choice ;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewProduct(list);
                    break;
                case 2:
                    showAllProduct(list);
                    break;
                case 3:
                    editProductWithId(list);
                    break;
                case 4:
                    deleteProductWithId(list);
                    break;
                case 5:
                    searchProductByName(list);
                    break;
                case 6:
                    sortProductList(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        }while (true);
    }

    private static void sortProductList(List<Product> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Ascending\n" +
                "2.Decreasing ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                Collections.sort(list, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getPrice().compareTo(o2.getPrice());
                    }
                });
                System.out.println("Already sorted");
                showAllProduct(list);
                break;
            case 2:
                Collections.sort(list, new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getPrice().compareTo(o1.getPrice());
                    }
                });
                System.out.println("Already sorted");
                showAllProduct(list);
                break;

        }

    }

    private static void searchProductByName(List<Product> list) {
        System.out.println("Enter the name you want to search");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        for (Product product:list) {
            if (product.getName().equals(searchName)){
                System.out.println(product);
                return;
            }
        }
        System.out.println(searchName+" don't have in product list");

    }

    private static void deleteProductWithId(List<Product> list) {
        for (Product product:list) {
            System.out.println(product.toString());
        }
        System.out.println("Choice id");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        list.removeIf(product -> id == product.getId());
        }

    private static void editProductWithId(List<Product> list) {
        for (Product product:list) {
            System.out.println(product.toString());
        }
        System.out.println("Choice id");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : list) {
            if (id == product.getId()) {
                System.out.println("Choice edit\n" +
                        "1.Edit Id\n" +
                        "2.Edit Name\n" +
                        "3.Edit Price\n" +
                        "0.Exit");
                int number = Integer.parseInt(scanner.nextLine());
                    switch (number) {
                        case 1:
                            System.out.println("Enter new id");
                            int newId = Integer.parseInt(scanner.nextLine());
                            product.setId(newId);
                            break;
                        case 2:
                            System.out.println("Enter new name");
                            String newName = scanner.nextLine();
                            product.setName(newName);
                            break;
                        case 3:
                            System.out.println("Enter new price");
                            Double newPrice = Double.parseDouble(scanner.nextLine());
                            product.setPrice(newPrice);
                            break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please try again");
                    }
            }
        }
        }


    private static void showAllProduct(List<Product> list) {
        for (Product product:list) {
            System.out.println(product.toString());
        }
    }

    private static void addNewProduct(List<Product> list) {
        System.out.println("Enter id");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        Double price = Double.parseDouble(scanner.nextLine());
        list.add(new Product(id,name,price));

    }
}
