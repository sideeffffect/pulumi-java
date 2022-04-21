// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KPack ClusterStack properties payload
 * 
 */
public final class StackPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final StackPropertiesResponse Empty = new StackPropertiesResponse();

    /**
     * Id of the ClusterStack.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Version of the ClusterStack
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private StackPropertiesResponse() {}

    private StackPropertiesResponse(StackPropertiesResponse $) {
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackPropertiesResponse $;

        public Builder() {
            $ = new StackPropertiesResponse();
        }

        public Builder(StackPropertiesResponse defaults) {
            $ = new StackPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public StackPropertiesResponse build() {
            return $;
        }
    }

}
