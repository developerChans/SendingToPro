package com.example.SendingToPro.src.Book.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class BookSellNotice {
    private int sellId;
    private int bookId;
    private int studId;
    private int bookState;
    private int sellPrice;
    private int sellState;
    private int contactState;
    private String sellorText;
}
