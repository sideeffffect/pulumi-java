// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TextResponse {
    /**
     * @return The text content to be displayed.
     * 
     */
    private final String content;
    /**
     * @return How the text content is formatted.
     * 
     */
    private final String format;

    @CustomType.Constructor
    private TextResponse(
        @CustomType.Parameter("content") String content,
        @CustomType.Parameter("format") String format) {
        this.content = content;
        this.format = format;
    }

    /**
     * @return The text content to be displayed.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return How the text content is formatted.
     * 
     */
    public String format() {
        return this.format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String format;

        public Builder() {
    	      // Empty
        }

        public Builder(TextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.format = defaults.format;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }        public TextResponse build() {
            return new TextResponse(content, format);
        }
    }
}
