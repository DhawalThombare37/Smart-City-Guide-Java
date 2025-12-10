package smart.city.guide;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class touristattractions extends JFrame implements ActionListener{

    JButton back;

    public touristattractions() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        String[] destination1 = {"MUMBAI","" ,"Places to be visit:- Marine Drive,water parks,Chhatrapati Shivaji Maharaj Terminus,Sidvinayak Temple", "Hotels to Stay:- Taj Hotel,Trident Nariman,JW marriott  ", "Shoping:- Phoenix Marketcity,Oberoi Mall,Palladium Mall,Inorbit Mall ", "Food to be Try:- Vada pav,Kebabs & Kurries,Famous Restaurant,Cafe Madras, Matunga", "Clubs:-The 4am Club, Dragonfly Experience, Toy Room,R'adda , ", "Nearby places :- Lonavala-Khandala ,Mahabaleshwar,Elephanta Caves", "Know for:-Mumbai, one of the major cosmopolitan cities in India, is a popular tourist attraction", "                   It is primarily famous for large markets, mesmerising beaches, towering buildings","                   & exquisite 5-star hotels.Mumbai is home to multiple UNESCO World Heritage Sites... "};
         String[] destination2 = {"DUBAI", "","Places to be visit:- Dubai Frame,Museum of The Future,Palm Jumeirah,Dubai Aquarium & Underwater Zoo,Desert safaris", "Hotels to Stay:-Atlantis The Plam,Burj AL Arab,Grand Hyatt", "Shoping:- The Dubai Mall,Mall of the Emirates,Ibn Battuta Mall,Souk Madinat Jumeirah", "Things to Do:-Dubai Desert Safari,Dubai Ice Rink,Motiongate Dubai,Skydive Dubai,The Flying Cup", "Foodide Hospots:-Ananta,Skyview Bar & Restaurant,Em Sherif,Zero Gravity,Pierchic", "most Loved Places:-,The Dubai Fountain,Kite Beach,Palm Jumeirah,Dubai Marina,Dubai Museum", "", "Know For:- Dubai is known for many things, including its modern architecture, luxury shopping, and lively nightlife","                It's also known as the \"capital of UAE's economy\"its soaring skyscrapers that kiss the heavens,", "                 Dubai is also known for its innovative construction projects and sports events.... ", "", ""};
           String[] destination3 = {"PUNE", "","Places to be visit:-Shreemant Dagdusheth Halwai Ganpati Mandir,Shaniwar Wada,Sinhagad Fort,BAPS Shri Swaminarayan Mandir,Laal Mahal ", "Hotels to Stay:-Le Meridien,Conrad,The Ritz-Carlton", "Shoping:-Amanora Mall,The Pavillion Mall,Westend Mall,Royale Heritage Mall", "Clubs:-Di mora, The Mill,2bhk, The Mills,Mi-A-Mi Senapati ", "Things to do :-Vasota Fort Jungle Trek and Camping,Malshej Ghat Camping,Paint Ball – It’s Time To Paint,Paragliding – Fly High And High", "Restarunt:-Goodluck Cafe, Vaishali, German Bakery,", "", "Know For:-  Pune is known for its rich history, culture, and architecture. It's also known as the \"cultural","                    capital of Maharashtra\".Pune exemplifies an indigenous Marathi culture and ethos, ","                     in which education, arts and crafts, and theatres are given due prominence", "", "", ""};
           String[] destination4 = {"Singapore", "","Places to be visit:-  Universal Studios Singapore,Gardens by the Bay,Marina Bay Sands,Night Safari,Sentosa Island ", "Hotels to Stay:- Raffles Singapore,Marina Bay Sands,Capella Singapore,The Fullerton Hotel Singapore", "Shopping:- VivoCity,Paragon Shopping Centre,ION Orchard,City Square Mall,Marina Square", " Adventatures:-Ride the Singapore Flyer,Ride the Singapore Cable Car, F1- Singapore Grand Prix,G-MAX Reverse Bungy ", "Foodie Hospots:- Clarke Quay,Sushi Kimura,1-Altitude,One-Ninety Bar,Zouk", "", "Know For:-Singapore—known variously as the “Lion City” or “Garden City,” the latter for its many parks and, ", "                    tree-lined streets—has also been called “instant Asia” because it offers the", "                  tourist an expeditious glimpse into the cultures brought to it by immigrants from all parts of Asia......", ""};
            String[] destination5 = {"GOA", "","Places to be visit:-Palolem Beach,Panaji,Agonda,Dudhsagar Waterfalls,Basilica of Bom Jesus ", "Hotels to Stay:-Taj Cidade de Goa,Double Tree by Hilton,Resort rio", "Shoping:-Anjuna Flea Market, ", "Food to be Try:-The Fisherman's Wharf,Martin's Corner,Chronicle ", "Clubs:-Casino Pride,Chronicle,Silent Night Club,Leopard Valley ", "Things to Do:- River Cruise,Scuba diving at Netrani Island,White Water Rafting,Parasailing","Know For:-Goa is known for its beaches, culture, climate, and historical places.It's also known for its stunning " ,"                 monuments and churches, bustling nightlife, and tropical climate.Goa is a popular tourist ","               destination in India and is nicknamed the \"Pearl of the Orient",""};
            
            
            
        String mumbaiMapLink = "https://www.google.com/maps/place/Mumbai";
        String dubaiMapLink = "https://www.google.com/maps/place/Dubai";
        String puneMapLink = "https://www.google.com/maps/place/Pune";
        String singaporeMapLink="https://www.google.com/maps/place/Singapore";
        String goaMapLink="https://www.google.com/maps/place/Goa";
        
        
        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createDestination(destination1, mumbaiMapLink);
        tab.addTab("Mumbai", null, p1);
        
        JPanel p2 = createDestination(destination2, dubaiMapLink);
        tab.addTab("Dubai", null, p2);
        
        

        JPanel p3 = createDestination(destination3 , puneMapLink);
        tab.addTab("Pune", null, p3);

        JPanel p4 = createDestination(destination4, singaporeMapLink);
        tab.addTab("Singapore", null, p4);

        JPanel p5 = createDestination(destination5 , goaMapLink);
        tab.addTab("Goa", null, p5);

        add(tab);
        setVisible(true);

    }

public JPanel createDestination(String[] pack, String mapLink) {
JPanel p1 = new JPanel();
            
        
        p1.setLayout(null);
        p1.setBounds(0, 0, 1600, 1000);

        JLabel l1 = new JLabel(pack[0]);
        l1.setBounds(700, 10, 300, 50);
        l1.setForeground(Color.MAGENTA);
        l1.setFont(new Font("elephant", Font.PLAIN, 45));
        p1.add(l1);

         JLabel l2 = new JLabel(pack[1]);
        l2.setBounds(50,60,1600,30);
       l2.setForeground(Color.DARK_GRAY);
        l2.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l2);
        
         JLabel l3 = new JLabel(pack[2]);
        l3.setBounds(50,110,1400,30);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l3);
        
         JLabel l4 = new JLabel(pack[3]);
        l4.setBounds(50,160,1400,30);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l4);
        
         JLabel l5 = new JLabel(pack[4]);
        l5.setBounds(50,210,1400,30);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l5);
        
         JLabel l6 = new JLabel(pack[5]);
        l6.setBounds(50,260,1400,30);
        l6.setForeground(Color.black);
        l6.setFont(new Font("tahoma",Font.BOLD,25));
        p1.add(l6);
        
         JLabel l7 = new JLabel(pack[6]);
        l7.setBounds(50,310,1400,30);
        l7.setForeground(Color.black);
        l7.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l7);
        
        JLabel l8 = new JLabel(pack[7]);
        l8.setBounds(50,370,1400,30);
        l8.setForeground(Color.black);
        l8.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(50,410,1400,30);
        l9.setForeground(Color.black);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        JLabel l10 = new JLabel(pack[9]);
        l10.setBounds(50,440,1400,30);
        l10.setForeground(Color.black);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l10);
        
        JLabel l11 = new JLabel(pack[10]);
        l11.setBounds(50,470,1400,30);
        l11.setForeground(Color.black);
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l11);
        
      JLabel googleMapsLabel = new JLabel("Open Google Maps");
        googleMapsLabel.setBackground(Color.BLACK);
        googleMapsLabel.setBounds(50, 600, 230, 25);
        googleMapsLabel.setForeground(Color.blue);
        googleMapsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        googleMapsLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        googleMapsLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI(mapLink));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        p1.add(googleMapsLabel);


        
     back= new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.white);
    back.setBounds(1300, 600, 200, 25);
    back.addActionListener(this);
    p1.add(back);
    
   
    
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/destt4.jpg"));
           Image i2 = i1.getImage().getScaledInstance(1600,1000,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel icon  = new JLabel(i3);
           icon.setBounds(0,-180,1600,1000);
          p1.add(icon);
          
          

    return p1;
}
   
        

  public void actionPerformed(ActionEvent ae ){
        setVisible(false);
    }
 
   
  public static void main(String[] args) {
        new touristattractions();
    }
}