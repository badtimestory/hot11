const fileDelBtn = document.querySelector('.fileDelBtn');
const file = document.querySelector('#file');

file.addEventListener('click', function(event){
  if(event.target.classList.contains('fileDelBtn')) {
    let check = confirm("파일을 삭제하시겠습니까?");

    if(!check) {
      return;
    }
    // 첨부파일의 파일번호를 가져옴
    let pf_num = event.target.getAttribute('data-fileNum');
    let pf_fileName = event.target.getAttribute('data-fileName');
    console.log("파일번호: " + pf_num);
    console.log("파일이름: " + pf_fileName);
    // JS에서 요청 객체 생성
    let xhttp = new XMLHttpRequest();
    // 요청 정보 입력
    // open('Method', 'URL');
    xhttp.open("POST", "./fileDelete");
    // 요청 header 정보
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    // 요청 전송
    xhttp.send("pf_num="+pf_num+"&pf_fileName="+pf_fileName);
    // 응답 처리
    xhttp.onreadystatechange = function() {
      if(this.readyState == 4 && this.status == 200) {
        console.log(this.responseTest);
        let result = this.responseText.trim();
        if(result == '1') {
          console.log("File 삭제");
          event.target.parentNode.remove();
        }
      }
    }
  }
});