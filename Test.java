class Test
{
public void openSameurlInMultiplewindow() throws InterruptedException{

String pageUrl = "http://www.bing.com";

JavascriptExecuter JsExecuter =(JavascriptExecuter)this.ffDriver;

String JsOpenNewWindow="Window.open('"+pageUrl+"');";

for(int i=0;i<5;i++)
{
     JsExecutor.execuuteScript(jsOpenNewWindow);
     Thread.sleep(1000);
     System.out.println("open opend.");
}
Set<String>WindowHandelSet = this.ffDriver.getWindowHandels();

if(WindowHandelSet!=null)
{
     Iterator<String> it = WindowHandelSet.Iterator();
     int i=0;
     while(it.hasNext())
     {
         String WindowHandelstr = it.next();
         System.out.println("WindowHandler String : "+WindowHandlerStr);
         if(i==2)
         {
            this.ffDriver.switchTo().Window(WindowHandlerStr);
            this.ffDriver.get("http://www.google.com");
            System.out.println("switch firefoxWindow "+WindowHandler +"to http://www.google.com");
            Thread.sleep(3000);
          }
         i++;
         if(i==1)
        {
          this.ffdriver.switchTo().Window(WindowHandlerStr);
          this.ffDriver.close();
          System.out.println("close " + WindowHandlerStr);
          Thread.sleep(3000);
       }
}
}
}
}