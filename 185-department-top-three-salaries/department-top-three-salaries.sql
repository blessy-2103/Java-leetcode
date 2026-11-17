WITH RankedSalaries AS (
    SELECT 
    d.name as Department,
    e.name AS Employee,
    e.salary As Salary,
    DENSE_RANK() OVER(
        PARTITION BY e.departmentId
        ORDER BY e.salary DESC
    ) AS rnk
    from Employee e
    JOIN Department d
    On e.departmentId = d.id

    )
    SELECT 
    Department,
    Employee,
    Salary
    From RankedSalaries
    WHERE rnk <= 3;
