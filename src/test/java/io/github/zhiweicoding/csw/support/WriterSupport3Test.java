package io.github.zhiweicoding.csw.support;

import io.github.zhiweicoding.csw.models.BookBean;
import io.github.zhiweicoding.csw.models.MenuBean;

import java.util.List;

/**
 * @Created by zhiwei on 2022/3/29.
 */
public class WriterSupport3Test {
    static String txt = "$.区情要览\n" +
            "$-$.行政区划\n" +
            "津南区位于天津市东南部，海河下游南岸。东与滨海新区塘沽接壤，西与河西区和西青区相连，南与滨海新区大港毗邻，北与东丽区隔海河相望。地处北纬38°50′02″～39°04′32″，东经117°14′32″～117°33′10″之间。东西最宽处25千米，南北最长26千米，总面积387.84平方千米。2020年，津南区辖咸水沽镇、小站镇、葛沽镇、双港镇、辛庄镇、双桥河镇、八里台镇、北闸口镇及长青办事处、双新街道办事处、双林街道办事处，有153个行政村97个居民委员会。\n" +
            "$-$.建置沿革\n" +
            "春秋战国时期，先属齐国。齐桓公二十三年（前663年），属燕国。秦时，属广阳郡。西汉高祖五年（前202年）至东晋，属渤海郡、章武郡东平舒县。北魏时，属沧州浮阳郡章武县。隋唐时，属瀛州、沧州鲁城县。北宋时，属河北路（后称高阳关路）清池县。金明昌四年（1193年），属河北东路清州靖海县。元至元二年（1265年），属中书省河间路清州靖海县。明时，属河间府静海县。清雍正三年（1725年），咸水沽一带属静海县，葛沽、小站一带属沧州。1731年，咸水沽、葛沽、小站分别从静海、沧州划归天津县。1945年5月，抗日武装建立津南县，9月建立津沽县。1946年1月，津沽县与津南县合并，称津南县。1948年12月撤销津南县，建立天津县，咸水沽为县治。1949年10月，属河北省天津专署。1953年5月15日，建立津南郊区，隶属天津市。1955年6月17日，津南郊区改称南郊区。1958年9月13日，撤销南郊区，并入河西区。1962年2月1日，南郊区与河西区分置。1992年3月6日，改称津南区。\n" +
            "$-$.地貌与气候\n" +
            "津南区境内地势平坦，起伏很小，从西南方向东南微微倾斜，海拔（大沽高程）最高处6米，最低处2.07米，绝大部分地区3～4米。属暖温带半湿润季风型气候，四季分明，日照较长，季风显著，雨热同期，2020年，平均气温13.6℃，年降水量591毫米，无霜期296天。\n" +
            "$-$.交通\n" +
            "津南区位于天津市东南部，海河南岸，紧邻滨海新区，地理位置优越，交通发达。境内李港铁路、咸官铁路贯穿南北；津晋高速、丹拉高速、津港高速、天津大道与天津外环线、津沽公路、津歧公路、葛万公路、汉港公路，组成了铁路、公路、水路纵横交错、相辅相成、出行便捷的快速交通网络。\n" +
            "$-$.人口与民族\n" +
            "截至2020年底，全区常住人口92.81万人，户籍人口53.30万人。全年出生人口2598人，其中一孩1420人，二孩1102人，多孩76人。辖区内居住着汉、回、朝鲜、蒙古、满等41个民族。\n" +
            "$-$-$.历史名人\n" +
            "津南的土地哺育了一代又一代优秀儿女，涌现出了《大清一统志》编修周人麒、画家乘航、河北梆子表演艺术家银达子、红学家周汝昌、作家邢野、版画家李平凡、金融家苏传绪、评书表演艺术家田连元等一批海内外知名人士。\n" +
            "$-$-$.经济总量\n" +
            "2020年，全区地区生产总值（在地口径）539.17亿元。第一产业完成6.70亿元，同比增长1.9%；第二产业完成180.19亿元，同比下降1.2%；第三产业完成352.29亿元，同比增长3.6%。三次产业结构为1.24：33.42：65.34。区级一般预算收入60.88亿元，同比下降7.6%，其中税收收入36.62亿元，占一般公共预算收入的60.1%。全年全区固定资产投资（在地口径）完成444.67亿元，同比增长9.3%。\n" +
            "$-$.农业\n" +
            "2020年，农业总产值11.93亿元，同比增长2.3%。其中，种植业产值4.16亿元，林业产值2.86亿元，畜牧业产值0.53亿元，渔业产值4.24亿元，农林牧渔专业及辅助性活动产值0.14亿元。现代农业健康发展。全区农业龙头企业21家，其中国家级龙头企业1家，市级龙头企业9家，区级龙头企业11家。市级合作社5个，含市级示范合作社2个，示范家庭农场2个。\n" +
            "$-$.工业和建筑业\n" +
            "2020年，全区规模以上工业企业完成工业总产值700.46亿元，主营业务收入718.69亿元。全区具有资质等级三级以上建筑业企业完成建筑业总产值597.58亿元，房屋施工面积1432.87万平方米，营业收入451.73亿元。\n" +
            "$-$.第三产业\n" +
            "2020年，社会消费品零售总额达到120亿元，同比下降16.8%。全区批发和零售业商品销售额1337.44亿元，同比增长8.3%；住宿餐饮业营业额9.13亿元，同比下降28.9%。全年新增运输企业185家，新增运力1733车19690吨。全区运输企业累计1003家，运力总量4644车65339吨。邮政业务总量完成5359万元，发送函件4.6万件，汇票0.2万件，特快专递1.2万件。2020年，城乡储蓄存款余额1003.10亿元，同比增长16.8%，其中居民储蓄存款余额615.20亿元，同比增长20%。城乡贷款余额798.20亿元，同比增长23.10%。全年房地产业完成施工" ;

    public static void main(String[] args) {
        WriterSupport support = new WriterSupport();
        BookBean bookBean = new BookBean();
        bookBean.setFactoryId(1);
        bookBean.setBookId(1);
        support.setBookBean(bookBean);

        support.init(txt);
        boolean start = support.start();
        if (start){
            List<MenuBean> tempMenuArray = support.getTempMenuArray();
            System.out.println(tempMenuArray);
            support.insert();
        }
    }
}