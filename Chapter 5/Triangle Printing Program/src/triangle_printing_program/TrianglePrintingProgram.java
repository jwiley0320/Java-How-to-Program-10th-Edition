package triangle_printing_program;

public class TrianglePrintingProgram 
{
	int star = 10;
	int space = 1;
	
	public TrianglePrintingProgram() 
	{
		
	}
	public TrianglePrintingProgram(int star, int space) {
		super();
		this.star = star;
		this.space = space;
	}
	public int getStar() {
		return star;
	}
	public void subStar() {
		this.star--;
	}
	public int getSpace() {
		return space;
	}
	public void addSpace() {
		this.space++;
	}
	public void subSpace() {
		this.space--;
	}
	public void addStar() {
		this.star++;
	}
}