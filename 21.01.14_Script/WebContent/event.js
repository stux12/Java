window.onload = function() { //객체.속성=값 --> 이벤트=이벤트처리함수
//tag 사용 없이 로드	
	var kong = document.getElementById("kong");
	
	if(kong != null){ //kong값이 있는지 확인
		
		//객체가만들어졌으면 실행됨
		if(kong.addEventListener){ //표준형인지 물어봄
			kong.addEventListener('click', kaja.JJIK, false);
		}else{
			kong.attachEvent('onclick', kaja.JJIK); //ie 일때 추가하기위해
		}	
	}
}

var kaja = {
		
				//event필요는 없지만
				//근데 써준이유는 표준형에서 호출해서 인자를 통해서 오기때문에 써줘야함
				//표준형 : 모든 브라우저마다 맞춰서 하자 = cross browsing
		JJIK : function(event){
			if(document.getElementById("kaja1") != null && document.getElementById("kaja2")!= null){
				document.getElementById("kaja1").innerHTML = "babo";
				document.getElementById("kaja2").innerHTML = "ondal";
			}
		}
}
