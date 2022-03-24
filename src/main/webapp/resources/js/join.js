const pwResult=document.getElementById("pwResult");
const pwResult2=document.getElementById("pwResult2");
const pw=document.getElementById("pw");
const id=document.getElementById("id");
const pw2=document.getElementById("pw2");
const idResult=document.getElementById("idResult");
const name=document.getElementById("name");
const phone=document.getElementById("phone");
const email=document.getElementById("email");
const address=document.getElementById("address");
const birth=document.getElementById("birth");



const frm=document.getElementById("frm");
const btn=document.getElementById("btn");


//이메일 검증할때 사용하는 객체
// const email_rule= /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
// const email_id=document.getElementById("email_id") 
// email_id=$("#email_id").val();
// const email_domain=document.getElementById("email_domain") 
// email_domain=$("#email_domain").val();
// var mail="";

//이메일 검증


let pwCheck=true;

//비밀번호 길이 검증
pw.addEventListener("blur",function(){
    if(pw.value.length<8||pw.value.length>12){
        pwResult.innerHTML="8글자 이상 12글자 이하로 입력해주세요."
    }else{
        pwResult.innerHTML="사용가능한 비밀번호입니다.";
    }

})

//pw와 pw2가 같은지 검증
pw2.addEventListener("blur",function(){

    let message="비밀번호가 일치합니다";
    if(pw.value!=pw2.value){
        pwCheck=true;
        message="비밀번호가 일치하지 않습니다.";
        pw2.value="";

    }else{
        pwCheck=false;
    }
    pwResult2.innerHTML=message;
})

//검증이 끝나고 pw 를 수정했을경우
pw.addEventListener("change",function(){
    pwCheck=true;
    pw2.value="";
    pwResult2.value=""; //이거 둘중에 하나만 있어도 되지 않나
    pw2.focus();

    
})

//아이디 입력 후 검증 
id.addEventListener("blur",function(){
    if(id.value==''){
        idResult.innerHTML="아이디를 바르게 입력하세요."
    }else{
        idResult.innerHTML="";
    }
})


btn.addEventListener("click",function(){

    if(id.value==''){
        alert("아이디를 입력하세요.");
        id.focus();
        return;
    }

    if(pw.value==""||pw.value.length<8||pw.value.length>12){
        alert("비밀번호를 바르게 입력하세요.");
        pw.focus();
        return;

    }
    if(pwCheck){
        alert("비밀번호가 일치하지 않습니다.");
        pw2.focus();
        return;
    }
    if(name.value==""){
        alert("이름을 입력하세요.");
        name.focus();
        return;
    }
    if(phone.value==""){
        alert("핸드폰 번호를 입력하세요.");
        phone.focus();
        return;
    }
    if(email.value==""){
        alert("이메일을 입력하세요.");
        email.focus();
        return;

    }
    if(address.value==""){
        alert("주소를 입력하세요.");
        address.focus();
        return;
    }

    frm.submit();
    alert("회원가입 되었습니다.");

});

