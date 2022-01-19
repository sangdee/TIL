select ANIMAL_ID,
       NAME,
       DATE_FORMAT(DATETIME, '%Y-%m-%d') as 날짜
from ANIMAL_INS
order by ANIMAL_ID;


