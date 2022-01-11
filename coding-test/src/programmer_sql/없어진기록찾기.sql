-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
from ANIMAL_OUTS outs
         left OUTER JOIN ANIMAL_INS ins
                         on outs.ANIMAL_ID = ins.ANIMAL_ID
where ins.ANIMAL_ID is null
order by ins.ANIMAL_ID;
