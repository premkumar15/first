package org.maven;

import java.io.IOException;

public class Main extends BaseClass {
		public static void main(String[] args) throws IOException, InterruptedException {
			BaseClass b=new BaseClass();
			Actwithexcel act = new Actwithexcel();
act.login(b.file(0, 0),b.file(0, 1));
act.searchHotel(b.file(0, 2),b.file(0, 3), b.file(0, 4), b.file(0, 5), b.file(0, 6), b.file(0, 7), b.file(0, 8), b.file(0, 9));
act.bookingLast(b.file(0, 10), b.file(0, 11), b.file(0, 12), b.file(0, 13), b.file(0, 14), b.file(0,15), b.file(0,16), b.file(0,17));
act.bookingConf();

		}
	}


