console.log("cart list");
const result=document.getElementById("result");
const plus=document.getElementById("plus");
const minus=document.getElementById("minus");

const id=document.getElementById("id");
const amount=document.getElementById("amount");





plus.addEventListener("click",function(){
    
    let number=result.value;
    number=parseInt(number)+1; 
    result.value=number; 
  
    
    // let pprice=parseInt(price.innerText);
    // let pamount=parseInt(amount.innerHTML);
    // pamount=pprice*(result.value);
    // console.log(pamount);
    
    if(result.value>50){
        alert("재고가 없습니다.")
        result.value=50;
    } 
});

minus.addEventListener("click",function(){
    let number=result.value;
    number=parseInt(number)-1;
    result.value=number;
    
    if(result.value<0){
        alert("1개 이상 구매가 가능합니다.");
        result.value=1;
}   
});



// function count(type){
//     const result=document.getElementById('result');

// onclick='count("minus")'

//     let number= result.value;
//     if(type==='plus'){
//         number=parseInt(number)+1;
//     }else if(type==='minus'){
//         number=number-1;

//     }
//     result.value=number;
// }