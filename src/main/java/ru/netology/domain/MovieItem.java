package ru.netology.domain;

import ru.netology.domain.PurchaseItem;
import ru.netology.manager.MovieManager;

// import lombok.AllArgsConstructor;
// import lombok.Data;
//import lombok.NoArgsConstructor;
//import ru.netology.domain.PurchaseItem;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class MovieItem {
    private int id;
    private int productId;
    private String productName;
    private int productPrice;
    private int count;
    private PurchaseItem fourth;
    private PurchaseItem fifth;
    private PurchaseItem sixth;
    private PurchaseItem seventh;
    private PurchaseItem eight;
    private PurchaseItem ninth;
    private PurchaseItem tenth;

    public MovieItem(int i, int i1, String first, int i2, int i3) {
    }

    public MovieItem(int i, String first, String film1, String detective) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
