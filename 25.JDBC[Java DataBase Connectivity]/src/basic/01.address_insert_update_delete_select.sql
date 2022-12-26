--insert
insert into address values(address_no_SEQ.nextval,'김경호','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경우','123-4567','경기도 성남시');
insert into address values(address_no_SEQ.nextval,'김경미','123-4567','경기도 성남시');

--update(pk update)
update address set name = '김변경',phone='899-9900',address='서울시 강남구' where no=1;


--delete(pk delete)



--select(pk select)



--select(all select)
select no,name,phone,address from address;