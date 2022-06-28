package test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String strTemp = "원용##가은";
        int __c = 3;
        ArrayList<String> arrayList = new ArrayList<String>();

        ArrayList<ContractInfo> cInfo = new ArrayList<>();
        ArrayList<BundleInfo> bInfo = new ArrayList<>();
        for (int i = 0; i < __c; i++) {
            ContractInfo cc = new ContractInfo();
            cc.setString1(i + "");
            cc.setString2(strTemp.split("#")[i]);

            if ("".equals(cc.getString2()) || cc.getString2() == null) {
                continue;
            }
            else {
                cInfo.add(cc);
            }


        }

    }
    static class ContractInfo {
        String string1 = "";
        String string2 = "";

        public String getString1() {
            return string1;
        }

        public void setString1(String string1) {
            this.string1 = string1;
        }

        public String getString2() {
            return string2;
        }

        public void setString2(String string2) {
            this.string2 = string2;
        }

        @Override
        public String toString() {
            return "ContractInfo{" +
                    "string1='" + string1 + '\'' +
                    ", string2='" + string2 + '\'' +
                    '}';
        }
    }

    class BundleInfo {
        String id = "";
        String ContractInfoId = "";
        String ContractInfoString = "";

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContractInfoId() {
            return ContractInfoId;
        }

        public void setContractInfoId(String contractInfoId) {
            ContractInfoId = contractInfoId;
        }

        public String getContractInfoString() {
            return ContractInfoString;
        }

        public void setContractInfoString(String contractInfoString) {
            ContractInfoString = contractInfoString;
        }
    }

}
