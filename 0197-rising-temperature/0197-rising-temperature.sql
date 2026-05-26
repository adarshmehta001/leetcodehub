# Write your MySQL query statement below
select weather1.id
from
WEATHER weather1,Weather weather2 
where datediff(weather1.recordDate,weather2.recordDate)=1
and weather1.temperature > weather2.temperature;