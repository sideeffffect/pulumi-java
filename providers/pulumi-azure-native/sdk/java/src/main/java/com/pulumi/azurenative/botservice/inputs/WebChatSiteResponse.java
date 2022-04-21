// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A site for the Webchat channel
 * 
 */
public final class WebChatSiteResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebChatSiteResponse Empty = new WebChatSiteResponse();

    /**
     * Whether this site is enabled for DirectLine channel
     * 
     */
    @Import(name="isEnabled", required=true)
    private Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Whether this site is enabled for preview versions of Webchat
     * 
     */
    @Import(name="isWebchatPreviewEnabled", required=true)
    private Boolean isWebchatPreviewEnabled;

    public Boolean isWebchatPreviewEnabled() {
        return this.isWebchatPreviewEnabled;
    }

    /**
     * Primary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * Secondary key. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="key2", required=true)
    private String key2;

    public String key2() {
        return this.key2;
    }

    /**
     * Site Id
     * 
     */
    @Import(name="siteId", required=true)
    private String siteId;

    public String siteId() {
        return this.siteId;
    }

    /**
     * Site name
     * 
     */
    @Import(name="siteName", required=true)
    private String siteName;

    public String siteName() {
        return this.siteName;
    }

    private WebChatSiteResponse() {}

    private WebChatSiteResponse(WebChatSiteResponse $) {
        this.isEnabled = $.isEnabled;
        this.isWebchatPreviewEnabled = $.isWebchatPreviewEnabled;
        this.key = $.key;
        this.key2 = $.key2;
        this.siteId = $.siteId;
        this.siteName = $.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebChatSiteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebChatSiteResponse $;

        public Builder() {
            $ = new WebChatSiteResponse();
        }

        public Builder(WebChatSiteResponse defaults) {
            $ = new WebChatSiteResponse(Objects.requireNonNull(defaults));
        }

        public Builder isEnabled(Boolean isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isWebchatPreviewEnabled(Boolean isWebchatPreviewEnabled) {
            $.isWebchatPreviewEnabled = isWebchatPreviewEnabled;
            return this;
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder key2(String key2) {
            $.key2 = key2;
            return this;
        }

        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteName(String siteName) {
            $.siteName = siteName;
            return this;
        }

        public WebChatSiteResponse build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.isWebchatPreviewEnabled = Codegen.booleanProp("isWebchatPreviewEnabled").arg($.isWebchatPreviewEnabled).def(false).require();
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.key2 = Objects.requireNonNull($.key2, "expected parameter 'key2' to be non-null");
            $.siteId = Objects.requireNonNull($.siteId, "expected parameter 'siteId' to be non-null");
            $.siteName = Objects.requireNonNull($.siteName, "expected parameter 'siteName' to be non-null");
            return $;
        }
    }

}
