// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A key-value pair to associate with a global network resource.
 * 
 */
public final class GlobalNetworkTagArgs extends ResourceArgs {

    public static final GlobalNetworkTagArgs Empty = new GlobalNetworkTagArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GlobalNetworkTagArgs() {}

    private GlobalNetworkTagArgs(GlobalNetworkTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalNetworkTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalNetworkTagArgs $;

        public Builder() {
            $ = new GlobalNetworkTagArgs();
        }

        public Builder(GlobalNetworkTagArgs defaults) {
            $ = new GlobalNetworkTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GlobalNetworkTagArgs build() {
            return $;
        }
    }

}
