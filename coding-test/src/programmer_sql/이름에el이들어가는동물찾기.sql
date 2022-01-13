select ANIMAL_ID, NAME
from ANIMAL_INS ai
where ai.NAME like '%el%' and ai.ANIMAL_TYPE = 'Dog'
order by NAME;