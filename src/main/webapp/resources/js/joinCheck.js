console.log("join Check");

const rule=document.getElementsByClassName("rule");
const checkAll=document.getElementById("checkAll");
const check=document.getElementsByClassName("check");
const btn=document.getElementById("btn");

checkAll.addEventListener("click",function(){

    for(agree of check){

        agree.checked=checkAll.checked;
    }
});

for(ch of check){
    ch.addEventListener("click",function(){
        let final=true;

        for(c of check){
            if(!c.checked){
                final=false;

            }
        }
        checkAll.checked=final;

    })
};

btn.addEventListener("click",function(){
    if(checkAll.checked){

        location.href="./join";

    }else{
        alert("약관에 동의가 필요합니다.");
    }

})