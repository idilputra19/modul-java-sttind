public class modul6_latihan6_idil {
    public static void main(String[] args) {
        String[][][] array3D = {
            {{"AGUSPINA", "AIDIL ARIFIN", "FITRI RAHMADHANI"}},
            {{"NOVRI"},
            {"RIZKI FAHRI PRATAMA"},
            {"MAYA DEFITA SARI"}},
            {{"OLIVIA ANDIKA RAMADHANI", "AMELIA PUTRI", "UMMIL AZIZAH"}}
        };
        
        String[][][] alias = new String[array3D.length][][];
        alias[0] = new String[1][]; // Element 1 contains 1 array of String (A)
        alias[1] = new String[3][]; // Element 2 contains 3 arrays of String (B)
        alias[2] = new String[1][]; // Element 3 contains 1 array of String (C)

        alias[0][0] = new String[3]; // Element 1 of A contains 3 strings
        alias[1][0] = new String[1]; // Element 1 of B contains 1 string
        alias[1][1] = new String[1]; // Element 2 of B contains 1 string
        alias[1][2] = new String[1]; // Element 3 of B contains 1 string
        alias[2][0] = new String[3]; // Element 1 of C contains 3 strings

        // Copying all elements from array3D[0] to alias[0]
        for (int i = 0; i < 3; i++) {
            alias[0][0][i] = array3D[0][0][i];
            System.out.println(alias[0][0][i]);
        }

        // Copying elements from array3D[1] to alias[1]
        alias[1][0][0] = array3D[1][0][0]; // Copy first element of B
        alias[1][1][0] = array3D[1][1][0]; // Copy second element of B
        alias[1][2][0] = array3D[1][2][0]; // Copy third element of B
        System.out.println(alias[1][0][0]);
        System.out.println(alias[1][1][0]);
        System.out.println(alias[1][2][0]);

        // Copying all elements from array3D[2] to alias[2]
        for (int i = 0; i < 3; i++) {
            alias[2][0][i] = array3D[2][0][i];
            System.out.println(alias[2][0][i]);
        }
    }
}
