-- 코드를 입력하세요
SELECT ai.NAME, ai.DATETIME
from ANIMAL_INS ai
         left join ANIMAL_OUTS on ai.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
where ANIMAL_OUTS.ANIMAL_ID is null
order by ai.DATETIME asc limit 3;