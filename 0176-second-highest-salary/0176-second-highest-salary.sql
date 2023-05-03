# Write your MySQL query statement below


select MAX(salary) as SecondHighestSalary
from Employee
where Salary < (
    select MAX(Salary)
    from Employee
)