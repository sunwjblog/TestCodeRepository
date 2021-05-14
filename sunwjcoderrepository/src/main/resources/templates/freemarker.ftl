<#assign voicePackageList = (packageuesedqry0.getMsgbody().getInfolist().getInfo())!'' />
<#assign gprsPackageList = (packageuesedqry2.getMsgbody().getInfolist().getInfo())!'' />
<#assign smsPackageList = (packageuesedqry1.getMsgbody().getInfolist().getInfo())!'' />
<databeanlist>
    <#if (packageuesedqry0.getMsgbody().getInfolist().getInfo())?? >
        <#list voicePackageList as voiceInfo >
            <databean>
                <type>0</type>
                <currname>${voiceInfo.prodname}</currname>
                <nextname></nextname>
                <leftflow>${voiceInfo.relay}</leftflow>
                <unit>分钟</unit>
                <contain>${voiceInfo.contain}</contain>
                <used>${voiceInfo.used}</used>
            </databean>
        </#list>
    </#if>
    <#if (packageuesedqry2.getMsgbody().getInfolist().getInfo())?? >
        <#list gprsPackageList as gprsInfo>
            <databean>
                <type>1</type>
                <currname>${gprsInfo.prodname}</currname>
                <nextname></nextname>
                <leftflow>${(gprsInfo.relay?number / 1024)?string('0.00')}</leftflow>
                <unit>M</unit>
                <contain>${(gprsInfo.contain?number / 1024)?string('0.00')}</contain>
                <used>${(gprsInfo.used?number / 1024)?string('0.00')}</used>
            </databean>
        </#list>
    </#if>
    <#if (packageuesedqry1.getMsgbody().getInfolist().getInfo())??>
        <#list smsPackageList as smsInfo>
            <databean>
                <type>2</type>
                <currname>${smsInfo.prodname}</currname>
                <nextname></nextname>
                <leftflow>${smsInfo.relay}</leftflow>
                <unit>条</unit>
                <contain>${smsInfo.contain}</contain>
                <used>${smsInfo.used}</used>
            </databean>
        </#list>
    </#if>
</databeanlist>