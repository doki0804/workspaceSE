desc cart;
/*
이름       널?       유형           
-------- -------- ------------ 
CART_NO  NOT NULL NUMBER(10)   
CART_QTY          NUMBER(10)   
USER_ID           VARCHAR2(20) 
P_NO              VARCHAR2(20) 
*/

--insert
insert into cart values(cart_cart_no_seq.nextval,1,'book1',6);

-- update
update cart set cart_qty=2 where user_id='book1';

--FK delete 
delete from cart where user_id='book1' and p_no=1;

--select
select * from cart c join product p on c.p_no = p.p_no;


