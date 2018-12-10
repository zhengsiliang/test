package LeetCode.median;

/**
 * @author siliang.zheng
 * Date : 2018/3/29
 * Describle
 */
public class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int medianIndex, index = 0;
        int m = A.length, n = B.length;
        if ((m + n) % 2 == 0) {
            medianIndex = (m + n) / 2;
        } else {
            medianIndex = (m + n + 1) / 2;
        }
        for (int i = 0; i < A.length; i++) {
            if (Math.max(A[i], B[medianIndex - i - 1]) <= Math.min(A[i + 1], B[medianIndex - i])) {
                index = i;
                break;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "<entry key=\"http://service.owitho.com/awesome/crm/scheme/schemeRemoteService_1.0.0\" value-ref=\"schemeRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/customer/customerRemoteService_1.0.0\" value-ref=\"customerRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/customer/customerSearchRemoteService_1.0.0\" value-ref=\"customerSearchRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/contact/contactRemoteService_1.0.0\" value-ref=\"contactRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/contract/contractRemoteService_1.0.0\" value-ref=\"contractRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/visit/visitRemoteService_1.0.0\" value-ref=\"visitRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/competitorRemoteService_1.0.0\" value-ref=\"competitorRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/scheme/auditSchemeRemoteService_1.0.0\" value-ref=\"auditSchemeRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/address/addressRemoteService_1.0.0\" value-ref=\"addressRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/message/messageRemoteService_1.0.0\" value-ref=\"messageRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/job/jobRemoteService_1.0.0\" value-ref=\"jobRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/scheme/dashboardRemoteService_1.0.0\" value-ref=\"dashboardRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/sys/operationLogRemoteService_1.0.0\" value-ref=\"operationLogRemoteService\"/>\n" +
                "\t\t\t\t<entry key=\"http://service.owitho.com/awesome/crm/metric/asyncUserMetricService_1.0.0\" value-ref=\"asyncUserMetricService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/issue/issueRemoteService_1.0.0\" value-ref=\"issueRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/snapshot/customerGradeRemoteService_1.0.0\" value-ref=\"customerGradeRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/customer/flushDateRemoteService_1.0.0\" value-ref=\"flushDateRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/organization/orgRemoteService_1.0.0\" value-ref=\"orgRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/snapshot/customerGradeJobRemoteService_1.0.0\" value-ref=\"customerGradeJobRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/backDoorService_1.0.0\" value-ref=\"backDoorService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/heatMapService_1.0.0\" value-ref=\"heatMapService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/workbench/workbenchService_1.0.0\" value-ref=\"workbenchService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/xtlMessage/xtlMessageRemoteService_1.0.0\" value-ref=\"xtlMessageRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/inventory/inventoryDetailRemoteService_1.0.0\" value-ref=\"inventoryDetailRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/inventory/inventoryRecordRemoteService_1.0.0\" value-ref=\"inventoryRecordRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/crmClueOperateService_1.0.0\" value-ref=\"crmClueOperateService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/xtlMessage/flushXtlMessageRemoteService_1.0.0\" value-ref=\"flushXtlMessageRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/inventory/damageRecordRemoteService_1.0.0\" value-ref=\"damageRecordRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/customer/stockOutReportRemoteService_1.0.0\" value-ref=\"stockOutReportRemoteService\"/>\n" +
                "                <entry key=\"http://service.owitho.com/awesome/crm/tms/tmsFacadeService_1.0.0\" value-ref=\"tmsFacadeService\"/>";
        String[] split = str.split("\n");
        for (String  s:split){
            //System.out.println(s.indexOf("\"")+","+s.indexOf("\"",s.indexOf("\"")+1));
            System.out.println(s.substring(s.indexOf("\"")+1,s.indexOf("\"",s.indexOf("\"")+1)));
        }
    }
}
