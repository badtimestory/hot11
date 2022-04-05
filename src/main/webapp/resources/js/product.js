const plus=document.querySelector(".plus");
const minus=document.querySelector(".minus");
const numBox=document.querySelector("#numBox");

// const p_price =document.getElementById("p_price");
const p_total=document.getElementById("p_total");
const c_stock=document.getElementById("c_stock");


plus.addEventListener("click",function(){
    
    let count=numBox.value;
    count=parseInt(count)+1;
    numBox.value=count; 
   
    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let total=p_total.value;
    total=parseInt(total)*1;
    p_total.value=total;

    p_total.value=(numBox.value)*(p_price.value);
    
  
    if(numBox.value>numBox.max){
        alert("재고가 없습니다.")
        numBox.value=numBox.max;
        p_total.value=(numBox.max)*(p_price.value);
     
    } 
  
});




minus.addEventListener("click",function(){
    let count=numBox.value;
    count=parseInt(count)-1;
    numBox.value=count; 
   
    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let total=p_total.value;
    total=parseInt(total)*1;
    p_total.value=total;

    p_total.value=(numBox.value)*(p_price.value);
    
    
    if(numBox.value<1){
        alert("1개 이상 구매가 가능합니다.");
        numBox.value=1;
        p_total.value=1*(p_price.value);
}   
});