const preview = document.querySelector('#preview');

function previewImage(event) {

  let file = event.files;

  // 확장자가 gif, jpg, jpeg, png만 올릴 수 있음
  if(!/\.(gif|jpg|jpeg|png)$/i.test(file[0].name)){
    alert("이미지 파일만 업로드 할 수 있습니다");
    
    // 선택한 파일 초기화
    event.outerHTML = event.outerHTML;

    document.querySelector('#preview').innerHTML = '';

  } else {
    
    // FileReader 객체 사용
    let reader = new FileReader();
  
    // 파일 읽기가 완료되었을떄 실행
    reader.onload = function(rst) {
      preview.innerHTML = '<img src="' + rst.target.result + '">';
    }
  
    // 파일 읽기
    reader.readAsDataURL(file[0]);  
  }
}


