package patternBuilder;

public class Book {
    private final String name;
    private final Integer price;
    private final Integer amountOfPages;
    private final boolean isInStock;
    private final Integer publishYear;

    private Book(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.amountOfPages = builder.amountOfPages;
        this.isInStock = builder.isInStock;
        this.publishYear = builder.publishYear;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmountOfPages() {
        return amountOfPages;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    static class Builder {
        private String name;
        private Integer price;
        private Integer amountOfPages;
        private boolean isInStock;
        private Integer publishYear;

        public Builder(String name) {
            this.name = name;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Builder amountOfPages(Integer amount) {
            this.amountOfPages = amount;
            return this;
        }

        public Builder inStock(Boolean isIn) {
            this.isInStock = isIn;
            return this;
        }

        public Builder publishYear(Integer year) {
            this.publishYear = year;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
