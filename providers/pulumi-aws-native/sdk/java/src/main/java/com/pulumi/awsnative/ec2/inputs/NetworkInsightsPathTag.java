// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsPathTag extends com.pulumi.resources.InvokeArgs {

    public static final NetworkInsightsPathTag Empty = new NetworkInsightsPathTag();

    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private NetworkInsightsPathTag() {}

    private NetworkInsightsPathTag(NetworkInsightsPathTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsPathTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsPathTag $;

        public Builder() {
            $ = new NetworkInsightsPathTag();
        }

        public Builder(NetworkInsightsPathTag defaults) {
            $ = new NetworkInsightsPathTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public NetworkInsightsPathTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
