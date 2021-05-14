package proxy20200719.proxyjdk;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:41<br>
 * 描述:  TODO<br>
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public String savePerson() {
        System.out.println("添加");
        return "保存成功！";
    }

    @Override
    public void updatePerson() {
        System.out.println("修改");
    }

    @Override
    public void deletePerson() {
        System.out.println("删除");
    }
}
