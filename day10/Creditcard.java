package day10;
	class CreditCard{
		long cardNo;
		int cvv;
		String cardHolder;
		int cardPin;
		int cardLimit;
		public 
		private long cardNo;
		private int cvv;
		private String cardHolder;
		private int cardPin;
		private int cardLimit;
		public void setCardPin(int cardPin){this.cardPin = cardPin;}
		public int getCardPin(){return cardPin;}
		public void setCardNo(long cardNo){this.cardNo = cardNo;}
		public void setCvv(int cvv){this.cvv = cvv;}
		public void setCardHolder(String cardHolder){this.cardHolder = cardHolder;}
		public void setCardLimit(int cardLimit) {this.cardLimit = cardLimit;}
		public long getCardNo(){return cardNo;}
		public int getCvv(){return cvv;}
		public String getCardHolder(){return cardHolder;}
		public int getCardLimit(){return cardLimit;}
	}
	public class Prime{
		public static void main(String[] arr){
			CreditCard card1 = new CreditCard();
			card1.cardNo=876545678765456L;
			card1.cvv = 334;card1.cardHolder="Razak Mohamed";card1.cardPin=1234;
			card1.cardLimit = 100000;
			System.out.printf("%s\t%d",card1.cardHolder,card1.cardLimit);
			card1.setCardNo(87654567893454L);
			// card1.setCardHolder("Razak Mohamed");
			card1.setCardPin(1234);
			card1.setCvv(133);
			card1.setCardLimit(100000);
			System.out.println(card1.getCardHolder()+" "+card1.getCardLimit());
		}
	}