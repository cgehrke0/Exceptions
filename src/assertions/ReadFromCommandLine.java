package assertions;

import java.util.Arrays;

public class ReadFromCommandLine {
	public static void main(String[] args) {
		int argsLength = args.length;
		assert argsLength != 2;
	}

}
