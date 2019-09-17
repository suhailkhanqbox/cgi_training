package com.stackroute.datamunger.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.opencsv.CSVReader;
import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {
		String s="";
	// Parameterized constructor to initialize filename
	public CsvQueryProcessor(String fileName) throws FileNotFoundException {

		this.s=fileName;
	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file.
	 * Note: Return type of the method will be Header
	 */
	
	@Override
	public Header getHeader() throws IOException {
			Header h= new Header();

		BufferedReader brTest = new BufferedReader(new FileReader(this.s));
		String text = brTest.readLine();
		// Stop. text is the first line.
		System.out.println(text);
		String[] strArray = text.split(",");
		System.out.println(Arrays.toString(strArray));
		h.setS(strArray);
		brTest.close();
		return h;
	}

	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */
	
	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. 
	 * Note: Return Type of the method will be DataTypeDefinitions
	 */
	
	@Override
	public DataTypeDefinitions getColumnType() throws IOException {
		DataTypeDefinitions d1= new DataTypeDefinitions();
		BufferedReader br = new BufferedReader(new FileReader(this.s));
		String text = br.readLine();
		String line="";
		String[] country={};


		while ((line = br.readLine()) != null)
		{

			// use comma as separator

			country = line.split(",");
			if (country.length == 18) {

				break;
			}
		}
		for(int i=0;i<country.length;i++)

					{

						String regex = "[+-]?[0-9][0-9]*";
						// compiling regex
						Pattern p1 = Pattern.compile(regex);
						// Creates a matcher that will match input1 against regex
						Matcher m1 = p1.matcher(country[i]);

						String regex2="(\\d+\\.\\d+)";
						Pattern p2= Pattern.compile(regex2);
						Matcher m2= p2.matcher(country[i]);
						// If match found and equal to input1


									if(m1.find() && m1.group().equals(country[i]))
									{   country[i]="java.lang.Integer";
										System.out.println(country[i] + " is a valid integer number");
									}


									else if(m2.find() && m2.group().equals(country[i]))
												{  country[i]= "java.lang.Double";

												System.out.println(country[i] + " is a valid double number");
												}

									else
									{
										country[i]="java.lang.String";
										System.out.println(country[i] + " is a valid String");
									}


					}



		d1.setS1(country);
		return d1;

		}




	}

