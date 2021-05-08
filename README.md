# Shopify-Challenge

## Shopify-Data-Science-Challenge

Please check 2021 Fall Data Science Intern Challenge.txt file.



## Shopify-Backend-Developer-Challenge

Challenge:
ADD image(s) to the repository
- one / bulk / enormous amount of images
- private or public (permissions)
- secure uploading and stored images

This solution was achieved using Spring Boot. IntelliJ IDEA is the preferred IDE to run this application.

Please clone the project first.
```
https://github.com/lujianming000/Shopify-Challenge.git
```

Please follow the instructions below to test the application:
1.	Run the application.
2.	Go to ```http://localhost:8080``` to visit the home page in the browser.
3.	Please login to upload your image files. Please use the following username and password to log in.
  - Username: user
  - Password: 111
4.	You could choose to log out or upload more image files.
5.	If your files have been successfully uploaded, you could go to ```C:\Downloads``` to check your uploaded files.

This application will secure all uploading operations by using form-based authentication. The guest doesn’t have permission to go to the upload page directly.
We could also create a repository in MongoDB to store our images since Spring Boot Integrates with MongoDB very well. However, due to the testing purpose, I think it’s easier to check the local files.
