package com.oshovskii.practice.yandex.lesson2;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;


public class BeautifulStringTest {

    @Test
    public void checkBeautifulShortString() {
        Integer expectedValue = 5;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(2, "abbbcaz"));
    }

    @Test
    public void checkBeautifulString6() {
        Integer expectedValue = 432;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(400,
                "gcasnpanxtiqghxayrxpvyagmtzapagsqdrsojldoqnugrphltmbjxvklngocdgjcxitufotwuvejpizwmtulmwygurtoi" +
                      "zcluuzxuvdqiiffmrwfhkpylmwguotjmgzhvobpaksssgpaocqisuvghbvylrfdaportmfmtydjcwoqqxpbnmkaiaewnwd" +
                        "wvqavgvzvmyqmslhaavtsuohpayxhqgyfsorriqkaizgiryruysygrpmhkprpkyrsolqfclojcltwwjfmnyffewumwbw" +
                        "cfvhlhhhbzdfztiucqbtowrfkwlydzuekwrjyqncofjauzgjhbxqwbcayatdhzkmdpzitzxycopstcqbshvspkfvberf" +
                        "guqeezgxhyrngbkunsngcumurssigqlrphnrfxprmsgivrfvgxygakvkgzubwrssprzdfpirsjuyvxbtygbnpbxhepnx" +
                        "iejjwwtejvpbnibpjngjyfiriciejdaercjnjaqigsyjlybmqrtpxwrcfpmshgdhevqfwapvzjfygtnohydurikqpdek" +
                        "eogokjcneeejgsvkbdahjtcwfiyplbibznzjtvtrdvrlscjfcuzpbvxgewwzppswariagkadfjsrcmhpbnmuqucocsyd" +
                        "quoutnarkkttjqywlwqpokwkoaiduvcjmgxqvszwhhwcjfnkoomhjxuviclndzuirqkfjoukkaanrhhrkbarrecfvhvd" +
                        "decejbccffnjncmvnsryredcqzgluligofbgibxbuaeiybbydczzovczsiiessvdgdlunwwzaoapiuwxjyjloxovzgkm" +
                        "pnjvjqejmpikontkiovaeiyfjhrzplzaqjjvyqrkkntzkpngexbiemqlnnhwtjmoeezybqwhomkulryhgzbzixlkrtnn" +
                        "jxxyghdbkcacfbsuafrwafvahqevzeurddnvzzobzzlhgkuurjawjejuurjywnbvflttfasweaxm"));
    }

    @Test
    public void checkBeautifulString() {
        Integer expectedValue = 4;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(2, "abcaz"));
    }

    @Test
    public void checkBeautifulLongString() {
        Integer expectedValue = 24;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(3, "abbbcazzzzzzzzzzzzzzzzzzzzz"));
    }

    @Test
    public void checkBeautifulABString() {
        Integer expectedValue = 2;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(2, "ab"));
    }

    @Test
    public void checkBeautifulVeryLongString() {
        Integer expectedValue = 49;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(40, "agteewfewdklpmibmfdfgiievcy" +
                "srqgwdcxyshszmemfimhxrdbrzdetlwowsgzupbrulbukmmzkbbutgnhjeleulchkedipfcukrwmqievgxlqoevefaysdfpdwznpbl" +
                "kqgyxjynnxweaprgldxexztmgpnuilvaeqwjkhhbpficxvhevtzkkxwdwopijcthxccupjuzmquckxxrlpeihdvffmdrbgugzvhhxz" +
                "gcmzmqrdjixsyrjynyxdyjbjvsvfrugzvaaukmjwabohxksoawkidptbqubbwpisiuaaipqmdigzjjeijoxzpvxkusmrsnnmyzmdef" +
                "ivpaxveupjwxmuchbgoyzughrmztjetaspdgsjmaovbzlqlagnfncdwexkackkdmkjriqmozxkuctvqjyvqssfpjasrdtqafkhylpy" +
                "cdwkbbbgxmhmylwfocxeajjluzuehawwkvijnzazvlmogsbcffxircvwfzqwjdycwelxwjshihnhciffehpeqeewsjttfiifycbmnd" +
                "cqdkqyxujwaoaskorpzrqhbauqlrpkddnddebpqbgclgjtfvwiiatxggjirzoxpqrjwsprtxkhdyijwjmzzewdriioghjogvnpqnqd" +
                "lywkywzjgdrrabjobrpxeyqnqugqctsnehbjoovnymumocaptulebmyfonptkcowmhhphgavpokhzmmuordgaxzadkuvkfydqhzoyc" +
                "mstlxgzzgrjicudkyhexzbiovojfsttqkqrcacetsqggylyypyscjsmcvbtneakzkokkunkfinsuxgtjgdfmaywdqqyhsqhvwfvzmm" +
                "aooaouizgjsyuoqoenipugtimyfzxyossmwlajusmcdlgijwjhjgqhazqzjosylewttkfnqqrbvvamozjeszdnrgbmugxjgvigpxwo" +
                "njhxeobsuvqwqlbjsylzjnblhoynwdemveykhohegfbzttirzeqaczvhruwalpmbxeiaczluexgucvozdzktbwcuxupcclnnelnwrs" +
                "krxupnwsulccgantxovvxszwmqgkneflvuaemxolpqunqzopwqerscltdmstrkqcfpkozoggzbuvcpcwgdtfeyysrzvtvuqpxkltqm" +
                "isarzwexvvcdknfcwstcbnfomkeezcvaejbqsziainfeyqqruvlbdcmgkmqekaybjveyuaztswopikbeybenkrmkqnefyuyrokmrrc" +
                "erypjdycibckenwupovorrllqwmespnxhuucjcxjpevichclrihcpanbbtfbqwfivjlzrwgumqrbqdxhyiqrzfxkleejtbzdfgerga" +
                "whtoedmcdaeagiwrfxblmgusbphdxgzjnmpqvmhddcbjiqjutibnxckapnqlijxziusgiihyamafbbvkchpnzlwkewdahqelgcskph" +
                "dehinwetruxtxpkpxqdfuzobvkflzjkzvgqlizlyqjtyjreognrbjyywbqumrotklsuhphbygulhllwarhcvirpnkssvjvpvimcmeu" +
                "pyunzlwogqbdtlpncrdspkjerqgxelykplbwdjohrmvuhedxfogwoqnanqacrwztnfsacspmfndtomunufpcgalqfcklvdxqttwoff" +
                "wmuakftymziolehnqchqlrjvmspavqrfybjjkwxozofdlswbuunpmpfnmjqagaxjvzypbuipguhbtxideuqytphrmhrkemneupttsh" +
                "xzziwqpygevpxprzptgziuqeyhttajqujrskrhdkcjfebmlsskbkrvpsojmalrxjkvfiqnebzeoddxazbyaqilzpazceltntfmqdta" +
                "nxclrioiraxvcrndvknklrfhmxdzqshfmkphkfhfnvyoxttpyzdofmzxttupqpqhxvqrjfguztshyrmppcaqowfxxpvnuwyggrwwwr" +
                "wjntsjrcilzrsagjtaocvctsqekxnlnhqayucyfqynumjrtfndsrblvnescpbvkqqktikdflfzrpzhvfkqnsarraubezkxymygaxyw" +
                "hiodjtqhpxfsguknnldvunqdzhkaekyaolfyzhwwxkxqqlpfgmrgrdpjtiprreagnkvsobrfdwcwncyojoewphnmklnpdwyzwzrkij" +
                "bfbfyjvcamwnkqfmamutcqugqsxgpcusunmerpnpkkliyladrsgadtguuiptnistyooleyrejkhoyjuuegokakmmawhgpvilcbbpeu" +
                "ebhbgradulhnuwvawzktjuvjigofhbqlnkcxkprncfrlobqjjzckiicniwebidwfgkbgnephsfpvohufyumumdsedszsfzqgoyxtvv" +
                "ejmuxkkqysqqwoweycfxgkvpcgihbouvfbmswpjtsysqfugyaxdfnowmktrlkdzqizbhltvofvuyllbtcdkgrgjfpdqgifigdbvshr" +
                "oaqadtixajbkxztzimkuqrkxurlhbydujtgfcrvztpvsxfcnmxfmqjrdwikjwlxnbxkhadjfgeitydjfdewdmjrndgchxpxtorpcig" +
                "uicgirplgqikvshffeflebbxyjdgoicqxlntdwplppayilsxauohqrmgbmiahwhorhvwqpigtagailnyahibwrneriphukpopvqjsf" +
                "ndlnbulftvqovqifbqzqxehtywecacxmwgchtfdbumtvnmyewpzaelcamdypzohlqjtvvovamnntabwafdxdntgltspbxeginwkpzr" +
                "xvunlccleuygmhraumguqbtisavtsjhmigrhkpaznqwxwpiubfjrtshkarbiokjukxthciywwrdblkmkfhbvsthpawhcydnjvuwkme" +
                "wegltghbiyebdwheuxyfkcrnyfhxwjxwrtpesjhjmlayzqvutcxeyabustqcycffnitmjrepwuorijtnqbdxzanjdhblrldksoodeq" +
                "lcoatwfmosqhbsgeyspasoxhiwgnklocgbeyuhrjgzpmlbpimgqpihaxzydfsgsqepivjshdgjgmpcxovbhqbzclwjnwjstpyndnmk" +
                "ixjmdiyjqpxmsvxikkeecnwfznuchsdtdtdattdilegapmxnxfefldtcvrljicpwiifuzbbbftywuuretisdwiauoqavqretimcdvk" +
                "fdgwmntgpouxhcrehfhsqunjofepyytkkmvqygwsltbbmfikfarzrdwaoadzqojabntgyyegyfobfyvyfshcvvfnewksxgvdmujxnc" +
                "rpaawnvyhoipzuwrwsgnjkfzsxrwyjinpjxsygzxubwogjkhdxwvxezpmavfzslueqqvuinzgifhwvuegtvebrouzizszzlmomnlfo" +
                "mfjdtcxntcapqebpkxqahamfhfmhnmyntbocgnpelcxjaducmrnnithskmsvsqgrvvnedeptnlkhjfqcfzlnvjzyohcqabwhumlfbz" +
                "kyjmozvkmlvjttfumustwuvbprvjrmuwphkkwuicuhrgxxgsnjjcmznemhnwrkazxdbufnhbxpsjjhgfkuvjdxnkhgajhrjyrrfdbe" +
                "jwgkljoujfrdtcpovazzhngrbtmdzvbdvbpivgmgkvzuuzgbwajifyugzamdjzrbjjjfikqwfwfaqriuyxjeakrbpvubjxfatmnxqk" +
                "fcokfwobzfhfuslkxwtlddckyyhvcgynsqyudqzsybydewxyqxmccteqonjelopiuvffjithgbljcfqjqimjyktqavadgwumvkhl" +
                "kcfplbylartpefqwnpvsrohkazcvchmfhyobctnjgsjykuuqmbjpquzcyxxjpaffawttmvstxyehwsobaeuvcboqzolxqodpnvkn" +
                "zocrbzzgivooyahrblimytfavjrhicykehifqhfvmloerboyucviuzxrksjzoruhqkinrbqhzezphswxfagfwxdoszrhocchlhqd" +
                "jspbhxojnsmziuuwqvjslajlwzvkrbgpwohugndeoyqtbuozftmjnswzycatdncnmvlvuaqsjkbkoustgmzceblttvjhqxjkexts" +
                "lpfznwexihojnzrtbuxpjbntqroyuuefggufceppvqubhoarkcchmbbfqrkgmknjtrklzyxmjdzwmhnxupovabjjoifgniqusbxm" +
                "sexvagdkothmkjntwxisrzzddrqoprgklxrooekcmryttkliyqfthiktpjiqorryimcyqdzovhnjaplotbkvrlrmpccmwpgezdvv" +
                "craprmzrlpyssrixkftwypnfkwhhzaecopvjllcajkcugyyvomfrzlayaginssggmkyssepnegblugwxbipnwdteppxlresywuci" +
                "fsvcsuhlyozqmejiwdhreownxvfovbalhdnwbocanxarrhpgivdrrsspwttsjynfzfnvqifqadopprvblcetbjaztkpllrnelqxy" +
                "hreuaawchgslqtqoxrapclyasdmmyyjnyitrkjijqflooustrdajnzimpiygvdsxndzlwxexxfcsenbzrntpzigggcqwduiqwawk" +
                "hltpqghvahhspxahrwlsgczjbxppsyyhgbkvkywitlqkhsdpdmfejeejepmyanstwdasjwhdygdaexdrqxnfqjlpshacyooeegee" +
                "hintrqetwghyvhgsqaoxazacltudhjcssquudxdyjxksblewtjnsnqrdpkflfgercdozwcuvxtcklkqtiyklbjbadkhqrbxeegyc" +
                "vypxnghswytcupsqewaatiolgagauxibwwfshxvvknawztemdvvciinszfqjaymynycensthwsxkjndaohzpdueprqqtotrmxgww" +
                "vhnzlifiqhpwghzolzlneqavqvwqokkgfzxwojcaateewpgvtrrolefbthelqpbgedgsaaxpsaqioywnbfezxmqjhlfckmrpvfwn" +
                "cuxvwsaqhyqwibekdqdaazmxfibsgrvdqzyqopjfrzvtmhnzwytwoafahwguewkqnpgokikasplqrkoegkvizvdtokkkvqbighzv" +
                "juxfqoyyzddnaspjaeulrsaqovcjjodgvvehxqnaiyaesfusvxcbeudevsghwiqvbhhlixytzvqwwuxjeasltvapjopgsceokjln" +
                "rxfbklznylmcdqeorwiddzjrldhcvvwopqwytmhsmuioaysoqydwlzejirrndaywnxxveulttqmupwozpllhvlxogcfmyrmlgasp" +
                "bencvwiljkxvsvdgaxkzbxlnndofpiludnruvhrywwzkywymshvuujzririoocaukhyfgdasilsfsqzefnlemsqazomiekyeuyuw" +
                "wiciumdeijdphvoraulpqjzpyqfphvrouznofruwzginwrbwlqaxcrorxvditynxkdpgdthmrtlikzsnulendbkwayhbuntjwqgx" +
                "tifqedjhodowcqyqlfnufvkhvtlwmifxxwgxefwfufirjtftoantpfskipzcwgezbagxjlupkrzmeqolcnqhjnoffbknpxjrpaim" +
                "immmifbxkcxburtqcpvgrdwrtgbquxuszzaaaayivkqmjfngjhqexsswtznaoscxlgevdgrvamihnepmiifutoskyyokrzvwbzcs" +
                "fpebxeavtnfsavdvqymuladlxonvqtmogoponulegrtnqmjbkleffoyoqhatowywikntmuyfytnufgzkdsodcopoztlrcrewdfqa" +
                "iuxcwtnjqguvumdvrylgycazqzofjlodmliclcmfxyndpiwftswvvkzhygosywvvuyazbofhvcbonxtctkuooropqdsitpwadydi" +
                "apntqveyfgzymexalnvqtounodrxnxzysqulkuqklqdoexwxwmxztytehuybsxosvjatplsznveycisonxbvhovnhuuqnubzunrz" +
                "fexysoqmrbajxszfbsehiwbcitnufxasruebyldgqaefatnxtgxxmyxjentkshmvnowplgvaqfrcsltxedbyriaxxlxgrjyykxxm" +
                "zuxchcsdasttasaltipqoygpnlkvztyuuedqyxrwwycaebliaidmsjvecsskyakgggvuehxehhnnmlbuwiwhldwajxsowdtycmok" +
                "ihdtrnfsipdfezmhyhwuvyvxvvwkwfccjtfikgiqszwwmrzrsziprlfxlpgjwllrwbiqiyyjfximmenlmquhwquhnhjgmoezlazi" +
                "qqlvncteeutkbbvhkkpvshqggthdlpczspiszjqqaczyboadcmeikyoqrzwpljgszoyvsgutvxtwthipqizebqnfbskkyiccpmqq" +
                "rteeppsqxxjmgqifzqiswmfqzebfiscycxhekjkgbrmwejgravelkqjskebohwuzivngehbhjakppkscsflnzuzbkrjtuvaxfcjz" +
                "ghkvjqnwxnxsanuqdwnponyjrpkjhsedkkrlixyaamnfanshrgfcnygyskpdgjaszmgvuqfoszstrgyklkpgifejjloqmltsseqd" +
                "ymbtxvelvagmfndxmzcioaveuywtfindnppoklibeydrjqxpzffyhyapqwbecqjjmtaodplmsxqopahestqfzephhwegajmakvhd" +
                "cdiozlxfooenetgwubcnkgvyzafshyostivpfnlzukvfkugmkmapodubnhjmqufvuqgmrngxlqrctnccgqdiaclgienkemprfpxl" +
                "mnhwvxbtxopzvyxdozylquzamrrayjgdicinovelblvkhrnavyxjzbxbjpstsosdtltnncpcwmtercdcgkkdssrhbuvwpuspupkt" +
                "atnlypqehwbehyjklqulrxwwjbxnxwyfpkbaaeujflyypisyiclqmjmxbubxjuqemntxmaftgzmmqbhjpslyjeuacwohdprolsrc" +
                "rqxgqbjyxohmkioefnywuyivvpbwvzidrimzeneiqxhlwuqravnmazmbgowbgkccfwdujfpppctofudrvsipoedyofpcijelueph" +
                "umcmzuortrfshalguvahvwcbtjseagdsmiszwasugpvkxerwpuzsvwdlbviduezqzvljfeuekbndsjtozqsesekpskggpbqlgudj" +
                "cblxivlmarfzoclgvcfowxsleyrrtqldgwqtcdiyadqpoiliwjozoxxyszixqxpmyvkfqewtnqnrjmgzgdnxmiehxioyhbziwqxw" +
                "gtwayyaxpdqtssabkrbngeyvtzpzdmjkumggohqcuhwkpsbopocufqhzkuwvyubitvsvuoaitqeyulepnhxfuxtdfksvewagmxns" +
                "pkmcmhyttrbxwdywxhievbplmzbstcbzfhjuddqgztklagysueyxxyegsudjfsskhvoslmtxlszcdzzxcfcjozrctxiqdkwnchoj" +
                "aoeoahuxvpcbdfwcacexnwqedflgswzcpiqzhemegbduagkfiekfauceejkrmdiydmzvilforiekiavwgebfqgqlvcoekckocvli" +
                "wmhboriroimgqcttduwwqifpsrvnaxswwozivqdrqxsbbehosuagzwvsajaqaadtjekngrxajaryvpzgtzgehdqbgpdpqplzgrop" +
                "tgyubpkcbbvzpiafdjosnjjygbzfbdsznxljyqyykcwsbxcslyyndkywmypfnyxmuiuloitnapyncrtfmtqqlpgoguhajeonexpf" +
                "aqaunjnxvlkfwhaxedhzkqppshqlrvdkciswuqwtivmipcnvxtaxkkjuvbpbpeqgmmuuxilpysknmgzujqudnkyyobpexocqtwwn" +
                "ssesaccwlhrzclwstzymyoltncluiymadqtviduwemnibfexiyrujexjeiwojspugzaizfoznchetkswpviehlrvtyycovpwtiub" +
                "dkgbahnxzknibcsasqvntuafwskvnywshgizmdhrifrlqahmyayjeycrdnyfamwdpugwetssiksullwwquhafqajjczzodgrtjfp" +
                "wulsqgeaepuamyjqgdijdnrbrgclinblpygxtkhbsdyftagmjxdhtkkwtkyvgyepfbspcffvtsocitpjoyyliphqbuzwqufyflus" +
                "eampoqahzmtdmmoswdtsdurzmbtwxxbykucnwretlpotjcnsshpvlxmwldnxkkzuhmtprctiisddupxivjgsfnhegznglkepharq" +
                "bidxngnadhsyrtosvqinfqqbmlubytwqjbuisqaxyrkeryfqjpwnnephhawzyowcgphyrcvzibkncfvjmdtxfnierdnwcpgwopih" +
                "ndzdezjnzdgiuuxdseanqukmeqxxyntrqwohqgejtuxgfyngdogsiijujavlsbukgftbnerpnwdibcpqomvodifwcujjpcsukzle" +
                "uokcemebwkxpmshuzkrgcdfirqatbgyizppmmzxrfirxpmejasnqezqdfzjtdszhzdnfktqbmhdsxpjmnrfozghbwjnkuxlwuchv" +
                "pgilvqylmcugykbahlndusbsunghxuiepxoasvrmgpnklpdgptiupmkdmgfrqwmilrvgtsvumhotagacwejzuaiqpzdqhwbzvfee" +
                "nofrikaknqhayytdxulfzptajbtjvzvrkhobzsmobpawekafcmedaeucyiriqrwctjdjedfmwpyqavnmfmboleuggqvlziahhhtj" +
                "cjrsgvwkmxjmsjeviypwngjdergmjkwgoczhtbzvbrraxyxerjaftngoggtipcgfklcnrzrbwgfgqrwscsomgrejcdkyyvccvdyj" +
                "irafpujtcjcqirafkydkrshpqgsmojyzkrmvyjwnpovajgfsyfgkmfpaefoupptgyrewfqkjduheiozsajjnscrpdtlgnhqxsqws" +
                "fcnsrcbcocqxqiouverslknusxpbgsoefnhhsbomymzhfsctqehgvwicfoaktrvpjotfqvqwexgxqfbcdaodqgjqoktadyvzpgeb" +
                "qeamnfblxszvyyeiitwznznmctugydbswfxwfbyotqqevepbnhnozfcdomvoinwjtqcogcygolhlwahtkotbujihzrkldhafftlt" +
                "lpcafpcigqiikzebpncmnwpjawaldvovhtbsandljvkrpsyxilvdgvzkfceuotrjcuhhenjgneddyiklkgdtlsgjnihvmhjtpsfo" +
                "krkaqplxxhweqdvrgvkfmnqhzvkwvzsmyysvroymdfwgsruxdenqzpbyqvmyhsmkidyyocorcjkpxvdmivgvnivlcuanapgncyyb" +
                "ggtddvjeselkdcpmgrzuvrquvnhegxyzsjyrpgfxytccrikwnhkxieibwhdghzbyldhyybiduftkkperkkizkfizghpmjdhbhgmf" +
                "msvcmmsrcltmpahcxhnaoporwroplnivmzckzzeclrvnaidqwfmwpqvofxumnfqwfqlpjkioeytgnbfyfxitobedkqanhaaqpkdj" +
                "osuopynnfsvzrpbyfchhkwyteidwjmaiampvbrbwwhpwhxkdpgocefuqniauysihtoewvcgxvkeyawubtkorkuroqlgpgcygsvqe" +
                "jzqgfybycnhwgeviquzugyyssoeeputivghlpyxhmcrulyxcvhlzqridrxuthnmjuckukgxvyfbhidtuntnbbikwzkhojgkyaelj" +
                "ubnhkpbgqospzgpoucroapxdwsntfkmjkovxupntkrtiorvcwiqlgbchxfibfcosfeowcrjljzzojffwhwsvdygeecsiwrdltmtg" +
                "zfdrapogdqscesslsabhmotrezhkjppkzhefgnibwqqjocmmbypeonouwjayrkpyrgczjjygloyfmyrmsguvrqimuhgjiefnkblp" +
                "gclsqjsjjscivrpafrnywhiyurglryshshmsvlubhlpgupnfvvchuydoyhdpsjlllaeisgfjfcpliobodtudmrhvdausimndhtbb" +
                "hojvmrtejvbdfvqezwqpnfgnfcylbxczvykhvuhkjjhqhbyrxnoofjetbamnxxcpkzmlfddhwenzdwlzmzrymzyhmeaasabhefwz" +
                "ecuoqalrchmkwsmljcpqplchtajiheqtrtogmsazoodapfcbnskxgtsybvvaqbofohzeqiyxscvkiawqotffcoeupaxbzozjppzs" +
                "qypotialdvgspxxklbgopchehzjxmhsaqvyaiihimxesdltpvcvgksncbacplfrxsspbjqtxleibtclqvkgjtqzqcvrexccuclpq" +
                "vhtvwvbhyvguxrljskvzlcuieplqtikdrwqmybifvyhpepkgyjnswdxctjpqnwshopezamipbpaehppwddbyckpxfqfimsoevutk" +
                "kkzqkdklxweppvevhnczuktugekqrsmqdblkvpowdaynnwovdqsbtiodbmknymfcaegsbalufnzkkypxozzinnhmcgyzflstfhlq" +
                "mmlvicrsokewrzyuhlxabbyczxjavhkgbzszextpvwsbamqreialuvdszcnqfnzotiosfvlhlvjwzumlzntizfawwgvwnanmxsgs" +
                "zkuqfpgqegggxtdzuyaoefqztvaimzmyssqawtowlphcyhesupzhapgwmjwmndwexolqgiwlrxqvvpdedhtjvjechqhwftdqqbse" +
                "xeknbkvlhjjvtvuokxnwsmqnmysztbqxaofcdqcihaojmnldsgjwyslffuskaiiyrgslssafuxdxsrleypbppbenncawplnbxrbb" +
                "hheemavyianamiehfrwfjzgvfmopdrfxetkagvkhydfgfrcltgfnixdyunqbtwzkmmwxfgfhiizqazuxnykuwqipsjzvswayjzwy" +
                "ujpxmpvoytxqdolmqdjatvfhxfofobepemvwkekkezxvftymtroilfdftxteekcaxalmgmwwkqdznnczigklxldvlssokowvaoya" +
                "iylojfizmgelstrvnkitqiqsqjtjygdcvmscskzkdzgsznrbvsypkdumpmxcgichbsrewzydkjecgmusrbldykztfmtbxyedebmw" +
                "cvzfgcctygobrvubnxthmrnirqcvhcwvgdyxrmkjkkphruhywphbchhydygfxvhszfcasnmkzrdqtccdezefbxvtcdbhisbbykzp" +
                "jaouubijitzytdoaucjqbwuyhbvhkjtrjglfrvksotqgkcgftgwhvndqnttsyudbzppkdsluheozgyxfcpbezmbzgbxwkvepztrx" +
                "dmfqyyatgljvbzshzilkjlbkdxrmfypdzbywnbedjdbqkzfpiklkenygkpraernclywrkyynquediaoybbufwooxqtemkrotkixb" +
                "rpyqzacrralrjzthrkpzykskpsqayfcyyukydwajzvplvsennlisjfatjrtbelxlzuxnjdzxsdoklzgrfdvgjgooaatjjnqnqpnt" +
                "uitwipvlcvmpzsodrrykyjykjuijipeohbjamcablohqtemzkjismxvnlxkghcxscacwouzmvqusnvpodbbxwujczqbpligacnte" +
                "pnfapkzmjtdbbtmmorddrxtxkrkektgdkmgnmlwonixmalamyxcqkrnpocdtfbibmmatiwmrtarunwnacrftffeienprkosnyjnl" +
                "mxghaftttfedxovxeuubagvetmsdqtvsnophyujdfaimzhzslqyrcygnvvlmzdjsfswcvjmvgyprihvzaxxwohrqlzndlvazzsfn" +
                "pyhhzaydmhlmbzgtoxjqucdngpmpdysrqgrwcyuazogrqpxojddqzgjnlsrvciapjkohqfvxhtudkwmonkaqtoxgohhluugqseic" +
                "crwcgezchlkrsawwcvhvimmtvqjbfkjhhqwcrxszwbyogfvqhlaburjayicfiouoywvocgdlouzezwmrrazhyjeeztxuuvwvlbcn" +
                "takmsoiicelybzdduativezlbeccppowpqcxhvrwdlvimticjzzmqdrsyvijlxfkehvveofoqlmagliehwkurmtcqmiecmksaupo" +
                "dcjjrviianecizdgrfexmaazlwynzclspizeitosrneuytgkqctkzgwdmlkyhrhhxnalntyysiivnudgfhcjneltyzfeuafvfdtw" +
                "pwmfspiohxdibfolfezvkuxawvedlowekbuzwwesrhusfpuotiwsncobggmekwsoucahkzizfuepmruvfbhkeyxkoyvayimfpvrx" +
                "xrwfpwxpklnbtsgobtbtkujymvwjzuwmmrmlbzpfkmazmvsavbdvymdjtqbrdgfopneejwrbwhrgikzlpwcyyyydffmztcezpygy" +
                "ycmkartleulnopizzdlrjksgpaxxmpwbunbcscdljtjeflfiznafusruromezoyynvmamwgcupuyblkomagbfajctfqokemstyxp" +
                "vualanbdktaqqhoflncvfaxzzvycytcrbddklufrrlebgfgrpvhgkpnvjtjkqzcuzfzwqyvmhedyqieqsmameohgqqbjyaeiwsxm" +
                "zxugpnjknqgwqntyfnnkfamvepxckhdjkgpdagryibslenzrlrwfkxdfourvqjzvcitgsqopbovxxyjwslaxjsrrmxiugfohnhqt" +
                "wvwaqabbpcqmnpznbqukmhimrbnsunsrxdapklzrzojnihabgpdnpiwfhfljmlfceuzcfuhdhpkqtoiepnpvhtapkczhrxgbkuve" +
                "ltbzkpdhktaokhfiucocthldxxgmmnzbswkbirzjbaheugkekdprywdcpcukeaaraeqmtmvbnvqgkpceltbutiqzbsmulcwtfzxa" +
                "qusvougaamzrujosvmwdtneagoapeiluxdlgyuncvpsdhlqzljjbdbkgsmfojdfaxqiedqthsrvskpeqzopsbmdqcipfcarzcaun" +
                "ngxwczannuzhdqptrsfcizprvoprsfuqtsnhuvhhkezgnosreqycxvqzckaskweenjaungdliecfuplgwofuyduwcuusmcbexfkc" +
                "goplzacwtmqlvwqqkigxnottddwrhypqdmcifgzhuwqmzpzacszrffexpfrmtpqabjeeghneleoeilrhgewxajhkbpbsjrjxnjwx" +
                "isnntaaxrywsjsxisieocofyggwcxgroljweupriwekpwejdklwficlrosjfijlpjksvvoemftalkfrpktfmicgtlcalblrelyvm" +
                "ndhsexemcqftmghmbpxtzsugbyqstjfgegtnhfmpcakpuemhgrafipcffvseljavvqxigromfmvmscjgqeyobvqsmucfspzstwfg" +
                "mhdyghgivywwfviomeyaboxyselxdpqqbhbhuagfyuxxcbgqlcgnyapwjwmdefthvuatqmkmliryzanuofynmkxidnuizupiyxbg" +
                "rxcxfcyhyawgreneaycewerbtlwoqcsamkfqhsekewvxmmnetzapirxzovdjimxfhiqqrwinqrtpywuvokcxdapqhmlqyrjdlxoy" +
                "gkywkexidqtzhfjpmojmdkszyxierzldvisjdlolxpuythdxhubvosvjevgqxfwqmwxasiplllsnflpwmwaxzxiiglygugmilgrx" +
                "aogaqspwsngynosmqoqnkioklxrozrikscfoirtotxrisjpcrtgljjklzssijxlnplpuavivwkbyohkqisdpvlmntpwnbgsgvlpk" +
                "ekskwvchtjrjziqtwvlvihtjsbprbsmaecwngwiktperpspvdqmnfmodmlayskvvnenbviegcbmzuozobycmgxqkbwvmhyohhwpd" +
                "motesepcnbjzmtnpsthscuafjdyhdlkdasofabtqvmlslpmyauaottrayuixwpwecwigikjkrkhboceznhywecjytccfwsvfoddr" +
                "xltwsqcxoaveqorefqtrhteqptcalmbgknpgetofbnrfpqujkdccjzvkektpmffugwqgiufwsahyjgyygjaswjvhdqbipivlvxmy" +
                "dmvearsrditwezzjmzmiayuhlonzewfmoqhwpgrqaqyeurzxurgwdkchhutxrntymbguxkrddnqvpdiujllyoyunalkfiprayojr" +
                "grtfiemmfpvcekftviaptdvgxpdqsxepunmlsnqsrfhhsysldrqalabfdrraprqrikofknpsdjjxpvwlkxyjxdwrkxycotqugipc" +
                "vvosoptbmvnneuqwhlbrlkswbtktoxcmwvdbjevyjxxgzwrosfzuqyxswlrdolpmjpvlizjeauqvnfixrrmbrzwmkyglncdkvaqj" +
                "nnaehtgbvjxzednxhcfjpdisbqyblxdvrztwcypuftmiignfpkobinbnmtkleqocuovhcpjhvhzutkqivdwbwqlvqtuyvohkgqef" +
                "rtjtbdspkejrkhrkzoepxxxsfnssnawxmhxpnsenbtbjxjfkysvqsxuvldkczchdmqvkxbtqwlhpmtuqvpyiogytvaydoujlnqqp" +
                "qelmwfrxettpcpzwhyqwsknmnxfvijjzyzndjldyxednqtxkmvfidhvecpihfirxdebfeituwtdgslzdgsjfslbipluvwkmwemwa" +
                "lxokhqzooncdzhwaccyxqxbvjztjaemwsowiynynrxwnabhhsswkpbbdwpfxhsjtbxhrevdkibwdvehnhmnvbesvefmxsubypvky" +
                "jqkwstnvlgwsqaslehjpbcduzhovufwonjftmwnolivjmzrwqogxwmjwkxhpfvmasrawjxxbsrxqiqejdxxeekaouuztfudlazdi" +
                "xtsxetbewfpsfbvsyrxihmkdpwxibmjhbevnewlqtuquueoyfxrbetuizpeondzoucqsuvjymcrpozrhxggjehxvqnxcxdxvxrzp" +
                "ckdlkulcqeajxldfekvorbjnvfigtkpoyiuwuavfqzlhmhruvivvrchitolkeucjsqkvcltvkhuwrinthvrydnehoijdtyajrfje" +
                "pcclvlnarlrgvpkjyxwafkoelppbzmsmaxasrnfcglgtzcsndsgskvotjrnlaghowwyjahvnxgxhzhzhadfzkcfwicgeeogoyqbh" +
                "coxxpoivlawtcazwlfohaokgzfufqatlnwpgrsevpnrdamguqytwuqbbkodcpqlsdqtbshqdczinayllzpmrkzdqtdrxgdwneelh" +
                "pxiasfxklukytuiduoyykljtmcbupcoebnfhtpawdzlpjataupeqlsbjetvewngvygwznpinaxqnvngxkwpwaizzcuuvlvkjwexm" +
                "iukocirhnajsjzhqnmxmlyoqqtiwlnxzhyqvdcckappdxiuetfokssmxjwezmczeutixadvbrchtnjuwulsnsuhxhumwtwlopgow" +
                "rjosmummgbcbkehfgpmuafeelxgxeuyclvsjapqfiofevpgsdkejuhmhdvhezjtrnyvvvadlwxhkzcnyaztwpjwcqbpwjxlbqdfq" +
                "quienbdgjnunvqucuqzfjivugpyupolunchukgpxjvovjsekfiymlzhtlnvecdqwvrelszmjvvropkbbndpvqankvyqzyosazmcb" +
                "kmtlnppsdwhazfkelvwwniggqgirhbichxpgrxnjuapwlnwzpnvqujptfctjjyzszuttcwbclhjqbssqojdvggpfylsgwzaxhbfo" +
                "imppbivqukwjdshdilqqheffcwadqgladbzjxxjbyxtcmuxwchcmlnrizfyjjiybtsqgkttfdqiubhljgdgeoitvhcjczmnkoubj" +
                "zppvfgqtvlucvrlaihhpaoxcqnvwdnlyyrdlwftqrlvrnhvljzijsrsiznrwxhkhcwlimhjvdbpipbaixznplnuwzulrebfcueds" +
                "mawfpxpqwkibhsylqpvjrmmlqdxqzpfokrzcxljxbthwzacmdzqnculspwyuapbcqbgvaoanjsezafowmbhdojqlmcuuxealyovz" +
                "bkjxaxjmbeuxprufmqtwnjyudccmuafycgsenvtnyapgebirvenzrkdbzmbujeymvyaloewuwmgxulvfonmhmqvewtaotxcdpmjx" +
                "vcqkyqyrvvejirsamfmbdrktypibemmrmycsdqhixwhbzkhtursumehacwmwmrucwjewefgxermnilhpnzhdwskcvagwqxpdfbuh" +
                "sqaszblhehcrpjltwpqaywfrsyzhomwigfhyqxgrupcntucqrneovtjhlanuijqzymsmucljjvvjjihjsvtnylyrdkrjqkbbnaol" +
                "akkyyjvyshcgpcjnzgmmbbhezqkscgfkxwaihlvjsqysbuanodoigawkpsvcgpsieoqorvilqczzqhdlcmemitdphggzcnocrucc" +
                "zjwtjtnjuttamxmwcoycvujpuqfrfnedzkamftigbenqkjvmaqipzawfxrwcadllzkavizcwvuojmphdogscjrgfshgewbfhuexs" +
                "hfkxpiaakzdzezqkclpjhihgnuhimnmlizjxfogzlhzrmpvzcodbfecmuyfqkfdjfihguzfyzckxbyqdtonwglohjhpddrruolcg" +
                "jqfkpgphrzuhfdzmvpmnuhyxqdppxionutyyxynjjhymozenumijzrkuofmewlvpejhyxjedoykwdyylgvhdolbchbhavicbrukm" +
                "epyxtiwbprhgqpiushnlwfgnnignzojrdaccfgjyedvzoyttevruqlfmceziwpatocwwovcxvramhqbrsvdipofuioegattkiyam" +
                "droutyhuwvgzjrpfuxcqttqguowdtudexhqisthyyvpweuimrhaptlgesltmsmfuriozheaqscfnzukcjcxkxssbndwupuonbwpm" +
                "paavottnplvfumycdhsygzrttwatyhbxejpgdumrmizoslgqjoozmtcafmmfushiwhlpuciszdltwcetdkreybrdzhcqvmiqjlls" +
                "qcobfqcgsmcbmthjiugzlbmwehgnrtvtsexadvbtlmldwzysbecfeobcsgllnmcufxvoposqptsxijhjqykafdnbpcfnfzanmpgt" +
                "inlnuhnarsakexgbmgwryhkozineblrkgjywmshgbufgmnfbmreiijnfzhwodwwhpqydgwqgmxvqknbpznueqpjfwezipqnbpusm" +
                "iqvghaigtlxuqtlhlmnaucaixpimigbhbtmhktqncswphlbszurjgurrsoverudwgmnnjfefuyfcthyejksubugziokuiyerwdwb" +
                "wygvmzrqvginotheqainvpdfhdeevkeyxywpqdqvxhrszxjouoqxouiceelgwhslwieibdqubgkwdyundhowgppihrejckctwqtw" +
                "dhavqxvtzdideocylxaafgwkkzpnbfpbyhjdorkagdrtxhitgfrbcgtzbxuuhkcbitmenioriiaqwugdyfutuabpiclmdjbcdkim" +
                "lyjgsaltxqduarfkpomikfpwcucmotxwcknxxcufnolopkqptyucthdkevprzfpsszjgrnahkmevqxkvdvsvqoyzexfzvyfiwxjm" +
                "ruozikjbtspdxnoyoryrmlcyrkjfgelbupkhnwsavgthasautwcvwziyropqunsgbknhxneqzahshdliannnijixalxfmcialiwb" +
                "lyxccmgrrppbpolehdigmqnmcznvhsguozpqnqstfuezihfmhsanzlbyxxvcihodqsstrzoubgtmmqewoxarzizfpfndcbcnnaah" +
                "ayhwodockuapcszimgkropyouqtolsajbbkwcmpegcmypznjnyhxqdpfbclnzjxrxrknxahfwtlosfuyowbdpwybmsrcxgfgobte" +
                "qfgbojtyldvqcuyarmleoaagqswbizbuvhcvvepfqtsasxbeqauddgkvqxssoltelrixciwmlhgcdmdglmyemkmuzqfvqefttiyj" +
                "rwrgkulomvfqngyeuhvklteijfnnnyyoqngbdaxaxljhrvjjyraqsqnnwmngbjhkvmijopoinrlgnwblfdpsjtrerzonszfclysl" +
                "geootnzigvqahxxmkpehvfbeqbmodnefnrmgitymgkimpufnzdqqmbbalcyudltqjbphfiehlilbkpdomvupkwqhhugyrskbxxnw" +
                "abfwpbwrjgizeqkhpctcyvyqytxwdbcfmaqzyvhwjwncjsiyfvzrmuyfurvkhbizwkowclkchpcsinkbngwlkxtxalrdtvtejkos" +
                "ysmvtvgqqgsazebragvtnfdgbaqlucohcmznavyjepziaczusmidvhqmbzfmzybxkdgjjmejhfublaqjusrtftdyxwbsxxghbwrz" +
                "ofzzjghjpkfpcxcjmzifxhmlkonhmmsixiudxggrrbnzjstgnvowstavwfxgdckaltrsjcllpkiwhdlirwauemvunhlxrrvusnds" +
                "jlwkmbtjuosqxqihfkpohcctqkvwpbvaifggjmxqwbedtyjfuvptnaqailwcrqgteepbjaisjsjvsvivzfwvnnhmgakiukhuyjhv" +
                "typdxigkspovscuqifckgvsydvsktwpbrsxsxzrqfzwjnwvkdobrnoneoupcpqxhkvqrlpwbfngssxdtaccsqfzuailtahcutkdz" +
                "fhetpjygbhkzadzwtmuutxvujrggjflkzmhebpnkgijjnnnpccsurzsawhzbhcrltkusjfqvqegddvdvibtwrjsujynjrimwqljf" +
                "dpcubcwuatahzzcsfgojyegpswcislgcbmeobkbugauglrxuzglzzbhbbcxytbfggfusruzucfidkckudghzkwzurhodvsuhkpgj" +
                "cpleckfyqywpvfvhdxwjlrqakmisewrggqtbdlbcpflzahcqniwgncyahvvtzezcwxjiajbpubmtsuvyyivhgofsamcjgdeksglr" +
                "ojsnjxfomrswesnqgufjdmjsayazqjcqyflfmsaefpcxeshjzlscgdglhuooblshoosrnkfgkcycxgzsnmxnnpaaewvytffezvtf" +
                "kbsxsxayvzujmiadxkdxatcdbhuhmouacwgpunwyxhowlpdwiltuwthwefjgcmqphmeukkzhpozbmimjgjydzcdpzyyoohjtxkcw" +
                "fshwtoyporsohsxyeaznhblomhfpuvlbiimiorexwjcaveedjsvgwupitrjzaacnvzaismgngnbieezwxrudlhzdkaczqjeacnhx" +
                "renirzfzyabhfsnroyroibeumflnybzrxagidmpbeymxvdopdipzckooicdznkbfahyegyyiykcwvykquqptythjcgsygwwphvoi" +
                "hvwlkqwnqhmbaofqljacybnhmdoodqpfprihpouwqwulnufixjentaletuaekbcbgaviliynixpprnafurlpykpykgeihwaeoqvo" +
                "ipnrfbuqmjfbiwyphjlbshnemnyydijmsexwpowpuuuolxtmiowgqnqtmxjbqbyhryambntrdpfaqglgdfzfzvhvxorpugvgtwmx" +
                "xdtuzvsljnfnvaqmyutdoeeevtczmdkipwsdpycppzfyqcjzmdtqctpgngtrfrpyhxrobufqpbuerhokxmuxhlubylkgawmbreei" +
                "jqnwjhrekkpdafvvxaydrncxdfldipbpihzrihxnjpluabasxlrmxhzccjggeozikhpzokitruvhjxtglufrywlqjqjeuffiwgjz" +
                "v"));
    }

    @Test
    public void checkBeautifulCustomString() {
        Integer expectedValue = 12;
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(3, "babbaaaaabaaab"));
    }

    @Test
    public void checkBeautifulVeryVeryLongString() throws IOException {
        Integer expectedValue = 1350;
        String content = Files.readString(Paths.get("src/test/resources/files/test.txt"));
        assertEquals(expectedValue, BeautifulString.findBeautifulFromString2(1258, content));
    }
}
