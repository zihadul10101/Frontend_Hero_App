
package com.debugentity.frontendhero;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */


		//========================Video Item Category
		addVideoItem("k_apoPmQntw", "ওয়েব ডিজাইন কি ?", "Understanding Web Design and Development part-1");
		addVideoItem("qPna1ZlRxTo", "ওয়েব ডিজাইন কি ?", "Understanding Web Design and Development part-2 ");
		addVideoItem("2DI2OzBs6UE", "ওয়েব ডেভেলপমেন্ট কি ?", "What Is Web Development Explained");
		addVideoItem("EflA4EX53RY", "ওয়েব ডিজাইন VS ওয়েব ডেভেলপমেন্ট ?", "Difference between Web Designer and Web Developer Bangla");
		addVideoItem("uFnOagOBAAo", "ফ্রন্টএন্ড ডেভেলপমেন্ট কি ?", "What is Frontend Development in Bangla");
		addVideoItem("MXNX_8Wa2SM", "বেকএন্ড ডেভেলপমেন্ট কি ?", "Back End Development in Bangla");
		addVideoItem("i4laq6e_B6U", "ওয়েব ডেভেলপার হওয়ার কমপ্লিট গাইডলাইন", "Complete Guideline to be a web developer");
		addVideoItem("2DI2OzBs6UE", "ওয়েব ডিজাইন এবং ফ্রন্টএন্ড ডেভেলপমেন্ট এর মধ্যে পার্থক্য কি ?", "Front End Development vs Web Design ... what is the difference?");
		createPlayListForVideo("ওয়েব ডেভেলপমেন্ট- কি, কেন, কিভাবে?", R.drawable.category_1);

		//=========================
		createCategoryForWebsite("W3school", R.drawable.category_2, "https://www.w3schools.com/");

		createCategoryForWebsite("হাতেকলমে জাভাস্ক্রিপ্ট", R.drawable.javascript, "https://js.zonayed.me/");
		//=========================

		//===========================
		createCategoryForPDF("HTML5 Pdf", R.drawable.category_4, "html5_tutorial.pdf");
		createCategoryForPDF("HTML5 Pdf", R.drawable.category_4, "css_tutorial.pdf");
		//==========================================================================*
















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

