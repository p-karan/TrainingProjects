"use strict";
class Book {
    constructor(bookNo, bookName, price) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.price = price;
    }
    toString() {
        return `${this.bookNo},${this.bookName},${this.price}`;
    }
}
