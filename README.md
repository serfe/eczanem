# eczanem

•	Story of The Project 
 
The project aims to offer the easy way to users pharmacy in the province of Izmir. 
Project was developed to Android app.
We used Jsoup parse, SQLite and Google map in our project. 
Our project was offer to the user all pharmacies in the province of Izmir, according to main town pharmacy and night-pharmacy.
Outside the pharmacy, has created to the user areas could write their own notes. 
 
•	How It Is Connected to an Internet Resource 
 
1)	In this project is taking two different parse operations.
Hence, we add jsoup.jar for parsing operation to android studio. 
Night-pharmacy information were parsed from “ https://www.izmir.bel.tr/NobetciEczaneler/162/tr”, 
and all pharmacies were parsed from “ http://www.hastanebul.com.tr/izmir-eczaneler ”. We use HTML table parse. 
2)	I have use database with SQLite for notes. Each users have individual database for saving their notes.  
3)	Google Maps API has been created for using Google Maps, and it was used in project structure. 
After that I gave all required permission in manifest.xlm file.  

