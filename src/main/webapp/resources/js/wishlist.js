const checkAll = document.getElementById('checkAll');
const check = document.getElementsByClassName('check');
const rules = document.getElementById('rules');
const order_btn = document.getElementById("order_btn");
const del = document.querySelector(".del");
const w_num = document.querySelector("#w_num");
const delToWish = document.querySelector(".delToWish");
const m_id=document.querySelector("#m_id");
const add_btn=document.querySelector(".add_btn");
const t_num=document.querySelector("#t_num");
const p_num=document.querySelector("#p_num");
const del_ALL=document.querySelector(".del_ALL");
const left=document.querySelector(".left");
const addToCart=document.querySelector(".addToCart");
const addCart_btn=document.querySelector(".addCart_btn");
const p_price=document.querySelector("#p_price");
const table=document.querySelector(".table");
const delBtn=document.querySelector(".delBtn");

// delBtn.addEventListener("click",function(event){
//     let confirm_val=confirm("삭제하시겠습니까?");
//     if(confirm_val){
//         list.addEventListener("click",function(event){
//             let check=event.target;
//             //선택자
//             for(let i=0;i<check.length;i++){
//                 console.log();
   
//             }
//         })
//     }
// });


checkAll.addEventListener("click", function(){
    
    for(c of check){
        c.checked = checkAll.checked;
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
        checkAll.checked=final;
    })
};



//삭제
table.addEventListener("click", function(event){
    let del=event.target
    
    if(del.classList.contains("del")){
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
              location.reload();
            }else{
                alert('삭제 실패');
            }
        }
    }
    }
    
    
});

//**장바구니 추가 */
// function getCart(){

//     const xhttp2=new XMLHttpRequest();
//     xhttp2.open("GET","../wishlis/wishlistList?p_num"+p_num.value);
//     xhttp2.send();
//     xhttp2.onreadystatechange=function(){
//         if(this.readyState==4&&this.status==200){
//             console.log(this.responseText);
            
//         }
//     }
// }



// addCart_btn.addEventListener("click",function(event){

 
    
        
//         let gdsNum=event.target.getAttribute("data-pNum");
//         //let p_num= event.target.getAttribute("data-pNum")
//         let t_num=event.target.getAttribute("data-tNum")
        
        
       
      
//         console.log(gdsNum);
//         console.log(t_num);
//         //console.log(p_num);
        
        
        
        
//         //ajax
//         //JS에서 요청객체(내장객체) 생성 (준비)
//         const xhttp=new XMLHttpRequest();

//         //요청정보 입력
//         //open("method형식","url주소")
//         xhttp.open("POST","../cartList/add2");

//         //요청 header정보
//         xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");

//         //요청 전송
//         //post 요청시 파라미터 
//         xhttp.send("p_num="+gdsNum+"t_num="+t_num);
       

//         //응답 처리
//         xhttp.onreadystatechange=function(){
//             if(this.readyState==4&&this.status==200){
//             console.log(this.responseText);
//             let result=this.responseText.trim();

//             if(result=='1'){
//                 alert("장바구니에 추가되었습니다.");
                
//             }else if(result=='0'){
//                 alert("로그인이 필요합니다");
//             }else{
//                 alert("카트담기 실패")
//             }

//             }
//         }


        
    
// });
