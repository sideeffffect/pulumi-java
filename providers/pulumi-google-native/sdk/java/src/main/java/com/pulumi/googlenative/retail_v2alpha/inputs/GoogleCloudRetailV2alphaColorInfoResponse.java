// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The color information of a Product.
 * 
 */
public final class GoogleCloudRetailV2alphaColorInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaColorInfoResponse Empty = new GoogleCloudRetailV2alphaColorInfoResponse();

    /**
     * The standard color families. Strongly recommended to use the following standard color groups: &#34;Red&#34;, &#34;Pink&#34;, &#34;Orange&#34;, &#34;Yellow&#34;, &#34;Purple&#34;, &#34;Green&#34;, &#34;Cyan&#34;, &#34;Blue&#34;, &#34;Brown&#34;, &#34;White&#34;, &#34;Gray&#34;, &#34;Black&#34; and &#34;Mixed&#34;. Normally it is expected to have only 1 color family. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colorFamilies", required=true)
    private List<String> colorFamilies;

    public List<String> colorFamilies() {
        return this.colorFamilies;
    }

    /**
     * The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    @Import(name="colors", required=true)
    private List<String> colors;

    public List<String> colors() {
        return this.colors;
    }

    private GoogleCloudRetailV2alphaColorInfoResponse() {}

    private GoogleCloudRetailV2alphaColorInfoResponse(GoogleCloudRetailV2alphaColorInfoResponse $) {
        this.colorFamilies = $.colorFamilies;
        this.colors = $.colors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2alphaColorInfoResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2alphaColorInfoResponse();
        }

        public Builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
            $ = new GoogleCloudRetailV2alphaColorInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder colorFamilies(List<String> colorFamilies) {
            $.colorFamilies = colorFamilies;
            return this;
        }

        public Builder colorFamilies(String... colorFamilies) {
            return colorFamilies(List.of(colorFamilies));
        }

        public Builder colors(List<String> colors) {
            $.colors = colors;
            return this;
        }

        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }

        public GoogleCloudRetailV2alphaColorInfoResponse build() {
            $.colorFamilies = Objects.requireNonNull($.colorFamilies, "expected parameter 'colorFamilies' to be non-null");
            $.colors = Objects.requireNonNull($.colors, "expected parameter 'colors' to be non-null");
            return $;
        }
    }

}
