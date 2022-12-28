DROP TABLE guest CASCADE CONSTRAINTS;

CREATE TABLE guest(
		guest_no                      		NUMBER(10)		 NULL ,
		guest_name                    		VARCHAR2(50)		 NULL ,
		guest_date                    		DATE		 NULL ,
		guest_email                   		VARCHAR2(50)		 NULL ,
		guest_homepage                		VARCHAR2(50)		 NULL ,
		guest_title                   		VARCHAR2(100)		 NULL ,
		guest_content                 		VARCHAR2(4000)		 NULL 
);

DROP SEQUENCE guest_guest_no_SEQ;

CREATE SEQUENCE guest_guest_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

ALTER TABLE guest ADD CONSTRAINT IDX_guest_PK PRIMARY KEY (guest_no);

