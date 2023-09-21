simpel bank app där du kan välja ett konto. Se saldot på kontot, sätta in eller taut pengar från kontot.

classer:

  app:
    mainfunktion.

  Customer:
    construktor för dom individuella kunderna. samt get och sets.

  CustomerHandler:
    en arraylist med alla individuella kunder i.

  BalanceHandler:
    chanceBalans:
      tar in om du ska sätta in eller ta ut genom variablen direction
      tar in vem kunden är från 
      om du ska ta ut pengar kollas även så att du inte tar ut mer en du har via metoden maxWIthdral
      lägger till eller ta bort pengar från det individuella kontots balance.
  
  depositWithdral:
      tar in om du ska sätta in eller ta ut via en direction från classen RunFlow (chanceBalanceInputs)
  
  checkMaxWithdral:
      kollar så du inte försöker ta ut mer än det finns på personens balance.


RunFlow:
  selectCustomer:
  chancheBalanceInputs:
  restart:
  menu:
  
