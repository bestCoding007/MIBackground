package com.chenyangwen.mibackground.webui.controller;

import com.chenyangwen.mibackground.common.utils.R;
import com.chenyangwen.mibackground.common.utils.StringRandom;
import com.chenyangwen.mibackground.dao.ExcelUtil;
import com.chenyangwen.mibackground.entity.Product;
import com.chenyangwen.mibackground.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    /*手机端后台跨域*/
    @RequestMapping("/pro")
    @ResponseBody
    public R ProductSelect(HttpServletResponse response){
        //设置允许CORS的域名，如果是所有则使用*
        response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
        return R.ok(productService.ProductSelect());
    }

    //商品分页查询
    @ResponseBody
    @RequestMapping("/productLimit")
    public R findProductByPage(@RequestParam(defaultValue ="1") int pageNo,
                               @RequestParam(defaultValue ="7") int pageSize, String productName){
        BigDecimal bigDecimal = new BigDecimal(0);
        return  R.ok(productService.productLimit(productName,bigDecimal,productName,pageNo,pageSize));
    }

    //商品录入
    @ResponseBody
    @RequestMapping("/addGoods")
    public R addGoods(Integer catId,String productName,Integer productCount,Integer shopId
            ,BigDecimal oldPrice,String productColor,String productDesc
            ,Integer isNewProduct,Integer isHotProduct){
        Product product = new Product();
        /*随机生成ID*/
        /*StringRandom ran = new StringRandom();
        String productId=ran.getStringRandom(10);*/

        product.setCatId(catId);
        product.setProductName(productName);
        product.setProductCount(productCount);
        product.setShopId(shopId);
        product.setOldPrice(oldPrice);
        product.setProductColor(productColor);
        product.setProductDesc(productDesc);
        product.setIsNewProduct(isNewProduct);
        product.setIsHotProduct(isHotProduct);
        product.setProductPhoto(imgName);
        System.out.println(product);
        return R.ok(productService.addGoods(product));
    }

    /*商品多删除*/
    @ResponseBody
    @RequestMapping("/deleteByIds")
    public R deleteByIds(@RequestBody List<Integer> ids){
        return R.ok(productService.deleteByIds(ids));
    }

    /*上传图片*/
    /*图片的路径和文件名*/
    String imgName="";
    @RequestMapping(value="/fileSave",method= RequestMethod.POST)
    public String fileSave(MultipartFile[] files,HttpServletRequest request) throws Exception{
        //文件存放的位置
        String path=request.getSession().getServletContext().getRealPath("/files");
        System.out.println(path);

        for (MultipartFile file : files) {
            //获取图片类型
            String contentType=file.getContentType();
            System.out.println(contentType);
            //获取文件名
            String fileName=file.getOriginalFilename();
            //uuid随机码
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            //图片文件后缀名
            String suffixName=contentType.substring(contentType.indexOf("/")+1);
            imgName=uuid+"."+suffixName;
            //保存文件
            File tempFile=new File(path,imgName);
            file.transferTo(tempFile);
        }
       return "theBackground/admin-goods-entry";
    }

    /*修改图片*/
    /*图片的路径和文件名*/
    String editName="";
    @RequestMapping(value="/fileSave2",method= RequestMethod.POST)
    public String fileSave2(MultipartFile[] files,HttpServletRequest request) throws Exception{
        //文件存放的位置
        String path=request.getSession().getServletContext().getRealPath("/files");
        System.out.println(path);

        for (MultipartFile file : files) {
            //获取图片类型
            String contentType=file.getContentType();
            //获取文件名
            String fileName=file.getOriginalFilename();
            //uuid随机码
            String uuid = UUID.randomUUID().toString().replaceAll("-","");
            //图片文件后缀名
            String suffixName=contentType.substring(contentType.indexOf("/")+1);
            editName=uuid+"."+suffixName;
            //保存文件
            File tempFile=new File(path,editName);
            file.transferTo(tempFile);
        }
        return "theBackground/admin-table";
    }

    /*Excel导出数据到桌面*/
    @RequestMapping("/outExcel")
    public void excel(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        List<HashMap<String, Object>> listMap = new ArrayList<>();
        List<Product> lit=productService.ProductSelect();

        for(int i=0;i<lit.size();i++){
            HashMap<String,Object> dataMap = new HashMap<>();
            dataMap.put("productId",lit.get(i).getProductId());
            dataMap.put("catId", lit.get(i).getCatId());
            dataMap.put("productName", lit.get(i).getProductName());
            dataMap.put("oldPrice", lit.get(i).getOldPrice());
            dataMap.put("productPhoto", lit.get(i).getProductPhoto());
            dataMap.put("productDesc", lit.get(i).getProductDesc());
            dataMap.put("productCount", lit.get(i).getProductCount());
            dataMap.put("shopId", lit.get(i).getShopId());
            dataMap.put("productColor", lit.get(i).getProductColor());
            dataMap.put("isNewProduct", lit.get(i).getIsNewProduct());
            dataMap.put("isHotProduct", lit.get(i).getIsHotProduct());
            listMap.add(dataMap);
        }

        String title = "用户信息管理";
        String[] rowsName = new String[]{"商品编号","类别编号","名称","市场价格","图片","商品简介","库存量","店面编号","颜色","是否新品","是否热门"};
        List<Object[]>  dataList = new ArrayList<Object[]>();
        Object[] objs = null;
        for (int i = 0; i < listMap.size(); i++) {
            HashMap<String, Object> data = listMap.get(i);
            objs = new Object[rowsName.length];
            objs[0] = data.get("productId");
            objs[1] = data.get("catId");
            objs[2] = data.get("productName");
            objs[3] = data.get("oldPrice");
            objs[4] = data.get("productPhoto");
            objs[5] = data.get("productDesc");
            objs[6] = data.get("productCount");
            objs[7] = data.get("shopId");
            objs[8] = data.get("productColor");
            objs[9] = data.get("isNewProduct");
            objs[10] = data.get("isHotProduct");
            dataList.add(objs);
        }
        ExportExcel ex = new ExportExcel(title, rowsName, dataList);
        try {
            ex.export(response);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            response.sendRedirect("/background/theBackground");
        }
    }

    /*修改商品*/
    @ResponseBody
    @RequestMapping("/editProduct")
    public R editProduct(int productId,Integer catId,String productName,Integer productCount,Integer shopId
            ,BigDecimal oldPrice,String productColor,String productDesc
            ,Integer isNewProduct,Integer isHotProduct){
        Product product = new Product();
        product.setProductId(productId);
        product.setCatId(catId);
        product.setProductName(productName);
        product.setProductCount(productCount);
        product.setShopId(shopId);
        product.setOldPrice(oldPrice);
        product.setProductColor(productColor);
        product.setProductDesc(productDesc);
        product.setIsNewProduct(isNewProduct);
        product.setIsHotProduct(isHotProduct);
        product.setProductPhoto(editName);
        return R.ok(productService.editProduct(product));
    }

    /*查询商品总数量 没用上*/
    @ResponseBody
    @RequestMapping("/selectProductSize")
    public R selectProductSize(String productName,
                               BigDecimal oldPrice,
                               String productDesc){
        return R.ok(productService.selectProductSize(productName,oldPrice,productDesc));
    }

    /*前台渲染商品数据*/
    @ResponseBody
    @RequestMapping("/receptionProductSelect")
    public R receptionProductSelect(){
        return R.ok(productService.ProductSelect());
    }

    /*前台渲染商品数据8条数据*/
    @ResponseBody
    @RequestMapping("/receptionProductByPage")
    public R receptionProductByPage(@RequestParam(defaultValue ="1") int pageNo, @RequestParam(defaultValue ="8") int pageSize){
        return  R.ok(productService.receptionProductByPage(pageNo,pageSize));
    }

    List<Product> productslist1 =new ArrayList<>();

    //导入excel表
    @RequestMapping(value = "/leadProduct",method = RequestMethod.POST)
    @ResponseBody
    public void leadProduct(MultipartFile files, HttpServletRequest request, HttpServletResponse response)throws IOException{
        String str=request.getServletContext().getRealPath("files");
        File file=new File(str);
        if(!file.exists()){
            file.mkdir();
        }

        File file1=new File(str,files.getOriginalFilename());
//        把内存的文件写入磁盘
        files.transferTo(file1);
        List<Product> productList=new ExcelUtil().impExcel(str+"\\"+files.getOriginalFilename(),productslist1);

        for (Product item:productList){
            Product product=new Product();
            /*product.setProductId(item.getProductId());*/
            product.setProductName(item.getProductName());
            product.setOldPrice(item.getOldPrice());
            product.setProductPhoto(item.getProductPhoto());
            product.setProductDesc(item.getProductDesc());
            product.setProductCount(item.getProductCount());
            product.setShopId(item.getShopId());
            product.setCatId(item.getCatId());
            product.setProductColor(item.getProductColor());
            product.setIsNewProduct(item.getIsNewProduct());
            product.setIsHotProduct(item.getIsHotProduct());
            productService.addGoods(product);
        }
        response.sendRedirect("/background/theBackground");
    }

    /*根据商品编号获得其他参数*/
    @ResponseBody
    @RequestMapping("/getProductId")
    public R getProductId(Integer productId){
        return R.ok(productService.getProductId(productId));
    }
}
