// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHttpEndpointConfiguration Empty = new DeliveryStreamHttpEndpointConfiguration();

    @Import(name="accessKey")
    private @Nullable String accessKey;

    public Optional<String> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private DeliveryStreamHttpEndpointConfiguration() {}

    private DeliveryStreamHttpEndpointConfiguration(DeliveryStreamHttpEndpointConfiguration $) {
        this.accessKey = $.accessKey;
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamHttpEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamHttpEndpointConfiguration $;

        public Builder() {
            $ = new DeliveryStreamHttpEndpointConfiguration();
        }

        public Builder(DeliveryStreamHttpEndpointConfiguration defaults) {
            $ = new DeliveryStreamHttpEndpointConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder accessKey(@Nullable String accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public DeliveryStreamHttpEndpointConfiguration build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
