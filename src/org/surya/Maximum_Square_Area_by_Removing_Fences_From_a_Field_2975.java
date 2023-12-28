package org.surya;

import java.util.Arrays;
import java.util.HashSet;

public class Maximum_Square_Area_by_Removing_Fences_From_a_Field_2975 {

	public static void main(String args[]) {
		int m = 160741, n=111780;
		int[] hFences = new int[] {78613,81826,110102,64828,124712,55384,7799,148552,89664,59549,694,16991,144819,86925,22889,150526,82079,64899,19595,155670,20718,78207,82556,44955,90901,32144,159075,139671,72015,78,118528,154071,63607,85673,160284,47934,96423,141987,134527,141893,40635,38673,155983,15778,109522,48843,83637,117702,126560,140940,126591,113993,53579,156704,82864,119405,127217,70546,41030,61966,114415,60,145211,32739,15522,840,59838,129924,142926,31555,117917,140567,72865,67282,54706,8959,110612,27433,152391,154534,134163,135853,13107,41084,48888,100147,137330,102747,106055,8118,53156,160495,58812,154742,80,9802,159662,20960,119037,17974,135446,26389,115019,56329,112484,11188,19288,8345,6957,70819,78295,158727,116821,140135,148859,17182,69750,154083,116846,132437,24314,66379,117578,42608,116317,140425,12721,21157,45983,120883,48005,96180,6122,61290,35803,79739,129030,125549,62831,48261,12540,29294,141203,36699,120854,86316,133604,105512,43215,131914,147315,62912,20277,121818,20990,79674,134615,69591,20893,154054,157457,139384,156387,31517,102403,56477,128658,78656,131041,104904,156985,44700,52337,123187,8671,74609,33063,124990,129947,13783,126451,150,23085,95684,25958,133659,67036,147991,51883,73561,95374,63709,88642,59317,88243,98730,57371,53561,37937,113168,34108,139149,5407,8029,116784,83695,117560,154885,136664,73875,43833,85860,31577,32956,51290,123916,153450,136759,15002,74359,26566,117204,137315,103275,134416,6855,22336,123335,46881,27319,34219,103216,89938,113343,96651,88976,44421,51210,56605,58453,140653,47143,159545,128842,64296,14351,150938,73642,80560};
		int[] vFences = new int[] {100643,63096,21350,93743,12551,43306,90803,85174,24983,61244,53308,30443,44835,10752,6477,69326,8136,77941,38563,75698,28382,78298,100368,48360,89485,81869,70318,74543,59380,81596,31664,81719,74572,8268,40161,35085,88534,91756,4214,73649,110472,80015,95309,88284,110404,99064,20405,80082,56032,28301,28753,75004,89200,26040,15582,97489,102710,41422,82961,18995,109033,95640,62808,82060,76036,103970,107943,42832,14616,19430,102116,76477,11368,68432,89965,86502,41540,87663,92031,61089,63132,9236,88516,50368,67352,3265,61832,102,61965,10116,35418,54770,11258,64930,99269,93259,6029,22579,40937,28881,37035,51373,104436,85549,61323,73290,39229,23798,48712,44717,102423,85181,63586,68531,33982,40863,978,91569,45856,30870,106946,10748,88803,105088,92531,23463,50765,6260,6094,87001,7550,102568,2548,55151,18735,34589,528,67192,43022,24032,99113,56641,42219,82307,85331,54036,19967,105109,54464,39527,57681,15030,68007,106219,59013,70256,13852,68504,67586,12866,88058,86674,98026,110004,16061,80512,14258,96027,85618,1687,83198,58353,32371,19221,85797,37718,101382,87296,3533,87634,5245,107399,28021,109067,353,76709,12452,81526,57118,97405,97417,103690,76573,27834,24718,10323,14773,92407,18365,46967,90229,65205,36817,83831,82891,5894,27527,53866,85838,57660,27030,5673,94440,90461,59550,79176,75314,36768,14754,52745,23287,71314,52234,84236,8444,109507,75026,106738,62733,31450,55806,53568,49512,28851,64020,19433,107390,82039,102482,66827,51387,40783,43509,12726,63800,24800,20608,31222,71270,20224,77709,91076,75163,3089,50606,83454,110133,62826,90081,101909,94822,51053,63743,56722,63753,55349,102253,53428,97531,68825,108306,66138,49137,14988,3478,57236,101248,20602,100127,48318,10438,6434,32577,86167,26513,73827,24439,108966,68546,25047,48900,18367,36667,92078,88469,5836,96355,71684,61926,108736,79910,53265,48078,10830,8349,38344,61135,63323,110252,40477,12181,28875,48412,43868,66653,47705,71943,28968,12636,69434,24570,13353,41335,60472,71227,73473,3326,28035,40359,9120,91920,85307,8458,109712,49556,30894,11606,17637,23016,50426,48349,77732,94639,27863,51684};
		System.out.println(new Maximum_Square_Area_by_Removing_Fences_From_a_Field_2975().new Solution().maximizeSquareArea(m, n, hFences, vFences));
	}
	
	class Solution {
	    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
	        
	    	int hFencesSize = hFences.length + 2;
	    	int vFencesSize = vFences.length + 2;
	    	
	    	hFences = Arrays.copyOf(hFences, hFences.length + 2);
	    	vFences = Arrays.copyOf(vFences, vFences.length + 2);
	    	hFences[hFences.length - 2] = 1;
	    	hFences[hFences.length - 1] = m;
	    	vFences[vFences.length - 2] = 1;
	    	vFences[vFences.length - 1] = n;
	    	
	    	long maxArea = -1l;
	    	HashSet<Integer> side = new HashSet<>();
	    	
	    	for(int i=0;i<hFencesSize;++i) {
	    		for(int j=i+1;j<hFencesSize;++j) {
	    			side.add(Math.abs(hFences[i] - hFences[j]));
	    		}
	    	}
	    	
	    	for(int i=0;i<vFencesSize;++i) {
	    		for(int j=i+1;j<vFencesSize;++j) {
	    			if(side.contains(Math.abs(vFences[i] - vFences[j]))) {
	    				maxArea = Math.max(maxArea, Math.abs(vFences[i] - vFences[j]));
	    			}
	    		}
	    	}
	    	
	    	return maxArea == -1 ? -1 : (int)((maxArea*maxArea) % 1000000007);
	    }
	}
}
