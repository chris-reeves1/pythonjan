while True:
    print("Time Calculator")
    print("1- Add 2 date-times")
    print("2- Find the difference between 2 date-times")
    print("3- Convert datetime to Hours")
    print("4- Convert datetime to Minutes")
    print("5- Convert Minutes to date-time")
    print("6- Convert Hours to date-time")
    print("7- Exit")
    
    choice = input("Enter an option: ")
    
    if choice == "1":
        while True:
            date_time1 = input("Enter time 1 (in format DD:HH:MM): ")
            t1 = date_time1.split(':') 
            if len(t1) == 3 and 0 <= int(t1[0]) < 1000 and 0 <= int(t1[1]) < 24 and 0 <= int(t1[2]) < 60:
                break
            else:
                print("Incorrect format or value entered. Please enter time in the format DD:HH:MM and make sure the values are valid - max days is 1000.")
        while True:
            date_time2 = input("Enter time 2 (in format DD:HH:MM): ")
            t2 = date_time2.split(':')
            if len(t2) == 3 and 0 <= int(t2[0]) < 1000 and 0 <= int(t2[1]) < 24 and 0 <= int(t2[2]) < 60:
                break
            else:
                print("Incorrect format or value entered. Please enter time in the format DD:HH:MM and make sure the values are valid - max days is 1000.")
        t1 = date_time1.split(':') # returns [dd,hh,mm]
        t2 = date_time2.split(':')
        days = int(t1[0]) + int(t2[0])
        hours = int(t1[1]) + int(t2[1])
        minutes = int(t1[2]) + int(t2[2])
        if minutes >= 60:
            minutes -= 60
            hours += 1
        if hours >= 24:
            hours -= 24
            days += 1
        print(f"The sum of {date_time1} and {date_time2} is {days}:{hours}:{minutes}")
    
    elif choice == "2":
        date_time1 = input("Enter time 1 (in format DD:HH:MM): ")
        date_time2 = input("Enter time 2 (in format DD:HH:MM): ")

        t1 = [int(i) for i in date_time1.split(':')]
        t2 = [int(i) for i in date_time2.split(':')]

        total_minutes1 = t1[0] * 24 * 60 + t1[1] * 60 + t1[2]
        total_minutes2 = t2[0] * 24 * 60 + t2[1] * 60 + t2[2]

        minute_difference = abs(total_minutes1 - total_minutes2)
        days = minute_difference // (24 * 60) # total minutes floor divided by how many mins in a day.
        minute_difference %= (24 * 60) # gives the remaining left over minutes
        hours = minute_difference // 60 # min_diff is now mins less than a day - this gives us hours.
        minutes = minute_difference % 60 # calculates remaining minutes that dont make up an hour. 

        print(f"The difference between {date_time1} and {date_time2} is {days}:{hours}:{minutes}")

    elif choice == "3":
        date_time = input("Enter time in the format dd:hh:ss: ")
        t1 = date_time.split(':')
        total_minutes = int(t1[0]) * 1440 + int(t1[1]) * 60 + int(t1[2])
        total_hours = total_minutes // 60
        print(f"The total hours in {date_time} is {total_hours}")

    elif choice == "4":
        date_time = input("Enter time in the format dd:hh:ss: ")
        t1 = date_time.split(':')
        total_minutes = (int(t1[0]) * 1440 + int(t1[1]) * 60 + int(t1[2]))
        print(f"The total minutes in {date_time} is {total_minutes}")

    elif choice == "5":
        total_minutes = int(input("Enter total minutes: "))
        days = total_minutes // 1440
        hours = (total_minutes % 1440) // 60
        minutes = total_minutes % 60
        print(f"The time in {total_minutes} minutes is {days}:{hours}:{minutes}")

    elif choice == "6":
        total_hours = int(input("Enter total hours: "))
        days = total_hours // 24
        hours = total_hours % 24
        minutes = 0
        print(f"The time in {total_hours} hours is {days}:{hours}:{minutes}")
        
    elif choice == "7":
        break
    else:
        print("Invalid choice. Please try again.")