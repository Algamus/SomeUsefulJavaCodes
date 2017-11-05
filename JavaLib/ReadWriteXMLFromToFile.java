private void readXmlFile(String pathname){
	
				File file = new File(pathname);
				
		
				DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
		        DocumentBuilder docmentbuilder;
				try {
					docmentbuilder = documentbuilderfactory.newDocumentBuilder();
			        Document doc = docmentbuilder.parse(file);
			        doc.getDocumentElement().normalize();
			        NodeList nl = doc.getElementsByTagName("First Tag"); //first tag
			        
			        

			        /*
						 use;
						 	e.getAttribute("name") for tag e

						for more inner tag;

							e.getElementsByTagName("Second Tag")

						More Deeper tag;
							Node n1 = e.getElementsByTagName("Second Tag");
				            Element e1 = (Element) n1;

				            e1 is your Third tag;

			        */
			        
			        
			   		//modify here
		        
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}


	private void writexmlfile(String filename,ArrayList<CityNode> f){
		try{
			DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentbuilder = documentbuilderfactory.newDocumentBuilder();
			Document document = documentbuilder.newDocument();
			
			/*Element e = document.createElement("First Tag");
			document.appendChild(e);

			Element e1 = document.createElement("Second Tag");
				e.appendChild(e1);
				
				Attr attr1 = document.createAttribute("Second Tag attribute 1 name");
				attr1.setValue("name bla bla");
				e1.setAttributeNode(attr1);
			*/

				//Modify here
			
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File(filename+".xml"));
			
			transformer.transform(source, result);
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}