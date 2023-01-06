desc orders;
/*
이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(800) 
O_PRICE          NUMBER(10)    
O_DATE           DATE          
USER_ID          VARCHAR2(20)  
*/
desc order_item;
/*
OI_NO  NOT NULL NUMBER(10)   
OI_QTY          NUMBER(10)   
P_NO            VARCHAR2(20) 
O_NO            NUMBER(10)   
*/
--insert
insert into orders values(orders_o_no_seq.nextval,'..',10000,sysdate,'book2');
insert into order_item values(order_item_oi_no_SEQ.nextval,1,8,orders_o_no_SEQ.currval);
-- update
/*
update (select * from orders O join order_item oi
    on o.o_no = oi.o_no) set o_desc='^^', o_price=50000 
    where user_id='book2' and p_no= 8;
*/
update orders set o_desc = ' ', o_price = 30000 where o_no=7;
update order_item set oi_qty = 2 where o_no = 7 and p_no=8;


--FK delete 
delete from orders where user_id='book2';
delete from order_item where o_no = 6 and p_no=8;
--select
select * from orders o 
    join order_item oi 
    on o.o_no = oi.o_no
    join product p
    on p.p_no = oi.o_no;

select * from orders O join order_item oi
    on o.o_no = oi.o_no;

