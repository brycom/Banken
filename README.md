Simpel bank app där du kan välja ett konto. Se saldot på kontot, sätta in eller ta ut pengar från kontot.

classer:

  app:
    Mainfunktion.

  Customer:
    Construktor för dom individuella kunderna. samt get och sets.

  CustomerHandler:
    En arraylist med alla individuella kunder i.

  BalanceHandler:
    chanceBalans:
      Tar in om du ska sätta in eller ta ut genom variablen direction
      tar in vem kunden är från 
      om du ska ta ut pengar kollas även så att du inte tar ut mer en du har via metoden maxWIthdral
      lägger till eller ta bort pengar från det individuella kontots balance.
  
  checkMaxWithdral:
      Kollar så du inte försöker ta ut mer än det finns på kontots balance.


RunFlow:
  selectCustomer:
    Presenterar en lista med alla konton och kontonummer, tar in från konsolen vilket konto som ska användas.
  chancheBalanceInputs:
      Tar in riktning och summa som ska sättas in eller tas ut och kör metoderna från BalanceHandler.
  
    
  restart:
    Restartfunkton som används i menyn när det individuella caset har körts färdigt
  menu:
    Menyn där du kan välja om du vill se saldo, sätta in eller ta ut, avsluta och byta konto.
  
