package com.zeogonal.solidshop.products;

public class Book extends Product {

    private final String author;
    private final int numberOfPages;


    protected Book(String name, String description, int price, String id, String manufacturer, String author, int numberOfPages) {
        super(name, description, price, Category.BOOKS, id, manufacturer);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        if (!super.equals(o)) return false;

        if (numberOfPages != book.numberOfPages) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + numberOfPages;
        return result;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
