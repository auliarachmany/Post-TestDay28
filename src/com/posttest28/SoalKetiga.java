package com.posttest28;

public class SoalKetiga {
    public static void main(String[] args) {
        String[] T1 = {
                "202112SOAL3",
                "202111SOAL3",
                "202110SOAL3"
        };
        String[] T2 = {
                "SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT",
                "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT",
                "SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY .DT"
        };
        System.out.println("TI :" + T1[0]);
        System.out.println("T2 :" + T2[0].substring(36,90) + T2[0].substring(0,36));
        System.out.println("");
        System.out.println("TI :" + T1[1]);
        System.out.println("T2 :" + T2[1].substring(36,90) + T2[1].substring(0,36));
        System.out.println("");
        System.out.println("TI :" + T1[2]);
        System.out.println("T2 :" + T2[2].substring(36,90) + T2[2].substring(0,36));
        System.out.println("");
    }
}
