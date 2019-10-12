class MathOperation {

	public static void main(String[] args) 
{
		int[] a = new int[args.length];
		try
{
			for (int i = 0; i < args.length; i++) 
{
				a[i] = Integer.parseInt(args[i]);
			}
			
int sum = 0;
			for (int i = 0; i < a.length; i++)
{
				sum += a[i];
			}
			
System.out.println(sum + " " + (sum / (float)a.length));
		
} catch (NumberFormatException e) {
			System.out.println("Number Format Exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
	}
}
