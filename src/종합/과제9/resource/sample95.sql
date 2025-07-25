drop database if exists sample95;
create database sample95;
use sample95;

create table products(
	pno int auto_increment,
    pname varchar(30) not null,
    pcontent longtext not null,
    pprice varchar(7) not null,
    pdate datetime default now(),
    psale int default 0 ,
    puser varchar(30) not null,
    ppassword varchar(30) not null,
    primary key(pno)
);

INSERT INTO products VALUES (NULL, '콜라', '톡쏘는 탄산', '1200', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '사이다', '시원한 청량감', '1100', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '환타', '과일향 탄산', '1300', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '밀크티', '달콤한 홍차', '2500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '아이스커피', '진한 커피맛', '2000', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '레몬에이드', '새콤한 음료', '2200', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '복숭아 아이스티', '과일맛 아이스티', '2100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '딸기라떼', '딸기우유', '2300', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '바나나우유', '달콤한 바나나맛', '1700', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '초코우유', '진한 초코', '1800', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '그린티라떼', '녹차라떼', '2600', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '블루베리스무디', '상큼한 스무디', '3000', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '망고주스', '진한 망고 맛', '2700', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '오렌지주스', '생과일 느낌', '2400', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '사과주스', '상큼달콤', '2400', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '토마토주스', '건강한 맛', '2500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '코코넛워터', '이국적인 맛', '3200', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '에너지드링크', '기운이 펄펄', '2900', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '탄산수', '무맛 청량감', '1000', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '아메리카노', '진한 원두', '1800', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '카페라떼', '부드러운 우유', '2300', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '카푸치노', '거품 가득', '2300', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '바닐라라떼', '달달한 맛', '2500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '헤이즐넛라떼', '고소한 향', '2500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '카라멜마끼아또', '달콤쌉쌀', '2700', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '에스프레소', '한 잔의 진함', '1500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '핫초코', '따뜻한 달콤함', '2000', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '자몽에이드', '톡 쏘는 자몽', '2200', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '복숭아주스', '과일맛 가득', '2100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '청포도주스', '산뜻한 맛', '2100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '유자차', '겨울 필수', '2000', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '쌍화차', '기력 회복', '2200', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '매실차', '새콤한 전통차', '2100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '홍차', '기본의 맛', '1800', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '율무차', '고소한 맛', '2000', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '녹차', '깔끔한 마무리', '1800', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '모과차', '달콤쌉쌀', '1900', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '옥수수차', '고소한 향', '1600', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '보리차', '담백한 기본', '1500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '아이스티', '기본 홍차 아이스티', '1900', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '라임에이드', '상큼한 탄산', '2200', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '딸기스무디', '딸기 듬뿍', '3000', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '망고스무디', '트로피컬 스무디', '3100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '초코스무디', '초코맛 폭발', '3100', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '아보카도주스', '건강한 맛', '3500', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '크랜베리주스', '달콤한 과일', '2700', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '파인애플주스', '열대과일 향기', '2600', NOW(), 0, 'admin', '1234');
INSERT INTO products VALUES (NULL, '코코아', '따뜻한 달콤함', '2000', NOW(), 1, 'admin', '1234');
INSERT INTO products VALUES (NULL, '딸기우유', '어릴적 그맛', '1800', NOW(), 0, 'admin', '1234');



select *from products;