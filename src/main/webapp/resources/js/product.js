const plus=document.querySelector(".plus");
const minus=document.querySelector(".minus");

const p_count=document.getElementById("p_count");
// const p_price =document.getElementById("p_price");
const p_total=document.getElementById("p_total");
const p_stock=document.getElementById("p_stock");


plus.addEventListener("click",function(){
    
    let count=p_count.value;
    count=parseInt(count)+1;
    p_count.value=count; 
   
    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let total=p_total.value;
    total=parseInt(total)*1;
    p_total.value=total;

    p_total.value=(p_count.value)*(p_price.value);
    
  
    if(p_count.value>p_stock.value){
        alert("재고가 없습니다.")
        p_count.value=p_stock.value;
        p_total.value=(p_stock.value)*(p_price.value);
    } 
});

minus.addEventListener("click",function(){
    let count=p_count.value;
    count=parseInt(count)-1;
    p_count.value=count;

    let price=p_price.value;
    price=parseInt(price)*1;
    p_price.value=price;

    let total=p_total.value;
    total=parseInt(total)*1;
    p_total.value=total;

    p_total.value=(p_count.value)*(p_price.value);
    
    
    if(p_count.value<1){
        alert("1개 이상 구매가 가능합니다.");
        p_count.value=1;
        p_total.value=1*(p_price.value);
}   
});