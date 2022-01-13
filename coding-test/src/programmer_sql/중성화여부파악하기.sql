select ANIMAL_ID,
       NAME,
       case
           WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%Spayed%'
               then 'O'
           else 'X' end as '중성화'
from ANIMAL_INS ai
order by ai.ANIMAL_ID;
