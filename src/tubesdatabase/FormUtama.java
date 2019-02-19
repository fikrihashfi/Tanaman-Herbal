package tubesdatabase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormUtama extends javax.swing.JFrame {
    Connection con = null;
    Statement stm = null;
    ResultSet sql = null;
    String ComboBox="";
    public String dNumDisease1[]; 
    public String ScientificName1[];
    public String publicationNumber1[];
    public String HerbalMedicine1[];
    public String Method1[];
    ArrayList<String> dNumDisease = new ArrayList(); 
    ArrayList<String> ScientificName = new ArrayList(); 
    ArrayList<String> publicationNumber = new ArrayList(); 
    ArrayList<String> HerbalMedicine = new ArrayList(); 
    ArrayList<String> Method = new ArrayList(); 
    
 public FormUtama() {
        ArrayMethod();   
        ArraydNumDisease();
        ArrayScientificName();
        ArrayPublicationNumber();
        ArrayHerbalMedicine();
        initComponents();
        GetDataDisease();
        GetDataMP();
        GetDataRD();
        GetDataHerbMedic();
        GetDataMethod();
        setTitle("Obat Herbal - Kelompok 7");        
        TampilanOff();

    }  

 public void ArrayMethod(){
            Method1 = new String[Method.size()+1];
            for(int i=0; i<Method.size(); i++){
                Method1[i] = Method.get(i);
                //System.out.print(Method1[i]);
               // System.out.print(Method.get(i));
                CB_metNumberPB.addItem(Method.get(i));
            }

 }
 
 public void ArrayHerbalMedicine(){
            HerbalMedicine1 = new String[HerbalMedicine.size()+1];
            for(int i=0; i<HerbalMedicine.size(); i++){
                HerbalMedicine1[i] = HerbalMedicine.get(i);
                //System.out.print(dNumDisease1[i]);
                CB_hmNumberPR.addItem(HerbalMedicine.get(i));
                CB_hmNumberHMI.addItem(HerbalMedicine.get(i));
            }

 }
 
  public void ArrayPublicationNumber(){
            publicationNumber1 = new String[publicationNumber.size()+1];
            for(int i=0; i<publicationNumber.size(); i++){
                dNumDisease1[i] = publicationNumber.get(i);
                //System.out.print(publicationNumber1[i]);
                CB_rdpNumberProvB.addItem(publicationNumber.get(i));
                CB_rdpNumber.addItem(publicationNumber.get(i));
            }

 }
 
 public void ArraydNumDisease(){
            dNumDisease1 = new String[dNumDisease.size()+1];
            for(int i=0; i<dNumDisease.size(); i++){
                dNumDisease1[i] = dNumDisease.get(i);
                //System.out.print(dNumDisease1[i]);
                CB_disNumberTreat.addItem(dNumDisease.get(i));
            }

 }
 
  public void ArrayScientificName(){
            ScientificName1 = new String[ScientificName.size()+1];
            for(int i=0; i<ScientificName.size(); i++){
                ScientificName1[i] = ScientificName.get(i);
                //System.out.print(ScientificName1[i]);
                CB_mpsNameMPH.addItem(ScientificName.get(i));
                CB_mpsNameTreat.addItem(ScientificName.get(i));
                CB_mpsNameMPComp.addItem(ScientificName.get(i));
                CB_mpsNameProvB.addItem(ScientificName.get(i));
                CB_mpsNameMPC.addItem(ScientificName.get(i));
                CB_mpsNameRD.addItem(ScientificName.get(i));
                CB_mpsNameMPClas.addItem(ScientificName.get(i));
                CB_mpsNamePR.addItem(ScientificName.get(i));
                CB_mpsNamePB.addItem(ScientificName.get(i));
            }

 }
  
 public void deleteDataCB(){
            ScientificName.clear();
                CB_mpsNameMPH.removeAllItems();
                CB_mpsNameTreat.removeAllItems();
                CB_mpsNameMPComp.removeAllItems();
                CB_mpsNameProvB.removeAllItems();
                CB_mpsNameMPC.removeAllItems();
                CB_mpsNameRD.removeAllItems();
                CB_mpsNameMPClas.removeAllItems();
                CB_mpsNamePR.removeAllItems(); 
                CB_mpsNamePB.removeAllItems();
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InMPClasPanel = new javax.swing.JPanel();
        UpdateBtn6 = new javax.swing.JButton();
        DeleteBtn6 = new javax.swing.JButton();
        InsertBtn6 = new javax.swing.JButton();
        NewBtn6 = new javax.swing.JButton();
        ClassificationNo = new javax.swing.JLabel();
        MPSClasmpsName = new javax.swing.JLabel();
        division = new javax.swing.JLabel();
        MPSClasclass = new javax.swing.JLabel();
        subClass = new javax.swing.JLabel();
        ClassificationNoTF = new javax.swing.JTextField();
        classTF = new javax.swing.JTextField();
        divisionTF = new javax.swing.JTextField();
        subClassTF = new javax.swing.JTextField();
        subKingdom = new javax.swing.JLabel();
        superDivision = new javax.swing.JLabel();
        species = new javax.swing.JLabel();
        mporder = new javax.swing.JLabel();
        family = new javax.swing.JLabel();
        genus = new javax.swing.JLabel();
        subKingdomTF = new javax.swing.JTextField();
        superDivisionTF = new javax.swing.JTextField();
        speciesTF = new javax.swing.JTextField();
        mporderTF = new javax.swing.JTextField();
        familyTF = new javax.swing.JTextField();
        genusTF = new javax.swing.JTextField();
        CB_mpsNameMPClas = new javax.swing.JComboBox<>();
        InDiseasePanel = new javax.swing.JPanel();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        InsertBtn = new javax.swing.JButton();
        NewBtn = new javax.swing.JButton();
        dNumber = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Cause = new javax.swing.JLabel();
        Symptoms = new javax.swing.JLabel();
        NumberTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        CauseTF = new javax.swing.JTextField();
        SymptomsTF = new javax.swing.JTextField();
        InMPCompPanel = new javax.swing.JPanel();
        UpdateBtn5 = new javax.swing.JButton();
        DeleteBtn5 = new javax.swing.JButton();
        InsertBtn5 = new javax.swing.JButton();
        NewBtn5 = new javax.swing.JButton();
        composition = new javax.swing.JLabel();
        MPCompmpsName = new javax.swing.JLabel();
        compositionTF = new javax.swing.JTextField();
        CB_mpsNameMPComp = new javax.swing.JComboBox<>();
        InMethodPanel = new javax.swing.JPanel();
        UpdateBtn2 = new javax.swing.JButton();
        DeleteBtn2 = new javax.swing.JButton();
        InsertBtn2 = new javax.swing.JButton();
        NewBtn2 = new javax.swing.JButton();
        mNumber = new javax.swing.JLabel();
        HowToProcess = new javax.swing.JLabel();
        HowToUse = new javax.swing.JLabel();
        mNumberTF = new javax.swing.JTextField();
        HowToProcessTF = new javax.swing.JTextField();
        HowToUseTF = new javax.swing.JTextField();
        InMPHPanel = new javax.swing.JPanel();
        UpdateBtn4 = new javax.swing.JButton();
        DeleteBtn4 = new javax.swing.JButton();
        InsertBtn4 = new javax.swing.JButton();
        NewBtn4 = new javax.swing.JButton();
        habitatNumber = new javax.swing.JLabel();
        HmpsName = new javax.swing.JLabel();
        temperature = new javax.swing.JLabel();
        endemic = new javax.swing.JLabel();
        typeOfLand = new javax.swing.JLabel();
        habitatNumberTF = new javax.swing.JTextField();
        temperatureTF = new javax.swing.JTextField();
        endemicTF = new javax.swing.JTextField();
        typeOfLandTF = new javax.swing.JTextField();
        typeOfSoil = new javax.swing.JLabel();
        typeOfSoilTF = new javax.swing.JTextField();
        CB_mpsNameMPH = new javax.swing.JComboBox<>();
        InMPPanel = new javax.swing.JPanel();
        UpdateBtn7 = new javax.swing.JButton();
        DeleteBtn7 = new javax.swing.JButton();
        InsertBtn7 = new javax.swing.JButton();
        NewBtn7 = new javax.swing.JButton();
        scientificName = new javax.swing.JLabel();
        commonName = new javax.swing.JLabel();
        theUtilizePart = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        scientificNameTF = new javax.swing.JTextField();
        commonNameTF = new javax.swing.JTextField();
        theUtilizePartTF = new javax.swing.JTextField();
        photoTF = new javax.swing.JTextField();
        InHMIPanel = new javax.swing.JPanel();
        UpdateBtn8 = new javax.swing.JButton();
        DeleteBtn8 = new javax.swing.JButton();
        InsertBtn8 = new javax.swing.JButton();
        NewBtn8 = new javax.swing.JButton();
        ingredients = new javax.swing.JLabel();
        hmNumber = new javax.swing.JLabel();
        ingredientsTF = new javax.swing.JTextField();
        CB_hmNumberHMI = new javax.swing.JComboBox<>();
        InTreatPanel = new javax.swing.JPanel();
        UpdateBtn11 = new javax.swing.JButton();
        DeleteBtn11 = new javax.swing.JButton();
        InsertBtn11 = new javax.swing.JButton();
        NewBtn1 = new javax.swing.JButton();
        dNumber1 = new javax.swing.JLabel();
        mpsName5 = new javax.swing.JLabel();
        CB_disNumberTreat = new javax.swing.JComboBox<>();
        CB_mpsNameTreat = new javax.swing.JComboBox<>();
        InPRPanel = new javax.swing.JPanel();
        UpdateBtn14 = new javax.swing.JButton();
        DeleteBtn14 = new javax.swing.JButton();
        InsertBtn14 = new javax.swing.JButton();
        NewBtn13 = new javax.swing.JButton();
        mpsName3 = new javax.swing.JLabel();
        hmNumber2 = new javax.swing.JLabel();
        CB_mpsNamePR = new javax.swing.JComboBox<>();
        CB_hmNumberPR = new javax.swing.JComboBox<>();
        InRDRPanel = new javax.swing.JPanel();
        UpdateBtn9 = new javax.swing.JButton();
        DeleteBtn9 = new javax.swing.JButton();
        InsertBtn9 = new javax.swing.JButton();
        NewBtn9 = new javax.swing.JButton();
        researcher = new javax.swing.JLabel();
        rdpNumber = new javax.swing.JLabel();
        researcherTF = new javax.swing.JTextField();
        CB_rdpNumber = new javax.swing.JComboBox<>();
        InPBPanel = new javax.swing.JPanel();
        UpdateBtn12 = new javax.swing.JButton();
        DeleteBtn12 = new javax.swing.JButton();
        InsertBtn12 = new javax.swing.JButton();
        NewBtn11 = new javax.swing.JButton();
        mpsName6 = new javax.swing.JLabel();
        metNumber = new javax.swing.JLabel();
        CB_mpsNamePB = new javax.swing.JComboBox<>();
        CB_metNumberPB = new javax.swing.JComboBox<>();
        InProvBPanel = new javax.swing.JPanel();
        UpdateBtn13 = new javax.swing.JButton();
        DeleteBtn13 = new javax.swing.JButton();
        InsertBtn13 = new javax.swing.JButton();
        NewBtn12 = new javax.swing.JButton();
        rdpNumber2 = new javax.swing.JLabel();
        mpsName7 = new javax.swing.JLabel();
        CB_rdpNumberProvB = new javax.swing.JComboBox<>();
        CB_mpsNameProvB = new javax.swing.JComboBox<>();
        InMPCPanel = new javax.swing.JPanel();
        UpdateBtn3 = new javax.swing.JButton();
        DeleteBtn3 = new javax.swing.JButton();
        InsertBtn3 = new javax.swing.JButton();
        NewBtn3 = new javax.swing.JButton();
        cNumber = new javax.swing.JLabel();
        mpsName = new javax.swing.JLabel();
        breeding = new javax.swing.JLabel();
        fruit = new javax.swing.JLabel();
        length = new javax.swing.JLabel();
        cNumberTF = new javax.swing.JTextField();
        breedingTF = new javax.swing.JTextField();
        fruitTF = new javax.swing.JTextField();
        lengthTF = new javax.swing.JTextField();
        leaf = new javax.swing.JLabel();
        flower = new javax.swing.JLabel();
        root = new javax.swing.JLabel();
        stem = new javax.swing.JLabel();
        leafTF = new javax.swing.JTextField();
        flowerTF = new javax.swing.JTextField();
        rootTF = new javax.swing.JTextField();
        stemTF = new javax.swing.JTextField();
        CB_mpsNameMPC = new javax.swing.JComboBox<>();
        InRDPanel = new javax.swing.JPanel();
        UpdateBtn10 = new javax.swing.JButton();
        DeleteBtn10 = new javax.swing.JButton();
        InsertBtn10 = new javax.swing.JButton();
        NewBtn10 = new javax.swing.JButton();
        publicationNumberLabel = new javax.swing.JLabel();
        RDmpsName = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        organization = new javax.swing.JLabel();
        researchTime = new javax.swing.JLabel();
        publicationNumberTF = new javax.swing.JTextField();
        titleTF = new javax.swing.JTextField();
        organizationTF = new javax.swing.JTextField();
        researchTimeTF = new javax.swing.JTextField();
        publicationType = new javax.swing.JLabel();
        publicationTypeTF = new javax.swing.JTextField();
        CB_mpsNameRD = new javax.swing.JComboBox<>();
        VIEW = new javax.swing.JPanel();
        ExitBtn15 = new javax.swing.JButton();
        SearchBtns = new javax.swing.JButton();
        ResearchDataBtn = new javax.swing.JButton();
        SearchPenyakitTF = new javax.swing.JTextField();
        jScrollPane16 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        InHerbMedicPanel = new javax.swing.JPanel();
        UpdateBtn1 = new javax.swing.JButton();
        DeleteBtn1 = new javax.swing.JButton();
        InsertBtn1 = new javax.swing.JButton();
        Reset1 = new javax.swing.JButton();
        hNumber = new javax.swing.JLabel();
        hName = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        SideEffect = new javax.swing.JLabel();
        hNumberTF = new javax.swing.JTextField();
        hNameTF = new javax.swing.JTextField();
        TypeTF = new javax.swing.JTextField();
        levelTF = new javax.swing.JTextField();
        SideEffectTF = new javax.swing.JTextField();
        TTreatPanel = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        TRDPanel = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        TRDRPanel = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        TProvBPanel = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        TPRPanel = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        TPBPanel = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        THMIPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        TMPPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        TMPClasPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        TMPCompPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        TMPHPPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        THerbMedicPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TMethodPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        TMPCPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        TDiseasePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelAwal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelMenuAwal = new javax.swing.JPanel();
        diseasebtn = new javax.swing.JButton();
        HerbMedicBtn = new javax.swing.JButton();
        HMIngredientsbtn = new javax.swing.JButton();
        MedPlantsBtn = new javax.swing.JButton();
        Methodbtn = new javax.swing.JButton();
        MPCharacteristicbtn = new javax.swing.JButton();
        MPClassificationbtn = new javax.swing.JButton();
        MPCompositebtn = new javax.swing.JButton();
        MPHabitatbtn = new javax.swing.JButton();
        ProcessedBybtn = new javax.swing.JButton();
        ProductResultbtn = new javax.swing.JButton();
        ProvenBybtn = new javax.swing.JButton();
        RDResearcherbtn = new javax.swing.JButton();
        ResearchDatabtn = new javax.swing.JButton();
        Treatbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VIEWs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        InMPClasPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn6.setText("UPDATE");
        UpdateBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn6ActionPerformed(evt);
            }
        });

        DeleteBtn6.setText("DELETE");
        DeleteBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn6ActionPerformed(evt);
            }
        });

        InsertBtn6.setText("INSERT");
        InsertBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn6ActionPerformed(evt);
            }
        });

        NewBtn6.setText("RESET");
        NewBtn6.setToolTipText("");
        NewBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn6ActionPerformed(evt);
            }
        });

        ClassificationNo.setText("ClassificationNo");

        MPSClasmpsName.setText("mpsName");

        division.setText("division");

        MPSClasclass.setText("class");

        subClass.setText("subClass");

        subKingdom.setText("subKingdom");

        superDivision.setText("superDivision");

        species.setText("species");

        mporder.setText("mporder");

        family.setText("family");

        genus.setText("genus");

        CB_mpsNameMPClas.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InMPClasPanelLayout = new javax.swing.GroupLayout(InMPClasPanel);
        InMPClasPanel.setLayout(InMPClasPanelLayout);
        InMPClasPanelLayout.setHorizontalGroup(
            InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InMPClasPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                        .addComponent(ClassificationNo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClassificationNoTF))
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MPSClasmpsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division))
                        .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPClasPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CB_mpsNameMPClas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MPSClasclass, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subClass)
                            .addComponent(superDivision)
                            .addComponent(species)
                            .addComponent(mporder)
                            .addComponent(family)
                            .addComponent(genus))
                        .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPClasPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(classTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subClassTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(superDivisionTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speciesTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mporderTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(familyTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genusTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                        .addComponent(subKingdom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subKingdomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addComponent(NewBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InMPClasPanelLayout.setVerticalGroup(
            InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassificationNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassificationNo))
                .addGap(11, 11, 11)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MPSClasmpsName)
                    .addComponent(CB_mpsNameMPClas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(division))
                    .addComponent(divisionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(MPSClasclass))
                    .addComponent(classTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subClass)
                    .addComponent(subClassTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPClasPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(subKingdomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPClasPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subKingdom)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(superDivisionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speciesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(species))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mporder)
                    .addComponent(mporderTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(family)
                    .addComponent(familyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genus)
                    .addComponent(genusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(InMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewBtn6)
                    .addComponent(InsertBtn6)
                    .addComponent(DeleteBtn6)
                    .addComponent(UpdateBtn6))
                .addGap(24, 24, 24))
        );

        getContentPane().add(InMPClasPanel);
        InMPClasPanel.setBounds(0, 0, 400, 500);

        InDiseasePanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        InsertBtn.setText("INSERT");
        InsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtnActionPerformed(evt);
            }
        });

        NewBtn.setText("RESET");
        NewBtn.setToolTipText("");
        NewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtnActionPerformed(evt);
            }
        });

        dNumber.setText("Number");

        Name.setText("Name");

        Cause.setText("Cause");

        Symptoms.setText("Symptoms");

        SymptomsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymptomsTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InDiseasePanelLayout = new javax.swing.GroupLayout(InDiseasePanel);
        InDiseasePanel.setLayout(InDiseasePanelLayout);
        InDiseasePanelLayout.setHorizontalGroup(
            InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InDiseasePanelLayout.createSequentialGroup()
                .addGap(29, 29, Short.MAX_VALUE)
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InDiseasePanelLayout.createSequentialGroup()
                            .addComponent(dNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGroup(InDiseasePanelLayout.createSequentialGroup()
                            .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cause))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CauseTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(NameTF))))
                    .addGroup(InDiseasePanelLayout.createSequentialGroup()
                        .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(SymptomsTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InDiseasePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(NewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InDiseasePanelLayout.setVerticalGroup(
            InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InDiseasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InDiseasePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Name))
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InDiseasePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Cause))
                    .addComponent(CauseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InDiseasePanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Symptoms))
                    .addComponent(SymptomsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addGroup(InDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(InsertBtn)
                    .addComponent(NewBtn))
                .addContainerGap())
        );

        getContentPane().add(InDiseasePanel);
        InDiseasePanel.setBounds(0, 0, 400, 500);

        InMPCompPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn5.setText("UPDATE");
        UpdateBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn5ActionPerformed(evt);
            }
        });

        DeleteBtn5.setText("DELETE");
        DeleteBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn5ActionPerformed(evt);
            }
        });

        InsertBtn5.setText("INSERT");
        InsertBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn5ActionPerformed(evt);
            }
        });

        NewBtn5.setText("RESET");
        NewBtn5.setToolTipText("");
        NewBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn5ActionPerformed(evt);
            }
        });

        composition.setText("composition");

        MPCompmpsName.setText("mpsName");

        compositionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compositionTFActionPerformed(evt);
            }
        });

        CB_mpsNameMPComp.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InMPCompPanelLayout = new javax.swing.GroupLayout(InMPCompPanel);
        InMPCompPanel.setLayout(InMPCompPanelLayout);
        InMPCompPanelLayout.setHorizontalGroup(
            InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCompPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCompPanelLayout.createSequentialGroup()
                        .addComponent(composition, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compositionTF))
                    .addGroup(InMPCompPanelLayout.createSequentialGroup()
                        .addComponent(MPCompmpsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_mpsNameMPComp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(InMPCompPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(NewBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InMPCompPanelLayout.setVerticalGroup(
            InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCompPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compositionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(composition))
                .addGap(11, 11, 11)
                .addGroup(InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MPCompmpsName)
                    .addComponent(CB_mpsNameMPComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addGroup(InMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn5)
                    .addComponent(DeleteBtn5)
                    .addComponent(InsertBtn5)
                    .addComponent(NewBtn5))
                .addContainerGap())
        );

        getContentPane().add(InMPCompPanel);
        InMPCompPanel.setBounds(0, 0, 400, 500);

        InMethodPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn2.setText("UPDATE");
        UpdateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn2ActionPerformed(evt);
            }
        });

        DeleteBtn2.setText("DELETE");
        DeleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn2ActionPerformed(evt);
            }
        });

        InsertBtn2.setText("INSERT");
        InsertBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn2ActionPerformed(evt);
            }
        });

        NewBtn2.setText("RESET");
        NewBtn2.setToolTipText("");
        NewBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn2ActionPerformed(evt);
            }
        });

        mNumber.setText("mNumber");

        HowToProcess.setText("HowToProcess");

        HowToUse.setText("HowToUse");

        mNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNumberTFActionPerformed(evt);
            }
        });

        HowToProcessTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowToProcessTFActionPerformed(evt);
            }
        });

        HowToUseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowToUseTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InMethodPanelLayout = new javax.swing.GroupLayout(InMethodPanel);
        InMethodPanel.setLayout(InMethodPanelLayout);
        InMethodPanelLayout.setHorizontalGroup(
            InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMethodPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMethodPanelLayout.createSequentialGroup()
                            .addComponent(mNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGroup(InMethodPanelLayout.createSequentialGroup()
                            .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HowToProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HowToUse))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(HowToUseTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(HowToProcessTF))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InMethodPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(NewBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        InMethodPanelLayout.setVerticalGroup(
            InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMethodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMethodPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(HowToProcess))
                    .addComponent(HowToProcessTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMethodPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(HowToUse))
                    .addComponent(HowToUseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addGroup(InMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn2)
                    .addComponent(DeleteBtn2)
                    .addComponent(InsertBtn2)
                    .addComponent(NewBtn2))
                .addContainerGap())
        );

        getContentPane().add(InMethodPanel);
        InMethodPanel.setBounds(0, 0, 400, 500);

        InMPHPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn4.setText("UPDATE");
        UpdateBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn4ActionPerformed(evt);
            }
        });

        DeleteBtn4.setText("DELETE");
        DeleteBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn4ActionPerformed(evt);
            }
        });

        InsertBtn4.setText("INSERT");
        InsertBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn4ActionPerformed(evt);
            }
        });

        NewBtn4.setText("RESET");
        NewBtn4.setToolTipText("");
        NewBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn4ActionPerformed(evt);
            }
        });

        habitatNumber.setText("habitatNumber");

        HmpsName.setText("mpsName");

        temperature.setText("temperature");

        endemic.setText("endemic");

        typeOfLand.setText("typeOfLand");

        habitatNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitatNumberTFActionPerformed(evt);
            }
        });

        temperatureTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperatureTFActionPerformed(evt);
            }
        });

        endemicTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endemicTFActionPerformed(evt);
            }
        });

        typeOfSoil.setText("typeOfSoil");

        CB_mpsNameMPH.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InMPHPanelLayout = new javax.swing.GroupLayout(InMPHPanel);
        InMPHPanel.setLayout(InMPHPanelLayout);
        InMPHPanelLayout.setHorizontalGroup(
            InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPHPanelLayout.createSequentialGroup()
                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InMPHPanelLayout.createSequentialGroup()
                        .addGap(29, 29, Short.MAX_VALUE)
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(InMPHPanelLayout.createSequentialGroup()
                                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HmpsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temperature))
                                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InMPHPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(temperatureTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPHPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CB_mpsNameMPH, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(InMPHPanelLayout.createSequentialGroup()
                                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endemic, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeOfLand)
                                    .addComponent(typeOfSoil))
                                .addGap(118, 118, 118)
                                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(endemicTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(typeOfLandTF)
                                    .addComponent(typeOfSoilTF)))))
                    .addGroup(InMPHPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(habitatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habitatNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPHPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NewBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        InMPHPanelLayout.setVerticalGroup(
            InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPHPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPHPanelLayout.createSequentialGroup()
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(habitatNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitatNumber))
                        .addGap(11, 11, 11)
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HmpsName)
                            .addComponent(CB_mpsNameMPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPHPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(temperature))
                            .addComponent(temperatureTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPHPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(endemic))
                            .addComponent(endemicTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPHPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(typeOfLand))
                            .addComponent(typeOfLandTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(typeOfSoilTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(typeOfSoil, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addGroup(InMPHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn4)
                    .addComponent(DeleteBtn4)
                    .addComponent(InsertBtn4)
                    .addComponent(NewBtn4))
                .addContainerGap())
        );

        getContentPane().add(InMPHPanel);
        InMPHPanel.setBounds(0, 0, 400, 500);

        InMPPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn7.setText("UPDATE");
        UpdateBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn7ActionPerformed(evt);
            }
        });

        DeleteBtn7.setText("DELETE");
        DeleteBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn7ActionPerformed(evt);
            }
        });

        InsertBtn7.setText("INSERT");
        InsertBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn7ActionPerformed(evt);
            }
        });

        NewBtn7.setText("RESET");
        NewBtn7.setToolTipText("");
        NewBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn7ActionPerformed(evt);
            }
        });

        scientificName.setText("scientificName");

        commonName.setText("commonName");

        theUtilizePart.setText("theUtilizePart");

        photo.setText("photo");

        scientificNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scientificNameTFActionPerformed(evt);
            }
        });

        commonNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commonNameTFActionPerformed(evt);
            }
        });

        theUtilizePartTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theUtilizePartTFActionPerformed(evt);
            }
        });

        photoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InMPPanelLayout = new javax.swing.GroupLayout(InMPPanel);
        InMPPanel.setLayout(InMPPanelLayout);
        InMPPanelLayout.setHorizontalGroup(
            InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InMPPanelLayout.createSequentialGroup()
                .addGap(29, 29, Short.MAX_VALUE)
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPPanelLayout.createSequentialGroup()
                        .addComponent(NewBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPPanelLayout.createSequentialGroup()
                            .addComponent(scientificName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scientificNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGroup(InMPPanelLayout.createSequentialGroup()
                            .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(commonName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(theUtilizePart))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(theUtilizePartTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(commonNameTF))))
                    .addGroup(InMPPanelLayout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(photoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InMPPanelLayout.setVerticalGroup(
            InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scientificNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scientificName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(commonName))
                    .addComponent(commonNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(theUtilizePart))
                    .addComponent(theUtilizePartTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InMPPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(photo))
                    .addComponent(photoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addGroup(InMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn7)
                    .addComponent(DeleteBtn7)
                    .addComponent(InsertBtn7)
                    .addComponent(NewBtn7))
                .addContainerGap())
        );

        getContentPane().add(InMPPanel);
        InMPPanel.setBounds(0, 0, 400, 500);

        InHMIPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn8.setText("UPDATE");
        UpdateBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn8ActionPerformed(evt);
            }
        });

        DeleteBtn8.setText("DELETE");
        DeleteBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn8ActionPerformed(evt);
            }
        });

        InsertBtn8.setText("INSERT");
        InsertBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn8ActionPerformed(evt);
            }
        });

        NewBtn8.setText("RESET");
        NewBtn8.setToolTipText("");
        NewBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn8ActionPerformed(evt);
            }
        });

        ingredients.setText("ingredients");

        hmNumber.setText("hmNumber");

        CB_hmNumberHMI.setModel(new javax.swing.DefaultComboBoxModel<>(HerbalMedicine1));

        javax.swing.GroupLayout InHMIPanelLayout = new javax.swing.GroupLayout(InHMIPanel);
        InHMIPanel.setLayout(InHMIPanelLayout);
        InHMIPanelLayout.setHorizontalGroup(
            InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHMIPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHMIPanelLayout.createSequentialGroup()
                        .addComponent(ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingredientsTF))
                    .addGroup(InHMIPanelLayout.createSequentialGroup()
                        .addComponent(hmNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_hmNumberHMI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(InHMIPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(NewBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InHMIPanelLayout.setVerticalGroup(
            InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHMIPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredientsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingredients))
                .addGap(8, 8, 8)
                .addGroup(InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hmNumber)
                    .addComponent(CB_hmNumberHMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addGroup(InHMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn8)
                    .addComponent(DeleteBtn8)
                    .addComponent(InsertBtn8)
                    .addComponent(NewBtn8))
                .addContainerGap())
        );

        getContentPane().add(InHMIPanel);
        InHMIPanel.setBounds(0, 0, 400, 500);

        InTreatPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn11.setText("UPDATE");
        UpdateBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn11ActionPerformed(evt);
            }
        });

        DeleteBtn11.setText("DELETE");
        DeleteBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn11ActionPerformed(evt);
            }
        });

        InsertBtn11.setText("INSERT");
        InsertBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn11ActionPerformed(evt);
            }
        });

        NewBtn1.setText("RESET");
        NewBtn1.setToolTipText("");
        NewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn1ActionPerformed(evt);
            }
        });

        dNumber1.setText("disNumber");

        mpsName5.setText("mpsName");

        CB_disNumberTreat.setModel(new javax.swing.DefaultComboBoxModel<>(dNumDisease1));

        CB_mpsNameTreat.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InTreatPanelLayout = new javax.swing.GroupLayout(InTreatPanel);
        InTreatPanel.setLayout(InTreatPanelLayout);
        InTreatPanelLayout.setHorizontalGroup(
            InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InTreatPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InTreatPanelLayout.createSequentialGroup()
                        .addComponent(dNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_disNumberTreat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InTreatPanelLayout.createSequentialGroup()
                        .addComponent(mpsName5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_mpsNameTreat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(InTreatPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        InTreatPanelLayout.setVerticalGroup(
            InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InTreatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dNumber1)
                    .addComponent(CB_disNumberTreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpsName5)
                    .addComponent(CB_mpsNameTreat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addGroup(InTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn11)
                    .addComponent(DeleteBtn11)
                    .addComponent(InsertBtn11)
                    .addComponent(NewBtn1))
                .addContainerGap())
        );

        getContentPane().add(InTreatPanel);
        InTreatPanel.setBounds(0, 0, 400, 500);

        InPRPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn14.setText("UPDATE");
        UpdateBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn14ActionPerformed(evt);
            }
        });

        DeleteBtn14.setText("DELETE");
        DeleteBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn14ActionPerformed(evt);
            }
        });

        InsertBtn14.setText("INSERT");
        InsertBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn14ActionPerformed(evt);
            }
        });

        NewBtn13.setText("RESET");
        NewBtn13.setToolTipText("");
        NewBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn13ActionPerformed(evt);
            }
        });

        mpsName3.setText("mpsName");

        hmNumber2.setText("hmNumber");

        CB_mpsNamePR.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        CB_hmNumberPR.setModel(new javax.swing.DefaultComboBoxModel<>(HerbalMedicine1));

        javax.swing.GroupLayout InPRPanelLayout = new javax.swing.GroupLayout(InPRPanel);
        InPRPanel.setLayout(InPRPanelLayout);
        InPRPanelLayout.setHorizontalGroup(
            InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InPRPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InPRPanelLayout.createSequentialGroup()
                        .addComponent(mpsName3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_mpsNamePR, 0, 161, Short.MAX_VALUE))
                    .addGroup(InPRPanelLayout.createSequentialGroup()
                        .addComponent(hmNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_hmNumberPR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(InPRPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NewBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InPRPanelLayout.setVerticalGroup(
            InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InPRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mpsName3)
                    .addComponent(CB_mpsNamePR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hmNumber2)
                    .addComponent(CB_hmNumberPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addGroup(InPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn14)
                    .addComponent(DeleteBtn14)
                    .addComponent(InsertBtn14)
                    .addComponent(NewBtn13))
                .addContainerGap())
        );

        getContentPane().add(InPRPanel);
        InPRPanel.setBounds(0, 0, 400, 500);

        InRDRPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn9.setText("UPDATE");
        UpdateBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn9ActionPerformed(evt);
            }
        });

        DeleteBtn9.setText("DELETE");
        DeleteBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn9ActionPerformed(evt);
            }
        });

        InsertBtn9.setText("INSERT");
        InsertBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn9ActionPerformed(evt);
            }
        });

        NewBtn9.setText("RESET");
        NewBtn9.setToolTipText("");
        NewBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn9ActionPerformed(evt);
            }
        });

        researcher.setText("researcher");

        rdpNumber.setText("rdpNumber");

        researcherTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researcherTFActionPerformed(evt);
            }
        });

        CB_rdpNumber.setModel(new javax.swing.DefaultComboBoxModel<>(publicationNumber1));

        javax.swing.GroupLayout InRDRPanelLayout = new javax.swing.GroupLayout(InRDRPanel);
        InRDRPanel.setLayout(InRDRPanelLayout);
        InRDRPanelLayout.setHorizontalGroup(
            InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InRDRPanelLayout.createSequentialGroup()
                .addGap(29, 29, Short.MAX_VALUE)
                .addGroup(InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InRDRPanelLayout.createSequentialGroup()
                        .addComponent(researcher, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(researcherTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(InRDRPanelLayout.createSequentialGroup()
                        .addComponent(NewBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(InRDRPanelLayout.createSequentialGroup()
                        .addComponent(rdpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_rdpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InRDRPanelLayout.setVerticalGroup(
            InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InRDRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(researcherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(researcher))
                .addGap(11, 11, 11)
                .addGroup(InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdpNumber)
                    .addComponent(CB_rdpNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addGroup(InRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn9)
                    .addComponent(DeleteBtn9)
                    .addComponent(InsertBtn9)
                    .addComponent(NewBtn9))
                .addContainerGap())
        );

        getContentPane().add(InRDRPanel);
        InRDRPanel.setBounds(0, 0, 400, 500);

        InPBPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn12.setText("UPDATE");
        UpdateBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn12ActionPerformed(evt);
            }
        });

        DeleteBtn12.setText("DELETE");
        DeleteBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn12ActionPerformed(evt);
            }
        });

        InsertBtn12.setText("INSERT");
        InsertBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn12ActionPerformed(evt);
            }
        });

        NewBtn11.setText("RESET");
        NewBtn11.setToolTipText("");
        NewBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn11ActionPerformed(evt);
            }
        });

        mpsName6.setText("mpsName");

        metNumber.setText("metNumber");

        CB_mpsNamePB.setModel(new javax.swing.DefaultComboBoxModel<>(dNumDisease1));

        CB_metNumberPB.setModel(new javax.swing.DefaultComboBoxModel<>(Method1));

        javax.swing.GroupLayout InPBPanelLayout = new javax.swing.GroupLayout(InPBPanel);
        InPBPanel.setLayout(InPBPanelLayout);
        InPBPanelLayout.setHorizontalGroup(
            InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InPBPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InPBPanelLayout.createSequentialGroup()
                        .addComponent(mpsName6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_mpsNamePB, 0, 161, Short.MAX_VALUE))
                    .addGroup(InPBPanelLayout.createSequentialGroup()
                        .addComponent(metNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_metNumberPB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(InPBPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(NewBtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InPBPanelLayout.setVerticalGroup(
            InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InPBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mpsName6)
                    .addComponent(CB_mpsNamePB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metNumber)
                    .addComponent(CB_metNumberPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addGroup(InPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn12)
                    .addComponent(DeleteBtn12)
                    .addComponent(InsertBtn12)
                    .addComponent(NewBtn11))
                .addContainerGap())
        );

        getContentPane().add(InPBPanel);
        InPBPanel.setBounds(0, 0, 400, 500);

        InProvBPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn13.setText("UPDATE");
        UpdateBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn13ActionPerformed(evt);
            }
        });

        DeleteBtn13.setText("DELETE");
        DeleteBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn13ActionPerformed(evt);
            }
        });

        InsertBtn13.setText("INSERT");
        InsertBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn13ActionPerformed(evt);
            }
        });

        NewBtn12.setText("RESET");
        NewBtn12.setToolTipText("");
        NewBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn12ActionPerformed(evt);
            }
        });

        rdpNumber2.setText("rdpNumber");

        mpsName7.setText("mpsNumber");

        CB_rdpNumberProvB.setModel(new javax.swing.DefaultComboBoxModel<>(publicationNumber1));

        CB_mpsNameProvB.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InProvBPanelLayout = new javax.swing.GroupLayout(InProvBPanel);
        InProvBPanel.setLayout(InProvBPanelLayout);
        InProvBPanelLayout.setHorizontalGroup(
            InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InProvBPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InProvBPanelLayout.createSequentialGroup()
                        .addComponent(rdpNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_rdpNumberProvB, 0, 161, Short.MAX_VALUE))
                    .addGroup(InProvBPanelLayout.createSequentialGroup()
                        .addComponent(mpsName7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_mpsNameProvB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(InProvBPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NewBtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InProvBPanelLayout.setVerticalGroup(
            InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InProvBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdpNumber2)
                    .addComponent(CB_rdpNumberProvB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpsName7)
                    .addComponent(CB_mpsNameProvB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addGroup(InProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn13)
                    .addComponent(DeleteBtn13)
                    .addComponent(InsertBtn13)
                    .addComponent(NewBtn12))
                .addContainerGap())
        );

        getContentPane().add(InProvBPanel);
        InProvBPanel.setBounds(0, 0, 400, 500);

        InMPCPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn3.setText("UPDATE");
        UpdateBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn3ActionPerformed(evt);
            }
        });

        DeleteBtn3.setText("DELETE");
        DeleteBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn3ActionPerformed(evt);
            }
        });

        InsertBtn3.setText("INSERT");
        InsertBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn3ActionPerformed(evt);
            }
        });

        NewBtn3.setText("RESET");
        NewBtn3.setToolTipText("");
        NewBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn3ActionPerformed(evt);
            }
        });

        cNumber.setText("cNumber");

        mpsName.setText("mpsName");

        breeding.setText("breeding");

        fruit.setText("fruit");

        length.setText("length (int)");

        leaf.setText("leaf");

        flower.setText("flower");

        root.setText("root");

        stem.setText("stem");

        CB_mpsNameMPC.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InMPCPanelLayout = new javax.swing.GroupLayout(InMPCPanel);
        InMPCPanel.setLayout(InMPCPanelLayout);
        InMPCPanelLayout.setHorizontalGroup(
            InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                            .addComponent(cNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cNumberTF))
                        .addGroup(InMPCPanelLayout.createSequentialGroup()
                            .addComponent(mpsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CB_mpsNameMPC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InMPCPanelLayout.createSequentialGroup()
                        .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fruit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(length)
                            .addComponent(leaf)
                            .addComponent(flower)
                            .addComponent(root)
                            .addComponent(stem)
                            .addComponent(breeding))
                        .addGap(118, 118, 118)
                        .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breedingTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fruitTF)
                                .addComponent(lengthTF)
                                .addComponent(leafTF)
                                .addComponent(flowerTF)
                                .addComponent(rootTF)
                                .addComponent(stemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        InMPCPanelLayout.setVerticalGroup(
            InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNumber))
                .addGap(11, 11, 11)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpsName)
                    .addComponent(CB_mpsNameMPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breeding)
                    .addComponent(breedingTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                        .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPCPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(fruit))
                            .addComponent(fruitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InMPCPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(length))
                            .addComponent(lengthTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(leaf))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InMPCPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(leafTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flower)
                    .addComponent(flowerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(root)
                    .addComponent(rootTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stem)
                    .addComponent(stemTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(InMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn3)
                    .addComponent(DeleteBtn3)
                    .addComponent(InsertBtn3)
                    .addComponent(NewBtn3))
                .addContainerGap())
        );

        getContentPane().add(InMPCPanel);
        InMPCPanel.setBounds(0, 0, 400, 500);

        InRDPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn10.setText("UPDATE");
        UpdateBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn10ActionPerformed(evt);
            }
        });

        DeleteBtn10.setText("DELETE");
        DeleteBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn10ActionPerformed(evt);
            }
        });

        InsertBtn10.setText("INSERT");
        InsertBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn10ActionPerformed(evt);
            }
        });

        NewBtn10.setText("RESET");
        NewBtn10.setToolTipText("");
        NewBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtn10ActionPerformed(evt);
            }
        });

        publicationNumberLabel.setText("publicationNumber");

        RDmpsName.setText("mpsName");

        title.setText("title");

        organization.setText("organization");

        researchTime.setText("researchTime (yyyy-mm-dd)");

        publicationNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicationNumberTFActionPerformed(evt);
            }
        });

        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });

        organizationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationTFActionPerformed(evt);
            }
        });

        publicationType.setText("publicationType");

        CB_mpsNameRD.setModel(new javax.swing.DefaultComboBoxModel<>(ScientificName1));

        javax.swing.GroupLayout InRDPanelLayout = new javax.swing.GroupLayout(InRDPanel);
        InRDPanel.setLayout(InRDPanelLayout);
        InRDPanelLayout.setHorizontalGroup(
            InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InRDPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(InRDPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(organization, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(researchTime, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicationType, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InRDPanelLayout.createSequentialGroup()
                            .addComponent(publicationNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(publicationNumberTF))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InRDPanelLayout.createSequentialGroup()
                            .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RDmpsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(title))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CB_mpsNameRD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(organizationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(researchTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publicationTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InRDPanelLayout.setVerticalGroup(
            InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InRDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicationNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publicationNumberLabel))
                .addGap(8, 8, 8)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RDmpsName)
                    .addComponent(CB_mpsNameRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InRDPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(title))
                    .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InRDPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(organization))
                    .addComponent(organizationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InRDPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(researchTime))
                    .addComponent(researchTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publicationType)
                    .addComponent(publicationTypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addGroup(InRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn10)
                    .addComponent(DeleteBtn10)
                    .addComponent(InsertBtn10)
                    .addComponent(NewBtn10))
                .addContainerGap())
        );

        getContentPane().add(InRDPanel);
        InRDPanel.setBounds(0, 0, 400, 500);

        VIEW.setBackground(new java.awt.Color(102, 255, 204));

        ExitBtn15.setText("EXIT");
        ExitBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtn15ActionPerformed(evt);
            }
        });

        SearchBtns.setText("SEARCH");
        SearchBtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnsActionPerformed(evt);
            }
        });

        ResearchDataBtn.setText("Research Data");
        ResearchDataBtn.setToolTipText("");
        ResearchDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResearchDataBtnActionPerformed(evt);
            }
        });

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Penyakit", "Nama Tanaman", "Nama Obat", "Cara Mengolah", "Cara Menggunakan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setCellSelectionEnabled(true);
        jScrollPane16.setViewportView(searchTable);

        jLabel2.setText("Disease :");

        javax.swing.GroupLayout VIEWLayout = new javax.swing.GroupLayout(VIEW);
        VIEW.setLayout(VIEWLayout);
        VIEWLayout.setHorizontalGroup(
            VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIEWLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchPenyakitTF, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(VIEWLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VIEWLayout.createSequentialGroup()
                        .addComponent(jScrollPane16)
                        .addContainerGap())
                    .addGroup(VIEWLayout.createSequentialGroup()
                        .addComponent(ResearchDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285)
                        .addComponent(SearchBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitBtn15)
                        .addGap(23, 23, 23))))
        );
        VIEWLayout.setVerticalGroup(
            VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VIEWLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchPenyakitTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VIEWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitBtn15)
                    .addComponent(SearchBtns)
                    .addComponent(ResearchDataBtn))
                .addContainerGap())
        );

        getContentPane().add(VIEW);
        VIEW.setBounds(0, 0, 910, 500);

        InHerbMedicPanel.setBackground(new java.awt.Color(102, 255, 204));

        UpdateBtn1.setText("UPDATE");
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });

        DeleteBtn1.setText("DELETE");
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });

        InsertBtn1.setText("INSERT");
        InsertBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertBtn1ActionPerformed(evt);
            }
        });

        Reset1.setText("RESET");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });

        hNumber.setText("hNumber");

        hName.setText("name");

        Type.setText("type");

        Level.setText("level");

        SideEffect.setText("Side Effect");

        javax.swing.GroupLayout InHerbMedicPanelLayout = new javax.swing.GroupLayout(InHerbMedicPanel);
        InHerbMedicPanel.setLayout(InHerbMedicPanelLayout);
        InHerbMedicPanelLayout.setHorizontalGroup(
            InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHerbMedicPanelLayout.createSequentialGroup()
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHerbMedicPanelLayout.createSequentialGroup()
                                    .addComponent(hNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hNumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                                    .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Type))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TypeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(hNameTF))))
                            .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Level, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SideEffect))
                                .addGap(118, 118, 118)
                                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(levelTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(SideEffectTF)))))
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InsertBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn1)
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InHerbMedicPanelLayout.setVerticalGroup(
            InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InHerbMedicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(hName))
                    .addComponent(hNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Type))
                    .addComponent(TypeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Level))
                    .addComponent(levelTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InHerbMedicPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(SideEffect))
                    .addComponent(SideEffectTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addGroup(InHerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn1)
                    .addComponent(DeleteBtn1)
                    .addComponent(InsertBtn1)
                    .addComponent(Reset1))
                .addContainerGap())
        );

        getContentPane().add(InHerbMedicPanel);
        InHerbMedicPanel.setBounds(0, 0, 400, 500);

        TTreatPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "disNumber", "mpsName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable15.setCellSelectionEnabled(true);
        jScrollPane15.setViewportView(jTable15);
        jTable15.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TTreatPanelLayout = new javax.swing.GroupLayout(TTreatPanel);
        TTreatPanel.setLayout(TTreatPanelLayout);
        TTreatPanelLayout.setHorizontalGroup(
            TTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTreatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        TTreatPanelLayout.setVerticalGroup(
            TTreatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TTreatPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TTreatPanel);
        TTreatPanel.setBounds(400, 0, 520, 500);

        TRDPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PublicationNumber", "mpsName", "Title", "Organization", "ResearchTime", "PublicationType"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable14.setCellSelectionEnabled(true);
        jScrollPane14.setViewportView(jTable14);
        jTable14.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(2).setHeaderValue("Cause");
            jTable14.getColumnModel().getColumn(3).setHeaderValue("Symptoms");
        }

        javax.swing.GroupLayout TRDPanelLayout = new javax.swing.GroupLayout(TRDPanel);
        TRDPanel.setLayout(TRDPanelLayout);
        TRDPanelLayout.setHorizontalGroup(
            TRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TRDPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TRDPanelLayout.setVerticalGroup(
            TRDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRDPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TRDPanel);
        TRDPanel.setBounds(400, 0, 520, 500);

        TRDRPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Researcher", "rdpNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable13.setCellSelectionEnabled(true);
        jScrollPane13.setViewportView(jTable13);
        jTable13.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TRDRPanelLayout = new javax.swing.GroupLayout(TRDRPanel);
        TRDRPanel.setLayout(TRDRPanelLayout);
        TRDRPanelLayout.setHorizontalGroup(
            TRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TRDRPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TRDRPanelLayout.setVerticalGroup(
            TRDRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TRDRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TRDRPanel);
        TRDRPanel.setBounds(400, 0, 520, 500);

        TProvBPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rdpNumber", "mpsName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable12.setCellSelectionEnabled(true);
        jScrollPane12.setViewportView(jTable12);
        jTable12.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TProvBPanelLayout = new javax.swing.GroupLayout(TProvBPanel);
        TProvBPanel.setLayout(TProvBPanelLayout);
        TProvBPanelLayout.setHorizontalGroup(
            TProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TProvBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        TProvBPanelLayout.setVerticalGroup(
            TProvBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TProvBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TProvBPanel);
        TProvBPanel.setBounds(400, 0, 520, 500);

        TPRPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mpsName", "hmNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable11.setCellSelectionEnabled(true);
        jScrollPane11.setViewportView(jTable11);
        jTable11.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TPRPanelLayout = new javax.swing.GroupLayout(TPRPanel);
        TPRPanel.setLayout(TPRPanelLayout);
        TPRPanelLayout.setHorizontalGroup(
            TPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TPRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        TPRPanelLayout.setVerticalGroup(
            TPRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TPRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TPRPanel);
        TPRPanel.setBounds(400, 0, 520, 500);

        TPBPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DisNumber", "metNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable10.setCellSelectionEnabled(true);
        jScrollPane10.setViewportView(jTable10);
        jTable10.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TPBPanelLayout = new javax.swing.GroupLayout(TPBPanel);
        TPBPanel.setLayout(TPBPanelLayout);
        TPBPanelLayout.setHorizontalGroup(
            TPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TPBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        TPBPanelLayout.setVerticalGroup(
            TPBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TPBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TPBPanel);
        TPBPanel.setBounds(400, 0, 520, 500);

        THMIPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredients", "hmNumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setCellSelectionEnabled(true);
        jScrollPane9.setViewportView(jTable9);
        jTable9.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout THMIPanelLayout = new javax.swing.GroupLayout(THMIPanel);
        THMIPanel.setLayout(THMIPanelLayout);
        THMIPanelLayout.setHorizontalGroup(
            THMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, THMIPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        THMIPanelLayout.setVerticalGroup(
            THMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THMIPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(THMIPanel);
        THMIPanel.setBounds(400, 0, 520, 500);

        TMPPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ScientificName", "CommonName", "TheUtilizePart", "Photo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setCellSelectionEnabled(true);
        jScrollPane8.setViewportView(jTable8);
        jTable8.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(2).setHeaderValue("Cause");
            jTable8.getColumnModel().getColumn(3).setHeaderValue("Symptoms");
        }

        javax.swing.GroupLayout TMPPanelLayout = new javax.swing.GroupLayout(TMPPanel);
        TMPPanel.setLayout(TMPPanelLayout);
        TMPPanelLayout.setHorizontalGroup(
            TMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMPPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMPPanelLayout.setVerticalGroup(
            TMPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMPPanel);
        TMPPanel.setBounds(400, 0, 520, 500);

        TMPClasPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClassificationNo", "mpsName", "Division", "Class", "SubClass", "SubKingdom", "SuperDivision", "Species", "MpOrder", "Family", "Genus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setCellSelectionEnabled(true);
        jScrollPane7.setViewportView(jTable7);
        jTable7.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(2).setHeaderValue("Cause");
            jTable7.getColumnModel().getColumn(3).setHeaderValue("Symptoms");
        }

        javax.swing.GroupLayout TMPClasPanelLayout = new javax.swing.GroupLayout(TMPClasPanel);
        TMPClasPanel.setLayout(TMPClasPanelLayout);
        TMPClasPanelLayout.setHorizontalGroup(
            TMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMPClasPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMPClasPanelLayout.setVerticalGroup(
            TMPClasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMPClasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMPClasPanel);
        TMPClasPanel.setBounds(400, 0, 520, 500);

        TMPCompPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Composition", "mpsName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setCellSelectionEnabled(true);
        jScrollPane6.setViewportView(jTable6);
        jTable6.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TMPCompPanelLayout = new javax.swing.GroupLayout(TMPCompPanel);
        TMPCompPanel.setLayout(TMPCompPanelLayout);
        TMPCompPanelLayout.setHorizontalGroup(
            TMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMPCompPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMPCompPanelLayout.setVerticalGroup(
            TMPCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMPCompPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMPCompPanel);
        TMPCompPanel.setBounds(400, 0, 520, 500);

        TMPHPPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HabitatNumber", "mpsName", "temperature", "endemic", "TypeOfLand", "TypeOfSoil"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.setColumnSelectionAllowed(true);
        jScrollPane5.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TMPHPPanelLayout = new javax.swing.GroupLayout(TMPHPPanel);
        TMPHPPanel.setLayout(TMPHPPanelLayout);
        TMPHPPanelLayout.setHorizontalGroup(
            TMPHPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMPHPPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMPHPPanelLayout.setVerticalGroup(
            TMPHPPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMPHPPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMPHPPanel);
        TMPHPPanel.setBounds(400, 0, 520, 500);

        THerbMedicPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "hNumber", "Name", "Type", "level", "sideEffect"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Cause");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Symptoms");
        }

        javax.swing.GroupLayout THerbMedicPanelLayout = new javax.swing.GroupLayout(THerbMedicPanel);
        THerbMedicPanel.setLayout(THerbMedicPanelLayout);
        THerbMedicPanelLayout.setHorizontalGroup(
            THerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, THerbMedicPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        THerbMedicPanelLayout.setVerticalGroup(
            THerbMedicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(THerbMedicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(THerbMedicPanel);
        THerbMedicPanel.setBounds(400, 0, 520, 500);

        TMethodPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mNumber", "HowToProcess", "HowtoUse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setCellSelectionEnabled(true);
        jScrollPane3.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(2).setHeaderValue("Cause");
        }

        javax.swing.GroupLayout TMethodPanelLayout = new javax.swing.GroupLayout(TMethodPanel);
        TMethodPanel.setLayout(TMethodPanelLayout);
        TMethodPanelLayout.setHorizontalGroup(
            TMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMethodPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMethodPanelLayout.setVerticalGroup(
            TMethodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMethodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMethodPanel);
        TMethodPanel.setBounds(400, 0, 520, 500);

        TMPCPanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cNumber", "MpsName", "Breeding", "Fruit", "Length", "Leaf", "Flower", "root", "Stem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TMPCPanelLayout = new javax.swing.GroupLayout(TMPCPanel);
        TMPCPanel.setLayout(TMPCPanelLayout);
        TMPCPanelLayout.setHorizontalGroup(
            TMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TMPCPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TMPCPanelLayout.setVerticalGroup(
            TMPCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TMPCPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TMPCPanel);
        TMPCPanel.setBounds(400, 0, 520, 500);

        TDiseasePanel.setBackground(new java.awt.Color(51, 255, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Cause", "Symptoms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout TDiseasePanelLayout = new javax.swing.GroupLayout(TDiseasePanel);
        TDiseasePanel.setLayout(TDiseasePanelLayout);
        TDiseasePanelLayout.setHorizontalGroup(
            TDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TDiseasePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        TDiseasePanelLayout.setVerticalGroup(
            TDiseasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TDiseasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(TDiseasePanel);
        TDiseasePanel.setBounds(400, 0, 520, 500);

        PanelAwal.setBackground(new java.awt.Color(0, 255, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubesdatabase/Awal.jpeg"))); // NOI18N

        javax.swing.GroupLayout PanelAwalLayout = new javax.swing.GroupLayout(PanelAwal);
        PanelAwal.setLayout(PanelAwalLayout);
        PanelAwalLayout.setHorizontalGroup(
            PanelAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAwalLayout.setVerticalGroup(
            PanelAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(PanelAwal);
        PanelAwal.setBounds(0, 0, 920, 500);

        PanelMenuAwal.setBackground(new java.awt.Color(0, 153, 153));

        diseasebtn.setText("Disease");
        diseasebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasebtnActionPerformed(evt);
            }
        });

        HerbMedicBtn.setText("HerbMedic");
        HerbMedicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HerbMedicBtnActionPerformed(evt);
            }
        });

        HMIngredientsbtn.setText("HMIngredients");
        HMIngredientsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMIngredientsbtnActionPerformed(evt);
            }
        });

        MedPlantsBtn.setText("MedPlants");
        MedPlantsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedPlantsBtnActionPerformed(evt);
            }
        });

        Methodbtn.setText("Method");
        Methodbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MethodbtnActionPerformed(evt);
            }
        });

        MPCharacteristicbtn.setText("MPCharacteristic");
        MPCharacteristicbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPCharacteristicbtnActionPerformed(evt);
            }
        });

        MPClassificationbtn.setText("MPClassification");
        MPClassificationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPClassificationbtnActionPerformed(evt);
            }
        });

        MPCompositebtn.setText("MPComposite");
        MPCompositebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPCompositebtnActionPerformed(evt);
            }
        });

        MPHabitatbtn.setText("MPHabitat");
        MPHabitatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPHabitatbtnActionPerformed(evt);
            }
        });

        ProcessedBybtn.setText("ProcessedBy");
        ProcessedBybtn.setActionCommand("Processedby");
        ProcessedBybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessedBybtnActionPerformed(evt);
            }
        });

        ProductResultbtn.setText("ProductResult");
        ProductResultbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductResultbtnActionPerformed(evt);
            }
        });

        ProvenBybtn.setText("ProvenBy");
        ProvenBybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvenBybtnActionPerformed(evt);
            }
        });

        RDResearcherbtn.setText("RDResearcher");
        RDResearcherbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDResearcherbtnActionPerformed(evt);
            }
        });

        ResearchDatabtn.setText("ResearchData");
        ResearchDatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResearchDatabtnActionPerformed(evt);
            }
        });

        Treatbtn.setText("Treat");
        Treatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 11)); // NOI18N
        jLabel1.setText("Login as Admin");

        VIEWs.setText("VIEW");
        VIEWs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIEWsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuAwalLayout = new javax.swing.GroupLayout(PanelMenuAwal);
        PanelMenuAwal.setLayout(PanelMenuAwalLayout);
        PanelMenuAwalLayout.setHorizontalGroup(
            PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuAwalLayout.createSequentialGroup()
                        .addComponent(diseasebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HerbMedicBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Methodbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MPCharacteristicbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MPHabitatbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MPCompositebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MPClassificationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MedPlantsBtn)
                        .addGap(28, 28, 28))
                    .addGroup(PanelMenuAwalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(HMIngredientsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProcessedBybtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProductResultbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProvenBybtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RDResearcherbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResearchDatabtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Treatbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(VIEWs))
                .addGap(218, 218, 218))
        );
        PanelMenuAwalLayout.setVerticalGroup(
            PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MPHabitatbtn)
                    .addComponent(diseasebtn)
                    .addComponent(HerbMedicBtn)
                    .addComponent(Methodbtn)
                    .addComponent(MPCharacteristicbtn)
                    .addComponent(MPClassificationbtn)
                    .addComponent(MPCompositebtn)
                    .addComponent(MedPlantsBtn)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMenuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HMIngredientsbtn)
                    .addComponent(ProcessedBybtn)
                    .addComponent(ProductResultbtn)
                    .addComponent(ProvenBybtn)
                    .addComponent(RDResearcherbtn)
                    .addComponent(ResearchDatabtn)
                    .addComponent(Treatbtn)
                    .addComponent(VIEWs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelMenuAwal);
        PanelMenuAwal.setBounds(0, 500, 920, 90);

        setSize(new java.awt.Dimension(921, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GetDataDisease(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Number");
        model.addColumn("Name");
        model.addColumn("Cause");
        model.addColumn("Symptoms");
    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from disease");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("dNumber"),sql.getString("name")
                    ,sql.getString("cause"),sql.getString("symptoms")});
            dNumDisease.add(sql.getString("dNumber"));
        }
        jTable1.setModel(DbUtils.resultSetToTableModel(sql));
        jTable1.setModel(model);

                ArraydNumDisease();
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }

    
}
    
    private void GetDataHerbMedic(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("hNumber");
        model.addColumn("Name");
        model.addColumn("Type");
        model.addColumn("Level");
        model.addColumn("SideEffect");

    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from herbalmedicine");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("hNumber"),sql.getString("name")
                    ,sql.getString("type"),sql.getString("level"), sql.getString("side effect")});
            HerbalMedicine.add(sql.getString("hNumber"));
        }
        jTable2.setModel(DbUtils.resultSetToTableModel(sql));
        jTable2.setModel(model);
        
         ArrayHerbalMedicine();
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
}
    
    private void GetDataMethod(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("mNumber");
        model.addColumn("howToProcess");
        model.addColumn("howToUse");

    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from method");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("mNumber"),sql.getString("howToProcess")
                    ,sql.getString("howToUse")});
            Method.add(sql.getString("mNumber"));
            
        }
        jTable3.setModel(DbUtils.resultSetToTableModel(sql));
        jTable3.setModel(model);
        
        ArrayMethod();
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
}

 private void GetDataMPC(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("cNumber");
        model.addColumn("mpsName");
        model.addColumn("breeding");
        model.addColumn("fruit");
        model.addColumn("length");
        model.addColumn("leaf");
        model.addColumn("flower");
        model.addColumn("root");
        model.addColumn("stem");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from mpcharacteristic");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("cNumber"),sql.getString("mpsName")
                    ,sql.getString("breeding"),sql.getString("fruit"),sql.getString("length")
            ,sql.getString("leaf"),sql.getString("flower"),sql.getString("root")
            ,sql.getString("stem")});
        }
        jTable4.setModel(DbUtils.resultSetToTableModel(sql));
        jTable4.setModel(model);
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
}
 
private void GetDataMP(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("scientificName");
        model.addColumn("commonName");
        model.addColumn("theUtilizePart");
        model.addColumn("photo");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from medicinalplants");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("scientificName"),sql.getString("commonName")
                    ,sql.getString("theUtilizePart"),sql.getString("photo")});
             ScientificName.add(sql.getString("scientificName"));
        }
        jTable8.setModel(DbUtils.resultSetToTableModel(sql));
        jTable8.setModel(model);
        ArrayScientificName();
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataRDR(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("researcher");
        model.addColumn("rdpNumber");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from rdresearcher");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("researcher"),sql.getString("rdpNumber")});

        }
        jTable13.setModel(DbUtils.resultSetToTableModel(sql));
        jTable13.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataRD(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("publicationNumber");
        model.addColumn("mpsName");
        model.addColumn("title");
        model.addColumn("organization");
        model.addColumn("researchTime");
        model.addColumn("publicationType");

    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from researchdata");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("publicationNumber"),sql.getString("mpsName")
            ,sql.getString("title"),sql.getString("organization"),sql.getString("researchTime")
            ,sql.getString("publicationType")});
            publicationNumber.add(sql.getString("publicationNumber"));

        }
        jTable14.setModel(DbUtils.resultSetToTableModel(sql));
        jTable14.setModel(model);
        ArrayPublicationNumber();
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataMPH(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("habitatNumber");
        model.addColumn("mpsName");
        model.addColumn("temperature");
        model.addColumn("endemic");
        model.addColumn("typeOfLand");
        model.addColumn("typeOfSoil");

    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from mphabitat");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("habitatNumber"),sql.getString("mpsName"),sql.getString("temperature")
            ,sql.getString("endemic"),sql.getString("typeOfLand"),sql.getString("typeOfSoil")});

        }
        jTable5.setModel(DbUtils.resultSetToTableModel(sql));
        jTable5.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataMPComp(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("composition");
        model.addColumn("mpsName");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from mpcomposition");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("composition"),sql.getString("mpsName")});
           

        }
        jTable6.setModel(DbUtils.resultSetToTableModel(sql));
        jTable6.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataMPClas(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("classificationNo");
        model.addColumn("mpsName");
        model.addColumn("division");
        model.addColumn("class");
        model.addColumn("subClass");
        model.addColumn("subKingdom");
        model.addColumn("superDivision");
        model.addColumn("species");
        model.addColumn("mporder");
        model.addColumn("family");
        model.addColumn("genus");
     
    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from mpclassification");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("classificationNo"),sql.getString("mpsName"),sql.getString("division")
            ,sql.getString("class"),sql.getString("subClass"),sql.getString("subKingdom"),sql.getString("superDivision")
            ,sql.getString("species"),sql.getString("mporder"),sql.getString("family"),sql.getString("genus")});
           

        }
        jTable7.setModel(DbUtils.resultSetToTableModel(sql));
        jTable7.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
} 

private void GetDataHMI(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ingredients");
        model.addColumn("hmNumber");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from hmingredients");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("ingredients"),sql.getString("hmNumber")});
           

        }
        jTable9.setModel(DbUtils.resultSetToTableModel(sql));
        jTable9.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }          
} 

private void GetDataPB(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("mpsName");
        model.addColumn("metNumber");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from processedby");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("mpsName"),sql.getString("metNumber")});
           
        }
        jTable10.setModel(DbUtils.resultSetToTableModel(sql));
        jTable10.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }          
}

private void GetDataPR(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("mpsName");
        model.addColumn("hmNumber");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from productresult");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("mpsName"),sql.getString("hmNumber")});
           
        }
        jTable11.setModel(DbUtils.resultSetToTableModel(sql));
        jTable11.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }          
}

private void GetDataProvB(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("rdpNumber");
        model.addColumn("mpsName");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from provenby");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("rdpNumber"),sql.getString("mpsName")});
           
        }
        jTable12.setModel(DbUtils.resultSetToTableModel(sql));
        jTable12.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }          
}

private void GetDataTreat(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("disNumber");
        model.addColumn("mpsName");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("select * from treat");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("disNumber"),sql.getString("mpsName")});
           
        }
        jTable15.setModel(DbUtils.resultSetToTableModel(sql));
        jTable15.setModel(model);

    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }          
}

    private void NewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtnActionPerformed
        // mengosongkan textbox
        NumberTF.setText("");
        NameTF.setText("");
        CauseTF.setText("");
        SymptomsTF.setText("");
        dNumDisease.clear();
        CB_disNumberTreat.removeAllItems();
        GetDataDisease();
        
    }//GEN-LAST:event_NewBtnActionPerformed

    private void InsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtnActionPerformed
              dNumDisease.clear();
        CB_disNumberTreat.removeAllItems();
        if (!NumberTF.getText().matches("")) {
            try {
            String sql = "insert into disease values('"+NumberTF.getText()+"','"+NameTF.getText()
                    +"','"+CauseTF.getText()+"','"+SymptomsTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataDisease(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        NumberTF.setText("");
        NameTF.setText("");
        CauseTF.setText("");
        SymptomsTF.setText("");
        
    }//GEN-LAST:event_InsertBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
              dNumDisease.clear();
        CB_disNumberTreat.removeAllItems();
        try { // hapus data
            if(!NumberTF.getText().matches("")){
        String sql ="delete from disease where dNumber='"+NumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan number");
        NumberTF.setText("");
        NameTF.setText("");
        CauseTF.setText("");
        SymptomsTF.setText("");
    } catch (SQLException | HeadlessException e) {
        
    }
    
    GetDataDisease();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
            try{
            StringBuilder query = new StringBuilder("UPDATE `disease` SET");
            int flag = 0;
            if(!NumberTF.getText().isEmpty()){
                query.append("`dNumber` = '"+NumberTF.getText()+"'");
                flag = 1;
            }
            if(!NameTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`name` = '"+NameTF.getText()+"'");
                flag = 2;
            }
            if(!CauseTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`cause` = '"+CauseTF.getText()+"'");
                flag = 3;
            }
            if(!SymptomsTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`symptoms` = '"+SymptomsTF.getText()+"'");
                flag = 4;
            }
            int row = jTable1.getSelectedRow();
            int column = jTable1.getSelectedColumn();
            String primary = jTable1.getValueAt(row, column).toString();
            query.append("WHERE `disease`.`dNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");            
        }
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataDisease();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void MPClassificationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPClassificationbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMPClasPanel.setVisible(true);
        TMPClasPanel.setVisible(true);
        GetDataMPClas();
    }//GEN-LAST:event_MPClassificationbtnActionPerformed

    private void MethodbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MethodbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMethodPanel.setVisible(true);
        TMethodPanel.setVisible(true);
        Method.clear();
        CB_metNumberPB.removeAllItems();
        GetDataMethod();
    }//GEN-LAST:event_MethodbtnActionPerformed

    private void MPCompositebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPCompositebtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMPCompPanel.setVisible(true);
        TMPCompPanel.setVisible(true);
        GetDataMPComp();
    }//GEN-LAST:event_MPCompositebtnActionPerformed

    private void HerbMedicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HerbMedicBtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InHerbMedicPanel.setVisible(true);
        THerbMedicPanel.setVisible(true);
        HerbalMedicine.clear();
        CB_hmNumberPR.removeAllItems();
        CB_hmNumberHMI.removeAllItems();
        GetDataHerbMedic();
    }//GEN-LAST:event_HerbMedicBtnActionPerformed

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `herbalmedicine` SET ");
            int flag = 0;
            if(!hNumberTF.getText().isEmpty()){
                query.append("`hNumber` = '"+hNumberTF.getText()+"'");
                flag = 1;
            }
            if(!hNameTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`name` = '"+hNameTF.getText()+"'");
                flag = 2;
            }
            if(!TypeTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`type` = '"+TypeTF.getText()+"'");
                flag = 3;
            }
            if(!levelTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`level` = '"+levelTF.getText()+"'");
                flag = 4;
            }
            if(!SideEffectTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`side effect` = '"+SideEffectTF.getText()+"'");
                flag = 5;
            }  
            int row = jTable2.getSelectedRow();
            int column = jTable2.getSelectedColumn();
            String primary = jTable2.getValueAt(row, column).toString();
            query.append("WHERE `herbalmedicine`.`hNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataHerbMedic();
    }//GEN-LAST:event_UpdateBtn1ActionPerformed

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
         HerbalMedicine.clear();
        CB_hmNumberPR.removeAllItems();
        CB_hmNumberHMI.removeAllItems();
        try { // hapus data
            if(!hNumberTF.getText().matches("")){
        String sql ="delete from herbalmedicine where hNumber='"+hNumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan hNumber");
        hNumberTF.setText("");
        hNameTF.setText("");
        TypeTF.setText("");
        levelTF.setText("");
        SideEffectTF.setText("");
        
    } catch (SQLException | HeadlessException e) {
        
    }
    
    GetDataHerbMedic();
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void InsertBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn1ActionPerformed
        HerbalMedicine.clear();
        CB_hmNumberPR.removeAllItems();
        CB_hmNumberHMI.removeAllItems();   
        if (!hNumberTF.getText().matches("")) {
            try {
            String sql = "insert into herbalmedicine values('"+hNumberTF.getText()+"','"+hNameTF.getText()
                    +"','"+TypeTF.getText()+"','"+levelTF.getText()+"','"+SideEffectTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataHerbMedic(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan masukkan Data!");
        }
    }//GEN-LAST:event_InsertBtn1ActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        hNumberTF.setText("");
        hNameTF.setText("");
        TypeTF.setText("");
        levelTF.setText("");
        HerbalMedicine.clear();
        CB_hmNumberPR.removeAllItems();
        CB_hmNumberHMI.removeAllItems();
        GetDataHerbMedic();
    }//GEN-LAST:event_Reset1ActionPerformed

    private void diseasebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasebtnActionPerformed
        TampilanOff();
        PanelAwal.setVisible(false);
        InDiseasePanel.setVisible(true);
        TDiseasePanel.setVisible(true);
        dNumDisease.clear();
        CB_disNumberTreat.removeAllItems();
        GetDataDisease();
    }//GEN-LAST:event_diseasebtnActionPerformed

    private void UpdateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn2ActionPerformed
        try{
            StringBuilder query = new StringBuilder("UPDATE `method` SET ");
            int flag = 0;
            if(!mNumberTF.getText().isEmpty()){
                query.append("`mNumber` = '"+mNumberTF.getText()+"'");
                flag = 1;
            }
            if(!HowToProcessTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`howToProcess` = '"+HowToProcessTF.getText()+"'");
                flag = 2;
            }
            if(!HowToUseTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`howToUse` = '"+HowToUseTF.getText()+"'");
                flag = 3;
            }
            int row = jTable3.getSelectedRow();
            int column = jTable3.getSelectedColumn();
            String primary = jTable3.getValueAt(row, column).toString();
            query.append("WHERE `method`.`mNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");            
        }
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataMethod();
    }//GEN-LAST:event_UpdateBtn2ActionPerformed

    private void DeleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn2ActionPerformed
     // dNumDisease.clear();
     //   jComboBox2.removeAllItems();
        try { // hapus data
            if(!mNumberTF.getText().matches("")){
        String sql ="delete from method where mNumber='"+mNumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan mNumber");
        mNumberTF.setText("");
        HowToProcessTF.setText("");
        HowToUseTF.setText("");
    } catch (SQLException | HeadlessException e) {
        
    }
    
    GetDataMethod();
    }//GEN-LAST:event_DeleteBtn2ActionPerformed

    private void InsertBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn2ActionPerformed

        if (!mNumberTF.getText().matches("")) {
            try {
            String sql = "insert into method values('"+mNumberTF.getText()+"','"+HowToProcessTF.getText()
                    +"','"+HowToUseTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMethod(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        mNumberTF.setText("");
        HowToProcessTF.setText("");
        HowToUseTF.setText("");
        
    }//GEN-LAST:event_InsertBtn2ActionPerformed

    private void NewBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn2ActionPerformed
        mNumberTF.setText("");
        HowToProcessTF.setText("");
        HowToUseTF.setText("");
        GetDataMethod();
    }//GEN-LAST:event_NewBtn2ActionPerformed

    private void mNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNumberTFActionPerformed

    private void HowToProcessTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowToProcessTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HowToProcessTFActionPerformed

    private void HowToUseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowToUseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HowToUseTFActionPerformed

    private void UpdateBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn3ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `mpcharacteristic` SET ");
            int flag = 0;
            if(!cNumberTF.getText().isEmpty()){
                query.append("`cNumber` = '"+cNumberTF.getText()+"'");
                flag = 1;
            }
            if(CB_mpsNameMPC.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameMPC.getSelectedItem()+"'");
                flag = 2;
            }
            if(!breedingTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`breeding` = '"+breedingTF.getText()+"'");
                flag = 3;
            }
            if(!fruitTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`fruit` = '"+fruitTF.getText()+"'");
                flag = 4;
            }
            if(!lengthTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`length` = '"+lengthTF.getText()+"'");
                flag = 5;
            }
            if(!leafTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`leaf` = '"+leafTF.getText()+"'");
                flag = 6;
            }
            if(!flowerTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`flower` = '"+flowerTF.getText()+"'");
                flag = 7;
            }
            if(!rootTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`root` = '"+rootTF.getText()+"'");
                flag = 8;
            }
            if(!stemTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`stem` = '"+stemTF.getText()+"'");
                flag = 9;
            }
         int row = jTable4.getSelectedRow();
            int column = jTable4.getSelectedColumn();
            String primary = jTable4.getValueAt(row, column).toString();
            query.append(" WHERE `mpcharacteristic`.`cNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataMPC();
    }//GEN-LAST:event_UpdateBtn3ActionPerformed

    private void DeleteBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn3ActionPerformed
        
        try { // hapus data
            if(!cNumberTF.getText().matches("")){
        String sql ="delete from mpcharacteristic where cNumber='"+cNumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan cNumber");

    } catch (SQLException | HeadlessException e) {
        
    }
     cNumberTF.setText("");
        breedingTF.setText("");
        fruitTF.setText("");
        lengthTF.setText("");
        leafTF.setText("");
        flowerTF.setText("");
        rootTF.setText("");
        stemTF.setText("");
    GetDataMPC();
    }//GEN-LAST:event_DeleteBtn3ActionPerformed

    private void InsertBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn3ActionPerformed

        if (!cNumberTF.getText().matches("")) {
            try {
            String sql = "insert into mpcharacteristic values('"+cNumberTF.getText()+"','"+CB_mpsNameMPC.getSelectedItem()
                    +"','"+breedingTF.getText()+"','"+fruitTF.getText()+"','"+lengthTF.getText()+
                    "','"+leafTF.getText()+"','"+flowerTF.getText()+"','"+rootTF.getText()+
                    "','"+stemTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMPC(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
         cNumberTF.setText("");
        breedingTF.setText("");
        fruitTF.setText("");
        lengthTF.setText("");
        leafTF.setText("");
        flowerTF.setText("");
        rootTF.setText("");
        stemTF.setText("");
    }//GEN-LAST:event_InsertBtn3ActionPerformed

    private void NewBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn3ActionPerformed
        cNumberTF.setText("");
        breedingTF.setText("");
        fruitTF.setText("");
        lengthTF.setText("");
        leafTF.setText("");
        flowerTF.setText("");
        rootTF.setText("");
        stemTF.setText("");
        GetDataMPC();
    }//GEN-LAST:event_NewBtn3ActionPerformed

    private void UpdateBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn4ActionPerformed
       try{
            StringBuilder query = new StringBuilder ("UPDATE `mphabitat` SET ");
            int flag = 0;
            if(!habitatNumberTF.getText().isEmpty()){
                query.append("`habitatNumber` = '"+habitatNumberTF.getText()+"'");
                flag = 1;
            }
            if(CB_mpsNameMPH.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameMPH.getSelectedItem()+"'");
                flag = 2;
            }
            if(!temperatureTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`temperature` = '"+temperatureTF.getText()+"'");
                flag = 3;
            }
            if(!endemicTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`endemic` = '"+endemicTF.getText()+"'");
                flag = 4;
            }
            if(!typeOfLandTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`typeOfLand` = '"+typeOfLandTF.getText()+"'");
                flag = 5;
            }
            if(!typeOfSoilTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`typeOfSoil` = '"+typeOfSoilTF.getText()+"'");
                flag = 6;
            }
         int row = jTable5.getSelectedRow();
            int column = jTable5.getSelectedColumn();
            String primary = jTable5.getValueAt(row, column).toString();
            query.append(" WHERE `mphabitat`.`habitatNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataMPH();
       
    }//GEN-LAST:event_UpdateBtn4ActionPerformed

    private void DeleteBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn4ActionPerformed
         
        try { // hapus data
            if(!habitatNumber.getText().matches("")){
        String sql ="delete from mphabitat where habitatNumber='"+habitatNumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan habitatNumber");

    } catch (SQLException | HeadlessException e) {
        
    }
        habitatNumberTF.setText("");
        temperatureTF.setText("");
        endemicTF.setText("");
        typeOfLandTF.setText("");
        typeOfSoilTF.setText("");    
    GetDataMPH();
    }//GEN-LAST:event_DeleteBtn4ActionPerformed

    private void InsertBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn4ActionPerformed
        
        if (!habitatNumberTF.getText().matches("")) {
            try {
            String sql = "insert into mphabitat values('"+habitatNumberTF.getText()+"','"+CB_mpsNameMPH.getSelectedItem()
                    +"','"+temperatureTF.getText()+"','"+endemicTF.getText()+"','"+typeOfLandTF.getText()+"','"+typeOfSoilTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMPH(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        habitatNumberTF.setText("");
        temperatureTF.setText("");
        endemicTF.setText("");
        typeOfLandTF.setText("");
        typeOfSoilTF.setText("");                                       
    }//GEN-LAST:event_InsertBtn4ActionPerformed

    private void NewBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn4ActionPerformed
          habitatNumberTF.setText("");
        temperatureTF.setText("");
        endemicTF.setText("");
        typeOfLandTF.setText("");
        typeOfSoilTF.setText("");  
        GetDataMPH();
    }//GEN-LAST:event_NewBtn4ActionPerformed

    private void habitatNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitatNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitatNumberTFActionPerformed

    private void temperatureTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperatureTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperatureTFActionPerformed

    private void endemicTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endemicTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endemicTFActionPerformed

    private void UpdateBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn5ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `mpcomposition` SET ");
            int flag = 0;
            if(!compositionTF.getText().isEmpty()){
                query.append("`composition` = '"+compositionTF.getText()+"'");
                flag = 1;
            }
            if(CB_mpsNameMPComp.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameMPComp.getSelectedItem()+"'");
                flag = 2;
            }
            int row = jTable6.getSelectedRow();
            int column = jTable6.getSelectedColumn();
            String primary1 = jTable6.getValueAt(row, column).toString();
            String primary2 = jTable6.getValueAt(row, column+1).toString();
            query.append("WHERE `mpcomposition`.`composition` = '"+primary1+"' AND  `mpcomposition`.`mpsName` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }        
        GetDataMPComp();
    }//GEN-LAST:event_UpdateBtn5ActionPerformed

    private void DeleteBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn5ActionPerformed
        try { // hapus data
            if(!compositionTF.getText().matches("")){
        String sql ="delete from mpcomposition where composition='"+compositionTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan composition");

    } catch (SQLException | HeadlessException e) {
        
    }
        compositionTF.setText("");  
        GetDataMPComp();
    }//GEN-LAST:event_DeleteBtn5ActionPerformed

    private void InsertBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn5ActionPerformed
        
        if (!compositionTF.getText().matches("")) {
            try {
            String sql = "insert into mpcomposition values('"+compositionTF.getText()+"','"+CB_mpsNameMPComp.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMPComp(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        compositionTF.setText("");                 
    }//GEN-LAST:event_InsertBtn5ActionPerformed

    private void NewBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn5ActionPerformed
        compositionTF.setText("");   
        GetDataMPComp();
    }//GEN-LAST:event_NewBtn5ActionPerformed

    private void compositionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compositionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compositionTFActionPerformed

    private void UpdateBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn6ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `mpclassification` SET ");
            int flag = 0;
            if(!ClassificationNoTF.getText().isEmpty()){
                query.append("`classificationNo` = '"+ClassificationNoTF.getText()+"'");
                flag = 1;
            }
            if(CB_mpsNameMPClas.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameMPClas.getSelectedItem()+"'");
                flag = 2;
            }
            if(!divisionTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`division` = '"+divisionTF.getText()+"'");
                flag = 3;
            }
            if(!classTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`class` = '"+classTF.getText()+"'");
                flag = 4;
            }
            if(!subClassTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`subClass` = '"+subClassTF.getText()+"'");
                flag = 5;
            }
            if(!subKingdomTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`subKingdom` = '"+subKingdomTF.getText()+"'");
                flag = 6;
            }
            if(!superDivisionTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`superDivision` = '"+superDivisionTF.getText()+"'");
                flag = 7;
            }
            if(!speciesTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`species = '"+speciesTF.getText()+"'");
                flag = 8;
            }
            if(!mporderTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mporder` = '"+mporderTF.getText()+"'");
                flag = 9;
            }
             if(!familyTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`family` = '"+familyTF.getText()+"'");
                flag = 10;
            }
              if(!genusTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`genus` = '"+genusTF.getText()+"'");
                flag = 11;
            }
         int row = jTable7.getSelectedRow();
            int column = jTable7.getSelectedColumn();
            String primary = jTable7.getValueAt(row, column).toString();
            query.append("WHERE `mpclassification`.`classificationNo` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataMPClas();
    }//GEN-LAST:event_UpdateBtn6ActionPerformed

    private void DeleteBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn6ActionPerformed
        try { // hapus data
            if(!ClassificationNoTF.getText().matches("")){
        String sql ="delete from mpclassification where classificationNo='"+ClassificationNoTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan classificationNo");

    } catch (SQLException | HeadlessException e) {
        
    }
        ClassificationNoTF.setText("");      
        divisionTF.setText(""); 
        classTF.setText(""); 
        subClassTF.setText(""); 
        subKingdomTF.setText(""); 
        superDivisionTF.setText(""); 
        speciesTF.setText(""); 
        mporderTF.setText(""); 
        familyTF.setText(""); 
        genusTF.setText(""); 
        GetDataMPClas();
    }//GEN-LAST:event_DeleteBtn6ActionPerformed

    private void InsertBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn6ActionPerformed
        
        if (!ClassificationNoTF.getText().matches("")) {
            try {
            String sql = "insert into mpclassification values('"+ClassificationNoTF.getText()+"','"
                    +CB_mpsNameMPClas.getSelectedItem()+"','"+divisionTF.getText()+"','"
                    +classTF.getText()+"','"+subClassTF.getText()+"','"+subKingdomTF.getText()
                    +"','"+superDivisionTF.getText()+"','"+speciesTF.getText()+
                    "','"+mporderTF.getText()+"','"+familyTF.getText()+"','"+genusTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMPClas(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        ClassificationNoTF.setText("");      
        divisionTF.setText(""); 
        classTF.setText(""); 
        subClassTF.setText(""); 
        subKingdomTF.setText(""); 
        superDivisionTF.setText(""); 
        speciesTF.setText(""); 
        mporderTF.setText(""); 
        familyTF.setText(""); 
        genusTF.setText(""); 
        
    }//GEN-LAST:event_InsertBtn6ActionPerformed

    private void NewBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn6ActionPerformed
        ClassificationNoTF.setText("");      
        divisionTF.setText(""); 
        classTF.setText(""); 
        subClassTF.setText(""); 
        subKingdomTF.setText(""); 
        superDivisionTF.setText(""); 
        speciesTF.setText(""); 
        mporderTF.setText(""); 
        familyTF.setText(""); 
        genusTF.setText(""); 
        GetDataMPClas();
    }//GEN-LAST:event_NewBtn6ActionPerformed

    private void UpdateBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn7ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `medicinalPlants` SET ");
            int flag = 0;
            if(!scientificNameTF.getText().isEmpty()){
                query.append("`scientificName` = '"+scientificNameTF.getText()+"'");
                flag = 1;
            }
            if(!commonNameTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`commonName` = '"+commonNameTF.getText()+"'");
                flag = 2;
            }
            if(!theUtilizePartTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`theUtilizePart` = '"+theUtilizePartTF.getText()+"'");
                flag = 3;
            }
            if(!photoTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`photo` = '"+photoTF.getText()+"'");
                flag = 4;
            }
         int row = jTable8.getSelectedRow();
            int column = jTable8.getSelectedColumn();
            String primary = jTable8.getValueAt(row, column).toString();
            query.append("WHERE `medicinalPlants`.`scientificName` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataMP();
    }//GEN-LAST:event_UpdateBtn7ActionPerformed

    private void DeleteBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn7ActionPerformed
        deleteDataCB();      
        try {
            if(!scientificNameTF.getText().matches("")){
        String sql ="delete from medicinalplants where scientificName='"+scientificNameTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan cNumber");

    } catch (SQLException | HeadlessException e) {
        
    }
        scientificNameTF.setText("");
        commonNameTF.setText("");
        theUtilizePartTF.setText("");
        photoTF.setText("");
    GetDataMP();
    }//GEN-LAST:event_DeleteBtn7ActionPerformed

    private void InsertBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn7ActionPerformed
        deleteDataCB();
        if (!scientificNameTF.getText().matches("")) {
            try {
            String sql = "insert into medicinalplants values('"+scientificNameTF.getText()+"','"+commonNameTF.getText()
                    +"','"+theUtilizePartTF.getText()+"','"+photoTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataMP(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
         scientificNameTF.setText("");
        commonNameTF.setText("");
        theUtilizePartTF.setText("");
        photoTF.setText("");
    }//GEN-LAST:event_InsertBtn7ActionPerformed

    private void NewBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn7ActionPerformed
        scientificNameTF.setText("");
        commonNameTF.setText("");
        theUtilizePartTF.setText("");
        photoTF.setText("");
        deleteDataCB();
        GetDataMP();
    }//GEN-LAST:event_NewBtn7ActionPerformed

    private void scientificNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scientificNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scientificNameTFActionPerformed

    private void commonNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commonNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commonNameTFActionPerformed

    private void theUtilizePartTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theUtilizePartTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_theUtilizePartTFActionPerformed

    private void photoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photoTFActionPerformed

    private void UpdateBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn9ActionPerformed
        try{
        StringBuilder query = new StringBuilder ("UPDATE `rdresearcher` SET ");
            int flag = 0;
            if(!researcherTF.getText().isEmpty()){
                query.append("`researcher` = '"+researcherTF.getText()+"'");
                flag = 1;
            }
            if(CB_rdpNumber.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`rdpNumber` = '"+CB_rdpNumber.getSelectedItem()+"'");
                flag = 2;
            }
             int row = jTable13.getSelectedRow();
            int column = jTable13.getSelectedColumn();
            String primary1 = jTable13.getValueAt(row, column).toString();
            String primary2 = jTable13.getValueAt(row, column+1).toString();
            query.append("WHERE `rdresearcher`.`researcher` = '"+primary1+"' AND `rdresearcher`.`rdpNumber` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }        
        GetDataRDR();
    }//GEN-LAST:event_UpdateBtn9ActionPerformed

    private void DeleteBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn9ActionPerformed
      
        try {
            if(!researcherTF.getText().matches("")){
        String sql ="delete from rdresearcher where researcher='"+researcherTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan reasercher");

    } catch (SQLException | HeadlessException e) {
        
    }
        researcherTF.setText("");
    GetDataRDR();
    }//GEN-LAST:event_DeleteBtn9ActionPerformed

    private void InsertBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn9ActionPerformed
                // publicationNumber.clear();
                //CB_rdpNumberProvB.removeAllItems();
                //CB_rdpNumber.removeAllItems();
        if (!researcherTF.getText().matches("")) {
            try {
            String sql = "insert into rdresearcher values('"+researcherTF.getText()+"','"+CB_rdpNumber.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataRDR(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
         researcherTF.setText("");
    }//GEN-LAST:event_InsertBtn9ActionPerformed

    private void NewBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn9ActionPerformed
        researcherTF.setText("");
         GetDataRDR();
    }//GEN-LAST:event_NewBtn9ActionPerformed

    private void researcherTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researcherTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_researcherTFActionPerformed

    private void UpdateBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn10ActionPerformed
         try{
            StringBuilder query = new StringBuilder ("UPDATE `researchdata` SET ");
            int flag = 0;
            if(!publicationNumberTF.getText().isEmpty()){
                query.append("`publicationNumber` = '"+publicationNumberTF.getText()+"'");
                flag = 1;
            }
            if(CB_mpsNameRD.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameRD.getSelectedItem()+"'");
                flag = 2;
            }
            if(!titleTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`title` = '"+titleTF.getText()+"'");
                flag = 3;
            }
            if(!organizationTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`organization` = '"+organizationTF.getText()+"'");
                flag = 4;
            }
            if(!researchTimeTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`researchTime` = '"+researchTimeTF.getText()+"'");
                flag = 5;
            }
            if(!publicationTypeTF.getText().isEmpty()){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`publicationType` = '"+publicationTypeTF.getText()+"'");
                flag = 6;
            }
            int row = jTable14.getSelectedRow();
            int column = jTable14.getSelectedColumn();
            String primary = jTable14.getValueAt(row, column).toString();
            query.append("WHERE `researchdata`.`publicationNumber` = '"+primary+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
         GetDataRD();
    }//GEN-LAST:event_UpdateBtn10ActionPerformed

    private void DeleteBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn10ActionPerformed
            publicationNumber.clear();
             CB_rdpNumberProvB.removeAllItems();
             CB_rdpNumber.removeAllItems();    
        try {
            if(!publicationNumberTF.getText().matches("")){
        String sql ="delete from researchdata where publicationNumber='"+publicationNumberTF.getText()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan publicationNumber");

    } catch (SQLException | HeadlessException e) {
        
    }
         publicationNumberTF.setText("");
         titleTF.setText("");
         organizationTF.setText("");
         researchTimeTF.setText("");
         publicationTypeTF.setText("");
    GetDataRD();
    }//GEN-LAST:event_DeleteBtn10ActionPerformed

    private void InsertBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn10ActionPerformed
             publicationNumber.clear();
             CB_rdpNumberProvB.removeAllItems();
             CB_rdpNumber.removeAllItems();
        if (!publicationNumberTF.getText().matches("")) {
            try {
            String sql = "insert into researchdata values('"+publicationNumberTF.getText()+"','"+CB_mpsNameRD.getSelectedItem()+
                    "','"+titleTF.getText()+"','"+organizationTF.getText()+"','"+researchTimeTF.getText()+
                    "','"+publicationTypeTF.getText()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataRD(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
         publicationNumberTF.setText("");
         titleTF.setText("");
         organizationTF.setText("");
         researchTimeTF.setText("");
         publicationTypeTF.setText("");
    }//GEN-LAST:event_InsertBtn10ActionPerformed

    private void NewBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn10ActionPerformed
         publicationNumberTF.setText("");
         titleTF.setText("");
         organizationTF.setText("");
         researchTimeTF.setText("");
         publicationTypeTF.setText("");
         publicationNumber.clear();
         CB_rdpNumberProvB.removeAllItems();
         CB_rdpNumber.removeAllItems();
         GetDataRD();
    }//GEN-LAST:event_NewBtn10ActionPerformed

    private void publicationNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicationNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publicationNumberTFActionPerformed

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void organizationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationTFActionPerformed

    private void MPCharacteristicbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPCharacteristicbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMPCPanel.setVisible(true);
        TMPCPanel.setVisible(true);
        GetDataMPC();
    }//GEN-LAST:event_MPCharacteristicbtnActionPerformed

    private void MPHabitatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPHabitatbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMPHPanel.setVisible(true);
        TMPHPPanel.setVisible(true);
        GetDataMPH();
    }//GEN-LAST:event_MPHabitatbtnActionPerformed

    private void MedPlantsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedPlantsBtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InMPPanel.setVisible(true);
        TMPPanel.setVisible(true);
        deleteDataCB();
        GetDataMP();
    }//GEN-LAST:event_MedPlantsBtnActionPerformed

    private void HMIngredientsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMIngredientsbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InHMIPanel.setVisible(true);
        THMIPanel.setVisible(true);
        GetDataHMI();
    }//GEN-LAST:event_HMIngredientsbtnActionPerformed

    private void ProcessedBybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessedBybtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        TPBPanel.setVisible(true);
        InPBPanel.setVisible(true);
        GetDataPB();
    }//GEN-LAST:event_ProcessedBybtnActionPerformed

    private void ProductResultbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductResultbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        TPRPanel.setVisible(true);
        InPRPanel.setVisible(true);
        GetDataPR();
    }//GEN-LAST:event_ProductResultbtnActionPerformed

    private void ProvenBybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvenBybtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        TProvBPanel.setVisible(true);
        InProvBPanel.setVisible(true);
        GetDataProvB();
    }//GEN-LAST:event_ProvenBybtnActionPerformed

    private void RDResearcherbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDResearcherbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InRDRPanel.setVisible(true);
        TRDRPanel.setVisible(true);
        GetDataRDR();
    }//GEN-LAST:event_RDResearcherbtnActionPerformed

    private void ResearchDatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResearchDatabtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InRDPanel.setVisible(true);
        TRDPanel.setVisible(true);
             publicationNumber.clear();
             CB_rdpNumberProvB.removeAllItems();
             CB_rdpNumber.removeAllItems();
        GetDataRD();
    }//GEN-LAST:event_ResearchDatabtnActionPerformed

    private void TreatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatbtnActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        InTreatPanel.setVisible(true);
        TTreatPanel.setVisible(true);
        GetDataTreat();
    }//GEN-LAST:event_TreatbtnActionPerformed

    private void NewBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn8ActionPerformed
        ingredientsTF.setText(""); 
        GetDataHMI();
    }//GEN-LAST:event_NewBtn8ActionPerformed

    private void InsertBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn8ActionPerformed
          
        if (!ingredientsTF.getText().matches("")) {
            try {
            String sql = "insert into hmingredients values('"+ingredientsTF.getText()+"','"+CB_hmNumberHMI.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataHMI(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
        ingredientsTF.setText("");       
    }//GEN-LAST:event_InsertBtn8ActionPerformed

    private void DeleteBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn8ActionPerformed
                try { // hapus data
            if(CB_hmNumberHMI.getSelectedItem()!=null){
        String sql ="delete from hmingredients where ingredients='"+CB_hmNumberHMI.getSelectedItem()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. inputkan ingredients");

    } catch (SQLException | HeadlessException e) {
        
    }GetDataHMI();
                 ingredientsTF.setText("");  
    }//GEN-LAST:event_DeleteBtn8ActionPerformed

    private void UpdateBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn8ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `hmingredients` SET ");
            int flag = 0;
            if(!ingredientsTF.getText().isEmpty()){
                query.append("`ingredients` = '"+ingredientsTF.getText()+"'");
                flag = 1;
            }
            if(CB_hmNumberHMI.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`hmNumber` = '"+CB_hmNumberHMI.getSelectedItem()+"'");
                flag = 2;
            }
            int row = jTable9.getSelectedRow();
            int column = jTable9.getSelectedColumn();
            String primary1 = jTable9.getValueAt(row, column).toString();
            String primary2 = jTable9.getValueAt(row, column+1).toString();
            query.append("WHERE `hmingredients`.`ingredients` = '"+primary1+"' AND `hmingredients`.`hmNumber`  = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }    
        GetDataHMI();
    }//GEN-LAST:event_UpdateBtn8ActionPerformed

    private void UpdateBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn11ActionPerformed
        try{ 
        StringBuilder query = new StringBuilder ("UPDATE `treat` SET ");
            int flag = 0;
            if(CB_disNumberTreat.getSelectedItem()!=null){
                query.append("`disNumber` = '"+CB_disNumberTreat.getSelectedItem()+"'");
                flag = 1;
            }
            if(CB_mpsNameTreat.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameTreat.getSelectedItem()+"'");
                flag = 2;
            }
            int row = jTable15.getSelectedRow();
            int column = jTable15.getSelectedColumn();
            String primary1 = jTable15.getValueAt(row, column).toString();
            String primary2 = jTable15.getValueAt(row, column+1).toString();
            query.append("WHERE `treat`.`disNumber` = '"+primary1+"' AND `treat`.`mpsName` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataTreat();
    }//GEN-LAST:event_UpdateBtn11ActionPerformed

    private void DeleteBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn11ActionPerformed
        try { // hapus data
            if(CB_mpsNameTreat.getSelectedItem()!=null){
        String sql ="delete from processedby where mpsName='"+CB_mpsNameTreat.getSelectedItem()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. input mpsName");

    } catch (SQLException | HeadlessException e) {      
    }
        GetDataTreat();
    }//GEN-LAST:event_DeleteBtn11ActionPerformed

    private void InsertBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn11ActionPerformed
        
        if (CB_mpsNameTreat.getSelectedItem()!=null&&CB_disNumberTreat.getSelectedItem()!=null) {
            try {
            String sql = "insert into treat values('"+CB_disNumberTreat.getSelectedItem()+
                    "','"+CB_mpsNameTreat.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataTreat(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
    }//GEN-LAST:event_InsertBtn11ActionPerformed

    private void NewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn1ActionPerformed
        GetDataTreat();
    }//GEN-LAST:event_NewBtn1ActionPerformed

    private void UpdateBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn12ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `processedby` SET ");
            int flag = 0;
            if(CB_mpsNamePB.getSelectedItem()!=null){
                query.append("`mpsName` = '"+CB_mpsNamePB.getSelectedItem()+"'");
                flag = 1;
            }
            if(CB_metNumberPB.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`metNumber` = '"+CB_metNumberPB.getSelectedItem()+"'");
                flag = 2;
            }
         int row = jTable10.getSelectedRow();
            int column = jTable10.getSelectedColumn();
            String primary1 = jTable10.getValueAt(row, column).toString();
            String primary2 = jTable10.getValueAt(row, column+1).toString();
            query.append("WHERE `processedby`.`mpsName` = '"+primary1+"' AND `processedby`.`metNumber` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataPB();
    }//GEN-LAST:event_UpdateBtn12ActionPerformed

    private void DeleteBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn12ActionPerformed
         try { // hapus data
            if(CB_mpsNamePB.getSelectedItem()!=null){
        String sql ="delete from processedby where mpsName='"+CB_mpsNamePB.getSelectedItem()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. input mpsName");

    } catch (SQLException | HeadlessException e) {      
    }
         GetDataPB();
    }//GEN-LAST:event_DeleteBtn12ActionPerformed

    private void InsertBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn12ActionPerformed

        if (CB_mpsNamePB.getSelectedItem()!=null&&CB_metNumberPB.getSelectedItem()!=null) {
            try {
            String sql = "INSERT INTO `processedby` (`metNumber`, `mpsName`) values ('"+CB_metNumberPB.getSelectedItem()+
                    "','"+CB_mpsNamePB.getSelectedItem()+"');";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataPB(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
    }//GEN-LAST:event_InsertBtn12ActionPerformed

    private void NewBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn11ActionPerformed
        GetDataPB();
    }//GEN-LAST:event_NewBtn11ActionPerformed

    private void UpdateBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn13ActionPerformed
        try{
            StringBuilder query = new StringBuilder ("UPDATE `provenby` SET ");
            int flag = 0;
            if(CB_rdpNumberProvB.getSelectedItem()!=null){
                query.append("`rdpNumber` = '"+CB_rdpNumberProvB.getSelectedItem()+"'");
                flag = 1;
            }
            if(CB_mpsNameProvB.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`mpsName` = '"+CB_mpsNameProvB.getSelectedItem()+"'");
                flag = 2;
            }
        int row = jTable12.getSelectedRow();
            int column = jTable12.getSelectedColumn();
            String primary1 = jTable12.getValueAt(row, column).toString();
            String primary2 = jTable12.getValueAt(row, column+1).toString();
            query.append("WHERE `provenby`.`rdpNumber` = '"+primary1+"' AND `provenby`.`mpsName` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataProvB();
    }//GEN-LAST:event_UpdateBtn13ActionPerformed

    private void DeleteBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn13ActionPerformed
            try { // hapus data
            if(CB_rdpNumberProvB.getSelectedItem()!=null){
        String sql ="delete from provenby where mpsName='"+CB_rdpNumberProvB.getSelectedItem()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. input mpsName");

    } catch (SQLException | HeadlessException e) {      
    }
            GetDataProvB();
    }//GEN-LAST:event_DeleteBtn13ActionPerformed

    private void InsertBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn13ActionPerformed
        if (CB_rdpNumberProvB.getSelectedItem()!=null&&CB_mpsNameProvB.getSelectedItem()!=null) {
            try {
            String sql = "insert into provenby values('"+CB_rdpNumberProvB.getSelectedItem()+
                    "','"+CB_mpsNameProvB.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataProvB(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
    }//GEN-LAST:event_InsertBtn13ActionPerformed

    private void NewBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn12ActionPerformed
        GetDataProvB();
    }//GEN-LAST:event_NewBtn12ActionPerformed

    private void UpdateBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn14ActionPerformed
       try{
            StringBuilder query = new StringBuilder ("UPDATE `productresult` SET ");
            int flag = 0;
            if(CB_mpsNamePR.getSelectedItem()!=null){
                query.append("`mpsName` = '"+CB_mpsNamePR.getSelectedItem()+"'");
                flag = 1;
            }
            if(CB_hmNumberPR.getSelectedItem()!=null){
                if(flag !=0){
                    query.append(", ");
                }
                query.append("`hmNumber` = '"+CB_hmNumberPR.getSelectedItem()+"'");
                flag = 2;
            }
         int row = jTable11.getSelectedRow();
            int column = jTable11.getSelectedColumn();
            String primary1 = jTable11.getValueAt(row, column).toString();
            String primary2 = jTable11.getValueAt(row, column+1).toString();
            query.append("WHERE `productresult`.`mpsName` = '"+primary1+"' AND `productresult`.`hmNumber` = '"+primary2+"';");
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(query.toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi"); 
        }        
        catch (SQLException | HeadlessException e) {
           JOptionPane.showMessageDialog(null, e);
        }
        GetDataPR();
    }//GEN-LAST:event_UpdateBtn14ActionPerformed

    private void DeleteBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn14ActionPerformed
          try { // hapus data
            if(CB_mpsNamePR.getSelectedItem()!=null){
        String sql ="delete from productresult where mpsName='"+CB_mpsNamePR.getSelectedItem()+"'";
        java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Query Berhasil dieksekusi");
            
            }
            else
                JOptionPane.showMessageDialog(null, "Data gagal dihapus. input mpsName");

    } catch (SQLException | HeadlessException e) {      
    }
          GetDataPR();
    }//GEN-LAST:event_DeleteBtn14ActionPerformed

    private void InsertBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertBtn14ActionPerformed
        if (CB_mpsNamePR.getSelectedItem()!=null&&CB_hmNumberPR.getSelectedItem()!=null) {
            try {
            String sql = "insert into productresult values('"+CB_mpsNamePR.getSelectedItem()+
                    "','"+CB_hmNumberPR.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)tubesdatabase.TubesDatabase.koneksiDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
            GetDataPR(); // tampilkan ke grid
        }
            catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }    
        else{
            JOptionPane.showMessageDialog(null, "Silahkan Masukkan data!");
        }
    }//GEN-LAST:event_InsertBtn14ActionPerformed

    private void NewBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBtn13ActionPerformed
        GetDataPR();
    }//GEN-LAST:event_NewBtn13ActionPerformed

    private void ResearchDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResearchDataBtnActionPerformed
        GetDataResearch();
    }//GEN-LAST:event_ResearchDataBtnActionPerformed

    private void SearchBtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnsActionPerformed
        GetDataSearch();
    }//GEN-LAST:event_SearchBtnsActionPerformed

private void GetDataSearch(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama Penyakit");
        model.addColumn("Medical Plants");


    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("SELECT disease.name, medicinalPlants.commonName\n" +
"FROM disease, medicinalPlants, treat\n" +
"WHERE medicinalplants.scientificName  = treat.mpsName AND treat.disNumber = disease.dNumber AND disease.name LIKE '%"+SearchPenyakitTF.getText()+"%'");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("name"),sql.getString("commonName")});
        }
        searchTable.setModel(DbUtils.resultSetToTableModel(sql));
        searchTable.setModel(model);
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }           
} 

 private void GetDataResearch(){ // menampilkan data dari database
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Scientific Name");
        model.addColumn("Title");

    try {
        con =(Connection)tubesdatabase.TubesDatabase.koneksiDB();
        stm = con.createStatement();
        sql = stm.executeQuery("SELECT medicinalPlants.scientificName ,researchData.title\n" +
        "FROM researchData, medicinalPlants\n" +
        "WHERE medicinalPlants.scientificName = researchData.mpsName\n" +
        "ORDER BY medicinalPlants.scientificName ASC");
        while(sql.next()){
            model.addRow(new Object[]{sql.getString("scientificName"),sql.getString("title")});
        }
        searchTable.setModel(DbUtils.resultSetToTableModel(sql));
        searchTable.setModel(model);
    }
    catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "TABEL TAK BISA DITAMPILKAN");
    }
           
}    
    
    private void ExitBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtn15ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtn15ActionPerformed

    private void VIEWsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIEWsActionPerformed
        PanelAwal.setVisible(false);
        TampilanOff();
        VIEW.setVisible(true);
    }//GEN-LAST:event_VIEWsActionPerformed

    private void SymptomsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymptomsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymptomsTFActionPerformed
    
    public static void main(String args[]) {
            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new FormUtama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_disNumberTreat;
    private javax.swing.JComboBox<String> CB_hmNumberHMI;
    private javax.swing.JComboBox<String> CB_hmNumberPR;
    private javax.swing.JComboBox<String> CB_metNumberPB;
    private javax.swing.JComboBox<String> CB_mpsNameMPC;
    private javax.swing.JComboBox<String> CB_mpsNameMPClas;
    private javax.swing.JComboBox<String> CB_mpsNameMPComp;
    private javax.swing.JComboBox<String> CB_mpsNameMPH;
    private javax.swing.JComboBox<String> CB_mpsNamePB;
    private javax.swing.JComboBox<String> CB_mpsNamePR;
    private javax.swing.JComboBox<String> CB_mpsNameProvB;
    private javax.swing.JComboBox<String> CB_mpsNameRD;
    private javax.swing.JComboBox<String> CB_mpsNameTreat;
    private javax.swing.JComboBox<String> CB_rdpNumber;
    private javax.swing.JComboBox<String> CB_rdpNumberProvB;
    private javax.swing.JLabel Cause;
    private javax.swing.JTextField CauseTF;
    private javax.swing.JLabel ClassificationNo;
    private javax.swing.JTextField ClassificationNoTF;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JButton DeleteBtn10;
    private javax.swing.JButton DeleteBtn11;
    private javax.swing.JButton DeleteBtn12;
    private javax.swing.JButton DeleteBtn13;
    private javax.swing.JButton DeleteBtn14;
    private javax.swing.JButton DeleteBtn2;
    private javax.swing.JButton DeleteBtn3;
    private javax.swing.JButton DeleteBtn4;
    private javax.swing.JButton DeleteBtn5;
    private javax.swing.JButton DeleteBtn6;
    private javax.swing.JButton DeleteBtn7;
    private javax.swing.JButton DeleteBtn8;
    private javax.swing.JButton DeleteBtn9;
    private javax.swing.JButton ExitBtn15;
    private javax.swing.JButton HMIngredientsbtn;
    private javax.swing.JButton HerbMedicBtn;
    private javax.swing.JLabel HmpsName;
    private javax.swing.JLabel HowToProcess;
    private javax.swing.JTextField HowToProcessTF;
    private javax.swing.JLabel HowToUse;
    private javax.swing.JTextField HowToUseTF;
    private javax.swing.JPanel InDiseasePanel;
    private javax.swing.JPanel InHMIPanel;
    private javax.swing.JPanel InHerbMedicPanel;
    private javax.swing.JPanel InMPCPanel;
    private javax.swing.JPanel InMPClasPanel;
    private javax.swing.JPanel InMPCompPanel;
    private javax.swing.JPanel InMPHPanel;
    private javax.swing.JPanel InMPPanel;
    private javax.swing.JPanel InMethodPanel;
    private javax.swing.JPanel InPBPanel;
    private javax.swing.JPanel InPRPanel;
    private javax.swing.JPanel InProvBPanel;
    private javax.swing.JPanel InRDPanel;
    private javax.swing.JPanel InRDRPanel;
    private javax.swing.JPanel InTreatPanel;
    private javax.swing.JButton InsertBtn;
    private javax.swing.JButton InsertBtn1;
    private javax.swing.JButton InsertBtn10;
    private javax.swing.JButton InsertBtn11;
    private javax.swing.JButton InsertBtn12;
    private javax.swing.JButton InsertBtn13;
    private javax.swing.JButton InsertBtn14;
    private javax.swing.JButton InsertBtn2;
    private javax.swing.JButton InsertBtn3;
    private javax.swing.JButton InsertBtn4;
    private javax.swing.JButton InsertBtn5;
    private javax.swing.JButton InsertBtn6;
    private javax.swing.JButton InsertBtn7;
    private javax.swing.JButton InsertBtn8;
    private javax.swing.JButton InsertBtn9;
    private javax.swing.JLabel Level;
    private javax.swing.JButton MPCharacteristicbtn;
    private javax.swing.JButton MPClassificationbtn;
    private javax.swing.JLabel MPCompmpsName;
    private javax.swing.JButton MPCompositebtn;
    private javax.swing.JButton MPHabitatbtn;
    private javax.swing.JLabel MPSClasclass;
    private javax.swing.JLabel MPSClasmpsName;
    private javax.swing.JButton MedPlantsBtn;
    private javax.swing.JButton Methodbtn;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton NewBtn;
    private javax.swing.JButton NewBtn1;
    private javax.swing.JButton NewBtn10;
    private javax.swing.JButton NewBtn11;
    private javax.swing.JButton NewBtn12;
    private javax.swing.JButton NewBtn13;
    private javax.swing.JButton NewBtn2;
    private javax.swing.JButton NewBtn3;
    private javax.swing.JButton NewBtn4;
    private javax.swing.JButton NewBtn5;
    private javax.swing.JButton NewBtn6;
    private javax.swing.JButton NewBtn7;
    private javax.swing.JButton NewBtn8;
    private javax.swing.JButton NewBtn9;
    private javax.swing.JTextField NumberTF;
    private javax.swing.JPanel PanelAwal;
    private javax.swing.JPanel PanelMenuAwal;
    private javax.swing.JButton ProcessedBybtn;
    private javax.swing.JButton ProductResultbtn;
    private javax.swing.JButton ProvenBybtn;
    private javax.swing.JButton RDResearcherbtn;
    private javax.swing.JLabel RDmpsName;
    private javax.swing.JButton ResearchDataBtn;
    private javax.swing.JButton ResearchDatabtn;
    private javax.swing.JButton Reset1;
    private javax.swing.JButton SearchBtns;
    private javax.swing.JTextField SearchPenyakitTF;
    private javax.swing.JLabel SideEffect;
    private javax.swing.JTextField SideEffectTF;
    private javax.swing.JLabel Symptoms;
    private javax.swing.JTextField SymptomsTF;
    private javax.swing.JPanel TDiseasePanel;
    private javax.swing.JPanel THMIPanel;
    private javax.swing.JPanel THerbMedicPanel;
    private javax.swing.JPanel TMPCPanel;
    private javax.swing.JPanel TMPClasPanel;
    private javax.swing.JPanel TMPCompPanel;
    private javax.swing.JPanel TMPHPPanel;
    private javax.swing.JPanel TMPPanel;
    private javax.swing.JPanel TMethodPanel;
    private javax.swing.JPanel TPBPanel;
    private javax.swing.JPanel TPRPanel;
    private javax.swing.JPanel TProvBPanel;
    private javax.swing.JPanel TRDPanel;
    private javax.swing.JPanel TRDRPanel;
    private javax.swing.JPanel TTreatPanel;
    private javax.swing.JButton Treatbtn;
    private javax.swing.JLabel Type;
    private javax.swing.JTextField TypeTF;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JButton UpdateBtn10;
    private javax.swing.JButton UpdateBtn11;
    private javax.swing.JButton UpdateBtn12;
    private javax.swing.JButton UpdateBtn13;
    private javax.swing.JButton UpdateBtn14;
    private javax.swing.JButton UpdateBtn2;
    private javax.swing.JButton UpdateBtn3;
    private javax.swing.JButton UpdateBtn4;
    private javax.swing.JButton UpdateBtn5;
    private javax.swing.JButton UpdateBtn6;
    private javax.swing.JButton UpdateBtn7;
    private javax.swing.JButton UpdateBtn8;
    private javax.swing.JButton UpdateBtn9;
    private javax.swing.JPanel VIEW;
    private javax.swing.JButton VIEWs;
    private javax.swing.JLabel breeding;
    private javax.swing.JTextField breedingTF;
    private javax.swing.JLabel cNumber;
    private javax.swing.JTextField cNumberTF;
    private javax.swing.JTextField classTF;
    private javax.swing.JLabel commonName;
    private javax.swing.JTextField commonNameTF;
    private javax.swing.JLabel composition;
    private javax.swing.JTextField compositionTF;
    private javax.swing.JLabel dNumber;
    private javax.swing.JLabel dNumber1;
    private javax.swing.JButton diseasebtn;
    private javax.swing.JLabel division;
    private javax.swing.JTextField divisionTF;
    private javax.swing.JLabel endemic;
    private javax.swing.JTextField endemicTF;
    private javax.swing.JLabel family;
    private javax.swing.JTextField familyTF;
    private javax.swing.JLabel flower;
    private javax.swing.JTextField flowerTF;
    private javax.swing.JLabel fruit;
    private javax.swing.JTextField fruitTF;
    private javax.swing.JLabel genus;
    private javax.swing.JTextField genusTF;
    private javax.swing.JLabel hName;
    private javax.swing.JTextField hNameTF;
    private javax.swing.JLabel hNumber;
    private javax.swing.JTextField hNumberTF;
    private javax.swing.JLabel habitatNumber;
    private javax.swing.JTextField habitatNumberTF;
    private javax.swing.JLabel hmNumber;
    private javax.swing.JLabel hmNumber2;
    private javax.swing.JLabel ingredients;
    private javax.swing.JTextField ingredientsTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JLabel leaf;
    private javax.swing.JTextField leafTF;
    private javax.swing.JLabel length;
    private javax.swing.JTextField lengthTF;
    private javax.swing.JTextField levelTF;
    private javax.swing.JLabel mNumber;
    private javax.swing.JTextField mNumberTF;
    private javax.swing.JLabel metNumber;
    private javax.swing.JLabel mporder;
    private javax.swing.JTextField mporderTF;
    private javax.swing.JLabel mpsName;
    private javax.swing.JLabel mpsName3;
    private javax.swing.JLabel mpsName5;
    private javax.swing.JLabel mpsName6;
    private javax.swing.JLabel mpsName7;
    private javax.swing.JLabel organization;
    private javax.swing.JTextField organizationTF;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField photoTF;
    private javax.swing.JLabel publicationNumberLabel;
    private javax.swing.JTextField publicationNumberTF;
    private javax.swing.JLabel publicationType;
    private javax.swing.JTextField publicationTypeTF;
    private javax.swing.JLabel rdpNumber;
    private javax.swing.JLabel rdpNumber2;
    private javax.swing.JLabel researchTime;
    private javax.swing.JTextField researchTimeTF;
    private javax.swing.JLabel researcher;
    private javax.swing.JTextField researcherTF;
    private javax.swing.JLabel root;
    private javax.swing.JTextField rootTF;
    private javax.swing.JLabel scientificName;
    private javax.swing.JTextField scientificNameTF;
    private javax.swing.JTable searchTable;
    private javax.swing.JLabel species;
    private javax.swing.JTextField speciesTF;
    private javax.swing.JLabel stem;
    private javax.swing.JTextField stemTF;
    private javax.swing.JLabel subClass;
    private javax.swing.JTextField subClassTF;
    private javax.swing.JLabel subKingdom;
    private javax.swing.JTextField subKingdomTF;
    private javax.swing.JLabel superDivision;
    private javax.swing.JTextField superDivisionTF;
    private javax.swing.JLabel temperature;
    private javax.swing.JTextField temperatureTF;
    private javax.swing.JLabel theUtilizePart;
    private javax.swing.JTextField theUtilizePartTF;
    private javax.swing.JLabel title;
    private javax.swing.JTextField titleTF;
    private javax.swing.JLabel typeOfLand;
    private javax.swing.JTextField typeOfLandTF;
    private javax.swing.JLabel typeOfSoil;
    private javax.swing.JTextField typeOfSoilTF;
    // End of variables declaration//GEN-END:variables

  

  public void TampilanOff(){
        TDiseasePanel.setVisible(false);
        THerbMedicPanel.setVisible(false);
        InDiseasePanel.setVisible(false);
        InHerbMedicPanel.setVisible(false);
        InHMIPanel.setVisible(false);
        InMPCPanel.setVisible(false);
        InMPPanel.setVisible(false);
        InMPClasPanel.setVisible(false);
        InMPCompPanel.setVisible(false);
        InMPHPanel.setVisible(false);
        InMethodPanel.setVisible(false);
        InRDPanel.setVisible(false);
        InRDRPanel.setVisible(false);
        InTreatPanel.setVisible(false);
        InPBPanel.setVisible(false);
        InProvBPanel.setVisible(false);
        InPRPanel.setVisible(false);
        TPRPanel.setVisible(false);
        TPBPanel.setVisible(false);
        TProvBPanel.setVisible(false);
        TMPHPPanel.setVisible(false);
        THMIPanel.setVisible(false);
        TMethodPanel.setVisible(false);
        TMPPanel.setVisible(false);
        TMPCPanel.setVisible(false);
        TMPClasPanel.setVisible(false);
        TMPCompPanel.setVisible(false);
        TTreatPanel.setVisible(false);
        TRDRPanel.setVisible(false);
        TRDPanel.setVisible(false);
        VIEW.setVisible(false);
  }
  
}
