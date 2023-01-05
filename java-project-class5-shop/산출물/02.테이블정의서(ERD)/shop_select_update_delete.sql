/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where userid='guard1';
--회원정보수정(update pk)
update userinfo set password='1111',name='김변경',email='change@naver.com' where userid='guard1';
--회원탈퇴(delete pk)
delete userinfo where userid='guard4';



/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/**************cart****************/
--로그인한 멤버(guard1)의 카트리스트
select * from cart where userid='guard1';
select * from cart  c join product p on c.p_no = p.p_no where userid= 'guard1';

--로그인한 멤버(guard1)의 카트리스트 삭제
delete from cart where cart_no = 1;

--로그인한 멤버(guard1)의 카트아이템1개 수량변경
update cart set cart_qty = 3 where cart_no = 6;

--로그인한 멤버(guard1)의 카트에 존재하는 제품의 수(제품존재여부판단)
select count(*) cnt from cart where userid = 'guard1' and p_no = 8;

--로그인한 멤버(guard1)의 카트에 담기(수정)
update cart set cart_qty = cart_qty + 1 where userid = 'guard1' and p_no = 8;

/**************order****************/
--1.멤버한사람의 주문(주문아이템+제품)전체목록
select * from orders where userid='guard1';
select * 
    from orders o 
    join order_item oi 
    on o.o_no = oi.o_no
    join product p 
    on oi.p_no = p.p_no
where userid = 'guard1' and o.o_no=1;

--3. 로그인한멤버 주문한개삭제
delete from orders where o_no=2;

--4. 로그인한멤버 주문 전체삭제
delete from orders where userid='guard1';

