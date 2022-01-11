select NAME, count(*)
from ANIMAL_INS
where NAME is not null
group by NAME
having count(*) > 1
order by NAME asc;
