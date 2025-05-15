import java.util.*;

class Product <T extends Comparable<T>> implements Comparable <Product <T>> { // class product generic T yang membandingkan dengan Comparable agar bisa dibandingkan dengan product lain
    private int id; //deklarasi atribut id , name, price, dan category
    private String name;
    private double price;
    private T category; //menyimpan kategori bertipe generic T

    public Product(int id, String name, double price, T category) { //constructor utk menginisialisai semua atribut object
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getId() { //mengambil nilai id
        return id;
    }

    public String getName() { //mengambil nilai nama
        return name;
    }

    public double getPrice() { //mengambil nilai harga
        return price;
    }

    public T getCategory() { //mengambil nilai kategori
        return category;
    }

    @Override
    public int compareTo(Product<T> other) { //method utk membandingan product dengan product lain, override
        return this.category.compareTo(other.category); //membandingkan 2 product berdasarkan kategori
    }

    @Override
    public String toString() { //method format untuk menampilkan product dengan nilai string, override
        return String.format("ID : %d | Nama Barang : %s | Kategori : %s | Harga : %.2f ", id, name, category, price); //format utk menampilkan product 
    }
}

class ProductManeger {

    private List <Product<?>> products;
    private Set<String> categories;
    Queue<Product<?>> prosesbedasarkanantrianProducts;

    public ProductManeger() { //method constructor
        products = new ArrayList<>(); //membuat list
        categories = new HashSet<>(); //membuat set
        prosesbedasarkanantrianProducts = new LinkedList<>(); //membuat queue
    }

    public void addProduct(Product<?> product) { //method utk menambahkan produk baru
        products.add(product); //menambahkan product ke list product
        categories.add(product.getCategory().toString()); //mengambil product dengan cara getCategory mengubah menjadi string dan menambahkan dalam set categories
    }

    public boolean removeProduct(int id) { //method utk menghapus produk ini bertipe boolean
        Iterator<Product<?>> iterator = products.iterator(); //menggunakan iterator untuk mengakses setiap product
        while (iterator.hasNext()) { //mengakses setiap product
            Product<?> product = iterator.next(); //mengambil product ada wildcard
            if (product.getId() == id) { //mengakses id product 
                iterator.remove(); //menghapus bedasarkan id yang ada
                return true; //jika benar maka akan terhapus product yang ada dalam list product
            }
        }
        return false; //false apabila id tidak ada dalam list product
    }

    public List<Product<?>> cariBedasarkanNama (String name) { //method mencari produk berdasarkan nama
        List<Product<?>> hasil = new ArrayList<>();

        for (Product<?> product : products) { //looping utk setiap elemen antrian bedasarkan product
            
            if (product.getName().equalsIgnoreCase(name)) { //mengakses nama product serta mencari nama product tanpa menghawatirkan huruf besar kecilnya
                hasil.add(product);
            }
        }
        return hasil; //menampilkan hasil dari pencarian produk berdasarkan nama
    }

    public List<Product<?>> cariBedasarkanKategori (String category) { //method mencari produk berdasarkan kategori
        List<Product<?>> hasilKategori = new ArrayList<>();

        for (Product<?> product : products) { //looping utk setiap elemen antrian bedasarkan product

            if (product.getCategory().toString().equalsIgnoreCase(category)) { //mengakes kategori product serta mencari kategori product tanpa menghawatirkan huruf besar kecilnya
                hasilKategori.add(product);
            }
        }
        return hasilKategori; //menampilkan hasil dari pencarian produk berdasarkan kategori
    }
    
    public void displayCategories() { // method dimana akan menampilkan category tiap product
        
        for (String category : categories) { //looping utk setiap elemen antrian categories
            System.out.println(category); // menampilkan categories tiap product dengan format toString
        }
    }

    public boolean prosesProductById(int id) { //method dimana akan mengakses product berdasarkan id
        Iterator <Product<?>> it = products.iterator(); // menggunakan iterator untuk mengakses setiap product dengan variabel it
        while (it.hasNext()) { //melakukan looping apabila masih ada product yang belum di proses
            Product<?> P = it.next(); //iterator mengakses product dengan variabel P
            if (P.getId() == id) { //id dimana jika id product ada maka akan mengakses product tersebut
                it.remove(); //id tadi akan di hapus dengan iterator
                prosesbedasarkanantrianProducts.offer(P); // menambahkan proses yang sudah diproses sblm nya ke dalam variabel P kedalam antrian prosesbedasrakanantrian
                return true; //jika benar maka akan menampilkan proses product by id
            }
        }
        return false;
    }

    public void displayProcessedProdutcs() { //method dimana akan menampilkan product yang sedang di proses

        for (Product <?> p : prosesbedasarkanantrianProducts) { //looping utk setiap elemen antrian prosesbedasarkanantrianProducts
            System.out.println(p); //menampilkan product yang sedang di proses dengan format to string
        }
    }

    public void displaySortedProducts() {
        List<Product<?>> sortedList = new ArrayList<>(products); //membuat salinan product ke dalam variabel sortedList
        sortedList.sort((p1, p2) -> ((Comparable)p1.getCategory()).compareTo(p2.getCategory())); //variabel sortedList akan di 
        for (Product<?> p : sortedList) { // looping utk setiap elemen antrian sortedList
            System.out.println(p); // menampilkan product yang sudah diurutkan berdasarkan kategori dengan format to string
        }
    }
}

public class MarketPlace {
    public static void main(String[] args) {
        ProductManeger manager = new ProductManeger(); //inisialisasi object ProductManeger menjadi manager

        manager.addProduct(new Product(1, "Biskuit", 10.000, "Makanan")); // menambahkan product baru
        manager.addProduct(new Product(2, "Matcha Latte", 5.000, "Minuman"));
        manager.addProduct(new Product(12, "Kacamata", 25.000, "Aksesoris"));
        manager.addProduct(new Product(5, "Earphone", 50.000, "Elektronik"));

        System.out.println("Menampilkan Semua Produk :");
        manager.displaySortedProducts(); // beruguna untuk menampilkan semua produk berdasarkan kategori

        System.out.println("\nCari Produk dengan nama 'Matcha Latte' : ");
        List <Product<?>> cariList = manager.cariBedasarkanNama("Matcha Latte"); // menacari produk berdasarkan nama
        cariList.forEach(System.out ::println); //output keluaran dari mencari nama

        System.out.println("\nCari Produk dengan kategori 'Makanan' : ");
        List <Product<?>> cariProducts = manager.cariBedasarkanKategori("Makanan");
        cariProducts.forEach(System.out ::println); //output keluaran dari mencari kategori

        manager.removeProduct(2); //menghapus produk dengan id 2

        manager.prosesProductById(1); // menentukan produk mana yang di proses dan akan di tampilkan
        manager.prosesProductById(12);

        System.out.println("\nMenampilkan produk yang sedang diproses : ");
        manager.displayProcessedProdutcs(); // untuk menampilkan produk yang telah diproses

        System.out.println("\nMenampilkan Ketegori Produk : ");
        manager.displayCategories(); // untuk menampilkan kategori produk

        System.out.println("\nProduk yang di sorted : ");
        manager.displaySortedProducts(); //menampilkan produk yang blm di panggil/sisa nya
    }
}
