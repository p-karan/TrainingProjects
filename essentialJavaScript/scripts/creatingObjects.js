var app= (function(){
    var Product={};
    var Invoice={}
    Invoice.tv="Samsung";
    Product.id=101;
    Product.name="Sony Tv";

     Product.toString=function(){
        return this.id+","+this.name;
    }
    return {
        prod: Product.name,
        inv: Invoice
    };
})();

function display(){
/*    var funcRef=app.toString();
    console.log(funcRef);*/
console.log(app.prod);
    console.log(app.inv);

}
display();
