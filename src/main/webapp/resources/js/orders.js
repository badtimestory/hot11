console.log("orders page")
const btn1=document.getElementById("btn1");
const o_name=document.getElementById("o_name");
const o_address=document.getElementById("o_address");
const o_phone=document.getElementById("o_phone");
const o_message=document.getElementById("o_message");
const frm=document.getElementById("frm")


btn1.addEventListener("click",function(){

    if(o_name.value==''){
        alert("이름을 입력해주세요.");
        o_name.focus();
        return;

    }
    if(o_address.value==''){
        alert("주소를 입력해주세요.");
        o_address.focus();
        return;

    }

    if(o_phone.value==''){
        alert("핸드폰번호를 입력해주세요");
        o_phone.focus();
        return;

    }
    if(o_message.value==''){
        alert("배송메시지를 입력해주세요.");
        o_message.focus();
        return;
    }
    frm.submit();
    alert("주문 완료되었습니다.");
})