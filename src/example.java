
class Example
{
	public float sub(float xy, float ab)
	{
		return xy - yb;
	}
	
	public float add(float a, float b)
	{
		return a + b;
	}
	
	public static float add2(float a, float b)
	{
		// special method ;-)
		return 0.0f;
	}
	
	public static float add3(float a, float b)
	{
		return a + b;
	}

	public static float addAbc(float a, float b)
	{
		return a + b;
	}	
	public static void main(String [] args)
	{
		add2(3.4f, 3.2f);
		add2(3.4f, 3.2f);
		add2(3.4f, 3.2f);
		add2(3.4f, 3.2f);
	}
	
}
