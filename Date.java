package for_birthday_database;

public class Date {
		
		private Month month;
		private int day;
		private int year;
		
		public Date(Month theMonth, int theDay, int theYear) throws IllegalArgumentException{
			if(!isValidDay(theMonth, theDay)) {
				throw new IllegalArgumentException(theDay + " is a bad day for " + theMonth.getName() + "!");
			}
			if(theYear <= 0) {
				throw new IllegalArgumentException("Year cannot be negative!");
			}
			month = theMonth;
			day = theDay;
			year = theYear;
		}
		
		private boolean isValidDay(Month theMonth, int theDay) {
			int d = theMonth.getDay();
			return (theDay > 0 && theDay <= d);
		}
		
		public Month getMonth(){
			return month;
		}

		public int getDay(){
			return day;
		}

		public int getYear(){
			return year;
		}
		

			public void setMonth(Month theMonth){
				if(isValidDay(theMonth, day)){
					month = theMonth;
				}else{
					System.out.println(theMonth + " " + day + " is not a valid date.");
				}
			}


			public void setDay(int theDay){
				if(isValidDay(month, theDay)){
					day = theDay;
				}else{
					System.out.println(theDay + " is not a valid day in " + month.getName() + ".");
				}
			}


			public void setYear(int theYear){
				if(theYear < 0){
					System.out.println("The year cannot be a negative number.");
				} else{
					year = theYear;
				}
			}

			@Override
			public String toString(){
				return month.getName() + " " + day + ", " + year;
			}
			
	
	
}
