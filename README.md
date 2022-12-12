# AED_Final_Project

# AED_Final_Project

# Donor Management System
### Description :
Our system's goal is to make finding blood and organs in an emergency as easy and automated as possible while also keeping track of blood and organ donors, patients, hospitals, and the bank's blood and organ supplies. Our objective is to offer a useful management solution to manage donor and patient records of city’s population. Our ecosystem's goal is to create a network of Boston that links a patient and donor to a hospital, a blood organ bank, and Laboratory.  We have created an ecosystem where we oversee the complete Donor management system for the general public. Upon receiving a patient's request, we first check the blood/organ bank for matching donors. If none are present, we next transmit the request to the laboratory, where we look for matches there. We have 7 organizations, 8 roles, and 4 enterprises. This illustrates how resilient our ecosystem is. For a safer world, we want to offer a simple and user-friendly approach. The features of our application are listed below.

Administrators can manage hospitals, banks, patients, laboratories and reward systems.

Patient can register and request blood and organs

Hospital keeps patient information in its own hospital

Hospital can send requests for its own patients for blood or organs

Bank receives requests from different hospitals and checks in its inventory if a match is found. If found it will close the request else it will send the request to the laboratory.

In the event that the bank does not have the match, request is sent to the laboratory, which attempts to find a match and sends information about the matched donor to the laboratory

Patient can check the status of their request

Donor can register, donate blood and organs, and receive credit for their donation

All the donor details will be accessed by the laboratory as well.

### Enterprises:

Hospital - The hospital enterprise is connected to the patient. The patient will be admitted to a particular hospital. The patient will send a request to the hospital in which it is admitted. The hospital can view its own details and details of patients in its hospital. Hospitals can then send requests of patients to Blood and Organ banks.
Blood and Organ Bank - The Bank has its own inventory. The requests coming from the hospital are seen over here in banks. The bank can check if the request can be fulfilled or not. If a bank has requested blood or a donor then it closes the request else it will pass on to the laboratory.
Laboratory - Laboratory will have all the details of the donor. If a donor is available for any patient request then we close the request else we need to wait for some time till any donor is found.
Reward system - This enterprise will assign credits/rewards to donors who have donated their blood or organ.

### Organizations:

Patient Blood Department - This organization handles requests of blood.
Patient Organ Department - This organization handles requests of organs.
Blood and Organ Bank Inventory - This is the bank inventory which has blood and organs available for fulfilling any requests.
Patient Request Status Report - The status of patient request is tracked and shown in patient login.
Matchmaker - This is the matchmaker which will check if blood or organ is matched or not.
Donor Blood Department - This organization handles the blood donations.
Donor Organ Department - This organization handles the organ donations.

### Roles:
Administration 
Patient
Donor
Hospital
Bank
Blood 
Organ
Credit assigner 

### Design flow of this system:
![Design](https://user-images.githubusercontent.com/114432347/206962496-d79e2d4c-2891-4781-8108-06d1b97a787c.jpg)


### ClassDiagram:
![ClassDiagram](https://user-images.githubusercontent.com/114432347/206962451-267e1e87-4ead-4152-9126-5026934866bf.jpg)


### Screenshots:

1.Mainframe of our System:
<img width="1434" alt="Screenshot 2022-12-11 at 11 49 19 PM" src="https://user-images.githubusercontent.com/114432347/206963115-c61bcce9-81bb-4d97-858e-cfe1f13efd9a.png">

2.Login Frame:
<img width="1420" alt="Screenshot 2022-12-11 at 11 49 35 PM" src="https://user-images.githubusercontent.com/114432347/206963157-8b192edc-28af-4b24-a039-04969ec1098a.png">
 
3.Patient Send Request Frame:
<img width="1233" alt="Screenshot 2022-12-11 at 11 22 59 PM" src="https://user-images.githubusercontent.com/114432347/206962810-9f5f5cb6-065e-4dda-8298-e73144ece474.png">

4.Laboratory Operations:
<img width="1292" alt="Screenshot 2022-12-11 at 11 23 57 PM" src="https://user-images.githubusercontent.com/114432347/206962722-a104c59e-a9e8-4258-95a1-fd7c9d95d9f4.png">

5.Patient Status View Frame:
<img width="1234" alt="Screenshot 2022-12-11 at 11 25 22 PM" src="https://user-images.githubusercontent.com/114432347/206962861-2beace28-1b23-4f69-974e-7a8c6bd67c34.png">

6.Donor Reward system Frame:
<img width="1181" alt="Screenshot 2022-12-11 at 11 26 20 PM" src="https://user-images.githubusercontent.com/114432347/206962935-16ce0988-5cf2-476b-a1cc-1a2982229ccb.png">

 

