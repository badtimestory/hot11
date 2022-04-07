console.log("cart list");


const delete_btn=document.getElementsByClassName("delete_btn");
const check=document.getElementsByClassName("check");

const allCheck=document.querySelector("#allCheck")
const selectDelBtn=document.getElementById("selectDelBtn");
const checks=document.querySelector("#checks");
const delBtn=document.querySelector(".delBtn");
const list=document.querySelector(".list");

delBtn.addEventListener("click",function(){
    let confirm_val=confirm("삭제하시겠습니까?");
    if(confirm_val){

    
    let c = true;
    let final="c_num=";
    
    for(ch of check){

        if(ch.checked){
            let chnum=this.getAttribute("data-c_num");
            final=final+chnum+"&c_num=";
            c=false;

            }
        }
    
    }
 
  

});

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
    
    
                }else {
                    alert("삭제 실패");
                } 
            }       
        }
    

    }//else if

});


