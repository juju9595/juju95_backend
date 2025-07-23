drop database if exists exam10;
create database exam10;
use exam10;

create table board(
	bno int auto_increment,
    bcontent longtext not null,
    bwriter varchar(30) not null,
    constraint primary key(bno)
);

# 샘플
insert into board( bcontent, bwriter ) values( '안녕하세요', '유재석');
INSERT INTO board (bcontent, bwriter) VALUES ('오늘 날씨가 좋네요', '강호동');
INSERT INTO board (bcontent, bwriter) VALUES ('점심 뭐 먹지?', '이효리');
INSERT INTO board (bcontent, bwriter) VALUES ('자바 공부 중입니다.', '김종국');
INSERT INTO board (bcontent, bwriter) VALUES ('SQL 어렵지 않아요!', '박명수');
INSERT INTO board (bcontent, bwriter) VALUES ('좋은 하루 되세요~', '하하');
INSERT INTO board (bcontent, bwriter) VALUES ('운동 열심히 합시다', '정준하');
INSERT INTO board (bcontent, bwriter) VALUES ('프로그래밍 재미있어요', '유희열');
INSERT INTO board (bcontent, bwriter) VALUES ('점점 나아지고 있어요', '신동엽');
INSERT INTO board (bcontent, bwriter) VALUES ('오늘도 화이팅!', '서장훈');
INSERT INTO board (bcontent, bwriter) VALUES ('저녁 뭐 먹을까요?', '김연아');
INSERT INTO board (bcontent, bwriter) VALUES ('내일은 주말이에요', '장원영');
INSERT INTO board (bcontent, bwriter) VALUES ('파이팅 넘치는 하루', '아이유');
INSERT INTO board (bcontent, bwriter) VALUES ('지각하지 마세요!', '정해인');
INSERT INTO board (bcontent, bwriter) VALUES ('회의 너무 길어요', '박보검');
INSERT INTO board (bcontent, bwriter) VALUES ('다이어트는 내일부터', '홍진경');
INSERT INTO board (bcontent, bwriter) VALUES ('코딩 실력 늘고 있어요', '노홍철');
INSERT INTO board (bcontent, bwriter) VALUES ('커피가 필요해요', '이광수');
INSERT INTO board (bcontent, bwriter) VALUES ('늦잠 잤어요ㅠㅠ', '장도연');
INSERT INTO board (bcontent, bwriter) VALUES ('오늘도 출근!', '이서진');
INSERT INTO board (bcontent, bwriter) VALUES ('무한도전 보고싶다', '정형돈');
INSERT INTO board (bcontent, bwriter) VALUES ('요즘 감기 조심하세요', '유인나');
INSERT INTO board (bcontent, bwriter) VALUES ('오늘은 책을 읽었어요', '김태호');
INSERT INTO board (bcontent, bwriter) VALUES ('프로젝트 끝났다!', '조세호');
INSERT INTO board (bcontent, bwriter) VALUES ('놀면 뭐하니?', '이적');
INSERT INTO board (bcontent, bwriter) VALUES ('내일은 비 온대요', '정은지');
INSERT INTO board (bcontent, bwriter) VALUES ('밥은 먹고 다니세요?', '이상순');
INSERT INTO board (bcontent, bwriter) VALUES ('운동하고 왔어요', '배성재');
INSERT INTO board (bcontent, bwriter) VALUES ('요즘 재밌는 드라마?', '전소민');
INSERT INTO board (bcontent, bwriter) VALUES ('스케줄이 너무 많아요', '이제훈');
INSERT INTO board (bcontent, bwriter) VALUES ('시간이 너무 빨라요', '류준열');
INSERT INTO board (bcontent, bwriter) VALUES ('게임 한 판 하실래요?', '김세정');
INSERT INTO board (bcontent, bwriter) VALUES ('혼밥 최고', '김희철');
INSERT INTO board (bcontent, bwriter) VALUES ('야근은 이제 그만', '이동욱');
INSERT INTO board (bcontent, bwriter) VALUES ('커리어 고민 중입니다', '장기하');
INSERT INTO board (bcontent, bwriter) VALUES ('퇴사하고 싶다...', '조이');
INSERT INTO board (bcontent, bwriter) VALUES ('치킨 먹고 싶어요', '수지');
INSERT INTO board (bcontent, bwriter) VALUES ('연봉협상 힘들어요', '김고은');
INSERT INTO board (bcontent, bwriter) VALUES ('스트레칭 하세요~', '정소민');
INSERT INTO board (bcontent, bwriter) VALUES ('소확행을 느끼는 중', '이승기');
INSERT INTO board (bcontent, bwriter) VALUES ('휴가 가고 싶어요', '정유미');
INSERT INTO board (bcontent, bwriter) VALUES ('여름 너무 더워요', '신민아');
INSERT INTO board (bcontent, bwriter) VALUES ('독서 추천해주세요', '공유');
INSERT INTO board (bcontent, bwriter) VALUES ('새로운 취미 시작했어요', '박서준');
INSERT INTO board (bcontent, bwriter) VALUES ('프론트엔드 어렵다', '김혜수');
INSERT INTO board (bcontent, bwriter) VALUES ('지금 카페예요 ☕', '정해인');
INSERT INTO board (bcontent, bwriter) VALUES ('출근길 지옥철ㅠㅠ', '장나라');
INSERT INTO board (bcontent, bwriter) VALUES ('벌써 7월이라니', '고경표');
INSERT INTO board (bcontent, bwriter) VALUES ('계획대로 되고 있어요', '윤아');
