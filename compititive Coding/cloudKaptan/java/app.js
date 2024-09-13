
let p={
    fullname:"sanr",
    age:29
}
let p1={
    fullname:"sanr",
    age:29
}
let persomn=function(sate,coum){
    console.log(this.fullname,sate,coum)
}
persomn.apply(p,["india","china"]);
persomn.call(p);
let newFun=persomn.bind(p);
console.log("ehii");
newFun()