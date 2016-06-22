package com.tqedu.images;

import java.io.IOException;

import net.coobird.thumbnailator.Thumbnails;

public class ThumbnailsTest {

	public static void main(String[] args) {
		try {
			Thumbnails.of("/Users/TQ-Cui/Pictures/FN2V63AD2J.com.tencent.ScreenCapture2/1.png")
//			.size(200, 300)
			.scale(0.5)
			.toFile("/Users/TQ-Cui/Pictures/FN2V63AD2J.com.tencent.ScreenCapture2/1.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
