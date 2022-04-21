// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.attestation.inputs;

import com.pulumi.azurenative.attestation.inputs.JSONWebKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JSONWebKeySetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JSONWebKeySetArgs Empty = new JSONWebKeySetArgs();

    /**
     * The value of the &#34;keys&#34; parameter is an array of JWK values.  By
     * default, the order of the JWK values within the array does not imply
     * an order of preference among them, although applications of JWK Sets
     * can choose to assign a meaning to the order for their purposes, if
     * desired.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<JSONWebKeyArgs>> keys;

    public Optional<Output<List<JSONWebKeyArgs>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    private JSONWebKeySetArgs() {}

    private JSONWebKeySetArgs(JSONWebKeySetArgs $) {
        this.keys = $.keys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JSONWebKeySetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JSONWebKeySetArgs $;

        public Builder() {
            $ = new JSONWebKeySetArgs();
        }

        public Builder(JSONWebKeySetArgs defaults) {
            $ = new JSONWebKeySetArgs(Objects.requireNonNull(defaults));
        }

        public Builder keys(@Nullable Output<List<JSONWebKeyArgs>> keys) {
            $.keys = keys;
            return this;
        }

        public Builder keys(List<JSONWebKeyArgs> keys) {
            return keys(Output.of(keys));
        }

        public Builder keys(JSONWebKeyArgs... keys) {
            return keys(List.of(keys));
        }

        public JSONWebKeySetArgs build() {
            return $;
        }
    }

}
