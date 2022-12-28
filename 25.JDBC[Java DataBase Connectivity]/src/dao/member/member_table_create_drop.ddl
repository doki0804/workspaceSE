DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(20)		 NULL ,
		m_password                    		VARCHAR2(20)		 NOT NULL,
		m_name                        		VARCHAR2(50)		 NOT NULL,
		m_address                     		VARCHAR2(100)		 NULL ,
		m_age                         		NUMBER(3)		 DEFAULT 0		 NULL ,
		m_married                    		CHAR(1)		 DEFAULT 'M'		 NULL ,
		m_regdate                     		DATE		 DEFAULT sysdate		 NULL 
);

ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

