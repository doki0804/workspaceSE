/**********************member insert************************/
insert into userinfo(userid,password,name,email) values('guard1','1111','김경호1','guard1@korea.com');
insert into userinfo(userid,password,name,email) values('guard2','2222','김경호2','guard2@korea.com');
insert into userinfo(userid,password,name,email) values('guard3','3333','김경호3','guard3@korea.com');

/**********************product insert************************/

insert into product values(1, '비글', 550000, 'bigle.png','기타 상세 정보 등...', 0);
insert into product values(2, '달마시안', 500000, 'dalma.jpg','기타 상세 정보 등...', 0);
insert into product values(3, '퍼그', 400000, 'pug.jpg','기타 상세 정보 등...', 0);
insert into product values(4, '페키니즈', 450000, 'pekiniz.png','기타 상세 정보 등...', 0);
insert into product values(5, '포메라니안', 800000, 'pomeranian.jpg','기타 상세 정보 등...', 0);
insert into product values(6, '샤페이', 700000, 'shaipei.jpg','기타 상세 정보 등...', 0);
insert into product values(7, '닥스훈트', 800000, 'dachshund.jpg','기타 상세 정보 등...', 0);
insert into product values(8, '사모예드', 800000, 'samoyed.jpg','기타 상세 정보 등...', 0);

/**********************cart insert***************************/
--guard1
insert into cart(cart_no,cart_qty,userid,p_no) 
    values(cart_cart_no_SEQ.nextval,2,'guard1',1);
insert into cart(cart_no,cart_qty,userid,p_no) 
    values(cart_cart_no_SEQ.nextval,1,'guard1',8);
--gurad2    
insert into cart(cart_no,cart_qty,userid,p_no)
    values(cart_cart_no_SEQ.nextval,3,'guard2',2);
insert into cart(cart_no,cart_qty,userid,p_no)
    values(cart_cart_no_SEQ.nextval,2,'guard2',7);
    
/*********************order insert***********************/
--로그인한멤버(guard1)의 주문전체목록
/*
guard1 님이
    제품번호 1번 1마리
    제품번호 2번 2마리 제품을 주문
*/
--1.orders insert
insert into orders(o_no,o_desc,o_date,o_price,userid)
    values(orders_o_no_SEQ.nextval,'비글 외 1마리',sysdate,1550000,'guard1');

--2.order item insert
--제품번호 1번 1마리
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,1);
--제품번호 2번 2마리
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,2,orders_o_no_SEQ.currval,2);
    
/*
guard1 님이
    제품번호 3번 3마리
    제품번호 4번 4마리 제품을 주문
*/
--1.orders insert
insert into orders(o_no,o_desc,o_date,o_price,userid)
    values(orders_o_no_SEQ.nextval,'퍼그 외 7마리',sysdate,0000,'guard1');

--2.order item insert
--제품번호 3번 3마리
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,3,orders_o_no_SEQ.currval,3);
--제품번호 4번 4마리
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,4,orders_o_no_SEQ.currval,4);
    

