// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * MetadataFilter label name value pairs that are expected to match corresponding labels presented as metadata to the load balancer.
 * 
 */
public final class MetadataFilterLabelMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataFilterLabelMatchResponse Empty = new MetadataFilterLabelMatchResponse();

    /**
     * Name of metadata label. The name can have a maximum length of 1024 characters and must be at least 1 character long.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The value of the label must match the specified value. value can have a maximum length of 1024 characters.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private MetadataFilterLabelMatchResponse() {}

    private MetadataFilterLabelMatchResponse(MetadataFilterLabelMatchResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataFilterLabelMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataFilterLabelMatchResponse $;

        public Builder() {
            $ = new MetadataFilterLabelMatchResponse();
        }

        public Builder(MetadataFilterLabelMatchResponse defaults) {
            $ = new MetadataFilterLabelMatchResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public MetadataFilterLabelMatchResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
