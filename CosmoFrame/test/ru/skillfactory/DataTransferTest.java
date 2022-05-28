package ru.skillfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ru.skillfactory.MyFrame;
import ru.skillfactory.ResultFrame;

class DataTransferTest {

	@Test
	void testDataTransfer() {
		MyFrame testFrame = new MyFrame();
		testFrame.content ="Test string 123";
		ResultFrame newFrame = new ResultFrame(MyFrame.process(testFrame.content));
		
		assertEquals(newFrame.i, 123);
		
	}

}
