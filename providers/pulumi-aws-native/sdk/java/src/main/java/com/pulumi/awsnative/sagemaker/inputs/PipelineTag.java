// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PipelineTag extends com.pulumi.resources.InvokeArgs {

    public static final PipelineTag Empty = new PipelineTag();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private PipelineTag() {}

    private PipelineTag(PipelineTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineTag $;

        public Builder() {
            $ = new PipelineTag();
        }

        public Builder(PipelineTag defaults) {
            $ = new PipelineTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public PipelineTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
