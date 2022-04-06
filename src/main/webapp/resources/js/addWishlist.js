const addToWish=document.querySelector(".addToWish");
const addWish_btn = document.querySelector(".addWish_btn");
const p_num=document.querySelector("#p_num");
const p_price=document.querySelector("#p_price");

//관심상품 추가//
function getWish(){
const xhttp2=new XMLHttpRequest();
xhttp2.open("GET","../product/list?p_num"+p_num.value);
xhttp2.send();
xhttp2.onreadystatechange=function(){
    if(this.readyState==4&&this.status==200){
        console.log(this.responseText);
        
    }
}
}

addWish_btn.addEventListener("click", function(event){
  



    let wdsNum=event.target.getAttribute("data_pNum");
    
    let t_num = event.target.getAttribute("data_tNum");
   
   

    console.log(wdsNum);
    console.log(t_num); 
  

     //ajax
    //JS에서 요청객체(내장객체) 생성 (준비)
    const xhttp=new XMLHttpRequest();

    //요청정보 입력
    //open("method형식","url주소")
    xhttp.open("POST","../wishlist/add");
    
    xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
     //요청 전송
     //Post 요청시 파라미터
     xhttp.send("p_num="+wdsNum+"&t_num="+t_num);

     //응답처리
     xhttp.onreadystatechange=function(){
         if(this.readyState==4&&this.status==200){
             console.log(this.responseText);
             let result=this.responseText.trim();

             if(result=='1'){
                 alert("관심상품에 추가하였습니다.");
             }else if(result=='0'){
                 alert("로그인이 필요합니다.");
             }else {
                 alert("등록 실패")
             }
         }
     }
})
