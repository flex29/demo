package com.tqedu.images;

public class JpegThumbnailTest {
	public static void main(String[] args) {

		JpegThumbnail j = new JpegThumbnail();
		try {
			j.setScale(0.7);
			j.setSmallHeight(500);
			j.doFinal("/Users/TQ-Cui/Downloads/鹿雅宣传单素材/方案二/1.jpg","/Users/TQ-Cui/Downloads/鹿雅宣传单素材/方案二/1-1.jpg");
		} catch (JpegThumbnailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
