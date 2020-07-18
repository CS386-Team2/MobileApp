# D3 Analysis
## System Description
Our application will offer service for students and workers on Android Platform(not available on PC). The app is aimed at making people's life easier when it comes to eat. But the problem we have is that we don't know how to make people find restaurants next to them. It is the most biggest barrier we have met so far because it is convenient for them to order food fast and this action will increase our user usage. "E-kitchen" shoule be a popular app that can provide detailed information and fast take-out services to make our users have their meals as soon as posible. Unlike doordash which is famous in US, we provide users with detailed information about the food ingredients, cook time and cook progress. These features will let our users know their status of order clearly.

Our application requires our users to use a user-name and password to log in. So users can store their address, personal information, order history and paymemt method after logging in. Certainly, users can pay the bill by using guest payment if they don't want to create an account. But if users want to review the order history, they need to create an account to log in the system. Another bright spot of our app is that users can get the refund for the first time in a restaurant if they are not satisfied with the food. But if users order the foof at the same restaurant over two times, they can't get the refund.

## Model

## Class Responsibilities 
We use Usersignup and Userlogin as the basis for users to obtain user addresses through Usergps to provide nearby restaurants. Restaurantmenu and RestaurantInformation provide users with restaurant information to let them choose dishes. Usercart class records what the user has selected. Userbuy class is used for entry payment after user selection. Userpay class is used for user payment. . Purchasehistory records the user's purchase history. HistoryView class is used for users to view historical records.
