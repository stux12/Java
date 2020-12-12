package Day19;

public class a {

	public static void main(String[] args) {
		
/*		
		# 버튼에 이미지 넣기
		1) C드라이브, D드라이브 컴폴더에 있는 이미지를 넣으려면 absolute path 선택한다
		absolute path 선택한다
		방법은 design 왼쪽 속성창에서
		아이콘-삼점버튼-absolute path... - breowse --이미지선택
		-속성창 text에는 "이미지"라는 글자 입력
		- 버튼 크기를 적당히 조절하면 이미지와 글씨가 잘 들어가 있는 것을 보게된다
		2) 만일 이클립스 src아래에 만든 images 패키지방에서 이미지를 가져와 넣으려면
		아이콘-삼점버튼-맨위 classpath resource를 선택한다
*/		
		
		
		// 아이콘은 https://iconmonstr.com/page/9/ png로 다운
		// 사진은 픽사베이
		
		
/*
 		 JToolbar
 		 -  src - new - 패키지하여 images폴더하나 준비한후
 		 	그안에 .png 파일들을 복사하여 넣는다
 		 - HToolbar를 design에 올리고
 		 # JButton을 드래그 드롭으로 넣은 후 속성창 icon에
 		 classpath를 선택하여
 		 color1.png를 넣고 text부분의 new button글자를 삭제한다
 		 				필요시 JToolbar의 행을 약간 늘려 크기를 맞춘다
 		 이어서 JButton을 추가한후 같은 방법으로 만들억나다
 		 라벨을 하나 만들어 글자를 넣은 후
 		 첫번째 툴바의 버튼 - 마오 - add event handler
 		 .... - mouse clicked .. 그리고 두번째 버튼 ~~~
 		 - 코딩한 후 만일 액박 에러시 JLabel lblnewlabel~~~ 문장을 상단에 올려 전역으로 만들면 된다
 */

/*
 		JTextarea 에 스크롤바 생기게 하기
 		그위에 JTextarea를 바로 올리면 viewport개념으로 크기가 일치한다
 		( 이것이 잘 안되면 먼저 JTextarea를 만들고
 		왼쪽 Structur 창 JTextarea에 마우스 놓고
 		마오 - surround with - scrollpane을 선택하면 조금 편리하다
 		소스참고) scrollPane.setViewportView(textArea);
 		실행시에는 JTextarea에 글자를 계속 넣어보고 한줄 길게 넣어보면
 		스크롤바가 both(가로줄 및 세로줄) 로 생긴다.
 */
		
/*
 		JComboBox
 		콤보박스 초기값은 속성 - model에서 입력한다
*/		
		
/*
 		JList
 		scrollpane 놓고 그위에 JList놓는다
 		이것이 잘 안되면 먼저 JList를 만들고
 		왼쪽 Structure 창 JList에 마우스 놓고
 		-마오- surround with- scrollpane을 선택하면 조금편리하다
 		
 		selection을 선택
 		ex) single-SELECTION
 		
 		visible rowcount를 선택
 		ex) 5개
 		
 		이벤트에서 listSelection -valueChanged 선택
 */
		
/*
 		JFileChooser
 		(system choose)
 		button 두개 만들고 이벤트
 			맨아래 custom은 창문 밖에 폐지
 */
	}
}
