// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAddressArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddressArgs Empty = new GetAddressArgs();

    @Import(name="address", required=true)
    private String address;

    public String address() {
        return this.address;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetAddressArgs() {}

    private GetAddressArgs(GetAddressArgs $) {
        this.address = $.address;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddressArgs $;

        public Builder() {
            $ = new GetAddressArgs();
        }

        public Builder(GetAddressArgs defaults) {
            $ = new GetAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(String address) {
            $.address = address;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetAddressArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
