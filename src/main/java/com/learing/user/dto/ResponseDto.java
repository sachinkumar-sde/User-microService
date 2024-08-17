package com.learing.user.dto;


public class ResponseDto {
    private Bookdto bookdto;

    public ResponseDto() {
    }
    public ResponseDto(Bookdto bookdto) {
        this.bookdto = bookdto;
    }

    public Bookdto getBookdto() {
        return bookdto;
    }

    public void setBookdto(Bookdto bookdto) {
        this.bookdto = bookdto;
    }
}
