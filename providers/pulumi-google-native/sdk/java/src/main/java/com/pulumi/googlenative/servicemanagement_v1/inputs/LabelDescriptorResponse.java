// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A description of a label.
 * 
 */
public final class LabelDescriptorResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabelDescriptorResponse Empty = new LabelDescriptorResponse();

    /**
     * A human-readable description for the label.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * The label key.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The type of data that can be assigned to the label.
     * 
     */
    @Import(name="valueType", required=true)
    private String valueType;

    public String valueType() {
        return this.valueType;
    }

    private LabelDescriptorResponse() {}

    private LabelDescriptorResponse(LabelDescriptorResponse $) {
        this.description = $.description;
        this.key = $.key;
        this.valueType = $.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelDescriptorResponse $;

        public Builder() {
            $ = new LabelDescriptorResponse();
        }

        public Builder(LabelDescriptorResponse defaults) {
            $ = new LabelDescriptorResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder valueType(String valueType) {
            $.valueType = valueType;
            return this;
        }

        public LabelDescriptorResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.valueType = Objects.requireNonNull($.valueType, "expected parameter 'valueType' to be non-null");
            return $;
        }
    }

}
