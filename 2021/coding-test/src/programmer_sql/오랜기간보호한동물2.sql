select AINMAL_ID, NAME, INTAKE_CONDITION
from ANIMAL_INS ai
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty');

select ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS ai,
     ANIMAL_OUTS ao
where ai.ANIMAL_ID = ao.ANIMAL_ID
order by ao.DATETIME - ai.DATETIME desc
    limit 2;
