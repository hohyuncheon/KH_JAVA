--================================
-- kh 계정
--================================

show user;

--table sample 생성
create table sample(
    id number
);

--현재 계정의 소유 테이블 목록 조회
select * from tab;

--사원테이블
select * from employee;
--부서테이블
select * from department;
--직급테이블
select * from job;
--지역테이블
select * from location;
--국가테이블
select * from nation;
--급여등급테이블
select * from sal_grade;


--용어정리--

--표 table (entity, relation) 데이터를 보관하는 객체
--열 (column, field, attribute) 데이터가 담길 형식
--행 (row, record, turple) 실질적인 데이터를 가지고 있음.
--도메인 domain 하나의 컬럼에 취할수 있는 값의 그룹.(범위)

--테이블 명세

--컬럼명  널여부  자료형
describe employee;
desc employee;


--==================================
--DATA TYPE
--==================================
--컬럼에 지정해서 값을 제한적으로 허용
--1. 문자형 varchar2 | char
--2. 숫자형 number
--3. 날짜 시간형 date
--4. LOB


--==================================
--문자형
--==================================
-- 고정형 char(byte)  : 최대 2000byte
--      char(10)  'korea' 영소문자는 글자당 1byte이므로 실제크기 5byte. 고정형 10byte로 저장됨.
--                   '안녕' 한글은 글자당 3byte(11g XE)이므로 실제크기 6byte. 고정형 10byte로 저장됨.
-- 가변형 varchar2(byte) chleo 4000byte
--      varchar2(10)  'korea' 영소문자는 글자당 1byte이므로 실제크기 5byte. 가변형 5byte로 저장됨.
--                        '안녕' 한글은 글자당 3byte(11g XE)이므로 실제크기 6byte. 가변형 6byte로 저장됨.

--가변형 long : 최대 2GB 까지 가능
--LOB 타입(Large Object) 중의 CLOB(Character LOB)는 단일컬럼 최대 4GB까지 지원

create table tb_datatype(
--컬럼명 자료형 널여부 기본값
    a char(10),
    b varchar2(10)
);

--테이블 조회
select * --아스타는 모든 컬럼을 의미한다.
--setlect a,b도 가능
from tb_datatype; -- 테이블명

--데이터추가 : 한행을 추가
insert into tb_datatype
values('hello','hello');

insert into tb_datatype
values('안녕','안녕');

insert into tb_datatype
values('이거는오버사이즈','안될걸이야');

--데이터가 변경(insert, update, delete)되는 경우, 메모리상에서 먼저 처리된다.
--commit을 통해 실제 database에 적용해야 한다.

commit;

--lengthb(컬럼명):number  - 저장된 데이터의 실제크기를 리턴
SELECT a, lengthb(a),b,lengthb(b)
from tb_datatype;


------------------------------------------------------------
-- 숫자형
------------------------------------------------------------
-- 정수, 실수를 구분치 않는다.
-- number(p, s)
-- p : 표현가능한 전체 자리수
-- s : p 중 소수점이하 자리수
/*
값 1234.567 
--------------------------------
number              1234.567
number(7)           1235        --반올림 
number(7,1)         1234.6      --반올림 
number(7,-2)        1200        --반올림
*/

create table tb_datatype_number (
    a number,
    b number(7),
    c number(7,1),
    d number(7,-2)
);

select * from tb_datatype_number;

insert into tb_datatype_number 
values(1234.567, 1234.567, 1234.567, 1234.567);

--지정한 크기보다 큰 숫자는 ORA-01438: value larger than specified precision allowed for this column 유발
insert into tb_datatype_number 
values(1234567890.123, 1234567.567, 123456.5678, 1234.567);

commit;
--마지막 commit시점 이후 변경사항은 취소된다.
rollback; 


------------------------------------------------------------
-- 날짜시간형
------------------------------------------------------------


create table tb_datatype_date(
    a date,
    b TIMESTAMP
);

--그냥 출력문이 아니고 이런식으로 바꿔서 보여달라는 코드
--to_char 날짜 /숫자를 문자열로 표현
select to_char(a, 'yyyy/mm/dd hh24:mi:ss'), b
from tb_datatype_date;

--select *
--from tb_datatype_date;

insert into tb_datatype_date
values(sysdate, systimestamp);
    
-- 날짜형 +- 숫자(1=하루) = 날짜형

select to_char(a , 'yyyy/mm/dd hh24:mi:ss'), -- +1을 해줬는데 이건 하루를 더해준것.
        to_char(a -1, 'yyyy/mm/dd hh24:mi:ss'),b

from tb_datatype_date;

--sysdate는 현재시간

-- 날짜형 - 날짜형 = 숫자(1=하루)
--더하기는 안됨 빼기는 됨 날짜
select sysdate -a --출력문 0.0009일차이
from tb_datatype_date;


--to_date는 문자열을 날짜형으로 변환하는 함수
select to_date('2021/01/23') -a
from tb_datatype_date;

--dual 가상테이블
select (sysdate +1)-sysdate -- 내일 - 오늘
from dual;

--========================================
-- DQL
--========================================
-- Data Query Language 데이터 조회(검색)을 위한 언어
-- select문
-- 쿼리 조회결과를 ResultSet(결과집합)라고 하며, 0행이상을 포함한다.
-- from절에 조회하고자 하는 테이블 명시
-- where절에 의해 특정행을 filtering 가능.
-- select절에 의해 컬럼을 filtering 또는 추가가능
-- order by절에 의해서 행을 정렬할 수 있다.

/*
구조 
순서중요 습관들이면 좋음

select 컬럼명 (5)
from 테이블명 (1)
where 조건절 (2)
group by 그룹기준컬럼 (3)
having 그룹조건절 (4)
order by 정렬기준컬럼 (6)

*/

select*
FROM EMPLOYEE
where dept_code = 'D9' --데이터는 대소문자 구분
order by emp_name asc; --오름차순으로

--1. job테이블에서 job_name컬럼정보만 출력
select job_name
from job;

--2. department 테이블에서 모든 컬럼출력
select *
from department;

--3. employee테이블에서 이름, 이메일, 전화번호, 입사일 출력
select emp_name, email, phone, hire_date
from employee;

--4. employee테이블에서 급여가 2,500,000원 이상인 사원의 이름과 급여를 출력
select emp_name, salary
from employee
where salary>=2500000;

--5. employee테이블에서 급여가 3,500,000원 이상이면서 직급코드가 'j3'인 사원출력
--&& || 이 아닌 and 와 or만 사용

select *
from employee
where salary>=3500000 and job_code='J1';

--6.employee테이블에서 현재 근무중인 사원을 이름 오름차순으로 정렬.

select *
from employee
where quit_yn ='N'
ORDER BY emp_name asc;


--============================================
--SELECT
--============================================
--table의 존재하는 컬럼
--가상컬럼 (산술연산)
--임의의 값(literal)
--각 컬럼은 별칭(alias)를 가질 수 있다. as와 "(쌍따옴표)는 생략가능
--(별칭에 공백, 특수문자가 있거나 숫자로 시작하는 경우 쌍따옴표 필수.)
select emp_name as "사원명", 
            phone "전화번호", 
            salary 급여,
            salary * 12 "연 봉",
            123 "123abc",
            '안녕'
from employee;

--실급여 : salary + (salary * bonus)
select emp_name,
            salary,
            bonus,
            salary + (salary * nvl(bonus, 0)) 실급여
from employee;

--null값과는 산술연산 할수 없다. 그 결과는 무조건 null이다.
--null % 1(X) 나머지연산자는 사용불가
select null + 1, 
            null - 1, 
            null * 1,
            null / 1
from dual; --1행짜리 가상테이블

--nvl(col, null일때 값) null처리 함수
--col의 값이 null이 아니면, (col)값 리턴
--col의 값이 null이면, (null일때 값)을 리턴
select bonus,
            nvl(bonus, 0) null처리후
from employee;


--distinct 중복제거용 키워드
--select절에 단 한번 사용가능하다.
--직급코드를 중복없이 출력
select distinct job_code
from employee;

--여러 컬럼사용시 컬럼을 묶어서 고유한 값으로 취급한다.
select distinct job_code, dept_code
from employee;

--문자 연결연산자 ||
-- + 는 산술연산만 가능하다.
select '안녕' || '하세요' || 123 
from dual;

select emp_name || '(' || phone || ')'
from employee;


-------------------------------------------
--  WHERE
-------------------------------------------
--테이블의 모든 행 중 결과집합에 포함될 행을 필터링한다.
--특정행에 대해 true(포함) | false(제외) 결과를 리턴한다.

/*
    =                       같은가
    !=  ^=  <>           다른가
    > < >= <= 
    between .. and ..      범위연산
    like, not like             문자패턴연산
    is null, is not null     null여부
    in, not in                    값목록에 포함여부
    
    and                    
    or
    not                    제시한 조건 반전 
*/

--부서코드가 D6가 아닌 사원 조회
select emp_name, dept_code
from employee
where dept_code <> 'D6'; -- != ^= <>

--급여가 2,000,000원보다 많은 사원 조회
select emp_name, salary
from employee
where salary > 2000000;

--날짜형 크기비교 가능
--과거 < 미래
select emp_name, hire_date
from employee
where hire_date < '2000/01/01'; --날짜형식의 문자열은 자동으로 날짜형으로 형변환

--20년이상 근무한 사원 조회 
--날짜형 - 날짜형 = 숫자(1=하루)
--날짜형 - 숫자(1=하루) = 날짜형
select emp_name, hire_date, quit_yn
from employee
where quit_yn = 'N' 
    and to_date('2021/01/22') - hire_date > 365 * 20;

--부서코드가 D6이거나 D9인 사원 조회
select emp_name, dept_code
from employee
where dept_code = 'D6' or dept_code = 'D9';

--범위 연산
--급여가 200만원이상 400만원 이하인 사원 조회
select emp_name, salary
from employee
where salary >=2000000 and salary <=4000000;

select emp_name, salary
from employee
where salary between 2000000 and 4000000;

--입사일이 1990/01/01 ~ 2001/01/01 인 사원조회(사원명, 입사일)
select emp_name, hire_date
from employee
where quit_yn = 'N' 
    and hire_date >= '1990/01/01' and hire_date <= '2001/01/01';

select emp_name, hire_date
from employee
where quit_yn = 'N' 
    and hire_date between '1990/01/01' and '2001/01/01';


--like, not like
--문자열 패턴 비교 연산

--wildcard : 패턴 의미를 가지는 특수문자
-- _ 아무문자 1개
-- % 아무문자 0개이상

select emp_name
from employee
where emp_name like '전%';--전으로 시작, 0개이상의 문자가 존재하는가
--전, 전차, 전진, 전형돈, 전전전전전(O)
--파전(X)

select emp_name
from employee
where emp_name like '전__';--전으로 시작, 2개의 문자가 존재하는가
--전형동, 전전전(O)
--전, 전진, 파전, 전당포아저씨(X)

--이름에 가운데글자가 '옹'인 사원 조회. 단, 이름은 3글자이다.
select emp_name
from employee
where emp_name like '_옹_';

--이름에 '이'가 들어가는 사원 조회.
select emp_name
from employee
where emp_name like '%이%';

--email컬럼값의 '_' 이전 글자가 3글자인 이메일을 조회
select email
from employee
--where email like '____%';--4글자 이후 0개이상의 문자열 뒤따르는가 -> 문자열이 4글자이상인가?
where email like '___#_%' escape '#'; --임의의 escaping문자 등록. 데이터에 존재하지 않을 것.

--in, not in 값목록에 포함여부 
--부서코드가 D6 또는 D8인 사원 조회
select emp_name, dept_code
from employee
where dept_code = 'D6' or dept_code = 'D8';

select emp_name, dept_code
from employee
where dept_code in ('D6','D8'); --개수제한 없이 값 나열

select emp_name, dept_code
from employee
where dept_code not in ('D6','D8');

select emp_name, dept_code
from employee
where dept_code != 'D6' and dept_code != 'D8';

--is null, is not null : null비교연산
--인턴사원 조회
--null값은 산술연산, 비교연산 모두 불가능하다.
select emp_name, dept_code
from employee
--where dept_code = null;
where dept_code is not null;

--D6, D8부서원이 아닌 사원조회(인턴사원 포함)
select emp_name, dept_code
from employee
where dept_code not in ('D6','D8') or dept_code is null;

--nvl버젼
select emp_name, dept_code, nvl(dept_code, '인턴') dept_co
from employee
where nvl(dept_code, 'D0') not in ('D6','D8'); --임시의  널값을 D0으로 만든다음 비교해줌. 



--------------------------------------------
-- ORDER BY
--------------------------------------------
--select구문 중 가장 마지막에 처리.
--지정한 컬럼 기준으로 결과집합을 정렬해서 보여준다.

-- number  0 < 10
-- string  ㄱ < ㅎ, a < z
-- date  과거 < 미래
-- null값 위치를 결정가능 : nulls first | nulls last
-- asc 오름차순(기본값)
-- desc 내림차순
-- 복수개의 컬럼 차례로 정렬가능

select emp_id, emp_name, dept_code, job_code, salary, hire_date
from employee
order by salary desc;

-- alias 사용가능
select emp_id 사번,
            emp_name 사원명,
            dept_code 부서코드
from employee
order by 사원명;

--1부터 시작하는 컬럼순서 사용가능. 
select *
from employee
order by 9 desc;


--======================================
-- BUILT-IN FUNCTION
--======================================
--일련의 실행 코드 작성해두고 호출해서 사용함.
--반드시 하나의 리턴값을 가짐.

--1. 단일행 함수 : 각행마다 반복 호출되어서 호출된 수만큼 결과를 리턴함.
--      a. 문자처리함수
--      b. 숫자처리함수
--      c. 날짜처리함수
--      d. 형변환 함수
--      e. 기타함수
--2. 그룹함수 : 여러행을 그룹핑한후, 그룹당 하나의 결과를 리턴함.

--------------------------------------------
-- 단일행 함수
--------------------------------------------

--****************************************************
-- a. 문자처리함수
--****************************************************

--length(col):number
--문자열의 길이를 리턴
select emp_name, length(emp_name)
from employee;

--where절에서도 사용가능
select emp_name, email
from employee
where length(email) < 15;

--lengthb(col)
--값의 byte수 리턴
select emp_name, lengthb(emp_name),
            email, lengthb(email)
from employee;

--instr(string, search[, startPosition[, occurence]])

--string에서 search가 위치한 index를 반환.
--oracle에서는 1-based index. 1부터 시작.
--startPosition 검색시작위치
--occurence 출현순서
select instr('kh정보교육원 국가정보원', '정보'),  --3
            instr('kh정보교육원 국가정보원', '안녕'),    --0 값없음
            instr('kh정보교육원 국가정보원', '정보', 5),  --11
            instr('kh정보교육원 국가정보원 정보문화사', '정보', 1, 3), --15
            instr('kh정보교육원 국가정보원', '정보', -1) --11   startPosition이 음수면 뒤에서부터 검색
from dual;

--email컬럼값중 '@'의 위치는? (이메일, 인덱스)
select email, instr(email, '@')
from employee;


--substr(string, startIndex[, length])
--string에서 startIndex부터 length개수만큼 잘라내어 리턴
--length 생략시에는 문자열 끝까지 반환

select substr('show me the money', 6, 2), --me
            substr('show me the money', 6),  --me the money
            substr('show me the money', -5, 3) --mon
from dual;

--@실습문제 : 사원명에서 성(1글자로 가정)만 중복없이 사전순으로 출력
select distinct substr(emp_name, 1, 1) 성
from employee
order by 성;

-- lpad|rpad(string, byte[, padding_char])
-- byte수의 공간에 string을 대입하고, 남은 공간은 padding_char를 (왼쪽|오른쪽) 채울것.
-- padding char는 생략시 공백문자.

select lpad(email, 20, '#'),
            rpad(email, 20, '#'),
            '[' || lpad(email, 20) || ']', 
            '[' || rpad(email, 20) || ']'
from employee;

--@실습문제: 남자사원만 사번, 사원명, 주민번호, 연봉 조회
--주민번호 뒤  6자리는 ****** 숨김처리할 것.

select emp_id,
            emp_name,
            substr(emp_no, 1, 8) || '******' emp_no,
            rpad(substr(emp_no, 1, 8), 14, '*') emp_no,
            (salary + (salary * nvl(bonus, 0))) * 12 annul_pay
from employee
where substr(emp_no, 8, 1) in ('1', '3');


--===============================================
--실습문제
--===============================================

    create table tbl_escape_watch(
        watchname   varchar2(40)
        ,description    varchar2(200)
    );
    
    
    --drop table tbl_escape_watch;
    
    insert into tbl_escape_watch values('금시계', '순금 99.99% 함유 고급시계');
    insert into tbl_escape_watch values('은시계', '고객 만족도 99.99점를 획득한 고급시계');
  
  
    commit;
    
    
    select * from tbl_escape_watch;
--tbl_escape_watch 테이블에서 description 컬럼에 99.99% 라는 글자가 들어있는 행만 추출하세요.
    
    select *
    from tbl_escape_watch
    where substr(description, 9,1) in '%';
    
--@실습문제
--파일경로를 제외하고 파일명만 아래와 같이 출력하세요.
    
    create table tbl_files
    (fileno number(3)
    ,filepath varchar2(500)
    );
    
    
    insert into tbl_files values(1, 'c:\abc\deft\salesinfo.xls');
    insert into tbl_files values(2, 'c:\music.mp3');
    insert into tbl_files values(3, 'c:\documents\resume.hwp');
    commit;
    
    
    select * 
    from tbl_files;
    
    select fileno 파일번호 , filepath 파일명
    from tbl_files
    where substr('filepath',1,13);


--문제2 답안
select fileno, substr(filepath, instr(filepath,'\',-1,1)+1)
from tbl_files;
    
    
출력결과 :
--------------------------
파일번호          파일명
---------------------------
1             salesinfo.xls
2             music.mp3
3             resume.hwp


