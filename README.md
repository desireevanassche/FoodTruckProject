#### FoodTruckProject

### Lessons Learned
Initially, I wanted to assign values to my array directly from the user input collected by the scanner. I was able to get most of the app to work, but when it came to assigning an ID to the food truck objects it would not work. I tried a few things I had found on the internet and reached out to other students to no avail. Eventually, I decided functionality was the priority, and spinning my wheels was getting me nowhere. After speaking to other students we realized that my constructor on the app had been initialized empty. Since I was receiving the data to populate the array directly from the user it was never assigned to the constructor. With the help of other students, we tried a few work arounds, one of which assigned a different ID to each line but also generated a null line of code on the user screen. By assigning the scanner input to a variable and using that in my constructor within the app I was able to get the app functioning and initiate a counter on the FoodTruck class to assign unique IDs to each input.

Always read the instructions and keep reading them as you go. If it weren't for the comment of another student I would have missed an essential in the list of instructions which specifically states use a to.String. After getting the unique ID set up it was easy enough to fix this simple mistake, but an important lesson in reading the directions.

I am still not sure I understand why using != null did not work in my switch cases, but it didn't. I was receiving a "null error" and my program was not compalating past the first case when using this comparison. Thankfully we have to option to use break statements and I was able to rearrange my comparison, with a break at the end and that was what I needed to continue through my menu.

The TA's were seeing a common error for all students after the scanners next.double where the program would not automatically go to the next line, and suggested that we use an unassigned next.Line after. That seemed to fix the error but I am curious as to why and how that works.

With coding, once you build the wheel, you don't have to reinvent it. Looking back on previous assignments helped a ton, it was easy to review old assignments, remember how they worked, and use that knowledge and reference to apply it to this assignment.

Spinning your wheels, gets you nowhere. I can be so stubborn sometimes and I really wanted to find a way to make the program work without assigning the field variables to the constructor but it was not happening. Had I listened to the multiple people who hinted, suggested, and flat out said to change it sooner, I could have been done with this assignment and had more time to study this weekend. With that said, because I did it the hard way, I am sure I won't forget how to do it the way that works in the future.

Finally, it is okay to ask for help. I was able to work though a few issues with other students, and then later on I was able to use the information gained from my peers to assist others with similar problems. It was nice to see the help I received go full circle and help someone else.

### Technologies Used
* Constructors
* Previous Assignments : HiLo, MakeChange, Car & Car Tester, ParkingLot & Tester.
* Google
* Zoom and the aid of TA's & other students
* Atom
* Terminal
* Eclipse
* Oracle Java Documentation 
