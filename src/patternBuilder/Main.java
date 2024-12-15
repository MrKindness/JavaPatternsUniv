package patternBuilder;

public class Main {
    public static void main(String[] args) {
        Book bk = new Book.Builder("War and Peace")
                .inStock(false)
                .amountOfPages(999999)
                .price(1000)
                .build();
        System.out.println(bk.getName());
        System.out.println(bk.isInStock());
        System.out.println(bk.getPrice());
        System.out.println(bk.getAmountOfPages());
        System.out.println(bk.getPublishYear());
    }
}