import os
import subprocess
import time

# Name for the sub folder
subfolder = "feedback_files"
#makes the subfolder, exist_ok=True prevents an error if the folder already exists.
os.makedirs(subfolder, exist_ok=True)

# this is a high level function that could become a wrapper -
# i could change the behaviour of the input function later if i wanted.
# purpose here: none :)
def get_input(prompt):
    return input(prompt)

# this function will re-open the file once the feedback has been generated.
# i am telling it to use the editor i set as the env 'editor'. 
# i will run 'export EDITOR=nano' on the cli. This should work on windows if
# set the editor to 'notepad' (hopefully). 
def open_in_editor(filename):
    editor = os.getenv('EDITOR')
    subprocess.run([editor, filename])

# a sleep timer to give a countdown before opening the file in editor - allows 
# time to read the output on cli.
def countdown(seconds):
    for i in range(seconds, 0, -1):
        print(i)
        time.sleep(1)

# I call input through the get_input function, and split the string by the commas
# and put into a list.
# print the names just for verification.
student_names = get_input("Enter the names of the students: ").split(",")
print(student_names)

# starts the loop for each student, remove any space around the name with strip.
for student in student_names:
    student = student.strip()
    print(f"Entering feedback for {student}")

    # collect feedback for each attribute as user input
    understand_level = get_input("Enter understanding level (1: basic, 2: good, 3: very good, 4: excellent)")


    # descriptions that match the levels entered
    understand_descriptions = {"1": "a basic understanding", "2": "a good understanding", "3": "a very good understanding", "4": "an excellent understanding"}

    # Format the feedback into a template using the descriptions from the dictionaries 
    # and pre-existing strings.
    feedback = f"General comments\n{student} demonstrated {understand_descriptions[understand_level]} of python and general programming concepts.\n\n"
    feedback += f"Learener punctuality and engagement\n\n"
    feedback += f"Recommendations for further learning"

    # create the file with correct path and name that references the student
    filename = os.path.join(subfolder, f"{student}_feedback.txt")
    with open(filename, "w") as file:
        file.write(feedback)
        print(f"Feedback for {student}  written to file {filename}")

    # Open the file in the editor (remember to export as env or hard-code)
    print(f"Opening {filename} in the default editor to make any final adjustments...")
    countdown(3)
    open_in_editor(filename)

    # Notify user file has been saved
    print(f"Feedback for {student} has been edited and saved in file {filename}")