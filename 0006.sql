-- programmers
-- SUM, MAX, MIN 최대값 구하기
SELECT MAX(DATETIME) FROM ANIMAL_INS;

-- programmers
-- SUM, MAX, MIN 최솟값 구하기
SELECT MIN(DATETIME) FROM ANIMAL_INS;

-- programmers
-- SUM, MAX, MIN 동물 수 구하기
SELECT COUNT(ANIMAL_ID) FROM ANIMAL_INS;

-- programmers
-- SUM, MAX, MIN 중복 제거하기
SELECT COUNT(B.NAME) FROM (SELECT A.* FROM (SELECT DISTINCT NAME FROM ANIMAL_INS)A WHERE NAME IS NOT NULL)B;
