@Regression_Testing
Feature: TMS_2061 As a user, I need http requests to be modified to have authorization headers using the JWT token to ensure security of my session  

  Scenario: Login as an admin user and obtain the authorization token
    Given the base URL is "http://localhost:8080"
    When I send a POST request to "/authentication/login" with valid admin credentials
    Then I copy the authorization token from the response header
    
    Scenario: Attempt to pass the negative credentials
    Given the base URL is "http://localhost:8080"
    When I send a POST request to "/authentication/login" with invalid admin credentials
    Then the status code response should be 401
    
    
