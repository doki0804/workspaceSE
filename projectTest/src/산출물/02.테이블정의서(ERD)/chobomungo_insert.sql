/**********************member insert************************/
insert into userinfo(user_id,user_pw,user_name,user_phone,user_address,user_email) values('book1','1111','정약용','010-1111-1111','서울시 중구','book1@korea.com');
insert into userinfo(user_id,user_pw,user_name,user_phone,user_address,user_email) values('book2','2222','이순신','010-2222-2222','서울시 관악구','book2@korea.com');
insert into userinfo(user_id,user_pw,user_name,user_phone,user_address,user_email) values('book3','3333','이방원','010-3333-3333','서울시 종로구','book3@korea.com');

/**********************product insert************************/

insert into product values(product_p_no_SEQ.nextval, '1', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '2', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '3', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '4', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '5', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '6', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '7', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '8', 25000, 'default.jpg','상세 정보...');



/**********************cart insert***************************/
--book1
insert into cart(cart_no,cart_qty,user_id,p_no) 
    values(cart_cart_no_SEQ.nextval,1,'book1',1);
insert into cart(cart_no,cart_qty,user_id,p_no) 
    values(cart_cart_no_SEQ.nextval,1,'book1',2);
--book2    
insert into cart(cart_no,cart_qty,user_id,p_no) values(cart_cart_no_SEQ.nextval,1,'book2',4);
insert into cart(cart_no,cart_qty,user_id,p_no)
    values(cart_cart_no_SEQ.nextval,2,'book2',5);
    
/*********************order insert***********************/
--book1
--1.orders insert
insert into orders(o_no,o_desc,o_date,o_price,user_id)
    values(orders_o_no_SEQ.nextval,'...',sysdate,41000,'book1');

--2.order item insert
--제품번호 3번 1권
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,3);
--제품번호 6번 1권
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,6);
    
--book2
--1.orders insert
insert into orders(o_no,o_desc,o_date,o_price,user_id)
    values(orders_o_no_SEQ.nextval,'...',sysdate,47000,'book2');

--2.order item insert
--제품번호 7번 1권
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,7);
--제품번호 8번 1권
insert into order_item(oi_no,oi_qty,o_no,p_no)
    values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,8);
    

