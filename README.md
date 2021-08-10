# teamproject_rebooting-cinema

선행 작업

1. 회원가입(관리자, 회원)

2. 관리자 => 영화관리
2. 회원의 마이페이지(예매 내역은 없겠지만, 회원정보 수정과 포인트는 조회 가능)
2. 아이디/비번 찾기

3. 일반회원이 영화 예매

회원 : 민성, 형민
관리자 : 태호, 선영

for (int i = 0; i = size; i++)  => 표준


첫 화면 CGV 인사를 시각적으로 표현
시작은 포인트 0, 현금 100,000 => 기본값
멤버쉽 등급
**** 포인트로 결제시 포인트 차감만 적용
회원가입시 Bronze 등급 => 결제가격의 3% 포인트 적립 
영화 1회 예매시 silver 등급 -> 5% 할인결제 + 포인트는 결제금액의 4%적립
영화 2회 예매시 gold -> 10% 할인 + 포인트는 결제금액의 5%적립
영화 3회 이상 예매시 platinum -> 15% 할인 + 포인트는 결제금액의 10% 적립

영화 예매를 하면 count를 늘려서 예매순위 정하기
아이디/비번 찾기, 
결제(포인트, 금액 = 100,000), 
연령제한(회원가입 나이기준 영화 관람나이), 
포인트 적립!!!! ,
 푸드코트 구현(팝콘, 콜라, 핫도그, 환타)

1.  로그인

1.1 관리자 로그인
	1.1.1  	영화관리
		1.1.1.1 영화 등록(제목, 연령,  가격, 상영시간, 종료시간)
		1.1.1.2 영화 삭제
		1.1.1.3 영화 수정
		1.1.1.4 영화 리스트 출력

	1.1.2 고객 회원정보 조회

	 // 1.1.3 푸드코트 관리(잠시 대기)


1.2 일반회원 로그인(등록된 영화가 없습니다. 얘로 처음 접속 시)

	1.2.1 영화 예매(리스트가 보여야 하고, 선택을 해서, 좌석선택, 결제까지 해야함 => 포인트, 현금(등급			에 따른 할인),    (푸드코트는 잠시 대기)

	1.2.2 마이페이지
		1.2.2.1 예매내역
		1.2.2.2 회원 정보 수정 
		1.2.2.3 포인트 조회


2.  회원가입
	
	2.1 관리자 회원가입

	2.2 회원의 회원가입(사용자 정보 입력) => 나이를 적어서 영화 등급에서 심사 // 전화번호 4자리로 하기
	
3. 아이디 비번 찾기

	3.1 본인인증(휴대폰번호) => 번호만 4자리로 // 기존회원은 이미 등록된 회원이고 아이디 출력(뒤에 		4자리는 *로 출력)

	3.2  비밀번호 찾기(id 입력받아서) => 비밀번호 재등록

0. 종료




2021.08.09 2차 팀미팅						
						

"미팅 목적 : 관리자, 고객의 domain(변수 선언) 및 필요 메서드 정리
p.s : pull request 추후 고려 , git push 작업 진행시 카톡에 push한다고 말해두기
commit시 다른 팀원들이 commit만 보고 작업 내용을 알 수 있도록 구체적으로 작성 
ex) commit -m ""2021-08-09 insult admin-movieAdd() method"	

String movieTitle				String name
int limitAge					int age
int ticketPrice					String email
String startTime				int phoneNum(4자리)
String endTime					String clientId
String adminID					String clientPW
String adminPW					------------------
boolean isAdmin					String level
						int membershipPoint
						int money = 100,000 초기값
				
adminController					clientController
				
CRUD Movie()					movieTicketing()
client info()					myPage()
adminSingup()					clientSingup()
findByNo() -> no = phoneNum			findByNo()
				

결제관련 클래스
int money;
int membershipPoint



					
						
						