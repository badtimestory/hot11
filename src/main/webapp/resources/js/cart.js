console.log("cart list");


const delete_btn=document.querySelector(".delete_btn");
const check=document.getElementsByClassName("check");

const allCheck=document.querySelector("#allCheck")
const selectDelBtn=document.getElementById("selectDelBtn");


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



delete_btn.addEventListener("click",function(event){

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

});