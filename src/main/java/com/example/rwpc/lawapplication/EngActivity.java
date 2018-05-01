package com.example.rwpc.lawapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EngActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
        listView = (ListView)findViewById(R.id.list_item);

        String[] values = new String[] { "INTRODUCTION\n   ","CLASSIFICATION OF OFFENCES AGAINST WOMEN",
                " OFFENCES AGAINST WOMEN IN INDIA\n  ",
                "CAUSES OF CRIME AGAINST WOMEN IN INDIA",
                "CONCLUSION",

        };
//        Integer[] imgid={
//
//
//
//        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position==0) {
                    Intent myintent = new Intent(view.getContext(), Scrolling1Activity.class);
                    myintent.putExtra("id","                 As Swami Vivekananda had said “That country and that nation that do not respect women have never become great, nor ever be in future”. Women are considered as a weaker sex not only from physical point of view but also from sociological aspect also. When we refer to smritis, we notice that woman has always been dependent on man. During child hood, on her father, after marriage on her husband, and during her old age on her son. However in olden times we find say “Where women are respected there Gods reside” Mahatma Gandhi once observed[i]. To call women a weaker sex it’s liable in mans injustice to women if by strength means brute strength, then indeed women are less brute than men. If by strength means moral power then women is work of Gabon the spirit of man in every position like priest, husband guardian perpetuated the female sex as to obey the man but no one questioned as to why she must be treated as obeying person.  Women were considered inferior to men in practical life. But in scriptures they were given high position. Thus in past, the status of women in India was not clear. It was theoretically high but practically low. Women were prohibited to take part in domestic as well as in external matter. They were under the influence of their parents before marriage and their husbands after marriage.\n" +
                            "Thus, the position of women in ancient India was inferior. The position became worse even during the Moghul rule. They could not overcome the nasty Pardah system of the time. Further, there was the custom of Sati. Many women were forcibly sent to the funeral pyre of their dead husbands. There was no change in the fate of women even during the British rule in India.\n" +
                            "The situation began to change when many national figures started a struggle for India’s freedom. Mahatma Gandhi openly invited the help from women. Many women came forward. Among them were Sarojini Naidu, Vijaya Laxmi Pandit, Mrs. Aruna Asaf Ali and others[ii]. Many women thereafter occupied prestigious positions in India. They excelled in almost all fields such as sports, politics, administration, science and arts.\n ");
                    startActivityForResult( myintent,0);


                }
                if (position==1) {
                    Intent myintent = new Intent(view.getContext(), Scrolling1Activity.class);
                    myintent.putExtra("id","CLASSIFICATION OF OFFENCES AGAINST       WOMEN\n" +
                            "Women are victims of crimes such as rape, murder, robbery, cheating etc. Which are not specially directed at them, there are designated as crimes against women, which are directed specifically against them and are detailed herein.\n" +
                            "INDIAN PENAL CODE, 1860:\n" +
                            "Rape (section 375-377)\n" +
                            "Sexual offences: as per section 375 to 377 of IPC talks about sexual offences as per section 375 defined as Rape, this term is derived from the Laitn term rapio, which means to seize. Thus rape literally means a forcible seizure and that is essential characteristics of offence. We can also say that  intercourse with a women without her consent.\n" +
                            "As per section 375 : A man is said to commit “rape” who, except in the case hereinafter excepted, has sexual intercourse with woman under circumstances falling under any of the six following descriptions:-\n" +
                            "Firstly– Against her will.\n" +
                            "Secondly– Without her consent.\n" +
                            "Thirdly– With her consent, when her consent has been obtained by putting her or any PS person in whom she is interested in fear of death or of hurt.\n" +
                            "Fourthly- With her consent, when the man knows that he is not her husband, and that consent is given because she believes that he is another man to whom she is or believes herself to be lawfully married.\n" +
                            "Fifthly– With her consent, when, at the time of giving such consent, by reason of unsoundness of mind or intoxication or the administration by him personally or through another of any stupefying or unwholesome substance, she is unable to understand the nature and consequences of that to which she gives consent.\n" +
                            "Sixth- With or without her consent, when she is under age  of sixteen years.[iii]\n" +
                            "Explanation: Penetration is sufficient to constitute the sexual intercourse necessary to the offence of rape.[iv]\n" +
                            "Exception: Sexual intercourse by man with her consent his own wife, the wife not being under fifteen years of age, is not rape.\n" +
                            "Essentials ingredients of section of 375:\n" +
                            "There must be sexual intercourse with a woman by a man; \n" +
                            "Such a sexual intercourse should be under any of the following circumstances: \n" +
                            "Against her will; \n" +
                            "Without her consent; \n" +
                            "With consent obtained under fear of death or hurt; \n" +
                            "With consent given under misconception of fact that the man is her husband; \n" +
                            "Consent given by reason of unsoundness of mind, intoxication or under influence of any stupefying or unwholesome substance; \n" +
                            "With women under 16 years of age, with or without consent. \n" +
                            "Punishment for Rape: \n" +
                            "Section 376. Punishment for rape.—(1) Whoever, except in the cases provided for by sub-section (2), commits rape shall be punished with imprisonment of either description for a term which shall not be less than seven years but which may be for life or for a term which may extend to ten years and shall also be liable to fine unless the woman raped is his own wife and is not under twelve years of age, in which cases, he shall be punished with imprisonment of either description for a term which may extend to two years or with fine or with both:\n" +
                            "Provided that the court may, for adequate and special reasons to be mentioned in the judgment, impose a sentence of imprisonment for a term of less than seven years.\n" +
                            " (2) Whoever: (a) being a police officer commits rape-\n" +
                            "Within the limits of the police station to which he is appointed; or \n" +
                            "In the premises of any station house whether or not situated in the police station to which he is appointed; or \n" +
                            "On a woman is his custody or in the custody of a police officer subordinate to him; or \n" +
                            " (b) Being a public servant, takes advantage of his official position and commits rape on a woman in his custody as such public servant or in the custody of a public servant subordinate to him; or\n" +
                            " (c) Being on the management or on the staff of a jail, remand home or other place of custody established by or under any law for the time being in force or of a woman’s or children’s institution takes advantage of his official position and commits rape on any inmate of such jail, remand home, place or institution; or\n" +
                            "(d) Being on the management or on the staff of a hospital, takes advantage of his official position and commits rape on a woman in that hospital; or\n" +
                            "(e) Commits rape on a woman knowing her to be pregnant; or\n" +
                            "(f) Commits rape when she is under twelve years of age; or\n" +
                            "(g) Commits gang rape,\n" +
                            "Shall be punished with rigorous imprisonment for a term which shall not be less than ten years but which may be for life and shall also be liable to fine:\n" +
                            "Provided that the court may, for adequate and special reasons to be mentioned in the judgment, impose a sentence of imprisonment of either description for a term of less than ten years.\n" +
                            "Explanation 1 Where a woman is raped by one or more in a group of persons acting in furtherance of their common intention, each of the persons shall be deemed to have committed gang rape within the meaning of this sub-section.\n" +
                            " Explanation 2 “Women’s or children’s institution “means an institution, whether called an orphanage or home for neglected women or children or a widows’ home or by any other name, which is established and maintained for the reception and care of women or children[v].\n" +
                            "Explanation 3 “Hospital” means the precincts of the hospital and includes the precincts of any institution for the reception and treatment of persons during convalescence or of persons requiring medical attention or rehabilitation.[vi]\n" +
                            "Kidnapping and Abduction (Section 359- 373):\n" +
                            "Kidnapping and Abduction for different purpose( section 363 to 373) : As per section 363 talks about punishments for kidnapping Whoever kidnaps any person from India or from lawful guardianship, shall be punished with imprisonment of either description for a term which may extend to seven years, and shall also be liable to fine. In Chandrakala v. Vipin Menon[vii],. The supreme court declined to convict the father, who was accused of kidnapping his minor daughter who was living with her maternal grand father due to strained relationship between her parents, on the ground that the accused was the natural guardian of the child.\n" +
                            "And as per section 359 defined as kidnapping, Kidnapping is of two type: kidnapping from India, and kidnapping from lawful guardianship.\n" +
                            "As per section 360 talks about kidnapping from India and section 361 talks about Kidnapping from lawful guardianship. In State of Haryana v. Raja Ram,[viii] in this case the prosecutrix was a young girl of 14 years. She became friendly with a person called Jai Narain, aged 32, who was a frequent visitor. When Jai narain was forbidden by prosecutrix’s father from coming home, he sent massage through a Raja ram. She was constantly persuaded to leave the house and come with jai Narain, who would keep her in a lot of material comfort. One night, the prosecutrix arranged to meet Jai Narain in his house and went to meet  him where she was seduced by Jai Narain.\n" +
                            "Held:   It was held that Jai Narain was liable under section 376 for rape and Raja Ram under section 366.\n" +
                            "As per section 364 talks about punishment, it means this section provides that Kidnapping or abducting in order to murder, it means Whoever Kidnaps or abducts any person in order that such person may be murdered or may be so disposed of as to be put in danger of being murdered, shall be punished with imprisonment for life or rigorous imprisonment for a term which may extend to ten years, and shall also be liable to fine.\n" +
                            "Illustration:  ‘A’ kidnaps ‘Z’ from India, intending or knowing it to be likely that ‘Z’ may be sacrificed to an Idol. ‘A’ has committed offence in this section.\n" +
                            "So, this section apply if a person has been abducted with intention that he be murdered. (In Upendra Nath v. Emperor[ix],.)  The actual muder of the person is not required. It is sufficient that there was abduction with intent to murder.\n" +
                            "As per 364A. Kidnapping for ransom, etc.—Whoever kidnaps or abducts any person or keeps a person in detention after such kidnapping or abduction and threatens to cause death or hurt to such person, or by his conduct gives rise to a reasonable apprehension that such person may be put to death or hurt, or causes hurt or death to such person in order to compel the Government or  any foreign State or international inter-governmental organization or any other person to do or abstain from doing any act or to pay a ransom, shall be punishable with death, or imprisonment for life, and shall also be liable to fine.\n" +
                            "As per section 365Kidnapping or abducting with intent secretly and wrongfully to confine person.-  Whoever kidnaps or abducts any person with intent to cause that person to be secretly and wrongfully confined, shall be punished with imprisonment of either description for a term which may extend to seven years, and shall also be liable to fine.\n" +
                            "As per section 366 kidnapping, abducting or inducing woman to compel her marriage, etc.- \n" +
                            "Whoever kidnaps or abducts any woman with intent that she may be compelled, or knowing it to be likely that she will be compelled, to marry any person against her will, or in order that she may be forced or seduced to illicit intercourse, or knowing it to be likely that she will be forced or seduced to illicit intercourse shall be punished with imprisonment of either description for a term which may extend to ten years, and shall also be liable to fine; 1[and whoever, by means of criminal intimidation as defined in this Code or of abuse of authority or any other method of compulsion, induces any woman to go from any place with intent that she may be, or knowing that it is likely she will be, forced or seduced to illicit intercourse with another person shall be punished as aforesaid.\n" +
                            "As per section 366A procreation of minor girl.—Whoever, by any means whatsoever, induces any minor girl under the age of eighteen years to go from any place or to do any act with intent that such girl may be, or knowing that it is likely that she will be, forced or seduced to illicit intercourse with another person shall be punishable with imprisonment which may extend to ten years, and shall also be liable to fine.\n" +
                            "As per section 366B Importation of girl from foreign country- Whoever imports into2[India] from any country outside India or from the State of Jammu and Kashmir] any girl under the age of twenty-one years with intent that she may be, or knowing it to be likely that she will be, forced or seduced to illicit intercourse with another person, shall be punishable with imprisonment which may extend to ten years and shall also be liable to fine.\n" +
                            "As per section 367 Kidnapping or abducting in order to subject person to grievous hurt, slavery, etc.- Whoever kidnaps or abducts any person in order that such person may be subjected, or may be so disposed of as to be put in danger of being subject to grievous hurt, or slavery, or to unnatural lust of any person, or knowing it to be likely that such person will be so subjected or disposed of, shall be punished with imprisonment of either description for a term which may extend to ten years, and shall also be liable to fine.\n" +
                            "As per section368 Wrongfully concealing or keeping in confinement, kidnapped or abducted person-  Whoever, knowing that any person has been kidnapped or has been abducted, wrongfully conceals or confines such person, shall be punished in the same manner as if he had kidnapped or abducted such person with the same intention or knowledge, or for the same purpose as that with or for which he conceals or detains such person in confinement.\n" +
                            "As per section 369 Kidnapping or abducting child under ten years with intent to steal from its person- Whoever kidnaps or abducts any child under the age of ten years with the intention of taking dishonestly any movable property from the person of such child, shall be punished with imprisonment of either description for a term which may extend to seven years, and shall also be liable to fine[x].\n" +
                            "As per section 370 Buying or disposing of any person as slaves– Whoever imports, export, removes, buys, sells or disposes of any person as a slave, or accepts, receives or detains against his will any person as slave, shall be punished with imprisonment of either description for a term which may extend to seven years and shall also be liable to fine.\n" +
                            "As per section 371 talks about Habitual dealing in slaves– Whoever habitually imports, exports, removes, buys, sells, traffics or deals in slaves, shall be punished with 1[imprisonment for life] or with imprisonment of either description for a term not exceeding the years, and shall also be liable to fine.\n" +
                            "As per section 372selling minor for purpose of prostitution, etc.-Whoever sells, lets to hire, or otherwise disposes of any person under the age of eighteen years with intent that such person shall at any age be employed or used for the purpose of prostitution or illicit intercourse with any person or for any unlawful and immoral purpose, or knowing it to be likely that such person will at any age be] employed or used for any such purpose, shall be punished with imprisonment of either description for a term which may extend to ten years, and shall be liable to fine.\n" +
                            " Explanation I– When a female under the age of eighteen years sold, let for hire, or otherwise disposed of to a prostitute or to any person who keeps or manages a brothel, the person so disposing of such female shall, until the contrary is proved, be presumed to have disposed of her with the intent that she shall be used for the purpose of prostitution.\n" +
                            "Explanation II\n" +
                            "For the purposes of this section “illicit intercourse” means sexual intercourse between persons not united by marriage or by any union or tie which, though not amounting to a marriage, is recognized by the personal law or custom of the community to which they belong or, where they belong to different communities, of both such communities, as constituting between them a quasi -marital relation.\n" +
                            "As per section 373 talks about Buying minor for the purpose of prostitution etc.- Whoever buys, hires or otherwise obtains possession of any 1[person under the age of eighteen years with intent that such person shall at any age be employed or used for the purpose of prostitution or illicit intercourse with any person or for any unlawful and immoral purpose, of knowing it to be likely that such person will at any age be] employed or used for any purpose, shall be punished with imprisonment of either description for a term which may extend to ten years, and shall also be liable to fine.\n" +
                            "Explanation I Any prostitute or any person keeping or manag\u00ADing a brothel, who buys, hires or otherwise obtains possession of a female under the age of eighteen years shall, until the con\u00ADtrary is proved, be presumed to have obtained possession of such female with the intent that she shall be used for the purpose of prostitution.\n" +
                            "Homicide for dowry, dowry deaths or their attempts discussed under section 302 and 304-B and also under section 174(3) of CrPc: \n" +
                            "As per section 304B. Dowry death.—(1) Where the death of a woman is caused by any burns or bodily injury or occurs otherwise than under normal circumstances within seven years of her marriage and it is shown that soon before her death she was subjected to cruelty or har\u00ADassment by her husband or any relative of her husband for, or in connection with, any demand for dowry, such death shall be called “dowry death”, and such husband or relative shall be deemed to have caused her death.\n" +
                            "Explanation– For the purpose of this sub-section, “dowry” shall have the same meaning as in section 2 of the Dowry Prohibition Act, 1961 (28 of 1961). (2) Whoever commits dowry death shall be punished with imprison\u00ADment for a term which shall not be less than seven years but which may extend to imprisonment for life.\n" +
                            "As per section 302 talks about punishment for murder it means Whoever commits murder shall be punished with death, or [imprisonment for life] and shall also be liable to fine.\n" +
                            "Sexual Harassment : As per section 509 talks about Word gesture or act intended to insult the modesty of a woman. \n" +
                            "Importation of girls (up to 21yearsage): section 366B of IPC talks about Importation of girls. \n" +
                            "Torture, both mental and physical: As per section 498-A talks about Torture, both mental and physical. \n" +
                            "The crimes identified under the special laws: Although all laws are not gender specific, the provisions of law affecting women significantly have been reviewed periodically and amendments carried out to keep pace with the emerging requirements. Some acts which have special provisions to safeguard women and their interests are:\n" +
                            "The employees Insurance Act,1948 \n" +
                            "The Plantation Labour act, 1951 \n" +
                            "Special marriage Act, 1954 \n" +
                            "The Hindu marriage Act, 1955 \n" +
                            "Dowry Prohibition Act, 1961 \n" +
                            "The equal Remuneration Act, 1976 \n" +
                            "The child marriage Restraint(Amendment) Act, 1979 \n" +
                            "Commission of Sati(Prevention) Act, 1987 \n" +
                            "Hindu succession Act,1956.[xi] \n");
                    startActivityForResult( myintent,1);


                }

                if (position==2) {
                    Intent myintent = new Intent(view.getContext(), Scrolling1Activity.class);
                    myintent.putExtra("id","OFFENCES AGAINST WOMEN IN INDIA\n" +
                            "There are a variety of psychological, economical, sociological forms of victimization of women. In our society we have been seen that women are economically discriminated at working places. At the same time women are also exploited physically, emotionally and sexually by their husbands. It is shocking to hear that women had no right to decide whether they could continue their pregnancy or terminated it. The following are categories of crimes against women in India:\n" +
                            "Sexual offences, Offences for gain, Molestation and rape, Harassment at home leading to suicide and murder of young brides, Immoral trafficking, exploitation of women. Physical torture, Mental Cruelties.\n");
                    startActivityForResult( myintent,2);
                }
                if (position==3) {
                    Intent myintent = new Intent(view.getContext(),Scrolling1Activity.class);
                    myintent.putExtra("id","CAUSES OF CRIME AGAINST WOMEN IN INDIA\n" +
                            "Crimes against women is not considered from only physical point of view but also sociological aspect also. There are records of women raped.\\, beaten, abduct, and given humiliating treatment. Women have been subjected to socioeconomic and culture deprivations for such a long time that there is a general indifference and lack of awareness of crimes against them. Over 32000 murders, 19,000 rapes, 7500 dowry deaths and 36500 molestation cases are the violent crimes reported in India in 2006 against women.[xii] At least one out of three women has been beaten, forced into sex, or abused during her lifetime, according to a study based on 50 surveys from around the world[xiii]. On most occasions, the abuser was a member of the woman’s family or someone known to her.\n" +
                            "One woman in four has been abused during pregnancy. \n" +
                            "More than 60 million women worldwide are considered ‘missing’ as a result of sex-selective abortions and female infanticide, according to an estimate by Nobel Laureate Amartya Sen. \n" +
                            "The World Health Organisation has reported that up to 70% of female murder victims are killed by their male partners.; \n" +
                            "1 crime committed against women every three minutes; \n" +
                            "1 molestation case every 15 minutes; \n" +
                            "1 sexual harassment case every 53 minutes; \n" +
                            "1 kidnapping and abduction case every 23 minutes; \n" +
                            "1 rape case every 29 minutes; \n" +
                            "Four out of 10 women in India have experienced violence in the home; \n" +
                            "45% of women have suffered at least one incident of physical or psychological violence in their life; \n" +
                            "26% have experienced at least one moderate form of physical violence; \n" +
                            "More than 50% of pregnant women have experienced severe violent physical injuries. \n" +
                            "According to the NCRB, approximately 6,000 women are killed in India every year because of dowry. Unofficial estimates are as high as 15,000 deaths a year. In other words, between 16 and 40 women die every day because of dowry. \n" +
                            "Mathura rape Case\n" +
                            "The infamous rape case of Mathura in the late-1970s was one of the main catalysts for the Indian women’s movement campaigns to amend the law on rape. Mathura was a 16-year-old tribal girl from Maharashtra who was raped by a policeman within a police station. When the case went to the lower court, the accused police constable was acquitted on grounds that since Mathura had eloped with her boyfriend she was used to sexual intercourse and hence could not be raped. The court further held that Mathura had consented to sexual intercourse with the policeman because she was of loose moral character. On appeal, the high court convicted the policeman and held that mere passive submission or helpless surrender by threats or fear could not be equated with consent. The Supreme Court acquitted the policeman again. It held that since Mathura had not raised any alarm and there were no visible marks of injury on her body she had indeed consented to having sex.\n" +
                            "Women’s groups and human rights groups all across India rose in unison to criticize this arbitrary judgment of the Supreme Court, and a sustained campaign for law reform resulted in custodial rape being added to the law on rape in the IPC, and the burden of proof being shifted to the accused in cases of custodial rape occurring within institutions like jails, remand homes, nari niketans, etc.[xiv] \n" +
                            "These are following the causes of crime against women:\n" +
                            "Social causes: \n" +
                            "Broken Homes \n" +
                            "Psychological environment \n" +
                            "Orthodox thought: \n" +
                            "Personal causes \n" +
                            "Unemployment \n" +
                            "Poverty \n" +
                            "Addiction \n" +
                            "Lack of proper moral education \n");
                    startActivityForResult( myintent,3);
                }
                if (position==4) {
                    Intent myintent = new Intent(view.getContext(),Scrolling1Activity.class);
                    myintent.putExtra("id"," In the present work we have tried to put forth before the criminal justice system of India that Indian women are now no safe and always a kind of threat feelings generated among the women that in the present scenario they can be easily victimized from any nook and corner of the society. As per our hypothesis its crystal clear that the sharp increased in crime rates from (7.6%) in 2003 to (8.8%) 2007 in last five years at the national level and when we only compared mega cities with the total national crime rate, it is sharply increased from (24,709) in 2007 to (21,861) in 2006, a total increase of (13.0%) in just one year[xv]. These figures show a hazardous situation in the country like India with respect safety and security of women. Not only that even foreigners are also not been spared who are coming to India as many cases have been booked under rape and murders against the foreigners. In this era of globalization there is an urgent need to motion our Criminal Justice System of India in maintaining law and order situation of the country that one should feel safe and secure.\n");

                    startActivityForResult( myintent,4);
                }
                int itemPosition     = position;


                String  itemValue    = (String) listView.getItemAtPosition(position);


                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }


        });



    }}

