set @hour = -1;
select @hour := @hour + 1,
  (select count(*)
  from ANIMAL_OUTS
  where @hour = HOUR(DATETIME))
from ANIMAL_OUTS
where @hour < 23;