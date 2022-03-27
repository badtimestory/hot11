console.log("cart list");
const p_count=document.getElementById("p_count");
const plus=document.getElementById("plus");
const minus=document.getElementById("minus");
const p_price =document.getElementById("p_price");
const c_amount=document.getElementById("c_amount");

const id=document.getElementById("id");
const amount=document.getElementById("amount");





plus.addEventListener("click",function(){
    
    let count=p_count.value;
    count=parseInt(count)+1;
    p_count.value=count; 
   
    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let amount=c_amount.value;
    amount=parseInt(amount)*1;
    c_amount.value=amount;

    c_amount.value=(p_count.value)*(p_price.value);
    
  
    if(p_count.value>10){
        alert("재고가 없습니다.")
        p_count.value=10;
        c_amount.value=10*(p_price.value);
    } 
});

minus.addEventListener("click",function(){
    let count=p_count.value;
    count=parseInt(count)-1;
    p_count.value=count;

    
    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let amount=c_amount.value;
    amount=parseInt(amount)*1;
    c_amount.value=amount;

    c_amount.value=(p_count.value)*(p_price.value);
    
    if(p_count.value<1){
        alert("1개 이상 구매가 가능합니다.");
        p_count.value=1;
        c_amount.value=1*(p_price.value);
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