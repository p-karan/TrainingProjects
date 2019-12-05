function outer(){
    var name="Hello World";

    return  function() {

        return name;
    }
}

function displayName(){

    var funcRef=outer();
    console.log(funcRef);

    var capturePrivate=funcRef();
    console.log(capturePrivate);

}

displayName();