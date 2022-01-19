select HOUR(DATETIME) hour, count(*) from ANIMAL_OUTS
group by hour
HAVING hour >= 9 and hour <=19
order by hour;