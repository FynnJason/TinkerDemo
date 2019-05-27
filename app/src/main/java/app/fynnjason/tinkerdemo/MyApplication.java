package app.fynnjason.tinkerdemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "app.fynnjason.tinkerdemo.MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

}
