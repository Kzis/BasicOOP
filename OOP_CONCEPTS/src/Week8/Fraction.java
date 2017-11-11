package Week8;


public class Fraction {
	
	private int numerator;
	private int denominator;

	public static int gcd(int m, int n) {
		int r = n % m;
		while (r != 0) {
			n = m;
			m = r;
			r = n % m;
		}
		return m;
	}

	public Fraction simplify() {
		int num = getNumerator();
		int denom = getDenominator();
		int divisor = 1;
		if (num != 0) {
			divisor = gcd(Math.abs(num), denom);
		}
		return new Fraction(num / divisor, denom / divisor);
	}

	public Fraction(int numerator, int denominator) {
		if (denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
		if (numerator == 0) {
			denominator = 1;
		}
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}

	public Fraction(int i) {
		this(i, 1);
	}

	public Fraction() {
		this(0, 1);
	}

	public Fraction(Fraction f) {
		this(f.getNumerator(), f.getDenominator());
	}

	public Fraction add(Fraction frac) {
		int a, b, c, d;
		Fraction sum;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		sum = new Fraction(a * d + b * c, b * d);
		return sum;
	}

	public Fraction add(int i) {
		Fraction f = new Fraction(i);
		Fraction sum = this.add(f);
		return sum;
	}

	public Fraction multiply(Fraction frac) {
		int a, b, c, d;
		Fraction result;
		a = this.getNumerator();
		b = this.getDenominator();
		c = frac.getNumerator();
		d = frac.getDenominator();
		result = new Fraction(a * c, b * d);
		return result;
	}

	public Fraction multiply(int i) {
		Fraction f = new Fraction(i);
		Fraction result = this.multiply(f);
		return result;
	}
	
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}