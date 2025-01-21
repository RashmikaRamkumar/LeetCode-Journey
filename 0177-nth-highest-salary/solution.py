import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    newsalary = employee.sort_values(by = "salary", ascending=False).drop_duplicates(subset="salary", keep='first')
    if  employee["salary"].nunique() < N or N<=0:
        salary=pd.DataFrame({f'getNthHighestSalary({N})':[pd.NA]})
    else:
        p = newsalary.iloc[N-1]["salary"]
        salary=pd.DataFrame({f'getNthHighestSalary({N})':[p]})
    return salary    
