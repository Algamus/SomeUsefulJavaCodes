private void readCsvFile(String pathname){
		BufferedReader bufferedreader = null;
  
        try {

        	bufferedreader = new BufferedReader(new FileReader(pathname));

        	while ((line = bufferedreader.readLine()) != null) {

                // separator
                String[] data = line.split(",");

                /////data[*] all your data for first line

                //modify here
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedreader != null) {
                try {
                	bufferedreader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

	}


	private static void writeLine(Writer w, List<String> values) throws IOException {

        boolean first = true;

        StringBuilder stringbuilder = new StringBuilder();
        for (String value : values) {
            if (!first) {
                stringbuilder.append(',');
            }
            
            stringbuilder.append(value);
            first = false;
        }
        stringbuilder.append("\n");
        w.append(stringbuilder.toString());


    }
	
	private void writecsvfile(String filename,ArrayList<CityNode> f){
		try {
			FileWriter writer = new FileWriter(filename+".csv");
			
			
			//write data to file
			String c1 = "column1";
			String c2 = "column2";
			String c3 = "column3";
			String c4 = "column4";
			
			writeLine(writer, (Arrays.asList(c1, c2, c3, c4)));
			
			// end of write
			
			
			writer.flush();
	        writer.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}