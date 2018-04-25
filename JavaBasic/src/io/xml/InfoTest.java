package io.xml;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class InfoTest implements ActionListener{

	JFrame frame;
	JTextField tf_name, tf_id, tf_tel, tf_age, tf_gender, tf_home ;
	JButton b_add, b_show, b_search, b_delete, b_cancel, b_exit;
	JTextArea ta;	


	public InfoTest() {

		frame		= new JFrame("DBTest");


		tf_name	= new JTextField(15);
		tf_id		= new JTextField(15);
		tf_tel		= new JTextField(15);
		tf_age		= new JTextField(15);
		tf_gender	= new JTextField(15);
		tf_home		= new JTextField(15);

		b_add		= new JButton("Add", new ImageIcon("img/add.gif"));
		b_add.setVerticalTextPosition(SwingConstants.BOTTOM);
		b_add.setHorizontalTextPosition(SwingConstants.CENTER);		
		b_add.setBorder(new BevelBorder(BevelBorder.RAISED));
		b_add.setToolTipText("추가");


		b_show		= new JButton("Show");
		b_search	= new JButton("Search");
		b_delete	= new JButton("Delete");
		b_cancel	= new JButton("Cancel");
		b_exit		= new JButton("Exit");
		ta			= new JTextArea(20, 50);


	}

	void setup(){

		JPanel p_center  = new JPanel();
		JPanel p_west	 = new JPanel();
		JPanel p_south 	 = new JPanel();

		// west영역 붙이기
		// 화면출력만 하는 라벨 생성 및 붙이기 

		/************************
		 * 이미지 라벨 
		 */
		JLabel ll_name = new JLabel("Name", new ImageIcon("img/cute/1.gif"),JLabel.CENTER);		
		JLabel ll_id   = new JLabel("ID",   new ImageIcon("img/cute/2.gif"),SwingConstants.CENTER);
		JLabel ll_tel  = new JLabel("Tel",  new ImageIcon("img/cute/3.gif"),SwingConstants.CENTER);
		JLabel ll_sex  = new JLabel("Sex",  new ImageIcon("img/cute/4.gif"),SwingConstants.CENTER);
		JLabel ll_age  = new JLabel("Age",  new ImageIcon("img/cute/5.gif"),SwingConstants.CENTER);
		JLabel ll_home = new JLabel("Home", new ImageIcon("img/cute/6.gif"),SwingConstants.CENTER);


		p_west.setLayout( new GridLayout(6,2));
		p_west.add( ll_name);
		p_west.add( tf_name );
		p_west.add( ll_id);
		p_west.add( tf_id );
		p_west.add( ll_tel);
		p_west.add( tf_tel );
		p_west.add( ll_sex);
		p_west.add( tf_gender );
		p_west.add( ll_age);
		p_west.add( tf_age );
		p_west.add( ll_home);
		p_west.add( tf_home );


		// center 영역
		p_center.setLayout(new BorderLayout());
		p_center.add("Center", ta );

		// south 영역
		p_south.setLayout( new GridLayout(1,6));
		p_south.add( b_add );
		p_south.add( b_show );
		p_south.add( b_search );
		p_south.add( b_delete );
		p_south.add( b_cancel );
		p_south.add( b_exit );

		frame.getContentPane().setLayout( new BorderLayout() );
		frame.getContentPane().add("West", p_west );
		frame.getContentPane().add("Center", p_center );
		frame.getContentPane().add("South", p_south );

		frame.pack();
		frame.setTitle("InfoTest");
		frame.setVisible(true);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void eventProc(){


		// 버튼 이벤트 등록
		b_add.addActionListener( this );
		b_show.addActionListener( this );
		b_search.addActionListener( this );
		b_delete.addActionListener( this );
		b_cancel.addActionListener( this );
		b_exit.addActionListener( this );

		tf_tel.addActionListener(this);

	}

	public void actionPerformed( ActionEvent ev ){

		Object evt = ev.getSource();
		if( evt== b_add ){
			saveData();
		}	else if( evt == b_show ){
			readData();
		} 	else if( evt == tf_tel ){
			search();
		}	else if( evt == b_delete ){
			removeData();
		}
	}

	void removeData(){
		try {
			File f = new File("info.xml");
			DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder docBuild= docFac.newDocumentBuilder();
			Document doc = docBuild.parse(f); // parse : file을 memory구조(트리구조)로 변경 
			
			NodeList personList = doc.getElementsByTagName("person");
			
			for (int i = 0; i < personList.getLength(); i++) {
				Node temp = personList.item(i);
				NodeList childlist = temp.getChildNodes();
				for (int j = 0; j < childlist.getLength(); j++) {
					Node node = childlist.item(j);
					if(node.getNodeName().equals("tel")){
						String searchTel = tf_tel.getText();
						if(searchTel.equals(node.getTextContent())){
							
							Node info = temp.getParentNode();
							
							info.removeChild(temp);
						}
					}
				}
			}
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Result output = new StreamResult(new File("info.xml"));
            Source input = new DOMSource(doc);
            transformer.transform(input, output);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	void search() {
		try {
			File file = new File("info.xml");
			DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuild = docFac.newDocumentBuilder();
			Document doc = docBuild.parse(file);//file-> 메모리구조(트리구조)로 변경
			
			//ta.setText(doc.getDocumentElement().getNodeName());//info출력
			
			NodeList personList = doc.getElementsByTagName("person");
			//ta.setText("인원수:"+personList.getLength());
			
			ta.setText("");
			for (int i = 0; i < personList.getLength(); i++) {
				Node temp = personList.item(i);
				NodeList childList = temp.getChildNodes();
				
				for (int j = 0; j < childList.getLength(); j++) {
					Node node = childList.item(j);
					
					//------------------------------show 복사--후 추가
					if(node.getNodeName().equals("tel")){
						String searchTel = tf_tel.getText();
						if(searchTel.equals(node.getTextContent())){
							//getNextSibling . getPreciousSiling
							Node tn1 = node.getNextSibling();
							Node tn2 = tn1.getNextSibling();
							Node tn3 = tn2.getNextSibling();
							Node tn4 = node.getPreviousSibling();
							Node tn5 = tn4.getPreviousSibling();
							
							String t1 = tn1.getTextContent();
							String t2 = tn2.getTextContent();
							String t3 = tn3.getTextContent();
							String t4 = tn4.getTextContent();
							String t5 = tn5.getTextContent();
							//String t3 = tn2.get
							tf_gender.setText(t1);
							tf_age.setText(t2);
							tf_home.setText(t3);
							tf_id.setText(t4);
							tf_name.setText(t5);
						}
					}
					
				}
				
			}
			
		} catch (ParserConfigurationException e) {
			System.out.println("읽기 error:"+e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("error:"+e.getMessage());
			e.printStackTrace();
		}

	}

	
	void readData(){
		File f = new File("info.xml");
		try {
			DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder docBuild = docFac.newDocumentBuilder();
			Document doc = docBuild.parse(f); // parse : file을 memory구조(트리구조)로 변경 
			
//			ta.setText(doc.getDocumentElement().getNodeName());
			NodeList personList = doc.getElementsByTagName("person");
//			ta.setText("인원수:" + personList.getLength());
			
			ta.setText("");
			
			for (int i = 0; i < personList.getLength(); i++) {
				Node temp = personList.item(i);
				NodeList childlist = temp.getChildNodes();
				for (int j = 0; j < childlist.getLength(); j++) {
					Node node = childlist.item(j);
					ta.append(node.getTextContent() + "\t");
				}
				ta.append("\n");
			}
		} catch (Exception e) {
			ta.setText("읽기 실패");
			e.printStackTrace();
		}
	}
	
	void saveData(){
		try {
			File f = new File("info.xml");
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			long pos = raf.length() -7 ; //</info>가 7글자
			if(pos<0){ // 처음 데이터를 저장할때 
				String tag = "<info>" + makeTags() + "</info>";
				raf.write(tag.getBytes());//String을 자동으로 byte[]로 바꿔줌 
			}else{ // 이미 데이터가 있는 경우
				raf.seek(pos); // 위치를 찾을 수있음 
				String tag = makeTags() + "</info>";
				raf.write(tag.getBytes());
			}
			raf.close();
			clearTextFields();
		} catch (Exception e) {
			ta.setText("저장실패:" + e.getMessage());
		}
	}

	String makeTags(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("<person>");
		sb.append("<name>" + tf_name.getText() + "</name>");
		sb.append("<id>" + tf_id.getText() + "</id>");
		sb.append("<tel>" + tf_tel.getText() + "</tel>");
		sb.append("<gender>" + tf_gender.getText() + "</gender>");
		sb.append("<age>" + tf_age.getText() + "</age>");
		sb.append("<home>" + tf_home.getText() + "</home>");
		sb.append("</person>");
		
		
		return sb.toString();
	}

	void clearTextFields(){
		tf_tel.setText("");
		tf_name.setText("");
		tf_id.setText("");
		tf_age.setText("");
		tf_home.setText("");
		tf_gender.setText("");
	}
	public static void main(String args[]) {		
		InfoTest mainFrame = new InfoTest();
		mainFrame.setup();
		mainFrame.eventProc();
	}
}
