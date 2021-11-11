SELECT
   Name 
FROM
   STUDENTS 
WHERE
   Marks > MIN(Marks) 
ORDER BY
   RIGHT(Name, 3),
   ID;