// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WebAclCustomResponseBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclCustomResponseBodyArgs Empty = new WebAclCustomResponseBodyArgs();

    /**
     * The payload of the custom response.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    public WebAclCustomResponseBodyArgs(
        Output<String> content,
        Output<String> contentType,
        Output<String> key) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private WebAclCustomResponseBodyArgs() {
        this.content = Codegen.empty();
        this.contentType = Codegen.empty();
        this.key = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclCustomResponseBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> content;
        private Output<String> contentType;
        private Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclCustomResponseBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.key = defaults.key;
        }

        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }
        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }        public WebAclCustomResponseBodyArgs build() {
            return new WebAclCustomResponseBodyArgs(content, contentType, key);
        }
    }
}
