package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class calculations extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.calculations");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.calculations.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public double _scroll_height = 0;
public double _scroll_width = 0;
public double _scroll_top = 0;
public double _scroll_left = 0;
public String _name = "";
public String _ip = "";
public int _users_id = 0;
public String _users_name = "";
public b4a.example.main _main = null;
public b4a.example.login_form _login_form = null;
public b4a.example.create_account _create_account = null;
public b4a.example.search_frame _search_frame = null;
public b4a.example.menu_form _menu_form = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.my_profile _my_profile = null;
public b4a.example.about_frame _about_frame = null;
public b4a.example.help_frame _help_frame = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public scroll_height As Double";
_scroll_height = 0;
 //BA.debugLineNum = 4;BA.debugLine="Public scroll_width As Double";
_scroll_width = 0;
 //BA.debugLineNum = 5;BA.debugLine="Public scroll_top As Double";
_scroll_top = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public scroll_left As Double";
_scroll_left = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 8;BA.debugLine="Private ip As String";
_ip = "";
 //BA.debugLineNum = 9;BA.debugLine="ip = \"http://192.168.254.100:80\"";
_ip = "http://192.168.254.100:80";
 //BA.debugLineNum = 10;BA.debugLine="Public users_id As Int";
_users_id = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public users_name As String";
_users_name = "";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _name_user(String _n) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub name_user(n As String) As String";
 //BA.debugLineNum = 57;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _php_email_url(String _email) throws Exception{
String _merge_url = "";
 //BA.debugLineNum = 50;BA.debugLine="Public Sub php_email_url(email As String)";
 //BA.debugLineNum = 51;BA.debugLine="Dim merge_url As String";
_merge_url = "";
 //BA.debugLineNum = 52;BA.debugLine="merge_url = ip&email";
_merge_url = _ip+_email;
 //BA.debugLineNum = 53;BA.debugLine="Return merge_url";
if (true) return _merge_url;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public double  _sums_height(double _h) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub sums_height(h As Double) As Double";
 //BA.debugLineNum = 34;BA.debugLine="scroll_height = h";
_scroll_height = _h;
 //BA.debugLineNum = 35;BA.debugLine="Return scroll_height";
if (true) return _scroll_height;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return 0;
}
public double  _sums_left(double _l) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub sums_left(l As Double) As Double";
 //BA.debugLineNum = 46;BA.debugLine="scroll_left = l";
_scroll_left = _l;
 //BA.debugLineNum = 47;BA.debugLine="Return scroll_left";
if (true) return _scroll_left;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return 0;
}
public double  _sums_top(double _t) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub sums_top(t As Double) As Double";
 //BA.debugLineNum = 42;BA.debugLine="scroll_top = t";
_scroll_top = _t;
 //BA.debugLineNum = 43;BA.debugLine="Return scroll_top";
if (true) return _scroll_top;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return 0;
}
public double  _sums_width(double _w) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub sums_width(w As Double) As Double";
 //BA.debugLineNum = 38;BA.debugLine="scroll_width = w";
_scroll_width = _w;
 //BA.debugLineNum = 39;BA.debugLine="Return scroll_width";
if (true) return _scroll_width;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
