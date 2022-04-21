// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.ImageResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * User signature.
 * 
 */
public final class SignatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final SignatureResponse Empty = new SignatureResponse();

    /**
     * Optional. An image of the user&#39;s signature.
     * 
     */
    @Import(name="image", required=true)
    private ImageResponse image;

    public ImageResponse image() {
        return this.image;
    }

    /**
     * Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
     * 
     */
    @Import(name="metadata", required=true)
    private Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Optional. Timestamp of the signature.
     * 
     */
    @Import(name="signatureTime", required=true)
    private String signatureTime;

    public String signatureTime() {
        return this.signatureTime;
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    public String userId() {
        return this.userId;
    }

    private SignatureResponse() {}

    private SignatureResponse(SignatureResponse $) {
        this.image = $.image;
        this.metadata = $.metadata;
        this.signatureTime = $.signatureTime;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignatureResponse $;

        public Builder() {
            $ = new SignatureResponse();
        }

        public Builder(SignatureResponse defaults) {
            $ = new SignatureResponse(Objects.requireNonNull(defaults));
        }

        public Builder image(ImageResponse image) {
            $.image = image;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder signatureTime(String signatureTime) {
            $.signatureTime = signatureTime;
            return this;
        }

        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        public SignatureResponse build() {
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            $.signatureTime = Objects.requireNonNull($.signatureTime, "expected parameter 'signatureTime' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
