desc product;
/*
        p_no                          		VARCHAR2(20)		 NULL ,
		p_title                       		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		     NULL ,
		p_image                       		VARCHAR2(50)		 DEFAULT 'default.jpg'		 NULL ,
		p_desc                        		VARCHAR2(800)		 NULL 
 */
 
/**********************product insert************************/    
insert into product values(product_p_no_SEQ.nextval, '1', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '2', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '3', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '4', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '5', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '6', 25000, 'default.jpg','상세 정보...');
insert into product values(product_p_no_SEQ.nextval, '7', 25000, 'default.jpg','상세 정보...');

select*from product;

--p.k(상품번호)로 update
update product set p_title = '변경책', p_price = 33333, p_image = 'change.jpg' , p_desc = '이 책은 변경됐습니다' where p_no =5; 

--p.k(상품번호)로 delete
delete from product where p_no = 1;

--상품 번호로 찾기
select*from product where p_no = 5;

--상품 이름으로 찾기 

select*from product where p_title like '%'||'변경'||'%';