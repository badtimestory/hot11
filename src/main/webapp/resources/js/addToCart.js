const addToCart=document.querySelector(".addToCart");
const addCart_btn=document.querySelector(".addCart_btn");
const p_num=document.querySelector("#p_num");
const p_price=document.querySelector("#p_price");



//**장바구니 추가 */
function getCart(){

    const xhttp2=new XMLHttpRequest();
    xhttp2.open("GET","../product/list?p_num"+p_num.value);
    xhttp2.send();
    xhttp2.onreadystatechange=function(){
        if(this.readyState==4&&this.status==200){
            console.log(this.responseText);
            
        }
    }
}



addCart_btn.addEventListener("click",function(event){

    // let gdsNum=p_num.value;
    // let c_amount=p_price.value;

    // console.log(p_num.value);
    // console.log(p_price.value);
    
    // let cn=event.target;
    
    
        
        let gdsNum=event.target.getAttribute("data-pNum");
        let pPrice=event.target.getAttribute("data-p_price");
        let t_num=event.target.getAttribute("data-tNum");
        console.log(gdsNum);
        console.log(pPrice);
        console.log(t_num);
        
        //ajax
        //JS에서 요청객체(내장객체) 생성 (준비)
        const xhttp=new XMLHttpRequest();

        //요청정보 입력
        //open("method형식","url주소")
        xhttp.open("POST","../cart/add");

        //요청 header정보
        xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");

        //요청 전송
        //post 요청시 파라미터 
        xhttp.send("p_num="+gdsNum+"&c_amount="+pPrice+"&t_num="+t_num);
        // xhttp.send("p_num="+gdsNum);
        // xhttp.send("c_amount="+c_amount);

        //응답 처리
        xhttp.onreadystatechange=function(){
            if(this.readyState==4&&this.status==200){
            console.log(this.responseText);
            let result=this.responseText.trim();

            if(result=='1'){
                alert("장바구니에 추가되었습니다.");
                
            }else if(result=='0'){
                alert("로그인이 필요합니다");
            }else{
                alert("카트담기 실패")
            }

            }
        }


        
    
})