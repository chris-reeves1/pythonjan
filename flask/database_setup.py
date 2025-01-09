import sqlite3

def setup_database():
    conn = sqlite3.connect("passwords.db")
    cursor = conn.cursor()

    cursor.execute("""
        CREATE TABLE IF NOT EXISTS history (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            password TEXT NOT NULL,
            rating TEXT NOT NULL
        )
    """)

    conn.commit()
    conn.close()


if __name__=="__main__":
    setup_database()