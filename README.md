# naver0829study
네이버 클라우드 데브옵스 3기 수업
나중에도 여기다가 이 리포지터리가 뭐에대한 건지 설명쓰면됨 프로젝트같은거할때


git-bash  

(처음에 한번만 이메일과 유저명확인  
git config --global user.name "사용자명"  
git config --global user.email "사용자이메일")  

1.git init : git 과 연동할 폴더 초기화  
2.git remote add origin https://github.com/mongdamhwa/naver0829study.git : git 원격저장소에 새로 연결  
 오류가 나서 새로운 깃 저장소랑 연결이 안될경우  
 git remote set-url origin https://github.com/mongdamhwa/naver0829study.git : 기존 저장소와 연결끊고 set에 쓴 새저장소로 연결해줌  
3.git branch : branch 조회  
4.git add . 또는 git add 파일명 : 해당 파일들을 로컬저장소에 추가  
5.git commit -m 메세지 : 해당 메세지와 함께 위의 파일들을 로컬저장소에 커밋  
  -메세지에 공백이 없으면 그냥 써도 되는데 공백이 있으면 ""로 감싸주기  
6.git push origin 브랜치명 : 원격저장소의 해당 브랜치에 소스 보내기    
  -반대로 원격 저장소의 수정된 내용을 가져올경우  
  -git pull origin 브랜치명 (한글자라도 변경했으면 무조건 pull해주기
