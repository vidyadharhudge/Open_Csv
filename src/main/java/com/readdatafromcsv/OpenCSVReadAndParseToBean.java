package com.readdatafromcsv;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.pojo.CsvUser;
import java.util.List;
public class OpenCSVReadAndParseToBean
{
    private static final String SAMPLE_CSV_FILE_PATH="sample1.csv";
    public static void main(String[] args) throws IOException
    {
        try(Reader reader= Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));)
        {
            CsvToBean<CsvUser> csvToBean= new CsvToBeanBuilder(reader)
                    .withType(CsvUser.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<CsvUser> csvUsers=csvToBean.parse();
            for(CsvUser csvUser:csvUsers)
            {
                System.out.println("Name:"+csvUser.getName());
                System.out.println("Email:"+csvUser.getEmail());
                System.out.println("PhoneNo:"+csvUser.getPhone());
                System.out.println("Country"+csvUser.getCountry());
                System.out.println("=================================");
            }
        }
    }
}
