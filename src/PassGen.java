public class PassGen {
		static char[] dictionary = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		
        public static String getPassword(int len) {
			String pass;
            for(pass = ""; pass.length() < len; pass += randLetter());
            return(pass);
        }

        private static char randLetter() {
            int randIndex = (int)(Math.random() * (double)dictionary.length);
            return dictionary[randIndex];
        }
}
