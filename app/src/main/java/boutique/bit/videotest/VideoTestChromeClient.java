package boutique.bit.videotest;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by stephenbartholomew on 12/05/2017.
 */

public class VideoTestChromeClient extends WebChromeClient {
  private Activity mActivity;
  private View mWebView;
  private View mVideoView;

  public VideoTestChromeClient(Activity activity, WebView webView) {
    mActivity = activity;
    mWebView = webView;
  }
  @Override
  public void onShowCustomView (View view, WebChromeClient.CustomViewCallback callback) {
    mVideoView = view;

    getRootView().addView(mVideoView);

    mWebView.setVisibility(View.GONE);
  }

  @Override
  public void onHideCustomView () {
    getRootView().removeView(mVideoView);
    mVideoView.setVisibility(View.GONE);
    mWebView.setVisibility(View.VISIBLE);
  }

  public ViewGroup getRootView() {
    return (ViewGroup) mActivity.findViewById(android.R.id.content);
  }
}