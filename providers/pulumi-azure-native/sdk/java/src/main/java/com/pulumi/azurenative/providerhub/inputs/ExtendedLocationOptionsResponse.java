// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtendedLocationOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExtendedLocationOptionsResponse Empty = new ExtendedLocationOptionsResponse();

    @Import(name="supportedPolicy")
    private @Nullable String supportedPolicy;

    public Optional<String> supportedPolicy() {
        return Optional.ofNullable(this.supportedPolicy);
    }

    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ExtendedLocationOptionsResponse() {}

    private ExtendedLocationOptionsResponse(ExtendedLocationOptionsResponse $) {
        this.supportedPolicy = $.supportedPolicy;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtendedLocationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtendedLocationOptionsResponse $;

        public Builder() {
            $ = new ExtendedLocationOptionsResponse();
        }

        public Builder(ExtendedLocationOptionsResponse defaults) {
            $ = new ExtendedLocationOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder supportedPolicy(@Nullable String supportedPolicy) {
            $.supportedPolicy = supportedPolicy;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ExtendedLocationOptionsResponse build() {
            return $;
        }
    }

}
