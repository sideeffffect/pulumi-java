// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsPathTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsPathTagArgs Empty = new NetworkInsightsPathTagArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private NetworkInsightsPathTagArgs() {}

    private NetworkInsightsPathTagArgs(NetworkInsightsPathTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsPathTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsPathTagArgs $;

        public Builder() {
            $ = new NetworkInsightsPathTagArgs();
        }

        public Builder(NetworkInsightsPathTagArgs defaults) {
            $ = new NetworkInsightsPathTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
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

        public NetworkInsightsPathTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
