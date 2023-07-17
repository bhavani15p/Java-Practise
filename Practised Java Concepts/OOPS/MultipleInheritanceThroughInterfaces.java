public class MultipleInheritanceThroughInterfaces {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.printOne();
        num.printTwo();
        num.printThree();
    }
    
}

interface one {
	public void printOne();
}

interface two {
	public void printTwo();
}

interface three extends one, two {
	public void printThree();
}

class Numbers implements three {
	public void printOne()
	{
		System.out.println("One");
	}

	public void printTwo() { 
        System.out.println("Two"); 
    }

    public void printThree() { 
        System.out.println("Three"); 
    }
}
