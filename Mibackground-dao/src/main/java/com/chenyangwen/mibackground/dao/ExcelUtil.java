package com.chenyangwen.mibackground.dao;

import com.chenyangwen.mibackground.entity.Product;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExcelUtil {
    /**
     * 导入Excel
     * @param execelFile 表示Excel文件路径
     */
    public List<Product> impExcel(String execelFile, List<Product> product1){

       /* List<Product> product2=new ArrayList<Product>();*/
        try {
            Workbook book = null;//构造 Workbook对象
            try {
                //Excel 2007获取方法
                book=new XSSFWorkbook(new FileInputStream(execelFile));
            } catch(Exception ex){
                //Excel 2003获取方法
                book=new HSSFWorkbook(new FileInputStream(execelFile));
            }
            //读取表格的第一个sheet页
            Sheet sheet = book.getSheetAt(0);
            int totalRows=sheet.getLastRowNum();//获取总行数,从0开始
            //循环输出表格中的内容,首先循环取出行,再根据行循环取出列 (第一行索引是0,从1开始读的话可以去掉头部)
            for (int i = 0; i <= totalRows; i++) {
                Row row = sheet.getRow(i);//获取行
                if(row == null){//处理空行
                    continue ;
                }
                int totalCells=row.getLastCellNum();//总共有多少列,从0开始
                System.out.println("导入中...");
                Product product=new Product();

                double productId=Double.parseDouble(row.getCell(0).toString());
                int productId1=(int)productId ;
                product.setProductId(productId1);
                double catId=Double.parseDouble(row.getCell(1).toString());
                int catId1=(int)catId ;
                product.setCatId(catId1);
                product.setProductName(row.getCell(2).toString());
                double oldPrice=Double.parseDouble(row.getCell(3).toString().trim());
                int oldPrice1=(int)oldPrice ;
                product.setOldPrice(BigDecimal.valueOf(oldPrice1));
                product.setProductPhoto(row.getCell(4).toString());
                product.setProductDesc(row.getCell(5).toString());
                double productCount=Double.parseDouble(row.getCell(6).toString());
                int productCount1=(int)productCount ;
                product.setProductCount(productCount1);
                double shopId=Double.parseDouble(row.getCell(7).toString());
                int shopId1=(int)shopId ;
                product.setShopId(shopId1);
                product.setProductColor(row.getCell(8).toString());
                double newProduct=Double.parseDouble(row.getCell(9).toString());
                int newProduct1=(int)newProduct ;
                double hotProduct=Double.parseDouble(row.getCell(10).toString());
                int hotProduct1=(int)hotProduct ;
                product.setIsNewProduct(hotProduct1);
                product.setIsNewProduct(newProduct1);
                System.out.println(product);
                product1.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product1;
    }

    /**
     * 转换单元格内容,这里返回字符串
     * @param cell Excel 单元格
     * @return String 返回单元格数据内容
     */
    public String getStringCellValue(Cell cell) {

        if (cell==null){//列为空
            return null;
        }

        String strCell = "";
        switch(cell.getCellType()){
            case HSSFCell.CELL_TYPE_STRING://字符串类型
                //也可通过cell.toString()获取单元格内容
                strCell = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC://数字类型

                // 判断当前的cell是否为Date,如果是Date类型则，转化为Data格式
                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    //方法1：这样子的data格式是带时分秒的：2011-10-12 0:00:00
                    //strCell=cell.getDateCellValue().toLocaleString();

                    //方法2：这样子的data格式是不带带时分秒的：2011-10-12
                    Date date = cell.getDateCellValue();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    strCell = sdf.format(date);

                }else{//如果是纯数字
                    strCell=String.valueOf(cell.getNumericCellValue());//取得当前Cell的数值
                }

                break;
            case HSSFCell.CELL_TYPE_BOOLEAN://布尔(boolean)类型

                strCell = String.valueOf(cell.getBooleanCellValue());
                break;
            case HSSFCell.CELL_TYPE_BLANK://为空类型

                strCell = "";
                break;

            default:
                strCell = "";
                break;
        }
        return strCell;
    }

}
