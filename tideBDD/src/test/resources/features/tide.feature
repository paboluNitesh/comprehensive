Feature: Tide project

@search1
Scenario: I want to register in the tide Website
Given I want to go to the home page
When I naviagate to the url
Then it should navigate to the website

@search2
Scenario: I want to verify search functionality is working
Given I as an user I want to verify search field
When I enter a product name in the search field 
Then it should display products

@search3
Scenario: I want to verify that shopProducts is working or not
Given I as an user I want to list in the shop products
When I hover on the shop products 
Then it should display products list

@search4
Scenario: I want to verify stain picker is working or not
Given I as an user I want to use stain guide
When I scroll or up and down button
Then it should display various options present in the feature

@search5
Scenario: I want to contactUs is working or not
Given I as an user I want to contact to the customer care
When I click on the contact us link
Then it should navigate to that page

@search6
Scenario: I want to verify login functionality is working or not
Given I as an user I want to login
When I gave my login credentials to the system 
Then system should accept and navigate to the home page

@search7
Scenario: I want to verify sliders are working or not
Given I as an user I want verify slides presnt at the page
When I entered to the home page
Then it should display slides

@search8
Scenario: I want to verify that review option is available or not
Given I as an user i want to review the products
When I entered in to product page 
Then I can review that product and know the product details

@search9
Scenario: I want to verify that footer links are accesseable or not
Given i as an user I want to verify footer links
When I click on any link 
Then it should it should navigate to that page

@search10
Scenario: I want to verify that brands are accesseable or not
Given i as an user i want to verify barands are accessable or not
When I go to the home page 
Then it should display the P&G family brands




