$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "PolicyBazzar Website",
  "description": "",
  "id": "policybazzar-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Select two wheeler insurance",
  "description": "",
  "id": "policybazzar-website;select-two-wheeler-insurance",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": ":Get bike number,manufacturer,Model,Reg year,Policy expired",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": ": Select insurance company,terms to be paid,vehicle owner details",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": ":Get insurance details and summary will be printed",
  "keyword": "Then "
});
formatter.match({
  "location": "impcucumber.get_bike_number_manufacturer_Model_Reg_year_Policy_expired()"
});
formatter.result({
  "duration": 11783044373,
  "status": "passed"
});
formatter.match({
  "location": "impcucumber.select_insurance_company_terms_to_be_paid_vehicle_owner_details()"
});
formatter.result({
  "duration": 56227124102,
  "status": "passed"
});
formatter.match({
  "location": "impcucumber.get_insurance_details_and_summary_will_be_printed()"
});
formatter.result({
  "duration": 109877,
  "status": "passed"
});
});