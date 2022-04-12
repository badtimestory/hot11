console.log("cart list");


const delete_btn=document.getElementsByClassName("delete_btn");
const check=document.getElementsByClassName("check");

const allCheck=document.querySelector("#allCheck")
const selectDelBtn=document.getElementById("selectDelBtn");
const checks=document.querySelector("#checks");
const delBtn=document.querySelector(".delBtn");
const list=document.querySelector(".list");
const getList=document.querySelector(".getList");
const m_id=document.querySelector("#m_id");

//주문정보 입력 확인
// const orderInfo_btn=document.querySelector(".orderInfo_btn");

const order_btn=document.querySelector(".order_btn");
const o_name=document.querySelector("#o_name");
const o_phone=document.querySelector("#o_phone");
const o_address=document.querySelector("#o_address");


// orderInfo_btn.addEventListener("click",function(){
//     if(set.value==''){
//         alert("장바구니에 상품을 추가해주세요.");
//         return;
//     }
// });

order_btn.addEventListener("click",function(){

    if(o_name.value==''){
        alert("주문자의 성함을 입력해주세요.");
        o_name.focus();
        return;
    }
    if(o_phone.value==''){
        alert("핸드폰 번호를 입력해주세요.");
        o_phone.focus();
        return;
    }

    if(o_address.value==''){
        alert("주소를 입력해주세요.");
        o_address.focus();
        return;
    }
    alert("주문 성공하셨습니다.");

});

// delBtn.addEventListener("click",function(){
//     let confirm_val=confirm("삭제하시겠습니까?");
//     if(confirm_val){

//     const xhttp=new XMLHttpRequest();
    
//     let c = true;
//     let final="c_num=";
    
//     for(ch of check){
        
//         if(ch.checked){
//             xhttp.open("POST","../cart/selectDelete");
//             xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
//             let chnum=this.getAttribute("data-c_num");
//             final=final+chnum+"&c_num=";
//             c=false;
            
//             xhttp.send(final);
//             xhttp.onreadystatechange=function(){

//                 if(this.readyState==4&&this.status==200){
//                     console.log(this.responseText);
//                     if(this.response.trim()=='1'){
//                         alert("삭제되었습니다.");
//                         location.reload();
//                     }
//                     else{
//                         alert("삭제 실패");
//                     }
//                 }
//             }
//             }
//         }
    
//     }
 
  

// });

// let checkArr = new Array();
list.addEventListener("click",function(event){
 let check=event.target;
 if(check.classList.contains("check")){
     let c_num=event.target.getAttribute("data-c_num");
    
     console.log(c_num);
 }
});


allCheck.addEventListener("click",function(){
    // console.log("click all");
    for(agree of check){
        agree.checked=allCheck.checked;
        
    }
});


for(ch of check){
    ch.addEventListener("click",function(){
        // console.log("select");
        let final=true;

        for(c of check){
            if(!c.checked){
                final=false;

            }

        }
        allCheck.checked=final;
    })
};

//장바구니 list
function getCartList(){

    const xhttp2=new XMLHttpRequest();
    xhttp2.open("GET","../cart/cartList?m_id="+m_id.value);
    xhttp2.send();
    xhttp2.onreadystatechange=function(){
        if(this.readyState==4&&this.status==200){
            // console.log(this.responseText);
            getList.innerHTML=this.responseText.trim();
            
        }
    }
}

list.addEventListener("click",function(event){
    let delete_btn=event.target;

    if(delete_btn.classList.contains("delete_btn")){

        let c_num= event.target.getAttribute("data-c_num");
 
        console.log(c_num);
     
        const xhttp = new XMLHttpRequest();
    
        xhttp.open("POST","../cart/deleteCart");
    
        xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    
        xhttp.send("c_num="+c_num);
    
        xhttp.onreadystatechange=function(){
            if(this.readyState==4&&this.status==200){
    
                console.log(this.responseText);
                let result=this.responseText.trim();
    
                if(result=='1'){
                    alert("삭제하였습니다.");
                    location.reload();
    
                }else {
                    alert("삭제 실패");
                } 
            }       
        }
    

    }//else if

});


