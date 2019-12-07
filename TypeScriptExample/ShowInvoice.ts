import Invoice from "./Invoice";

class OrderBook{
    private orderNo:number;
    constructor(orderNo:number){
        this.orderNo=orderNo;
    }

    showInvoice(invRef:Invoice):void{
        let info =`${this.orderNo},${invRef.customerName},${invRef.amount*10}`;
        console.log(info);
    }
}

const ramOrder=new OrderBook(101);
const tv:Invoice={invoiceNumber:101,customerName:"Ramesh",amount:4500,gst:"ABC101"};

ramOrder.showInvoice(tv);