select ao.ANIMAL_ID, ao.ANIMAL_TYPE, ao.NAME
from ANIMAL_OUTS ao
         join ANIMAL_INS ai on ai.ANIMAL_ID = ao.ANIMAL_ID
where ai.SEX_UPON_INTAKE != ao.SEX_UPON_OUTCOME
order by ao.ANIMAL_ID;
