Feature: PolicyBazzar Website
Scenario: Select two wheeler insurance
Given :Get bike number,manufacturer,Model,Reg year,Policy expired
When : Select insurance company,terms to be paid,vehicle owner details
Then :Get insurance details and summary will be printed