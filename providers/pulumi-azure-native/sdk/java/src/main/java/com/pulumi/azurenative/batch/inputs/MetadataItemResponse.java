// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Batch service does not assign any meaning to this metadata; it is solely for the use of user code.
 * 
 */
public final class MetadataItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataItemResponse Empty = new MetadataItemResponse();

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private MetadataItemResponse() {}

    private MetadataItemResponse(MetadataItemResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataItemResponse $;

        public Builder() {
            $ = new MetadataItemResponse();
        }

        public Builder(MetadataItemResponse defaults) {
            $ = new MetadataItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public MetadataItemResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
