// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDevicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDevicePlainArgs Empty = new GetDevicePlainArgs();

    @Import(name="customer")
    private @Nullable String customer;

    public Optional<String> customer() {
        return Optional.ofNullable(this.customer);
    }

    @Import(name="deviceId", required=true)
    private String deviceId;

    public String deviceId() {
        return this.deviceId;
    }

    private GetDevicePlainArgs() {}

    private GetDevicePlainArgs(GetDevicePlainArgs $) {
        this.customer = $.customer;
        this.deviceId = $.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDevicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDevicePlainArgs $;

        public Builder() {
            $ = new GetDevicePlainArgs();
        }

        public Builder(GetDevicePlainArgs defaults) {
            $ = new GetDevicePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder customer(@Nullable String customer) {
            $.customer = customer;
            return this;
        }

        public Builder deviceId(String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public GetDevicePlainArgs build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            return $;
        }
    }

}
