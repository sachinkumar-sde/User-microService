package com.learing.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bookdto {

    private UUID uuid;
    private String authorName;
    private String bookName;
    private Double bookPrice;
    private Integer bookEdition;
    private Integer quantity;
    private String category;

    public Bookdto(String authorName, String bookName, Double bookPrice, Integer bookEdition, Integer quantity, String category) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookEdition = bookEdition;
        this.quantity = quantity;
        this.category = category;
    }

    public Bookdto() {

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(Integer bookEdition) {
        this.bookEdition = bookEdition;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
