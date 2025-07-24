drop database if exists sample95;
create database sample95;
use sample95;

create table products(
	pno int auto_increment,
    pnum varchar(10) not null,
    pname varchar(30) not null,
    pcontent longtext not null,
    pprice varchar(7) not null,
    pdate datetime default now(),
    psale int default 0 ,
    puser varchar(30) not null,
    ppassword varchar(30) not null,
    primary key(pno)
);

insert into products value (null, '1', '콜라', '톡쏘는 탄산', '1200', now(), 1 , 'admin', '1234');
insert into products value (null, '2', '사이다', '시원한 청량감', '1100', now(), 0 , 'admin', '1234');
insert into products value (null, '3', '환타', '오렌지 향 가득', '1300', now(), 1 , 'admin', '1234');
insert into products value (null, '4', '마운틴듀', '익스트림한 맛', '1500', now(), 0 , 'admin', '1234');
insert into products value (null, '5', '포카리스웨트', '이온음료의 정석', '1700', now(), 0 , 'admin', '1234');
insert into products value (null, '6', '게토레이', '스포츠 후엔 이거', '1600', now(), 0 , 'admin', '1234');
insert into products value (null, '7', '밀키스', '탄산 + 우유의 만남', '1400', now(), 0 , 'admin', '1234');
insert into products value (null, '8', '칠성사이다', '대한민국 대표 사이다', '1250', now(), 0 , 'admin', '1234');
insert into products value (null, '9', '레쓰비', '달달한 커피', '1000', now(), 1 , 'admin', '1234');
insert into products value (null, '10', 'TOP', '진한 커피', '1800', now(), 0 , 'admin', '1234');
insert into products value (null, '11', '몬스터', '에너지 충전 완료', '2500', now(), 0 , 'admin', '1234');
insert into products value (null, '12', '레드불', '날개를 달아줘요', '2700', now(), 0 , 'admin', '1234');
insert into products value (null, '13', '코카콜라 제로', '무설탕의 힘', '1300', now(), 1 , 'admin', '1234');
insert into products value (null, '14', '펩시', '콜라의 대항마', '1150', now(), 0 , 'admin', '1234');
insert into products value (null, '15', '웰치스', '포도향 가득', '1350', now(), 0 , 'admin', '1234');
insert into products value (null, '16', '트로피카나', '과일 맛 쥬스', '1400', now(), 0 , 'admin', '1234');
insert into products value (null, '17', '비타500', '비타민 충전', '1000', now(), 1 , 'admin', '1234');
insert into products value (null, '18', '데미소다', '사과의 청량함', '1200', now(), 0 , 'admin', '1234');
insert into products value (null, '19', '컨디션', '숙취해소엔 이거', '3000', now(), 0 , 'admin', '1234');
insert into products value (null, '20', '헛개수', '해장용 음료', '2000', now(), 0 , 'admin', '1234');
insert into products value (null, '21', '아침햇살', '쌀로 만든 음료', '1300', now(), 0 , 'admin', '1234');
insert into products value (null, '22', '홍삼원', '건강 충전', '3500', now(), 0 , 'admin', '1234');
insert into products value (null, '23', '카페라떼', '부드러운 커피', '1900', now(), 0 , 'admin', '1234');
insert into products value (null, '24', '아메리카노', '쓴 맛의 정석', '1800', now(), 1 , 'admin', '1234');
insert into products value (null, '25', '핫식스', '에너지 음료', '2300', now(), 0 , 'admin', '1234');
insert into products value (null, '26', '제주감귤주스', '상큼한 감귤', '1600', now(), 0 , 'admin', '1234');
insert into products value (null, '27', '복숭아 아이스티', '달달한 맛', '1400', now(), 0 , 'admin', '1234');
insert into products value (null, '28', '초코우유', '어릴적 추억', '1200', now(), 0 , 'admin', '1234');
insert into products value (null, '29', '딸기우유', '분홍 달콤함', '1200', now(), 0 , 'admin', '1234');
insert into products value (null, '30', '바나나우유', '국민 간식', '1300', now(), 0 , 'admin', '1234');
insert into products value (null, '31', '매일두유', '건강한 콩맛', '1500', now(), 0 , 'admin', '1234');
insert into products value (null, '32', '검은콩두유', '고소한 두유', '1600', now(), 0 , 'admin', '1234');
insert into products value (null, '33', '유자차', '겨울엔 이거지', '1700', now(), 0 , 'admin', '1234');
insert into products value (null, '34', '레몬에이드', '상큼한 탄산', '1800', now(), 1 , 'admin', '1234');
insert into products value (null, '35', '오렌지주스', '비타민C 가득', '1500', now(), 0 , 'admin', '1234');
insert into products value (null, '36', '딸기주스', '새콤달콤', '1600', now(), 0 , 'admin', '1234');
insert into products value (null, '37', '커피우유', '달달한 커피', '1200', now(), 0 , 'admin', '1234');
insert into products value (null, '38', '녹차라떼', '진한 녹차 풍미', '1700', now(), 0 , 'admin', '1234');
insert into products value (null, '39', '흑당밀크티', '대만 인기 음료', '2500', now(), 0 , 'admin', '1234');
insert into products value (null, '40', '티오피 스위트', '달달한 진한맛', '1800', now(), 0 , 'admin', '1234');
insert into products value (null, '41', '티오피 블랙', '깔끔한 블랙 커피', '1800', now(), 1 , 'admin', '1234');
insert into products value (null, '42', '이프로', '물 대신 마셔요', '1300', now(), 0 , 'admin', '1234');
insert into products value (null, '43', '생수', '맑고 깨끗한 물', '800', now(), 0 , 'admin', '1234');
insert into products value (null, '44', '에비앙', '프랑스 생수', '2000', now(), 0 , 'admin', '1234');
insert into products value (null, '45', '삼다수', '제주 생수', '1000', now(), 0 , 'admin', '1234');
insert into products value (null, '46', '초정탄산수', '무맛 탄산수', '1200', now(), 0 , 'admin', '1234');
insert into products value (null, '47', '라임탄산수', '상큼한 탄산', '1300', now(), 0 , 'admin', '1234');
insert into products value (null, '48', '자몽에이드', '달콤한 자몽맛', '1600', now(), 0 , 'admin', '1234');
insert into products value (null, '49', '석류주스', '여성에게 좋은', '1700', now(), 1 , 'admin', '1234');
insert into products value (null, '50', '홍차', '은은한 향', '1400', now(), 0 , 'admin', '1234');


select *from products;