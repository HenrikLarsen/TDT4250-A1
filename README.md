# TDT4250-A1
First assignment in TDT4250 Advanced Software Design

Features in the project:
- Classes, datatypes, ENUM
- attributes and references
- 1 OCL constraint. Checks if the courses hva atleast 5 credits.
- 1 manually Java constraint. Checks if the coursecode is on the right format, using regex. Regex used: "[A-Z]{2,3}[1-9]{4}"

Model structure:
Studyprogram with semesters, Specializations, courses and groups of courses to select among for electives (slots). Solved by using a mandatory ENUM.
![Imgur Image](https://i.imgur.com/aJZGIE8.png)

