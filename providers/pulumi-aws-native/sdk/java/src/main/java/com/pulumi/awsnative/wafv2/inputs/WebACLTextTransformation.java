// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.WebACLTextTransformationType;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Text Transformation on the Search String before match.
 * 
 */
public final class WebACLTextTransformation extends com.pulumi.resources.InvokeArgs {

    public static final WebACLTextTransformation Empty = new WebACLTextTransformation();

    @Import(name="priority", required=true)
    private Integer priority;

    public Integer priority() {
        return this.priority;
    }

    @Import(name="type", required=true)
    private WebACLTextTransformationType type;

    public WebACLTextTransformationType type() {
        return this.type;
    }

    private WebACLTextTransformation() {}

    private WebACLTextTransformation(WebACLTextTransformation $) {
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLTextTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLTextTransformation $;

        public Builder() {
            $ = new WebACLTextTransformation();
        }

        public Builder(WebACLTextTransformation defaults) {
            $ = new WebACLTextTransformation(Objects.requireNonNull(defaults));
        }

        public Builder priority(Integer priority) {
            $.priority = priority;
            return this;
        }

        public Builder type(WebACLTextTransformationType type) {
            $.type = type;
            return this;
        }

        public WebACLTextTransformation build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
