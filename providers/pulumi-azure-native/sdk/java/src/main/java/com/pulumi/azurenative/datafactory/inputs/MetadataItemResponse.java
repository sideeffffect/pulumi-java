// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify the name and value of custom metadata item.
 * 
 */
public final class MetadataItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataItemResponse Empty = new MetadataItemResponse();

    /**
     * Metadata item key name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="name")
    private @Nullable Object name;

    public Optional<Object> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Metadata item value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value")
    private @Nullable Object value;

    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
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

        public Builder name(@Nullable Object name) {
            $.name = name;
            return this;
        }

        public Builder value(@Nullable Object value) {
            $.value = value;
            return this;
        }

        public MetadataItemResponse build() {
            return $;
        }
    }

}
