package generator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyGenerator {

    public static void main(String[] args) throws Exception {
        System.out.println("start generator ...");
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;

        InputStream is = MyGenerator.class.getResourceAsStream("generatorConfig.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("end generator!");
    }

}
