SELECT name, population, area
FROM world w 
WHERE 1=1
and w.population >= 25000000
or w.area >= 3000000
;