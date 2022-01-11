select ANIMAL_TYPE, count(*)
from ANIMAL_INS
group by ANIMAL_TYPE
order by field(ANIMAL_TYPE,'Cat','Dog');
