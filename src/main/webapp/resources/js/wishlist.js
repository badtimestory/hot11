const checkAll = document.getElementById('checkAll');
const check = document.getElementsByClassName('check');
const rules = document.getElementById('rules');
const cart_btn= document.getElementById("cart_btn");
const order_btn = document.getElementById("order_btn");
const del = document.querySelector(".del");
const w_num = document.querySelector("#w_num");
const p_num = document.querySelector("#p_num");
const delToWish = document.querySelector(".delToWish");
const m_id=document.querySelector("#m_id");

checkAll.addEventListener("click", function(){
    
    for(c of check){
        c.checked = checkAll.checked;
    }

});

rules.addEventListener("click", function(){
    let final=true;

    for(c of check){
        if(!c.checked){
            final = false;
        }
    }
    checkAll.checked=final;
});



//삭제
del.addEventListener("click", function(event){
    
    let w_num= event.target.getAttribute("data-w_num");
    
    
    console.log(w_num);
    
    //ajax
    //JS에서 요청객체(내장객체) 생성 (준비)
    const xhttp = new XMLHttpRequest();
    //요청정보 입력
    //open("method형식","url주소")
    xhttp.open("POST","../wishlist/delete");
    
    xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    //요청 전송
    //Post 요청시 파라미터
    xhttp.send("w_num="+w_num);
    
    xhttp.onreadystatechange=function(){
        if(this.readyState==4&&this.status==200){
            console.log(this.responseText);
            let result=this.responseText.trim();
            if(result=='1'){
                alert('삭제 성공');
              
            }else{
                alert('삭제 실패');
            }
        }
    }
    
    
});

//--------------------------------

