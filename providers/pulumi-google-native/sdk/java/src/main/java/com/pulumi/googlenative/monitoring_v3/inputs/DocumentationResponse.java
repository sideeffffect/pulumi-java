// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A content string and a MIME type that describes the content string&#39;s format.
 * 
 */
public final class DocumentationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DocumentationResponse Empty = new DocumentationResponse();

    /**
     * The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller.
     * 
     */
    @Import(name="content", required=true)
    private String content;

    public String content() {
        return this.content;
    }

    /**
     * The format of the content field. Presently, only the value &#34;text/markdown&#34; is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
     * 
     */
    @Import(name="mimeType", required=true)
    private String mimeType;

    public String mimeType() {
        return this.mimeType;
    }

    private DocumentationResponse() {}

    private DocumentationResponse(DocumentationResponse $) {
        this.content = $.content;
        this.mimeType = $.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationResponse $;

        public Builder() {
            $ = new DocumentationResponse();
        }

        public Builder(DocumentationResponse defaults) {
            $ = new DocumentationResponse(Objects.requireNonNull(defaults));
        }

        public Builder content(String content) {
            $.content = content;
            return this;
        }

        public Builder mimeType(String mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        public DocumentationResponse build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.mimeType = Objects.requireNonNull($.mimeType, "expected parameter 'mimeType' to be non-null");
            return $;
        }
    }

}
