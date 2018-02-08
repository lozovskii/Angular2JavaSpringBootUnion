DROP TRIGGER users_angulartest_trigger;
DROP SEQUENCE users_angulartest_sequence;
DROP TABLE users_angulartest;

CREATE TABLE users_angulartest(
  user_id NUMBER(10),
  user_name VARCHAR2(45),
  user_phone NUMBER(10),
  CONSTRAINT user_id_pk PRIMARY KEY (user_id)
);

CREATE SEQUENCE users_angulartest_sequence START WITH 1 INCREMENT BY 1 NOMAXVALUE;

CREATE OR REPLACE TRIGGER users_angulartest_trigger
  BEFORE INSERT ON users_angulartest
  FOR EACH ROW
  BEGIN
    SELECT users_angulartest_sequence.NEXTVAL
    INTO :new.user_id
    FROM dual;
  END;