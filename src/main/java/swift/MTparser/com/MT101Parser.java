package swift.MTparser.com;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.*;
import com.prowidesoftware.swift.model.mt.mt1xx.MT101;

public class MT101Parser {

	public static void main(String[] args) throws IOException {
		System.out.println(mtTagValue("30"));
		System.out.println(mtTagValue("21"));
		System.out.println(mtTagValue("23E"));
		System.out.println(mtTagValue("32B"));
		System.out.println(mtTagValue("57A"));
		System.out.println(mtTagValue("59"));
		System.out.println(mtTagValue("70"));
		System.out.println(mtTagValue("77B"));
		System.out.println(mtTagValue("71A"));
	}

	public static String mtTagValue(String tag) throws IOException {
		File mtFile = new File(System.getProperty("user.dir") + "/src/test/resources/swift/MTResources/MT101.txt");
		AbstractMT mtMsg = AbstractMT.parse(mtFile);
		MT101 mt = (MT101) mtMsg;
		String tagValue = "";
		switch (tag) {
		case "20":
			tagValue = mt.getField20().getValue();
			break;
		case "21R":
			tagValue = mt.getField21R().getValue();
			break;
		case "28D":
			tagValue = mt.getField28D().getValue();
			break;
		case "50C":
			List<Field50C> list50CValue = mt.getField50C();
			for (Field50C tempComponent : list50CValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "50L":
			List<Field50L> list50LValue = mt.getField50L();
			for (Field50L tempComponent : list50LValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "50F":
			List<Field50F> list50FValue = mt.getField50F();
			for (Field50F tempComponent : list50FValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "50G":
			List<Field50G> list50GValue = mt.getField50G();
			for (Field50G tempComponent : list50GValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "50H":
			List<Field50H> list50HValue = mt.getField50H();
			for (Field50H tempComponent : list50HValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "52A":
			List<Field52A> list52AValue = mt.getField52A();
			for (Field52A tempComponent : list52AValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "52C":
			List<Field52C> list52CValue = mt.getField52C();
			for (Field52C tempComponent : list52CValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "51A":
			tagValue = mt.getField51A().getValue();
			break;
		case "30":
			tagValue = mt.getField30().getValue();
			break;
		case "25":
			tagValue = mt.getField25().getValue();
			break;
		// END of Sequence A
		case "21":
			List<Field21> list21Value = mt.getField21();
			for (Field21 tempComponent : list21Value) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "21F":
			List<Field21F> list21FValue = mt.getField21F();
			for (Field21F tempComponent : list21FValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "23E":
			List<Field23E> list23EValue = mt.getField23E();
			for (Field23E tempComponent : list23EValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "32B":
			List<Field32B> list32BValue = mt.getField32B();
			for (Field32B tempComponent : list32BValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "57A":
			List<Field57A> list57AValue = mt.getField57A();
			for (Field57A tempComponent : list57AValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "59":
			List<Field59> list59Value = mt.getField59();
			for (Field59 tempComponent : list59Value) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "70":
			List<Field70> list70Value = mt.getField70();
			for (Field70 tempComponent : list70Value) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "77B":
			List<Field77B> list77BValue = mt.getField77B();
			for (Field77B tempComponent : list77BValue) {
				tagValue += tempComponent.getValue();
			}
			break;
		case "71A":
			List<Field71A> list71AValue = mt.getField71A();
			for (Field71A tempComponent : list71AValue) {
				tagValue += tempComponent.getValue();
			}
			break;

		}
		return tagValue;

	}
}
