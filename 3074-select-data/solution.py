import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    selected=students[students['student_id']==101][['name','age']]
    return selected
    
