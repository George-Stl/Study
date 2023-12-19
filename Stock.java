class Stock {
   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;
   Stock(String inputSymbol, String inputName){
       symbol = inputSymbol;
       name = inputName;
   }
   double getChangePercent(){
       return Math.round(((currentPrice - previousClosingPrice) / previousClosingPrice) * 10000) / 100.0;
   }
   void setParameters(double newPreviousClosingPrice, double newCurrentPrice){
       previousClosingPrice = newPreviousClosingPrice;
       currentPrice = newCurrentPrice;
   }
}
