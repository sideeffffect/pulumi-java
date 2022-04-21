// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata for any related URL information.
 * 
 */
public final class RelatedUrlResponse extends com.pulumi.resources.InvokeArgs {

    public static final RelatedUrlResponse Empty = new RelatedUrlResponse();

    /**
     * Label to describe usage of the URL.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    public String label() {
        return this.label;
    }

    /**
     * Specific URL associated with the resource.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private RelatedUrlResponse() {}

    private RelatedUrlResponse(RelatedUrlResponse $) {
        this.label = $.label;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelatedUrlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelatedUrlResponse $;

        public Builder() {
            $ = new RelatedUrlResponse();
        }

        public Builder(RelatedUrlResponse defaults) {
            $ = new RelatedUrlResponse(Objects.requireNonNull(defaults));
        }

        public Builder label(String label) {
            $.label = label;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public RelatedUrlResponse build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
