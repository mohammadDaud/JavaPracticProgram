package StreamApiProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 1675;
		int temp, digits = 0, last = 0, sum = 0;
		temp=num; 
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.print("Armstrong ");
		} else {
			System.out.print("Not Armstrong ");
		}
	}

}
