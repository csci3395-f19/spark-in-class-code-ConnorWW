# Dataset Reports

## Russian Troll Tweets Dataset
https://github.com/fivethirtyeight/russian-troll-tweets


This dataset contains 12 90mb CSV files and 1 8mb CSV file. The set holds detailed information on every tweet (all 3 million of them) sent by accounts controlled by the Russian IRA (Internet Research Agency) between February 2012 May 2018, with most tweets being sent from 2015 to 2017 (according to the dataset documentation).  The researchers who originally examined this data grouped the tweet author accounts into archetypal groups: Left Troll, Right Troll, News Feed, and Hashtag Gamer. These groupings describe the content that the troll account tweets, and what strategies they employ in doing so. Some tweet-specific information captured includes: the content of the tweet, the date and time the tweet was published, the author of the tweet, the following/ follower count of the author, as well as analytical grouping by the Clemson researchers who put together the dataset.


This dataset could be used to answer questions about Russian-Troll-Tweet diction, frequency of key words/phrases (“Clinton”, “Trump”, “MAGA”, etc), frequency of Russian-Troll-Tweets and how their appearance corresponds to major election milestones, growth of account followers/following over time, and others. 
    
    
Specific questions that I wish to answer include:

* What keywords appear most often in troll tweets? Are there any patterns within the tweets that could be used to identify other tweets as being from Russian troll accounts?

* At what times did Russian Twitter Troll activity spike? Were the tweets a constant, steady stream or did they come in spikes that correspond to real-time political events?

* Russian Twitter Troll tweets are essentially meaningless if nobody follows their accounts. How many people followed each account and is there any correlation between the account’s researcher assigned grouping and their follower count? Are certain groups of accounts more successful than others?


I find this dataset to be interesting and worthy of analysis because of its impact on our day to day lives. Social media has leaked into every facet of American life, and if it is going to be used with negative intent then it should be examined. I do not see social media fading away as a tool to influence lives around the world, so we should be more aware and knowledgeable on the sway it can hold over our opinions. Additionally, this dataset is very large; to analyze it without machine assistance would take hundreds of hours of work by a large group of people. Thus, it seems like a prime, realistic candidate for use in our Big Data course.
 
 ## Lichess Chess Game Dataset
https://www.kaggle.com/datasnaek/chess

This dataset contains data on over 20,000 games of chess played on lichess.org, a popular online Chess platform. Chess has been played by humans for centuries, and is now being played (incredibly well) by machines. Machines have demonstrated a great prowess for learning Chess, likely attributed to the patterns one finds within the games. For every game in this dataset, the following values are recorded: the game ID, whether or not it was rated, the start time, the end time, the number of turns, the game status, the winner, the time increment (the amount of time the players had to play), both players IDs, both players ratings, all moves in chess notation, the opening played, and the number of moves in the ‘opening phase’.


Using this dataset, I hope to answer questions about correlations between openings and wins, average number of turns until checkmate for each opening, the percentage of times that a lower rated player beats a higher rated player, average length of Chess games, frequency of moves made by a losing player (ie if there are moves that make a given player more likely to lose), and whether a higher ranked player is more likely to lose or resign vs whether a lower ranked player is more likely to lose or resign. These questions aren’t as important to our daily lives as the questions posed in the last dataset, but they could help illuminate patterns within chess games and statistics about the Chess meta in general. The same questions posed within this dataset could be applied to a dataset of my own games, which I could acquire from Lichess as well. 


I find this dataset to be particularly interesting, as I am a Chess player myself. Chess is a game that is closely linked to the AI and machine learning fields, and boasts Chess computers which can beat even the best human players. Given the success found by AI programmers, I imagine that I should be able to find a similar level of success analyzing the games. It would be very interesting to see if using this data, I could create some kind of engine that can predict the winner of a game within the first several moves. 

## Austin Accident Report Dataset
https://data.austintexas.gov/Transportation-and-Mobility/Real-Time-Traffic-Incident-Reports/dx9v-zd7x


This ever-growing dataset contains information on traffic incidents within the City of Austin. It is updated every 5 minutes, and contains both archived traffic incidents as well as active traffic incidents. For each traffic incident, the following data are recorded: the traffic report ID, the published date, the issue reported, the location, the latitude, longitude, the address, the status, and the status date (when the incident was resolved / last updated).


This dataset could be used to answer the following questions:
* On what roads do the most incidents occur?
* At what times do the most incidents occur?
* Are there roads where incidents with injuries are more likely than incidents without and vice versa?
* Are there areas with very few traffic incidents?
* When is the safest time to drive in Austin (time with fewest incidents)?
* Do more incidents occur at a specific time universally, or does it depend on the exact road in question?
    
    
These questions are important for myself personally, as I live near Austin and drive through it on a regular basis. They are also important because if there are certain roads with significantly more incidents than most other roads, there are likely underlying issues with these roads that need to be addressed. Interestingly, the question that I believe to be most important is the one about areas with few traffic incidents. Are there high-traffic areas that have very few accidents? What makes these areas different from similar areas with more accidents? The information that we learn from asking these questions could help to design safer streets in the future. 


I find this dataset to be interesting because Austin is not a commuter friendly city. There are very few public transit options beyond the bus, thusly most Austinites drive to the places they need to go. Driving comes with an inherent risk, and analyzing this dataset could help to mitigate that risk. This dataset could also be used to help in the design of future roads. If certain roads are found to be more high risk than other roads, these roads likely share some key characteristics that can be omitted from future road construction projects.
