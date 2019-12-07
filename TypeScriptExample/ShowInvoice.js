"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class OrderBook {
    constructor(orderNo) {
        this.orderNo = orderNo;
    }
    showInvoice(invRef) {
        let info = `${this.orderNo},${invRef.customerName},${invRef.amount * 10}`;
        console.log(info);
    }
}
const ramOrder = new OrderBook(101);
const tv = { invoiceNumber: 101, customerName: "Ramesh", amount: 4500, gst: "ABC101" };
ramOrder.showInvoice(tv);
