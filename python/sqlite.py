import sqlite3

conn = sqlite3.connect("example.db")
c = conn.cursor()

# commands
# CREATE - create a table
# INSERT - inserting data into table
# SELECT - query data
# UPDATE - modifying data
# DELETE - delting
# WHERE - filtering


# Create

c.execute("""
    CREATE TABLE IF NOT EXISTS students (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER,
    grade TEXT
    )
"""
)

conn.commit() # save the change

# insert data 
# ? - placeholders 
# safer to use. 


c.execute("""
    INSERT INTO students (name, age, grade)
    VALUES (?, ?, ?)
""", ("chris", 40, "A"))
conn.commit()

# update

c.execute("""
    UPDATE students
    SET grade = ?
    WHERE name = ?
""", ("B", "chris"))
conn.commit()
# query

c.execute("SELECT * FROM students")

x = c.fetchall()

for data in x:
    print(data)

# DELETE

c.execute("""
    DELETE FROM students
    WHERE name = ?
""", ("chris",))
conn.commit()

c.execute("SELECT * FROM students")

x = c.fetchall()

for data in x:
    print(data)