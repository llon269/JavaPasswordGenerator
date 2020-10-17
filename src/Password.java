public class Password {
        public static String PassGeneration(int Len) {
            String Pass;
            for(Pass = ""; Pass.length() < Len; Pass = Pass + RandLetter());
            return(Pass);
        }

        private static char RandLetter() {
            char[] Chars = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
            int RandIndex = (int)(Math.random() * (double)Chars.length);
            return Chars[RandIndex];
        }
}
