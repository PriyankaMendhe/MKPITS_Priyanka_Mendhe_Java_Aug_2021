import java.util.Optional;

public class Exception1
{

	public static void main(String args[])
	{

		Optional<String> nonEmptyOptional = Optional.of("java");
		Optional<String> emptyOptional = Optional.empty();

		System.out.println(nonEmptyOptional.orElseThrow(NullPointerException::new));
		System.out.println(emptyOptional.orElseThrow(NullPointerException::new));

   }

}