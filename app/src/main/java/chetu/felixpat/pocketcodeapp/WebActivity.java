package chetu.felixpat.pocketcodeapp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.net.URL;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    String url;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.activity_web_webview);

        progressDialog = ProgressDialog.show(WebActivity.this,"","Loading...");

        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new myWebClient());
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        Bundle bundle = new Bundle();
        Intent in = getIntent();
        bundle = in.getBundleExtra("bundle");
        int position = bundle.getInt("position");
        String name = bundle.getString("name");
        String domain = bundle.getString("domain");

        if(domain.equals("c")){
            if(name.equals("tutorial")){

                switch (position){
                    case 0:
                        url = "https://www.tutorialspoint.com/cprogramming";
                        break;
                    case 1:
                        url = "https://www.javatpoint.com/c-programming-language-tutorial";
                        break;
                    case 2:
                        url = "https://fresh2refresh.com/c-programming";
                        break;
                    case 3:
                        url = "https://www.programiz.com/c-programming";
                        break;
                    case 4:
                        url = "https://www.cprogramming.com/tutorial/c-tutorial.html";
                        break;

                }
            }
            else if(name.equals("editor")){

                switch (position){
                    case 0:
                        url = "https://www.codechef.com/ide";
                        break;
                    case 1:
                        url = "https://www.tutorialspoint.com/compile_c_online.php";
                        break;
                    case 2:
                        url = "http://rextester.com/l/c_online_compiler_gcc";
                        break;
                    case 3:
                        url = "https://www.jdoodle.com/c-online-compiler";
                        break;
                    case 4:
                        url = "https://www.onlinegdb.com/online_c_compiler";
                        break;
                }
            }
            else if(name.equals("technews")){
                switch (position){
                    case 0:
                        url = "https://www.techgig.com/skill/c";
                        break;
                    case 1:
                        url = "http://www.firstpost.com/tag/c-programming-language";
                        break;
                    case 2:
                        url = "https://economictimes.indiatimes.com/topic/C-programming-language";
                        break;
                    case 3:
                        url = "http://cs-fundamentals.com/c-programming/c-programming-tutorials.php";
                        break;

                }
            }
        }
        else if(domain.equals("cpp")){
            if(name.equals("tutorial")){

                switch (position){
                    case 0:
                        url="https://www.programiz.com/cpp-programming";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/cplusplus/index.htm";
                        break;
                    case 2:
                        url = "http://www.cplusplus.com/doc/tutorial";
                        break;
                    case 3:
                        url ="https://www.javatpoint.com/cpp-tutorial";
                        break;

                }
            }
            else if(name.equals("editor")){

                switch (position){
                    case 0:
                        url="https://www.jdoodle.com/online-compiler-c++";
                        break;
                    case 1:
                        url="https://www.onlinegdb.com/online_c++_compiler";
                        break;
                    case 2:
                        url="https://www.codechef.com/ide";
                        break;
                    case 3:
                        url="https://www.tutorialspoint.com/compile_cpp_online.php";
                        break;
                }
            }
            else if(name.equals("technews")){

                switch (position){
                    case 0:
                        url="http://girnarsoft.com/c-cplusplus-cpp-development-services-tyC2c";
                        break;
                    case 1:
                        url="https://www.techgig.com/skill/cpp";
                        break;
                    case 2:
                        url="http:cppcast.com/";
                        break;
                    case 4:
                        url="http://www.drdobbs.com/cpp";
                        break;
                }
            }
        }
        else if(domain.equals("java")){
            if(name.equals("tutorial")){

                switch (position){
                    case 0:
                        url="https://www.javatpoint.com/java-tutorial";
                        break;
                    case 1:
                        url="https://www.codecademy.com/learn/learn-java";
                        break;
                    case 2:
                        url="http://www.learnjavaonline.org/";
                        break;
                    case 3:
                        url="https://beginnersbook.com/java-tutorial-for-beginners-with-examples/";
                        break;
                }
            }
            else if(name.equals("editor")){

                switch (position){
                    case 0:
                       url="https://www.jdoodle.com/online-java-compiler";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/compile_java_online.php";
                        break;
                    case 2:
                        url="https://www.compilejava.net/";
                        break;
                    case 3:
                        url="http://rextester.com/l/java_online_compiler";
                        break;
                }
            }
            else if(name.equals("technews")){

                switch (position){
                    case 0:
                        url="https://www.javaworld.com/news";
                        break;
                    case 1:
                        url="https://www.infoworld.com/category/java";
                        break;
                    case 2:
                        url="https://dzone.com/java-jdk-development-tutorials-tools-news";
                        break;
                    case 3:
                        url="https://prabhukvn.com/tech-news/";
                }
            }
        }
        else if(domain.equals("python")){
            if(name.equals("tutorial")){

                switch (position){
                    case 0:
                        url="https://docs.python.org/3/tutorial/";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/python/";
                        break;
                    case 2:
                        url="https://www.guru99.com/python-tutorials.html";
                        break;
                    case 3:
                        url="https://www.learnpython.org";
                        break;
                }
            }
            else if(name.equals("editor")){

                switch (position){
                    case 0:
                        url="https://www.jdoodle.com/python-programming-online";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/execute_python_online.php";
                        break;
                    case 2:
                        url="https://www.onlinegdb.com/online_python_compiler";
                        break;
                    case 3:
                        url="https://repl.it/languages/python3";
                        break;

                }
            }
            else if(name.equals("technews")){

                switch (position){
                    case 0:
                        url="https://www.python.org/blogs/";
                        break;
                    case 1:
                        url="https://www.python.org/psf-landing/";
                        break;
                    case 2:
                        url="https://stackoverflow.blog/2017/09/06/incredible-growth-python";
                        break;
                    case 3:
                        url="https://mashable.com/2017/07/30/learn-how-to-code-with-python/";
                        break;
                }
            }
        }
else if(domain.equals("html"))
        {
            if(name.equals("tutorial")){
                switch (position)
                {
                    case 0:
                        url="https://www.w3schools.com/html/";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/html/";
                        break;
                    case 2:
                        url="https://www.javatpoint.com/html-tutoria";
                        break;
                    case 3:
                        url="htmldog.com/guides/html/beginner/";
                        break;
                }
            }
        if(name.equals("editor"))
        {
            switch (position){
                case 0:
                    url ="https://html-online.com/editor/";
                    break;
                case 1:
                    url="https://html-online.com/";
                    break;
                case 2:
                    url="https://htmlg.com/html-editor";
                    break;
                case 3:
                    url="htmlcodeeditor.com";
                    break;
            }
        }
        if(name.equals("technews")){
                switch (position){
                    case 0:
                        url="https://www.w3.org/html/";
                        break;
                    case 1:
                        url="https://www.w3schools.com/html/html5_serversentevents.asp";
                        break;
                    case 2:
                        url="https://www.indiatoday.in/news.html";
                        break;
                    case 3:
                        url="https://stackoverflow.com/questions/3300557/html-update-news-page";
                        break;
                }
        }
        }
else if(domain.equals("others"))
        {
            if(name.equals("MBA")){
                switch (position){
                    case 0:
                        url="https://www.tutorialspoint.com/managerial_economics/macroeconomics_basics.htm";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/human_resource_management/index.htm";
                        break;
                    case 2:
                        url="https://www.tutorialspoint.com/marketing_management/index.htm";
                        break;
                    case 3:
                        url="";
                        break;
                }
            }
        if(name.equals("Arts")){
                switch (position){
                    case 0:
                        url="https://www.tutorialspoint.com/modern_indian_history/index.htm";
                        break;
                    case 1:
                        url="https://www.tutorialspoint.com/geography/index.htm";
                        break;
                    case 2:
                        url="https://www.tutorialspoint.com/indian_polity/index.htm";
                        break;
                    case 3:
                        url="https://www.tutorialspoint.com/entrepreneurship_development/index.htm";
                        break;
                }
        }
        if(name.equals("electronics")){
            switch (position)
            {
                case 0:
                    url="https://www.tutorialspoint.com › Microprocessor › Microprocessor - Home";
                    break;
                case 1:
                    url="https://www.tutorialspoint.com/electromagnetics_theory/index.asp";
                    break;
                case 2:
                    url="https://www.tutorialspoint.com/dip/";
                    break;
                case 3:
                    url="https://www.tutorialspoint.com/data_communication_computer_network/index.htm";
                    break;

            }
        }
        }
        webView.loadUrl(url);
       }

    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);


        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (progressDialog.isShowing()) {
                progressDialog.dismiss();
            }


        }
    }







    @Override
    // This method is used to detect back button
    public void onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }

}
