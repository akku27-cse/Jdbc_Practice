//callback
//sync
const hello=()=>{
    console.log("hello");
    
}
setTimeout(hello,2000)
console.log("hello");

const getData=(data,nex)=>{

setTimeout(()=>{
    console.log("data ",data);
    if(nex){
        nex();
    }
    
},2000);

}

getData(1,()=>{
    getData(2,()=>{
        getData(3,()=>{
            getData(4);
        })
    });
})
console.log("finishg");


//promise
const promise=new Promise((resolve,reject)=>{
    console.log("promimces");
    reject();
    
})

function asyncFun1(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data1");
            resolve("success");
        }),5000
    })
}
function asyncFun12(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data12");
            resolve("success");
        }),5000
    })
}
function asyncFun13(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("data13");
            reject("err");
        }),5000
    })
}

//use of promise
const p1=asyncFun1();
p1.then((result) => {
    console.log(result);
    console.log("DAta 2 fetching....");
    const p2=asyncFun12();
    p2.then((result) => {
       console.log(result);
       console.log("data 3 fetching");
       const p3=asyncFun13();
       p3.then((result) => {
        console.log(result);
        
       }).catch((err) => {
        console.log(err);
        
       });
       
        
    }).catch((err) => {
        console.log(err);
        
    });

    
}).catch((err) => {
   console.log(err);
    
});