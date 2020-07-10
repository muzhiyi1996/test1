import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import static java.lang.System.*;

public class Test1 {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.breath();
	}

	// 冒泡排序
	public static void sortBy() {
		int[] arr = new int[] { 21, 32, 231, 43, 435, 13, 12, 4, 64, 643, 134 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			for (int j = 0; j < arr.length; j++) {
				out.print(arr[j] + ",");
			}
			out.println();
		}
	}

//	/直接选择
	public static void sort() {
		int[] arr = new int[] { 21, 32, 231, 43, 435, 13, 12, 4, 64, 643, 134 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			for (int j = 0; j < arr.length; j++) {
				System.err.print(arr[j] + ",");
			}
			System.err.println();
		}
	}

	public static String gettime(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date parse = null;
		try {
			parse = sdf.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(parse);
//			cal.set(Calendar.DAY_OF_MONTH, 1);
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 0);
			parse = cal.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(parse));
		return sdf.format(parse);
	}

	public static List<String> getAllMonth(String start, String end) {
		List<String> list = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM");
		try {
			Date StartDate = sdf.parse(start);
			Calendar startCal = Calendar.getInstance();
			startCal.setTime(StartDate);
			startCal.set(Calendar.DAY_OF_MONTH, 1);

			Date EndDate = sdf.parse(end);
			Calendar endCal = Calendar.getInstance();
			endCal.setTime(EndDate);
			endCal.set(Calendar.DAY_OF_MONTH, 1);

			System.out.println("start:" + sd.format(startCal.getTime()));
			System.out.println("end:" + sdf.format(endCal.getTime()));

			while (startCal.compareTo(endCal) < 1) {
				list.add(sd.format(startCal.getTime()));
				startCal.add(Calendar.MONTH, 1);
				System.out.println("start:" + sd.format(startCal.getTime()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(list);
		return list;
	}
}
