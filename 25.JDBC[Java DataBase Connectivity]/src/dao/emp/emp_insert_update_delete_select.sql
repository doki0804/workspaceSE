--select pk
select e.*,d.* from emp e left outer join dept d on e.deptno=d.deptno where empno = 7369;

--select all
select e.*,d.* from emp e left outer join dept d on e.deptno=d.deptno;

desc emp;
desc dept;

select * from member;

update member set m_id = gggg, m_password = gggg, m_name = 이방원, m_address = '서울시 광진구' ,m_age = 90, m_married = 'M' where m_id = dddd;