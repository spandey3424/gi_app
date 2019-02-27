package com.disability.synap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class CMO extends AppCompatActivity {

    Spinner spinner8, spinner9;
    ArrayAdapter<CharSequence> adapter8;
    ArrayAdapter<CharSequence> adapter9;
    TextView office,person,addr,mail,number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmo);

        office = (TextView) findViewById(R.id.txt1);
        addr = (TextView) findViewById(R.id.txt2);
        person = (TextView) findViewById(R.id.txt3);
        mail = (TextView) findViewById(R.id.txt4);
        number = (TextView) findViewById(R.id.txt5);


        spinner8 = (Spinner) findViewById(R.id.statespinner);

        adapter8 = ArrayAdapter.createFromResource(this, R.array.state_names, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner8.setAdapter(adapter8);

        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int pos=spinner8.getSelectedItemPosition();

                switch (pos)
                {
                    case 0:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofAndra, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int post, long id) {


                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 1:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofArunachal, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                int position1=spinner9.getSelectedItemPosition();

                                switch (position1)
                                {
                                    case 0:
                                        break;

                                        case 1:
                                            office.setText("District Survelliance Officer Changlang");
                                            addr.setText("District Survelliance Officer , Changlang\n");
                                            person.setText("Dr. R.C. Das\n");
                                            mail.setText("idspchanglang@rediffmail.com\n");
                                            number.setText("1558796\n");
                                            break;

                                    case 2:
                                        office.setText("District Survelliance Officer Dibang Valley\n");
                                        addr.setText("C/O DMO ANINI\n");
                                        person.setText("Dr. Gyati Reena\n");
                                        mail.setText("udidanini@gmail.com\n");
                                        number.setText("1155998\n");
                                        break;

                                    case 3:
                                        office.setText("District Surveillance Officer East Kameng\n");
                                        addr.setText("District Survelliance Officer , Seppa, East Kameng District\n");
                                        person.setText("Dr. K. Gyadi\n");
                                        mail.setText("idsp.seppa@gmail.com\n");
                                        number.setText("5874111\n");
                                        break;
                                    case 4:
                                        office.setText("District Survelliance Officer East Siang\n");
                                        addr.setText("District Survelliance Officer , Pasighat\n");
                                        person.setText("Dr. Tarik Talom\n");
                                        mail.setText("dsupasighat@gmail.com\n");
                                        number.setText("8779962\n");
                                        break;

                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 2:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofAssam, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                int position1=spinner9.getSelectedItemPosition();

                                switch (position1) {
                                    case 9:

                                        office.setText("Medical Superintendent Golaghat , Assam\n");
                                        addr.setText("MS Office, Nr. Shiv Temple\n");
                                        person.setText("Dr. Radha Kishan\n");
                                        mail.setText("msgolaghat@gmail.com\n");
                                        number.setText("45789635\n");

                                        break;

                                    case 13:

                                        office.setText("Medical Superintendent , Kamrup , Assam\n");
                                        addr.setText("SJ Road, Athgaon\n");
                                        person.setText("Dr. Anil Kumar Kalita\n");
                                        mail.setText("mskamrup@silvertouch.com\n");
                                        number.setText("2541201\n");

                                        break;


                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 3:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofBihar, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                int position1=spinner9.getSelectedItemPosition();

                                switch (position1)
                                {
                                    case 1:
                                        office.setText("CS OFFICE , ARARIA\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. Nawal Kishore Ojha\n");
                                        mail.setText("civilsurgeonararia@gmail.com\n");
                                        number.setText("242977\n");
                                        break;
                                    case 2:
                                        office.setText("CS OFFICE , ARWAL\n");
                                        addr.setText("Civil Surgeon Office\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("Csarwal2@gmail.com\n");
                                        number.setText("854623\n");
                                        break;
                                    case 3:
                                        office.setText("CS OFFICE , AURANGABAD\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital\n");
                                        person.setText("Dr. Janardhan Prasad\n");
                                        mail.setText("cs.aurangabadbih@gmail.com\n");
                                        number.setText("845621\n");

                                        break;
                                    case 4:
                                        office.setText("CS OFFICE ,BANKA\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital, Purani Thakurwari Road\n");
                                        person.setText("Dr. Sudhir Kumar Mahto\n");
                                        mail.setText("cs-banka-bih@nic.in\n");
                                        number.setText("222882\n");
                                        break;
                                    case 5:
                                        office.setText("CS OFFICE, BEGUSARAI\n");
                                        addr.setText("Sadar Hospital\n");
                                        person.setText("Sujeet Paswan\n");
                                        mail.setText("csbegusarai@gmail.com\n");
                                        number.setText("225512\n");
                                        break;
                                    case 6:
                                        office.setText("CS OFFICE , BHAGALPUR\n");
                                        addr.setText("Sadar Hospital Campus, Ghantaghar\n");
                                        person.setText("Indra Mohan Jha\n");
                                        mail.setText("csofficebgp01@gmail.com\n");
                                        number.setText("2422052\n");

                                        break;
                                    case 7:
                                        office.setText("CS OFFICE, BHOJPUR\n");
                                        addr.setText("C. S. Office, Sadar Hospital Campus, ARA\n");
                                        person.setText("Dr. Ras Bihari Singh\n");
                                        mail.setText("civilsurgeonbhojpur@gmail.com\n");
                                        number.setText("224264\n");

                                        break;
                                    case 8:
                                        office.setText("CS OFFICE , BUXAR\n");
                                        addr.setText("Central Jail Road, Mallahchakiya\n");
                                        person.setText("Manoj Kumar Srivastava\n");
                                        mail.setText("csbuxar123@gmail.com\n");
                                        number.setText("224163\n");

                                        break;
                                    case 9:
                                        office.setText("CS OFFICE , DARBHANGA\n");
                                        addr.setText("Civil Surgeon Office, Darnhanga\n");
                                        person.setText("Dr. Satish Chandra Das\n");
                                        mail.setText("civilsurgeondarbhanga@gmail.com\n");
                                        number.setText("233513\n");
                                        break;
                                    case 10:
                                        office.setText("CS OFFICE , GAYA\n");
                                        addr.setText("Jai Prakash Narayan Hospital, Opposite Azad Park\n");
                                        person.setText("Dr. Rajendra Prasad Sinha\n");
                                        mail.setText("csofficegaya@gmail.com\n");
                                        number.setText("2220303\n");
                                        break;
                                    case 11:
                                        office.setText("CS OFFICE , GOPALGANJ\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. A. K. Choudhary\n");
                                        mail.setText("Gopalganj.dhs3@gmail.com\n");
                                        number.setText("228158\n");

                                        break;

                                    case 12:
                                        office.setText("CS OFFICE , JAMUI\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. Shyam Mohan Das\n");
                                        mail.setText("dhs2005_jamui@rediffmail.com\n");
                                        number.setText("224363\n");

                                        break;

                                    case 13:
                                        office.setText("CS OFFICE , JEHANABAD\n");
                                        addr.setText("Civil Surgeon Office\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("csoffice043jehanabad@gmail.com\n");
                                        number.setText("227794\n");
                                        break;
                                    case 14:
                                        office.setText("CS OFFICE , KAIMUR\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital, Hajipur Campus, Bhabua\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("cskaimur@gmail.com\n");
                                        number.setText("222703\n");
                                        break;
                                    case 15:
                                        office.setText("CS OFFICE , KATIHAR\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital, Campus\n");
                                        person.setText("Dr. R. N. Singh\n");
                                        mail.setText("cscumcmoktr1@gmail.com\n");
                                        number.setText("241967\n");
                                        break;
                                    case 16:
                                        office.setText("CS OFFICE, KHAGARIA\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. Arun Kumar Singh\n");
                                        mail.setText("dhskhag111@gmail.com\n");
                                        number.setText("223758\n");

                                        break;
                                    case 17:
                                        office.setText("CS OFFICE , KISHANGANJ\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital, Campus\n");
                                        person.setText("Dr. Parsuram Prasad\n");
                                        mail.setText("cskishanganj99@gmail.com\n");
                                        number.setText("222966\n");

                                        break;
                                    case 18:
                                        office.setText("CS OFFICE, LAKHISARAI\n");
                                        addr.setText("Civil Surgeon Office\n");
                                        person.setText("Dr. R. K. Prasad\n");
                                        mail.setText("dhslakhisarai@gmail.com\n");
                                        number.setText("232870\n");
                                        break;
                                    case 19:
                                        office.setText("CS OFFICE , MADHEPURA\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital Campus\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("civilsurgeonmadhepura@gmail.com\n");
                                        number.setText("223204\n");
                                        break;
                                    case 20:
                                        office.setText("CS OFFICE , MADHUBANI\n");
                                        addr.setText("Sadar Hospital Campus, Madhubani\n");
                                        person.setText("Dr. Amarnath Jha\n");
                                        mail.setText("csofficemadhubani@gmail.com\n");
                                        number.setText("228008\n");
                                        break;

                                    case 21:
                                        office.setText("CS OFFICE , MUNGER\n");
                                        addr.setText("Civil Surgeon Office\n");
                                        person.setText("Dr. Srinath\n");
                                        mail.setText("civilsurgeonmunger1@yahoo.com\n");
                                        number.setText("222213\n");
                                        break;
                                    case 22:
                                        office.setText("CS OFFICE , MUZAFFARPUR\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. Lalita Singh\n");
                                        mail.setText("csmuz@rediffmail.com\n");
                                        number.setText("524189\n");
                                        break;
                                    case 23:
                                        office.setText("CS OFFICE , NALANDA\n");
                                        addr.setText("Biharsarif\n");
                                        person.setText("Dr. Subodh Prasad Singh\n");
                                        mail.setText("civilsurgeonnalanda@gmail.com\n");
                                        number.setText("236794\n");
                                        break;
                                    case 24:
                                        office.setText("CS OFFICE , NAWADA\n");
                                        addr.setText("Sadar Hospital Campus, Hospital Road\n");
                                        person.setText("Dr. Srinath Prasad\n");
                                        mail.setText("csnawada@gmail.com\n");
                                        number.setText("212270\n");
                                        break;
                                    case 25:
                                        office.setText("CS OFFICE, WEST CHAMPARAN\n");
                                        addr.setText("Block Campus, Bettiah\n");
                                        person.setText("Dr. Anil Kumar Sinha\n");
                                        mail.setText("csbettiah@gmail.com\n");
                                        number.setText("234293\n");
                                        break;
                                    case 26:
                                        office.setText("CS OFFICE , PATNA\n");
                                        addr.setText("Gardanibagh\n");
                                        person.setText("Dr. Pramod Jha\n");
                                        mail.setText("cspatna2015@gmail.com\n");
                                        number.setText("2249964\n");
                                        break;
                                    case 27:
                                        office.setText("CS OFFICE , EAST CHAMPARAN\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("CMO\n");
                                        mail.setText("dhschamparane@gmail.com\n");
                                        number.setText("240650\n");
                                        break;
                                    case 28:
                                        office.setText("CS OFFICE , PURNIA\n");
                                        addr.setText("Sadar Hospital Campus\n");
                                        person.setText("Dr. M. M. Wasim\n");
                                        mail.setText("csurgeon@rediffmail.com\n");
                                        number.setText("242965\n");
                                        break;
                                    case 29:
                                        office.setText("CS OFFICE , ROHTAS\n");
                                        addr.setText("Rouza Road, Sasaram\n");
                                        person.setText("Dr. Nawal Kishore Prasad Singh\n");
                                        mail.setText("csrohtas@gmail.com\n");
                                        number.setText("222039\n");
                                        break;
                                    case 30:
                                        office.setText("CS OFFICE , SAHARSA\n");
                                        addr.setText("Office of the Civil Surgeon-cum-Chief Medical\n");
                                        person.setText("Sri Ram Prakash Choudhary\n");
                                        mail.setText("dhssaharsa2017@gmail.com\n");
                                        number.setText("8554623\n");
                                        break;
                                    case 31:
                                        office.setText("CS OFFICE , SAMASTIPUR\n");
                                        addr.setText("Sadar Hospital Campus, Samastipur\n");
                                        person.setText("Dr. Awadh Kumar\n");
                                        mail.setText("csofficesamastipur@gmail.com\n");
                                        number.setText("228118\n");
                                        break;

                                    case 32:
                                        office.setText("CS OFFICE , SARAN\n");
                                        addr.setText("Near C. S. Office, Sadar Hospital Campus, Chapra\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("dhssaran@gmail.com\n");
                                        number.setText("244812\n");
                                        break;

                                    case 33:
                                        office.setText("CS OFFICE, SHEIKHPURA\n");
                                        addr.setText("Sadar Hospital Campus, Dallu More, PS PLUS\n");
                                        person.setText("CIVIL SURGEON\n");
                                        mail.setText("sheikhpura.cs@gmail.com\n");
                                        number.setText("223784\n");
                                    break;
                                    case 34:
                                        office.setText("CS OFFICE , SHEOHAR\n");
                                        addr.setText("Near I. B.\n");
                                        person.setText("Civil Surgeon\n");
                                        mail.setText("dhssheohar@rediffmail.com\n");
                                        number.setText("547896\n");
                                        break;
                                    case 35:
                                        office.setText("CS OFFICE , SITAMARHI\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital Campus\n");
                                        person.setText("Dr. Bindeshwar Sharma\n");
                                        mail.setText("cscumcmositamarhi@gmail.com\n");
                                        number.setText("254333\n");
                                        break;
                                    case 36:
                                        office.setText("CS OFFICE , SIWAN\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital\n");
                                        person.setText("Dr. Shiv Chandra Jha\n");
                                        mail.setText("cssiwan@gmail.com\n");
                                        number.setText("242782\n");
                                        break;
                                    case 37:
                                        office.setText("CS OFFICE, SUPAUL\n");
                                        addr.setText("Sadar Hospital Campus, Mahvir Chouk\n");
                                        person.setText("Mr. Akhilesh Prasad\n");
                                        mail.setText("cssupaul@gmail.com\n");
                                        number.setText("224101\n");

                                        break;
                                    case 38:
                                        office.setText("CS OFFICE , VAISHALI\n");
                                        addr.setText("Civil Surgeon Office, Sadar Hospital, Hajipur\n");
                                        person.setText("Dr. I. D. Ranjan\n");
                                        mail.setText("civilsurgeonvaishali@gmail.com\n");
                                        number.setText("541289\n");
                                        break;

                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 4:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofChhattisgarh, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                                int position1=spinner9.getSelectedItemPosition();

                                switch (position1)
                                {
                                    case 1:
                                        office.setText("Chief Medical and Health Officer, Balod\n");
                                        person.setText("District Office, Balod\n");
                                        addr.setText("S.P. Kesharwani\n");
                                        number.setText("cmobalod@gmail.com\n");
                                        mail.setText("223919\n");
                                        break;
                                    case 2:
                                        office.setText("Chief Medical and Health Officer, Baloda Bazar\n");
                                        person.setText("Office of Chief Medical Health Officer\n");
                                        addr.setText("Dr. Y.K. Sharma\n");
                                        number.setText("cmhobb2012@gmail.com\n");
                                        mail.setText("223622\n");
                                        break;
                                    case 3:
                                        office.setText("Chief Medical and Health Officer, Balrampur\n");
                                        person.setText("Chief Medical and Health Officer, Balrampur\n");
                                        addr.setText("Dr. Ganesh Kumar Chaube\n");
                                        number.setText("cmhobalrampur@gmail.com\n");
                                        mail.setText("273056\n");
                                        break;
                                    case 4:
                                        office.setText("Chief Medical and Health Officer , Bastar\n");
                                        person.setText("CMHO Office, Shanti Nagar, Jagdalpur\n");
                                        addr.setText("Dr. D.N.Nag\n");
                                        number.setText("cmhobastar@gmail.com\n");
                                        mail.setText("222281\n");
                                        break;
                                    case 5:
                                        office.setText("Chief Medical and Health Officer, Bemetara\n");
                                        person.setText("District Hospital, Bemetara\n");
                                        addr.setText("Dr.S.K.Sharma\n");
                                        number.setText("bemetaracmho@yahoo.com\n");
                                        mail.setText("7824222069\n");
                                        break;
                                    case 6:
                                        office.setText("Chief Medical and Health Officer, Bijapur\n");
                                        person.setText("Main Road, Bijapur\n");
                                        addr.setText("Dr. B.R Pujari\n");
                                        number.setText("cmho-Bijapur.cg@gov.in\n");
                                        mail.setText("220264\n");
                                        break;
                                    case 7:
                                        office.setText("Office of the Chief Medical and Health Officer, Bilaspur\n");
                                        person.setText("Office of the Chief Medical and Health Officer, Seepat Road, Sarkanda\n");
                                        addr.setText("Dr. B.B.Bode\n");
                                        number.setText("cmobilaspurcg@gmail.com\n");
                                        mail.setText("2266010\n");
                                        break;
                                    case 8:
                                        office.setText("Chief Medical and Health Officer, Dantewada\n");
                                        person.setText("Office of the Chief Medical and Health\n");
                                        addr.setText("Dr. H.L Thakur\n");
                                        number.setText("cmho.dantewada@gmail.com\n");
                                        mail.setText("252280\n");
                                        break;
                                    case 9:
                                        office.setText("Chief Medical and Health Officer, Durg\n");
                                        person.setText("Chief Medical and Health Office, Durg\n");
                                        addr.setText("Dr. Gambhir Singh Thakur\n");
                                        number.setText("cmhodurg@gmail.com\n");
                                        mail.setText("2210773\n");
                                        break;
                                    case 10:
                                        office.setText("Health and Family Welfare Department, Gariyaband\n");
                                        person.setText("Office- CM and HO\n");
                                        addr.setText("Dr. A.K.S. Ratre\n");
                                        number.setText("cmogariaband@yahoo.in\n");
                                        mail.setText("241445\n");
                                        break;
                                    case 11:
                                        office.setText("Health Department, Janjgir-Campa\n");
                                        person.setText("Office of the Chief Medical and Health officer and National Health Mission\n");
                                        addr.setText("Dr. Vadadi Jaiprakash\n");
                                        number.setText("cmho-jnj.cg@gov.in\n");
                                        mail.setText("7817222219\n");
                                        break;
                                    case 12:
                                        office.setText("Chief Medical and Health Officer, Jashpur\n");
                                        person.setText("Chief Medical and Health Officer, Jashpur\n");
                                        addr.setText("Dr. R.L Tiwari\n");
                                        number.setText("csdhjashpur@gmail.com\n");
                                        mail.setText("223927\n");
                                        break;
                                    case 13:
                                        office.setText("Health Department, Kabirdham\n");
                                        person.setText("Chief Medical and Health Officer, Office Kabirdham\n");
                                        addr.setText("Dr. K.K. Gajbhiye\n");
                                        number.setText("cmho_kabirdham@yahoo.com\n");
                                        mail.setText("9425212728\n");
                                        break;
                                    case 14:
                                        office.setText("Civil Surgeon cum Hospital Suprintand Department, Kanker\n");
                                        person.setText("Kamal deo district hospital\n");
                                        addr.setText("Tikeshwar\n");
                                        number.setText("districthospitalkanker@gmail.com\n");
                                        mail.setText("241214\n");
                                        break;
                                    case 15:
                                        office.setText("Health Department, Kondagaon\n");
                                        person.setText("Office of the Chief Medical and Health Officer, Near Ram Krishan sewa sadan Hospital\n");
                                        addr.setText("Mr. Dinesh Thakur\n");
                                        number.setText("cmhok.geon@gmail.com\n");
                                        mail.setText("242109\n");
                                        break;
                                    case 16:
                                        office.setText("CMO, Korba\n");
                                        person.setText("Rajgamar Road, Korba\n");
                                        addr.setText("Dr. P.S Sisodia\n");
                                        number.setText("cmhokorba@gmail.com");
                                        mail.setText("226766\n");
                                        break;
                                    case 17:
                                        office.setText("Chief Medical and Health Officer, Korea\n");
                                        person.setText("Chief Medical and Health Officer, Korea\n");
                                        addr.setText("Dr. S.S Palkar\n");
                                        number.setText("cmhokorea@gmail.com\n");
                                        mail.setText("9644429676\n");
                                        break;
                                    case 18:
                                        office.setText("Chief Medical and Health Officer, Mahasamund\n");
                                        person.setText("Distt. Hospital Mahasamund\n");
                                        addr.setText("Dr. R.K. Pardal\n");
                                        number.setText("cs.mahasamund@gmail.com\n");
                                        mail.setText("9425215852\n");
                                        break;
                                    case 19:
                                        office.setText("Chief Medical and Health Officer, Mungeli\n");
                                        person.setText("CMHO Office Near Old Bus Stand\n");
                                        addr.setText("Dr. R.L. Ghritlahre\n");
                                        number.setText("cmhomungeli@gmail.com\n");
                                        mail.setText("264695\n");
                                        break;
                                    case 20:
                                        office.setText("Chief Medical and Health Officer, Narayanpur\n");
                                        person.setText("New bus stand Road behind old SP office\n");
                                        addr.setText("Shri Anand Ram Gupta\n");
                                        number.setText("cmho.narayanpur@gmail.com\n");
                                        mail.setText("252913\n");
                                        break;
                                    case 21:
                                        office.setText("Chief Medical and Health Officer, Raigarh\n");
                                        person.setText("Bhagawanpur Raigarh Chattisgarh\n");
                                        addr.setText("Dr. T.K. Tondar\n");
                                        number.setText("cmhoraigarh@rediffmail.com\n");
                                        mail.setText("232668\n");
                                        break;
                                    case 22:
                                        office.setText("Family and Health Welfare Department, Raipur\n");
                                        person.setText("Office of the Chief Medical and Health Officer, Old Nurses Hostel, Near DKS Building\n");
                                        addr.setText("Dr. K.S. Shandilya\n");
                                        number.setText("cmho_raipur@yahoo.co.in\n");
                                        mail.setText("2535304\n");
                                        break;
                                    case 23:
                                        office.setText("District Hospital, Rajnandgaon\n");
                                        person.setText("Govt. District Hospital , Basantpur\n");
                                        addr.setText("Dr. Mithlesh Chaudhary\n");
                                        number.setText("grmc.rjn@gmail.com\n");
                                        mail.setText("224084\n");
                                        break;
                                    case 24:
                                        office.setText("Chief Medical and Health Officer, Sukma\n");
                                        person.setText("Room No-47, New Composite Building, Kumharras\n");
                                        addr.setText("Dr. Virendra Thakur\n");
                                        number.setText("cmho.sukma@gmail.com\n");
                                        mail.setText("284278\n");
                                        break;
                                    case 25:
                                        office.setText("District Hospital, Surajpur\n");
                                        person.setText("o/o Civil Surgen, District Hospital\n");
                                        addr.setText("Dr. Smt Shashi Tirky\n");
                                        number.setText("cmhosurajpur@gmail.com\n");
                                        mail.setText("266142\n");
                                        break;
                                    case 26:
                                        office.setText("Medical College Ambikapur, Surguja\n");
                                        person.setText("Near Surguja university office Darripara Ambikapur\n");
                                        addr.setText("Dr.P Kujur\n");
                                        number.setText("cshospital.ambikapur@gmail.com\n");
                                        mail.setText("220070\n");
                                        break;
                                }

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 5:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofGoa, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 6:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofGujrat, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 7:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofAssam, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 8:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofChandigarh, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 9:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofDadar, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 10:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofDaman, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                    case 11:
                        spinner9 = (Spinner) findViewById(R.id.districtspinner);
                        adapter9 = ArrayAdapter.createFromResource(CMO.this, R.array.DistrictofDelhi, android.R.layout.simple_spinner_item);
                        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spinner9.setAdapter(adapter9);

                        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent) {

                            }
                        });
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
